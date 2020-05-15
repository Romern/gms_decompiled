package p000;

import android.util.Log;

/* renamed from: axuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axuz extends axvn {

    /* renamed from: a */
    final /* synthetic */ axue f96442a;

    /* renamed from: b */
    final /* synthetic */ String f96443b;

    /* renamed from: c */
    final /* synthetic */ String f96444c;

    /* renamed from: d */
    final /* synthetic */ ayem f96445d;

    /* renamed from: e */
    final /* synthetic */ axvr f96446e;

    /* renamed from: f */
    final /* synthetic */ ayig f96447f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axuz(axvr axvr, axue axue, String str, String str2, ayig ayig, ayem ayem) {
        super(axvr);
        this.f96446e = axvr;
        this.f96442a = axue;
        this.f96443b = str;
        this.f96444c = str2;
        this.f96447f = ayig;
        this.f96445d = ayem;
    }

    /* renamed from: a */
    public final void mo53610a() {
        try {
            if (Log.isLoggable("ChannelManager", 2)) {
                Log.v("ChannelManager", String.format("Running createChannel(%s, %s, %s, callbacks)", this.f96442a.f96377a, this.f96443b, this.f96444c));
            }
            if (!this.f96446e.f96498e.mo53788b(this.f96443b)) {
                String valueOf = String.valueOf(this.f96443b);
                Log.w("ChannelManager", valueOf.length() == 0 ? new String("Tried to open channel to unreachable node: ") : "Tried to open channel to unreachable node: ".concat(valueOf));
                this.f96447f.mo54015a(13, null, this.f96444c);
            } else if (this.f96446e.f96498e.mo53789c(this.f96443b)) {
                String valueOf2 = String.valueOf(this.f96443b);
                Log.w("ChannelManager", valueOf2.length() == 0 ? new String("Tried to open channel to node through metered network: ") : "Tried to open channel to node through metered network: ".concat(valueOf2));
                this.f96447f.mo54015a(13, null, this.f96444c);
            } else {
                axvt axvt = this.f96446e.f96497d;
                axue axue = this.f96442a;
                String str = this.f96443b;
                int i = 0;
                while (i < 5) {
                    i++;
                    long nextLong = axvt.f96510b.nextLong() & Long.MAX_VALUE;
                    if (!axvt.f96509a.containsKey(new axvs(str, nextLong, true))) {
                        axvz a = axvz.m83358a(str, axue, nextLong, true);
                        axvx a2 = this.f96446e.mo53623a(this.f96445d, a, false);
                        this.f96446e.f96497d.mo53631a(a, a2);
                        this.f96486g = a2;
                        String str2 = this.f96444c;
                        ayig ayig = this.f96447f;
                        sdo.m34959a(ayig);
                        int i2 = a2.f96517e;
                        sdo.m34972a(i2 == 0, "Unexpected sendOpen. State: %s", axvx.m83333d(i2));
                        sdo.m34959a((Object) str2);
                        a2.f96520h = str2;
                        a2.mo53635a(1);
                        a2.f96533u = ayig;
                        bxvd da = ayei.f97299j.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ayei ayei = (ayei) da.f164949b;
                        ayei.f97302b = 1;
                        int i3 = 1 | ayei.f97301a;
                        ayei.f97301a = i3;
                        axvz axvz = a2.f96513a;
                        long j = axvz.f96541c;
                        int i4 = 2 | i3;
                        ayei.f97301a = i4;
                        ayei.f97303c = j;
                        axue axue2 = axvz.f96540b;
                        String str3 = axue2.f96377a;
                        str3.getClass();
                        int i5 = i4 | 8;
                        ayei.f97301a = i5;
                        ayei.f97305e = str3;
                        String str4 = axue2.f96379c;
                        str4.getClass();
                        int i6 = i5 | 16;
                        ayei.f97301a = i6;
                        ayei.f97306f = str4;
                        boolean z = axvz.f96542d;
                        int i7 = i6 | 4;
                        ayei.f97301a = i7;
                        ayei.f97304d = z;
                        boolean z2 = a2.f96514b;
                        int i8 = i7 | 128;
                        ayei.f97301a = i8;
                        ayei.f97309i = z2;
                        String str5 = a2.f96520h;
                        if (str5 != null) {
                            str5.getClass();
                            ayei.f97301a = i8 | 32;
                            ayei.f97307g = str5;
                        }
                        ayen i9 = a2.mo53652i();
                        bxvd bxvd = (bxvd) i9.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) i9);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ayen ayen = (ayen) bxvd.f164949b;
                        ayei ayei2 = (ayei) da.mo74062i();
                        ayen ayen2 = ayen.f97331g;
                        ayei2.getClass();
                        ayen.f97336d = ayei2;
                        ayen.f97333a |= 4;
                        a2.f96531s = a2.f96529q.mo53765a(new aybg(a2.f96513a, (ayen) bxvd.mo74062i()), 15000, 1, a2.f96516d);
                        return;
                    }
                }
                int size = axvt.f96509a.size();
                StringBuilder sb = new StringBuilder(63);
                sb.append("Failed to generate a free channel ID. Items in map: ");
                sb.append(size);
                throw new IllegalStateException(sb.toString());
            }
        } catch (RuntimeException e) {
            this.f96447f.mo54015a(8, null, this.f96444c);
            throw e;
        }
    }
}
