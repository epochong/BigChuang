import java.sql.Connection;
import java.sql.Statement;
import java.util.Random;;

public class Store {

		//�������Ӷ���
		public static Connection con;
		//���崫��������
		public static Statement statement;
		
		public static void DBConnection() throws Exception {
			//��ȡ���ݿ�����
			con = JdbcUtils.getConnection();
			//��ȡ������
			statement=con.createStatement();
		}
		
		public static void save(float s1,float s2,float s3,float s4,float s5,float s6,float s7,
				float s8,float s9,float s10,float s11,float s12,float s13,float s14,float s15,int s16) throws Exception {
			try {
				DBConnection();
				String sql="insert into imitate(���ҽṹ�ȶ���,���Ҳ���,���ʹ���,��ʯ����ָ��,�꽵ˮ��,����ˮ,"
						+ "���ε�ò,����ϵ���Ҳ���,ͣ��ʱ��,��ú����,ú�����,����ɺ��,���������,�ɿ����,ú���ߴ�Ͳ���,Σ�յȼ�)"
						+ " values("+s1+","+s2+","+s3+","+s4+","+s5+","+s6+","+s7+","+s8+","+s9+","+s10+
                        ","+s11+","+s12+","+s13+","+s14+","+s15+","+s16+")";
				//���ô�������sql�������ݿ�
				statement.executeUpdate(sql);         //ִ�и���
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				con.close();
			}
		}

		public static float[][] out=new float[600][16];
		public static int[] arr = new int[15];

		public static void main(String[] args) throws Exception {
			Random random = new Random();
			for(int i=0; i<600; i++) {
				//2-9
				out[i][0]=(float) ((random.nextInt(70)+20)/10.0);               //1 ���ҽṹ�ȶ���
				arr[0] = (int)(out[i][0] / 2) * 2;
				//2-9
				out[i][1]=(float) ((random.nextInt(70)+20)/10.0);               //2 ���Ҳ���
				arr[1] = (int)(out[i][1] / 2) * 2;
				//2-9
				out[i][2]=(float) ((random.nextInt(70)+20)/10.0);               //3 ���ʹ���
				arr[2] = (int)(out[i][2] / 2) * 2;
				//0-100
				out[i][3]=(float) ((random.nextInt(1000))/10.0);                //4 ��ʯ����ָ��
				if (out[i][3] < 40) {
					arr[3] = 8;
				} else if (out[i][3] < 50){
					arr[3] = 6;
				} else if (out[i][3] <= 60) {
					arr[3] = 4;
				} else {
					arr[3] = 2;
				}
				//0-1000
				out[i][4]=(float) (random.nextInt(10000)/10.0);            //5 �꽵ˮ��
				if (out[i][4]> 660) {
					arr[4] = 8;
				} else if (out[i][4] > 600){
					arr[4] = 6;
				} else if (out[i][4] >= 500) {
					arr[3] = 4;
				} else {
					arr[3] = 2;
				}
				//2-9
				out[i][5]=(float) ((random.nextInt(70)+20)/10.0);               //6 ����ˮ
				arr[5] = (int)(out[i][5] / 2) * 2;
				//2-9
				out[i][6]=(float) ((random.nextInt(70)+20)/10.0);               //7 ���ε�ò
				arr[6] = (int)(out[i][6] / 2) * 2;
				//0-100
				out[i][7]=(float) ((random.nextInt(1000))/10.0);                //8 ����ϵ���Ҳ���
				if (out[i][7] < 15) {
					arr[7] = 8;
				} else if (out[i][7] < 30){
					arr[7] = 6;
				} else if (out[i][7] <= 60) {
					arr[7] = 4;
				} else {
					arr[7] = 2;
				}
				out[i][8]=(float) ((random.nextInt(100))/10.0);                 //9 ͣ��ʱ��
				if (out[i][8] < 1) {
					arr[8] = 8;
				} else if (out[i][8] < 2){
					arr[8] = 6;
				} else if (out[i][8] <= 4) {
					arr[8] = 4;
				} else {
					arr[8] = 2;
				}
				out[i][9]=(float) ((random.nextInt(100))/10);                 //10 ��ú����
				if (out[i][9] > 6) {
					arr[9] = 8;
				} else if (out[i][9] >= 5){
					arr[9] = 6;
				} else if (out[i][9] >= 3) {
					arr[9] = 4;
				} else {
					arr[9] = 2;
				}
				out[i][10]=(float) ((random.nextInt(900))/10.0);               //11 ú�����
				if (out[i][10] < 5) {
					arr[10] = 8;
				} else if (out[i][10] < 30){
					arr[10] = 6;
				} else if (out[i][10] <= 50) {
					arr[10] = 4;
				} else {
					arr[10] = 2;
				}
				out[i][11]=(float) ((random.nextInt(1000))/10.0);               //12 ����ɺ��
				if (out[i][11] < 30) {
					arr[11] = 8;
				} else if (out[i][11] < 60){
					arr[11] = 6;
				} else if (out[i][11] <= 90) {
					arr[11] = 4;
				} else {
					arr[11] = 2;
				}
				out[i][12]=(float) ((random.nextInt(70)+20)/10.0);              //13 ���������
				arr[12] = (int)(out[i][12] / 2) * 2;
				//0-20
				out[i][13]=(float) (random.nextInt(150)/10.0);             //14 �ɿ����
				if (out[i][13] > 10) {
					arr[13] = 8;
				} else if (out[i][13] > 1){
					arr[13] = 6;
				} else if (out[i][13] > 0.1) {
					arr[13] = 4;
				} else {
					arr[13] = 2;
				}
				out[i][14]=(float) ((random.nextInt(70)+20)/10.0);              //15 ú���ߴ�Ͳ���
				arr[14] = (int)(out[i][14] / 2) * 2;

				int sum = 0;
				for (int j = 0; j < 15; j++) {
					sum += arr[j];
				}
				int tem = (int) sum ;
				System.out.println(tem);
				if (tem < 57 ) {
					out[i][15] = 2;
				} else if (tem < 65) {
					out[i][15] = 4;
				} else if (tem < 73) {
					out[i][15] = 6;
				} else {
					out[i][15] = 8;
				}
			}
			for(int i=0; i<600; i++) {

				save(out[i][0],out[i][1],out[i][2],out[i][3],out[i][4],out[i][5],
						out[i][6],out[i][7],out[i][8],out[i][9],out[i][10],
						out[i][11],out[i][12],out[i][13],out[i][14],(int)out[i][15]);
			}
		}
}
