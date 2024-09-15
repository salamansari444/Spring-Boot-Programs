package in.ineuron.bo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.NonFinal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class MarriageSeeKer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private String address;
	
	@Lob
	@NonNull
	private byte[] photo;
	@NonNull
	private LocalDateTime date;
	@Lob
	@NonNull
	private char[] bio;
	@NonNull
	private Boolean indian;
}
