package com.pojos;

import java.io.Serializable;
import java.sql.Timestamp;

public class ActorDTO implements Serializable {
		private static final long serialVersionUID = 1L;

		private int actorId;

		private String firstName;

		private String lastName;

		private Timestamp lastUpdate;

		//bi-directional many-to-one association to FilmActor
		 

		public ActorDTO() {
		}

		public int getActorId() {
			return this.actorId;
		}

		public void setActorId(int actorId) {
			this.actorId = actorId;
		}

		public String getFirstName() {
			return this.firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return this.lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Timestamp getLastUpdate() {
			return this.lastUpdate;
		}

		public void setLastUpdate(Timestamp lastUpdate) {
			this.lastUpdate = lastUpdate;
		}

		
		public String toString() {
			return "Actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
					+ lastUpdate + "]";
	}
}