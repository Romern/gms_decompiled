package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;

/* renamed from: appj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class appj extends dck implements appk {
    public appj() {
        super("com.google.android.gms.search.corpora.internal.ISearchCorporaService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        apph apph = null;
        switch (i) {
            case 2:
                RequestIndexingCall$Request requestIndexingCall$Request = (RequestIndexingCall$Request) dcl.m8163a(parcel, RequestIndexingCall$Request.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
                    if (queryLocalInterface instanceof apph) {
                        apph = (apph) queryLocalInterface;
                    } else {
                        apph = new appf(readStrongBinder);
                    }
                }
                mo47494a(requestIndexingCall$Request, apph);
                break;
            case 3:
                ClearCorpusCall$Request clearCorpusCall$Request = (ClearCorpusCall$Request) dcl.m8163a(parcel, ClearCorpusCall$Request.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
                    apph = queryLocalInterface2 instanceof apph ? (apph) queryLocalInterface2 : new appf(readStrongBinder2);
                }
                mo47489a(clearCorpusCall$Request, apph);
                break;
            case 4:
                GetCorpusStatusCall$Request getCorpusStatusCall$Request = (GetCorpusStatusCall$Request) dcl.m8163a(parcel, GetCorpusStatusCall$Request.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
                    if (queryLocalInterface3 instanceof apph) {
                        apph = (apph) queryLocalInterface3;
                    } else {
                        apph = new appf(readStrongBinder3);
                    }
                }
                mo47492a(getCorpusStatusCall$Request, apph);
                break;
            case 5:
                GetCorpusInfoCall$Request getCorpusInfoCall$Request = (GetCorpusInfoCall$Request) dcl.m8163a(parcel, GetCorpusInfoCall$Request.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
                    if (queryLocalInterface4 instanceof apph) {
                        apph = (apph) queryLocalInterface4;
                    } else {
                        apph = new appf(readStrongBinder4);
                    }
                }
                mo47491a(getCorpusInfoCall$Request, apph);
                break;
            case 6:
                DeleteUsageReportCall$Request deleteUsageReportCall$Request = (DeleteUsageReportCall$Request) dcl.m8163a(parcel, DeleteUsageReportCall$Request.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
                    if (queryLocalInterface5 instanceof apph) {
                        apph = (apph) queryLocalInterface5;
                    } else {
                        apph = new appf(readStrongBinder5);
                    }
                }
                mo47490a(deleteUsageReportCall$Request, apph);
                break;
            case 7:
                RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request = (RegisterCorpusInfoCall$Request) dcl.m8163a(parcel, RegisterCorpusInfoCall$Request.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
                    if (queryLocalInterface6 instanceof apph) {
                        apph = (apph) queryLocalInterface6;
                    } else {
                        apph = new appf(readStrongBinder6);
                    }
                }
                mo47493a(registerCorpusInfoCall$Request, apph);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
