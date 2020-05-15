package p000;

import android.content.Context;
import android.os.RemoteException;
import com.felicanetworks.sdu.ErrorInfoFactory;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlacesClientIdentifier;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bieu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bieu implements bieq {

    /* renamed from: a */
    private final aenr f120410a;

    /* renamed from: b */
    private final rnt f120411b;

    /* renamed from: c */
    private final PlacesClientIdentifier f120412c;

    @Deprecated
    public bieu(PlacesClientIdentifier placesClientIdentifier, aenr aenr) {
        this.f120412c = placesClientIdentifier;
        this.f120410a = aenr;
        this.f120411b = null;
    }

    /* renamed from: a */
    private final void m102177a(int i, String str) {
        aenr aenr = this.f120410a;
        if (aenr != null) {
            bioc.m102645a(i, str, aenr);
        } else if (this.f120411b != null) {
            try {
                this.f120411b.mo11797a(str != null ? aemj.m52158b(i, str) : aemj.m52157b(i));
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: a */
    public final int mo64569a() {
        return 3;
    }

    /* renamed from: b */
    public final int mo64573b() {
        return 1;
    }

    /* renamed from: c */
    public final String mo64574c() {
        return "";
    }

    /* renamed from: d */
    public final boolean mo64575d() {
        return false;
    }

    public bieu(PlacesClientIdentifier placesClientIdentifier, rnt rnt) {
        sdo.m34959a(rnt);
        sdo.m34959a(placesClientIdentifier);
        this.f120412c = placesClientIdentifier;
        this.f120410a = null;
        this.f120411b = rnt;
    }

    /* renamed from: a */
    public final bpqk mo64570a(PlacesParams placesParams) {
        PlacesClientIdentifier placesClientIdentifier = this.f120412c;
        String str = placesClientIdentifier.f79496a;
        String str2 = placesClientIdentifier.f79497b;
        bpqk c = bhqq.m101365c(15, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) c);
        bxvd da = bppg.f138615d.mo74144da();
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bppg bppg = (bppg) da.f164949b;
            str.getClass();
            bppg.f138617a |= 1;
            bppg.f138618b = str;
        }
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bppg bppg2 = (bppg) da.f164949b;
            str2.getClass();
            bppg2.f138617a |= 2;
            bppg2.f138619c = str2;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bppg bppg3 = (bppg) da.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bppg3.getClass();
        bpqk.f138753t = bppg3;
        bpqk.f138734a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        return (bpqk) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        bidx bidx = new bidx(2);
        try {
            PlacesClientIdentifier placesClientIdentifier = this.f120412c;
            bidx.mo64561a(placesClientIdentifier.f79496a, placesClientIdentifier.f79497b);
            m102177a(ErrorInfoFactory.STATUS_CODE_SERVER_MAINTENANCE, "This app is whitelisted to receive personalized place inference results");
        } catch (aaaj e) {
            m102177a(9202, "This app is not whitelisted to receive personalized place inference results");
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102177a(status.f30115i, status.f30116j);
    }
}
