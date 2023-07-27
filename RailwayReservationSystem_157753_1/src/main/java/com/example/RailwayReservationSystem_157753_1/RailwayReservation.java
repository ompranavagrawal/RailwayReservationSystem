package com.example.RailwayReservationSystem_157753_1;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Reservation")                        // Name of the collection inside the RRdb database
public class RailwayReservation {

		@Id
		private String pnrno;                         // pnrNo as id
		private String passengerName;
		private String sourceLocation;
		private String destLocation;
		private double price;
		public RailwayReservation(String pnrno, String passengerName,
				String sourceLocation, String destLocation, double price) {
			super();
			this.pnrno = pnrno;
			this.passengerName = passengerName;
			this.sourceLocation = sourceLocation;
			this.destLocation = destLocation;
			this.price = price;
		}
		public String getPnrno() {
			return pnrno;
		}
		public void setPnrno(String pnrno) {
			this.pnrno = pnrno;
		}
		public String getPassengerName() {
			return passengerName;
		}
		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}
		public String getSourceLocation() {
			return sourceLocation;
		}
		public void setSourceLocation(String sourceLocation) {
			this.sourceLocation = sourceLocation;
		}
		public String getDestLocation() {
			return destLocation;
		}
		public void setDestLocation(String destLocation) {
			this.destLocation = destLocation;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public RailwayReservation() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "RailwayReservation [pnrno=" + pnrno + ", passengerName="
					+ passengerName + ", sourceLocation=" + sourceLocation
					+ ", destLocation=" + destLocation + ", price=" + price
					+ "]";
		}
		
		
		
		
}
