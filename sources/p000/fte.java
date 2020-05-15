package p000;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RequestIndexingSpecification;
import com.google.android.gms.appdatasearch.ResultClickInfo;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;

/* renamed from: fte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fte extends dck implements ftf {
    public fte() {
        super("com.google.android.gms.appdatasearch.internal.IAppDataSearch");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                SearchResults a = mo11138a(parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt(), parcel.readInt(), (QuerySpecification) dcl.m8163a(parcel, QuerySpecification.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                break;
            case 2:
                SuggestionResults a2 = mo11139a(parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt(), (SuggestSpecification) dcl.m8163a(parcel, SuggestSpecification.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a2);
                break;
            case 3:
                DocumentResults a3 = mo11135a(parcel.createStringArray(), parcel.readString(), parcel.readString(), (QuerySpecification) dcl.m8163a(parcel, QuerySpecification.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a3);
                break;
            case 4:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                long readLong = parcel.readLong();
                RequestIndexingSpecification requestIndexingSpecification = (RequestIndexingSpecification) dcl.m8163a(parcel, RequestIndexingSpecification.CREATOR);
                boolean a4 = mo11144a(readString, readString2, readLong);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a4);
                break;
            case 5:
                CorpusStatus b = mo11147b(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                dcl.m8169b(parcel2, b);
                break;
            case 6:
                String[] a5 = mo11146a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStringArray(a5);
                break;
            case 7:
                mo11141a(parcel.readString(), (RegisterCorpusInfo) dcl.m8163a(parcel, RegisterCorpusInfo.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                Bundle a6 = mo11134a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a6);
                break;
            case 9:
                Bundle a7 = mo11133a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a7);
                break;
            case 10:
                SearchResults a8 = mo11137a(parcel.readString(), parcel.readInt(), parcel.readInt(), (GlobalSearchQuerySpecification) dcl.m8163a(parcel, GlobalSearchQuerySpecification.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a8);
                break;
            case 11:
                mo11140a((GlobalSearchApplicationInfo) dcl.m8163a(parcel, GlobalSearchApplicationInfo.CREATOR));
                parcel2.writeNoException();
                break;
            case 12:
                mo11154c(parcel.readString());
                parcel2.writeNoException();
                break;
            case 13:
                GlobalSearchApplicationInfo[] a9 = mo11145a();
                parcel2.writeNoException();
                parcel2.writeTypedArray(a9, 1);
                break;
            case 14:
                boolean b2 = mo11149b(parcel.readString(), (RegisterCorpusInfo) dcl.m8163a(parcel, RegisterCorpusInfo.CREATOR));
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b2);
                break;
            case 15:
            case 26:
            case 35:
            default:
                return false;
            case 16:
                mo11143a(parcel.createStringArray());
                parcel2.writeNoException();
                break;
            case 17:
                mo11148b(parcel.createStringArray());
                parcel2.writeNoException();
                break;
            case 18:
                mo11157f();
                parcel2.writeNoException();
                break;
            case 19:
                ResultClickInfo resultClickInfo = (ResultClickInfo) dcl.m8163a(parcel, ResultClickInfo.CREATOR);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, mo11163l());
                break;
            case 20:
                parcel.readString();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, mo11162k());
                break;
            case 21:
                parcel.readString();
                parcel2.writeNoException();
                break;
            case 22:
                parcel.readString();
                String[] i2 = mo11160i();
                parcel2.writeNoException();
                parcel2.writeStringArray(i2);
                break;
            case 23:
                parcel.readString();
                parcel.readInt();
                parcel.createByteArray();
                PIMEUpdateResponse j = mo11161j();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, j);
                break;
            case 24:
                PhraseAffinityResponse a10 = mo11136a(parcel.createStringArray(), (PhraseAffinitySpecification) dcl.m8163a(parcel, PhraseAffinitySpecification.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a10);
                break;
            case 25:
                RegisterCorpusInfo c = mo11152c(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                dcl.m8169b(parcel2, c);
                break;
            case 27:
                String[] b3 = mo11151b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStringArray(b3);
                break;
            case 28:
                StorageStats c2 = mo11153c();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, c2);
                break;
            case 29:
                GlobalSearchApplication[] b4 = mo11150b();
                parcel2.writeNoException();
                parcel2.writeTypedArray(b4, 1);
                break;
            case 30:
                parcel.createByteArray();
                dcl.m8167a(parcel);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, mo11164m());
                break;
            case 31:
                int[] g = mo11158g();
                parcel2.writeNoException();
                parcel2.writeIntArray(g);
                break;
            case 32:
                int[] h = mo11159h();
                parcel2.writeNoException();
                parcel2.writeIntArray(h);
                break;
            case 33:
                boolean d = mo11155d();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, d);
                break;
            case 34:
                NativeApiInfo e = mo11156e();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, e);
                break;
            case 36:
                mo11142a(parcel.readString(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
