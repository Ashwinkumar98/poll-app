package io.hack.poll.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="users")
public class User {
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "expertist_level")
	private int expertistLevel;
	@Column(name = "no_of_votes")
	private int noOfVotes;
	@Column(name = "problems_solved")
	private int problemSolved;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="voted_for")
	private User votedFor;
}
