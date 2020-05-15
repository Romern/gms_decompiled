package p000;

import android.accounts.Account;
import android.accounts.AccountsException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: myv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class myv extends bzsu {

    /* renamed from: a */
    final /* synthetic */ myw f34970a;

    public myv(myw myw) {
        this.f34970a = myw;
    }

    /* renamed from: a */
    public final void mo19706a() {
        myw.f34971a.mo25414c("Start scotty uploading.", new Object[0]);
        this.f34970a.f34974d.set(0);
    }

    /* renamed from: a */
    public final void mo19707a(bzsq bzsq) {
        lvn lvn = myw.f34971a;
        long d = bzsq.mo74571d();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Scotty bytes uploaded : ");
        sb.append(d);
        lvn.mo25409a(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public final void mo19708a(bzsq bzsq, bzsb bzsb) {
        byte[] bArr;
        int i = bzsb.f171220a;
        lvn lvn = myw.f34971a;
        long j = this.f34970a.f34981k;
        long d = bzsq.mo74571d();
        StringBuilder sb = new StringBuilder(81);
        sb.append("Scotty response: res=");
        sb.append(i);
        sb.append(" raw=");
        sb.append(j);
        sb.append(" up=");
        sb.append(d);
        lvn.mo25414c(sb.toString(), new Object[0]);
        nds nds = this.f34970a.f34982l;
        nds.mo20498a(bzsq.mo74571d(), this.f34970a.f34981k);
        bxvd bxvd = nds.f35360c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mrj mrj = (mrj) bxvd.f164949b;
        mrj mrj2 = mrj.f34426i;
        mrj.f34428a |= 32;
        mrj.f34434g = i;
        bxvd bxvd2 = nds.f35360c;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        mrj mrj3 = (mrj) bxvd2.f164949b;
        int i2 = 1;
        mrj3.f34433f = 1;
        mrj3.f34428a |= 16;
        if (i == 200) {
            blbn a = this.f34970a.f34972b.mo20473a();
            String c = bzsb.f171221b.mo74563c("X-Server-Object-Version");
            if (!(a == null || c == null)) {
                myw myw = this.f34970a;
                ncz.m25948a(myw.f34976f, myw.f34977g, c, a);
            }
            mys mys = this.f34970a.f34978h;
            if (mys != null) {
                mys.mo20330a();
            }
        } else if (i == 401) {
            try {
                myw myw2 = this.f34970a;
                String str = ((lth) myw2.f34984n.f164949b).f32920e;
                adyd a2 = adyd.m51363a(myw2.f34976f);
                Account a3 = new mzf(myw2.f34976f).mo19624a();
                if (a3 != null) {
                    a2.mo33921b(a3.type, str);
                } else {
                    throw new AccountsException("Missing backup account");
                }
            } catch (Exception e) {
                throw new AccountsException("Fail to invalid auth token.");
            } catch (AccountsException e2) {
                lvn lvn2 = myw.f34971a;
                String valueOf = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb2.append("Failed to invalidate auth token : ");
                sb2.append(valueOf);
                lvn2.mo25418e(sb2.toString(), new Object[0]);
            }
        }
        if (i != 200) {
            this.f34970a.f34973c.mo20318a();
            lvn lvn3 = myw.f34971a;
            String valueOf2 = String.valueOf(bzsb.mo74565a());
            lvn3.mo25409a(valueOf2.length() == 0 ? new String("Scotty http response headers: ") : "Scotty http response headers: ".concat(valueOf2), new Object[0]);
            if (ccnf.f179489a.mo6606a().mo76422P()) {
                try {
                    InputStream inputStream = bzsb.f171222c;
                    if (inputStream != null) {
                        bArr = boav.m111020a(inputStream);
                    } else {
                        bArr = null;
                    }
                    if (bArr != null) {
                        myw.f34971a.mo25409a("Full response: %s", new String(bArr, StandardCharsets.UTF_8));
                    } else {
                        myw.f34971a.mo25418e("Response body is null", new Object[0]);
                    }
                } catch (IOException e3) {
                    myw.f34971a.mo25418e("Error reading response body", new Object[0]);
                }
            }
        }
        int a4 = bzxt.m126308a(mck.m24876a(bzsb).f171801b);
        if (a4 != 0) {
            i2 = a4;
        }
        lvn lvn4 = myw.f34971a;
        String valueOf3 = String.valueOf(Integer.toString(i2 - 1));
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 31);
        sb3.append("Response status code returned: ");
        sb3.append(valueOf3);
        lvn4.mo25412b(sb3.toString(), new Object[0]);
        if (i2 == 50008 && ccnr.m130891c()) {
            bxvd bxvd3 = this.f34970a.f34982l.f35360c;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            mrj mrj4 = (mrj) bxvd3.f164949b;
            mrj4.f34433f = 13;
            mrj4.f34428a |= 16;
            this.f34970a.f34983m = 50008;
        }
        if (i2 == 50006 && ccog.m130999c()) {
            this.f34970a.f34983m = 50006;
        }
        if (!(i == 200 || i == 503 || i == 401)) {
            myw myw3 = this.f34970a;
            ncz.m25949b(myw3.f34976f, myw3.f34977g);
            if (this.f34970a.f34978h != null && (i2 != 50006 || !ccog.m130999c())) {
                this.f34970a.f34978h.mo20331b();
            }
        }
        synchronized (this.f34970a.f34975e) {
            this.f34970a.f34974d.set(bzsb.f171220a);
            this.f34970a.f34975e.notify();
        }
    }

    /* renamed from: a */
    public final void mo19709a(bzsq bzsq, bzss bzss) {
        int i;
        mys mys;
        if (!this.f34970a.f34980j) {
            lvn lvn = myw.f34971a;
            String valueOf = String.valueOf(bzss);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Scotty transfer exception. ");
            sb.append(valueOf);
            lvn.mo25416d(sb.toString(), new Object[0]);
            myw.f34971a.mo25408a("Scotty transfer exception. ", bzss, new Object[0]);
            nds nds = this.f34970a.f34982l;
            long d = bzsq.mo74571d();
            long j = this.f34970a.f34981k;
            bxvd bxvd = nds.f35360c;
            if ((((mrj) bxvd.f164949b).f34428a & 16) == 0) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                mrj mrj = (mrj) bxvd.f164949b;
                mrj mrj2 = mrj.f34426i;
                mrj.f34433f = 3;
                mrj.f34428a |= 16;
            }
            nds.mo20498a(d, j);
            bxvd bxvd2 = nds.f35360c;
            mcf mcf = mcf.ELIGIBLE;
            bzsr bzsr = bzsr.BAD_URL;
            int ordinal = bzss.f171294a.ordinal();
            if (ordinal != 0) {
                i = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? 15 : 14 : 13 : 12 : 11;
            } else {
                i = 10;
            }
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            mrj mrj3 = (mrj) bxvd2.f164949b;
            mrj mrj4 = mrj.f34426i;
            mrj3.f34428a |= 64;
            mrj3.f34435h = i;
            this.f34970a.f34973c.mo20318a();
            if (!this.f34970a.f34979i && (mys = this.f34970a.f34978h) != null) {
                mys.mo20331b();
            }
            synchronized (this.f34970a.f34975e) {
                this.f34970a.f34974d.set(-1);
                this.f34970a.f34975e.notify();
            }
            return;
        }
        myw.f34971a.mo25414c("Transfer aborted because the backup data is unchaged.", new Object[0]);
        if (!(bmzo.m108688b(bzss) instanceof nag) || ((nag) bmzo.m108688b(bzss)).f35131a != naf.BACKUP_UNCHANGED) {
            myw.f34971a.mo25415d("Expected transfer aborted, but received another exception.", bzss, new Object[0]);
        }
        this.f34970a.f34982l.mo20498a(bzsq.mo74571d(), this.f34970a.f34981k);
        mys mys2 = this.f34970a.f34978h;
        if (mys2 != null) {
            mys2.mo20330a();
        }
        synchronized (this.f34970a.f34975e) {
            this.f34970a.f34974d.set(-2);
            this.f34970a.f34975e.notify();
        }
    }
}
