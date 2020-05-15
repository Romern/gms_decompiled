package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: azhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class azhy {

    /* renamed from: a */
    protected final Context f99452a;

    /* renamed from: b */
    protected final azfx f99453b;

    /* renamed from: c */
    protected ciox f99454c;

    /* renamed from: d */
    protected cioz f99455d;

    /* renamed from: e */
    protected cioy f99456e;

    /* renamed from: f */
    protected int f99457f = 2;

    /* renamed from: g */
    protected int f99458g = 2;

    protected azhy(Context context, azfx azfx) {
        this.f99452a = context.getApplicationContext();
        this.f99453b = azfx;
        this.f99457f = 2;
        this.f99458g = 2;
        this.f99455d = null;
        this.f99456e = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final cipc mo54937a(boolean z, cioy cioy) {
        ciov ciov;
        int i;
        cioy cioy2 = cioy;
        azod.m85906a();
        String b = azod.m85907b(this.f99452a, "466216207879");
        ArrayList arrayList = null;
        String a = azob.m85899a(this.f99452a).mo55113a("client_status_report", (Map) null);
        bxvd da = ciou.f191140c.mo74144da();
        if (b != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b.getClass();
            ((ciou) da.f164949b).f191142a = b;
        }
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((ciou) da.f164949b).f191143b = a;
        }
        ciou ciou = (ciou) da.mo74062i();
        if (z) {
            this.f99455d = azou.m85978a(3, (ArrayList) null);
            ArrayList arrayList2 = new ArrayList();
            List d = azcv.m85357a(this.f99452a).mo54702d();
            int size = d.size();
            int i2 = 0;
            while (true) {
                int i3 = 7;
                if (i2 >= size) {
                    break;
                }
                azct c = azcv.m85357a(this.f99452a).mo54699c((LocalEntityId) d.get(i2));
                ArrayList arrayList3 = new ArrayList();
                for (LocalEntityId localEntityId : c.f99010g) {
                    int i4 = localEntityId.f111075b;
                    if (i4 == 1) {
                        i = 4;
                    } else if (i4 != i3) {
                        azoj.m85933c("DB", "unsupported entity type: %s", Integer.valueOf(i4));
                        i = 2;
                    } else {
                        i = 3;
                    }
                    String str = localEntityId.f111074a;
                    bxvd da2 = cipf.f191195c.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ((cipf) da2.f164949b).f191197a = i - 2;
                    if (str != null) {
                        str.getClass();
                        ((cipf) da2.f164949b).f191198b = str;
                    }
                    arrayList3.add((cipf) da2.mo74062i());
                    i3 = 7;
                }
                ByteString a2 = ByteString.m123261a(c.f99004a);
                long j = c.f99006c;
                bxvd da3 = cipb.f191175d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cipb cipb = (cipb) da3.f164949b;
                cipb.f191179c = j;
                if (a2 != null) {
                    a2.getClass();
                    cipb.f191177a = a2;
                }
                if (!cipb.f191178b.mo73666a()) {
                    cipb.f191178b = GeneratedMessageLite.m124021a(cipb.f191178b);
                }
                bxsy.m123078a(arrayList3, cipb.f191178b);
                arrayList2.add((cipb) da3.mo74062i());
                i2++;
                arrayList = null;
            }
            this.f99455d = azou.m85978a(4, arrayList);
            boolean E = azdl.m85412a(this.f99452a).mo54731E();
            boolean f = azdl.m85412a(this.f99452a).mo54775f();
            String a3 = azdl.m85412a(this.f99452a).mo54738a();
            boolean g = azdl.m85412a(this.f99452a).mo54778g();
            this.f99455d = azou.m85978a(5, arrayList);
            List b2 = azoe.m85910b(this.f99452a);
            ArrayList arrayList4 = new ArrayList();
            if (!b2.isEmpty() && b2.get(0) != null) {
                int size2 = b2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList4.add(((Account) b2.get(i5)).name);
                }
            }
            this.f99455d = azou.m85978a(6, arrayList);
            azeg.m85519a();
            int[] b3 = azeg.m85520b(this.f99452a);
            int length = b3.length;
            ArrayList arrayList5 = new ArrayList(length);
            int i6 = 0;
            while (i6 < length) {
                arrayList5.add(Integer.valueOf(b3[i6]));
                i6++;
                arrayList = null;
            }
            this.f99455d = azou.m85978a(7, arrayList);
            bxvd da4 = ciov.f191144i.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ciov ciov2 = (ciov) da4.f164949b;
            ciov2.f191147b = E;
            if (!ciov2.f191146a.mo73666a()) {
                ciov2.f191146a = GeneratedMessageLite.m124021a(ciov2.f191146a);
            }
            bxsy.m123078a(arrayList2, ciov2.f191146a);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ciov ciov3 = (ciov) da4.f164949b;
            if (!ciov3.f191148c.mo73666a()) {
                ciov3.f191148c = GeneratedMessageLite.m124021a(ciov3.f191148c);
            }
            bxsy.m123078a(arrayList4, ciov3.f191148c);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ciov ciov4 = (ciov) da4.f164949b;
            if (!ciov4.f191149d.mo73666a()) {
                ciov4.f191149d = GeneratedMessageLite.m124019a(ciov4.f191149d);
            }
            bxsy.m123078a(arrayList5, ciov4.f191149d);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ciov ciov5 = (ciov) da4.f164949b;
            ciov5.f191150e = f;
            if (a3 != null) {
                a3.getClass();
                ciov5.f191151f = a3;
            }
            ciov5.f191152g = g;
            ciov5.f191153h = 37;
            ciov = (ciov) da4.mo74062i();
        } else {
            ciov = null;
        }
        int i7 = this.f99457f;
        ciox ciox = this.f99454c;
        int i8 = this.f99458g;
        bxvd da5 = cipe.f191190d.mo74144da();
        if (i7 != 0) {
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            cipe cipe = (cipe) da5.f164949b;
            if (i7 != 1) {
                cipe.f191192a = i7 - 2;
            } else {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }
        if (i8 != 0) {
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            cipe cipe2 = (cipe) da5.f164949b;
            if (i8 != 1) {
                cipe2.f191194c = i8 - 2;
            } else {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }
        if (ciox != null) {
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            ciox.getClass();
            ((cipe) da5.f164949b).f191193b = ciox;
        }
        cipe cipe3 = (cipe) da5.mo74062i();
        bxvd da6 = cipc.f191180e.mo74144da();
        if (ciou != null) {
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            ciou.getClass();
            ((cipc) da6.f164949b).f191182a = ciou;
        }
        if (ciov != null) {
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            ciov.getClass();
            ((cipc) da6.f164949b).f191183b = ciov;
        }
        if (cipe3 != null) {
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            cipe3.getClass();
            ((cipc) da6.f164949b).f191184c = cipe3;
        }
        if (cioy2 != null) {
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            cioy.getClass();
            ((cipc) da6.f164949b).f191185d = cioy2;
        }
        return (cipc) da6.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo54938a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract cioy mo54941b();

    /* renamed from: a */
    public final void mo54939a(Intent intent) {
        this.f99453b.mo54886b(mo54938a(), new azhx(this, intent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54940a(cipc cipc) {
        new azhm(this.f99452a, this.f99453b, cipc).mo54921a();
    }
}
