//import classes.*;
//package GUI;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class Addcustomar extends JFrame implements ActionListener{
    private JLabel llb1;
	private JTextField tfff1,tfff2,tfff2r,tfff1g;
    private JComboBox<String> comboid;
	private JRadioButton rr3,rr4;
    private JButton addl,backl,backl2;
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane scroll;
	private String[] columns={"Name","Phone","Address","ID"};
	private String[] rows=new String[4];
    public Addcustomar() {
        super("addcustomarDetails");
        this.setBounds(200, 20, 700, 800);
        this.setVisible(true);                                         //button ulta palta jaga asle frame ekbar (class file delete)constractor/mainfunction/previous class e dia run kore dekbo
         this.setBackground(Color.WHITE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLayout(null);
        //JLabel
        JLabel lbes = new JLabel("User Name");
        lbes.setBounds(30, 50, 150, 25);
        this.add(lbes);
        
        tfff1=new JTextField();
		tfff1.setBounds(220,50,150,25);
		this.add(tfff1);
		

        JLabel llb1 = new JLabel("ID*");
        llb1.setBounds(30, 90, 150, 25);
        this.add(llb1);
            //-------------------COMBO BOX------------------------
        comboid = new JComboBox<>(new String[]{"Passport", "NID", "Driving License"});
        comboid.setBounds(220, 90, 150, 25);
        this.add(comboid);
		 //nid taking field
		tfff1g=new JTextField();
		tfff1g.setBounds(400,90,150,25);
		this.add(tfff1g);
		
		 JLabel lbes1 = new JLabel("Phone Number*");
        lbes1.setBounds(30,140,150,25);
        this.add(lbes1);
		/*  */
		tfff2=new JTextField();
		tfff2.setBounds(220,140,150,25);
		this.add(tfff2);
		
		JLabel lbes12 = new JLabel("Gender");
        lbes12.setBounds(30,180,150,25);
        this.add(lbes12);
		//------------------------------------Radio Button--------------------
		rr3 =new JRadioButton("Male");
		rr3.setBounds(220,180,60,25);
		this.add(rr3);
		
		rr4 =new JRadioButton("Female");
		rr4.setBounds(280,180,90,25);
		this.add(rr4);
		//------------------------Groping radio Button-----------------------
		ButtonGroup bq3=new ButtonGroup();
		bq3.add(rr3);
		bq3.add(rr4);
		
		 JLabel lbes1r = new JLabel("Adress");
        lbes1r.setBounds(30,220,150,25);
        this.add(lbes1r);
		
		tfff2r=new JTextField();
		tfff2r.setBounds(220,220,180,35);
		this.add(tfff2r);
		//----JButton-----
		addl=new JButton("ADD");
		addl.setBackground(Color.YELLOW);
		addl.setBounds(280,280,80,30);
		this.add(addl);
		
		backl=new JButton("CLEAR");
		backl.setBounds(362,280,80,30);
		this.add(backl);
		
		backl2=new JButton("DELETE");
		backl2.setBounds(460,280,100,30);
		this.add(backl2);
		//--------------------table---------------------
		table=new JTable();
		
		model=new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.setBackground(Color.YELLOW);
		table.setSelectionBackground(Color.BLUE);
		//table.setBounds(45,300,400,400);
		table.setRowHeight(25);
		//------------------------scrollpane add--------------------------------------+table location
		scroll =new JScrollPane(table);
		scroll.setBounds(10,320,600,350);
		this.add(scroll);
		        //       --------------------Adding actionListener-----
		addl.addActionListener(this);
		backl.addActionListener(this);
		backl2.addActionListener(this);
    }
	
	public void actionPerformed(ActionEvent a0){
		
		if(a0.getSource()==addl){
			rows[0]=tfff1.getText();
			rows[1]=tfff2.getText();
			rows[2]=tfff2r.getText();
			rows[3]=tfff1g.getText();
			
			model.addRow(rows);
		}
		
		else if(a0.getSource()==backl){
			tfff1.setText("");
			tfff2.setText("");
			tfff2r.setText("");
		}
		
		else if(a0.getSource()==backl2){
			
			int rownumber01=table.getSelectedRow();
			if(rownumber01>=0){
				model.removeRow(rownumber01);
			}
			else{
				JOptionPane.showMessageDialog(null,"no row Exits");
			}
		}
		
	}
	
	
	
	
	
	

    public static void main(String[] args) {
         new Addcustomar();
  /* Addcustomar x1=   new Addcustomar();
      x1.setBounds(200, 20, 820, 800);
        x1.setVisible(true);
	x1.setTitle("Add Info");
        x1.setBackground(Color.WHITE);
        x1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x1.setLayout(null); 
		likle jlabel thikmoto ase na
		
		*/
    }
}