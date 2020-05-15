package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.search.queries.AnnotateCall$Request;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;

/* renamed from: apsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class apsz extends dck implements apta {
    public apsz() {
        super("com.google.android.gms.search.queries.internal.ISearchQueriesService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        apsx apsx = null;
        switch (i) {
            case 2:
                QueryCall$Request queryCall$Request = (QueryCall$Request) dcl.m8163a(parcel, QueryCall$Request.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
                    if (queryLocalInterface instanceof apsx) {
                        apsx = (apsx) queryLocalInterface;
                    } else {
                        apsx = new apsv(readStrongBinder);
                    }
                }
                mo47584a(queryCall$Request, apsx);
                parcel2.writeNoException();
                return true;
            case 3:
                GlobalQueryCall$Request globalQueryCall$Request = (GlobalQueryCall$Request) dcl.m8163a(parcel, GlobalQueryCall$Request.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
                    apsx = queryLocalInterface2 instanceof apsx ? (apsx) queryLocalInterface2 : new apsv(readStrongBinder2);
                }
                mo47583a(globalQueryCall$Request, apsx);
                parcel2.writeNoException();
                return true;
            case 4:
                GetDocumentsCall$Request getDocumentsCall$Request = (GetDocumentsCall$Request) dcl.m8163a(parcel, GetDocumentsCall$Request.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
                    if (queryLocalInterface3 instanceof apsx) {
                        apsx = (apsx) queryLocalInterface3;
                    } else {
                        apsx = new apsv(readStrongBinder3);
                    }
                }
                mo47581a(getDocumentsCall$Request, apsx);
                parcel2.writeNoException();
                return true;
            case 5:
                GetPhraseAffinityCall$Request getPhraseAffinityCall$Request = (GetPhraseAffinityCall$Request) dcl.m8163a(parcel, GetPhraseAffinityCall$Request.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
                    if (queryLocalInterface4 instanceof apsx) {
                        apsx = (apsx) queryLocalInterface4;
                    } else {
                        apsx = new apsv(readStrongBinder4);
                    }
                }
                mo47582a(getPhraseAffinityCall$Request, apsx);
                parcel2.writeNoException();
                return true;
            case 6:
                QuerySuggestCall$Request querySuggestCall$Request = (QuerySuggestCall$Request) dcl.m8163a(parcel, QuerySuggestCall$Request.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
                    if (queryLocalInterface5 instanceof apsx) {
                        apsx = (apsx) queryLocalInterface5;
                    } else {
                        apsx = new apsv(readStrongBinder5);
                    }
                }
                mo47585a(querySuggestCall$Request, apsx);
                parcel2.writeNoException();
                return true;
            case 7:
                AnnotateCall$Request annotateCall$Request = (AnnotateCall$Request) dcl.m8163a(parcel, AnnotateCall$Request.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
                    if (queryLocalInterface6 instanceof apsx) {
                        apsx = (apsx) queryLocalInterface6;
                    } else {
                        apsx = new apsv(readStrongBinder6);
                    }
                }
                mo47580a(apsx);
                parcel2.writeNoException();
                return true;
            case 8:
                mo47579a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
