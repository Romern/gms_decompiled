package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.service.GeoDataChimeraService;
import java.util.concurrent.TimeoutException;

/* renamed from: bied */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bied extends bien {

    /* renamed from: b */
    private final String f120367b;

    /* renamed from: c */
    private final int f120368c;

    /* renamed from: d */
    private final int f120369d;

    /* renamed from: e */
    private final int f120370e;

    /* renamed from: f */
    private final bhrl f120371f;

    /* renamed from: g */
    private final GeoDataChimeraService f120372g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bied(String str, int i, int i2, int i3, PlacesParams placesParams, aeno aeno, bidi bidi, bidx bidx, GeoDataChimeraService geoDataChimeraService, bhpt bhpt) {
        super(65, "GetPhotoImage", placesParams, bidi, bidx, "", bhpt);
        boolean z;
        int i4 = i;
        int i5 = i2;
        sdo.m34959a((Object) str);
        boolean z2 = true;
        if (i4 > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34974b(i5 <= 0 ? false : z2);
        sdo.m34959a(aeno);
        this.f120367b = str;
        this.f120368c = i4;
        this.f120369d = i5;
        this.f120370e = i3;
        this.f120371f = new bhrl(aeno);
        this.f120372g = geoDataChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64562a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo64563b() {
        return 1;
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        int i = this.f120370e;
        bpqk c = bhqq.m101365c(5, this.f120388a);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) c);
        bxvd da = bprb.f138816d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bprb bprb = (bprb) da.f164949b;
        bprb.f138819b = 1;
        int i2 = 1 | bprb.f138818a;
        bprb.f138818a = i2;
        bprb.f138818a = i2 | 2;
        bprb.f138820c = i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bprb bprb2 = (bprb) da.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bprb2.getClass();
        bpqk.f138745l = bprb2;
        bpqk.f138734a |= 512;
        return (bpqk) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        super.mo6502a(context);
        bhql bhql = this.f120372g.f151362b;
        String str = this.f120367b;
        int i = this.f120368c;
        int i2 = this.f120369d;
        bhqj bhqj = new bhqj(bhql, this.f120371f);
        bhql.f119331b.add(new bhqk(ryx.m34685a(i, i2, str), bhqj, i, i2, bhqj));
        try {
            this.f120371f.mo64186a(mo64567f().mo64491a("photoImage", this.f120388a));
        } catch (VolleyError | gid | TimeoutException e) {
            throw bien.m102124a(e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f120371f.mo64186a(status);
    }
}
