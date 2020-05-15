package p000;

import android.content.Context;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;

/* renamed from: pov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pov extends poq {

    /* renamed from: c */
    private final boolean f39950c = ccxy.m132141c();

    /* renamed from: d */
    private final Context f39951d;

    /* renamed from: e */
    private final String f39952e;

    /* renamed from: f */
    private final String f39953f;

    /* renamed from: g */
    private final String f39954g;

    /* renamed from: h */
    private final String f39955h;

    /* renamed from: i */
    private final int f39956i;

    /* renamed from: j */
    private final String f39957j;

    public pov(pnl pnl, plx plx, Context context, String str, String str2, String str3, String str4, int i, String str5) {
        super(pnl, plx, true, false, "UpdateGuestModePairedDeviceOperation");
        this.f39951d = context;
        this.f39955h = str4;
        this.f39952e = str;
        this.f39953f = str2;
        this.f39954g = str3;
        this.f39956i = i;
        this.f39957j = str5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        pnr e = pnl.mo23495e();
        pnm pnm = (pnm) e.f39875d.get(this.f39955h.replace(":", ""));
        if (pnm == null) {
            pnm = pnl.mo23482a(qaf.m31747a(this.f39951d, this.f39952e, this.f39953f, this.f39954g, this.f39956i));
            pnm.f39853j = this.f39951d.getString(C0126R.string.cast_nearby_route_description_identified);
            e.mo23506a(this.f39955h, pnm);
        }
        pnq a = pnm.mo23497a();
        if (a == null) {
            a = new pnq();
            pnm.f39847d = a;
        }
        a.f39869e = true;
        a.f39867c = this.f39955h;
        a.f39868d = true;
        a.f39870f = this.f39957j;
        pnm pnm2 = e.f39873b;
        if (pnm2 != null) {
            pnq a2 = pnm2.mo23497a();
            if (a2.f39866b.containsKey(this.f39955h)) {
                String str = (String) ((Pair) a2.f39866b.get(this.f39955h)).first;
                if (!this.f39950c) {
                    a2.f39866b.remove(this.f39955h);
                }
                a.f39871g = str;
            }
        }
    }
}
