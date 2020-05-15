package p000;

import android.content.Context;
import android.os.Handler;
import android.util.Log;

/* renamed from: bflq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bflq extends bflm implements stv {

    /* renamed from: a */
    public long f114359a = 0;

    /* renamed from: b */
    public boolean f114360b;

    /* renamed from: c */
    public boolean f114361c;

    /* renamed from: d */
    public long f114362d = 0;

    /* renamed from: e */
    private final Handler f114363e;

    /* renamed from: f */
    private final bugn f114364f;

    /* renamed from: g */
    private final stw f114365g;

    /* renamed from: h */
    private final bugo f114366h;

    public bflq(Context context, Handler handler) {
        stw stw = new stw(context);
        bugn a = new bgcb().mo62634a(context);
        bfln bfln = new bfln(this);
        this.f114366h = bfln;
        this.f114363e = handler;
        this.f114359a = 5147455389092024324L;
        this.f114364f = a;
        this.f114365g = stw;
        a.mo72632a(bfln, handler);
    }

    /* renamed from: a */
    public final void mo61891a() {
        if (ceub.m138249d() && !this.f114360b) {
            this.f114360b = true;
            this.f114365g.mo26079a(this);
        }
    }

    /* renamed from: b */
    public final void mo61892b() {
        if (this.f114360b) {
            this.f114360b = false;
            this.f114365g.mo26078a();
            if (this.f114361c) {
                this.f114361c = false;
                this.f114362d = 0;
                mo61894a(1);
            }
        }
    }

    /* renamed from: a */
    public final void mo61894a(int i) {
        bugr a = this.f114364f.mo72627a(this.f114359a);
        if (a != null) {
            bxvd da = bugk.f153787e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bugk bugk = (bugk) da.f164949b;
            bugk.f153790b = i - 1;
            int i2 = bugk.f153789a | 1;
            bugk.f153789a = i2;
            boolean z = this.f114361c;
            int i3 = i2 | 2;
            bugk.f153789a = i3;
            bugk.f153791c = z;
            long j = this.f114362d;
            bugk.f153789a = i3 | 4;
            bugk.f153792d = j;
            bugu a2 = a.mo72640a(129, 0, (bugk) da.mo74062i());
            if (a2 == null) {
                long j2 = this.f114359a;
                StringBuilder sb = new StringBuilder(61);
                sb.append("Unable to post notification to nano app: ");
                sb.append(j2);
                Log.e("WifiConnectionHelperNyc", sb.toString());
                return;
            }
            a2.mo72638a(bflp.f114358a);
        } else if (Log.isLoggable("WifiConnectionHelperNyc", 6)) {
            long j3 = this.f114359a;
            StringBuilder sb2 = new StringBuilder(48);
            sb2.append("couldn't find the nano app: ");
            sb2.append(j3);
            Log.e("WifiConnectionHelperNyc", sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo26077a(boolean z, String str) {
        this.f114363e.post(new bflo(this, z, str));
    }
}
