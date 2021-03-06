
package eg.gov.iti.jets.upcomingtripsfragment.upcomingfragmentinterfaces;


import java.io.Serializable;
import java.util.List;

import eg.gov.iti.jets.dtos.Trip;

/**
 * Created by Usama on 7/3/2018.
 */

public interface UpcomingPresenterInterface extends Serializable {

    public void getTripListFromDB();

    public void addTripListToView(List<Trip> trip);

    public void deleteTripFromDB(Trip trip);

    public void deleteTripFromView(Trip trip);

    public void addTripToView(Trip trip);

    public void updateTripInView(Trip trip);

    public void updateTripInDB(Trip trip);

    void addTripToDB(Trip trip);
}
