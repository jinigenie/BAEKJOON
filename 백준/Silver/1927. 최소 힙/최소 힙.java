import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			
			int ans = Integer.parseInt(br.readLine());
			
			if(ans == 0 && pq.isEmpty()) bw.write("0\n");
			else if(ans == 0) {
				bw.write(Integer.toString(pq.poll()) + "\n");
			}
			else {
				pq.add(ans);
			}
		}
		
		bw.flush();
		bw.close();
		
	}
}
