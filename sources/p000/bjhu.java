package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bjhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjhu extends bjgd {

    /* renamed from: DB */
    private boolean f122750DB;

    /* renamed from: l */
    public int f122751l;

    /* renamed from: m */
    private int f122752m;

    protected bjhu(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: d */
    private final void m103530d(int i) {
        if (m103531e(i)) {
            mo65105a(bwot.f160488c, 1);
        }
    }

    /* renamed from: e */
    private final boolean m103531e(int i) {
        int i2 = this.f122751l;
        if (i2 == i) {
            return false;
        }
        this.f122751l = i;
        mo65257t();
        ArrayList arrayList = this.f122640b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((bjgf) arrayList.get(i3)).mo65139cK();
        }
        if (i2 == 0 || !this.f122750DB) {
            return true;
        }
        bxvd da = bpsk.f138966h.mo74144da();
        long j = this.f122639a.f122692a.f122725b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsk bpsk = (bpsk) da.f164949b;
        bpsk.f138968a |= 1;
        bpsk.f138971d = j;
        bpsg bpsg = bpsg.EVENT_TYPE_FUNCTIONAL_DATA_VALUE_CHANGE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsk bpsk2 = (bpsk) da.f164949b;
        bpsk2.f138972e = bpsg.f138957l;
        bpsk2.f138968a |= 2;
        long e = mo65120e();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsk bpsk3 = (bpsk) da.f164949b;
        bpsk3.f138968a |= 8;
        bpsk3.f138973f = e;
        bxvd da2 = bpsm.f138981d.mo74144da();
        int i4 = i2 - 1;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpsm bpsm = (bpsm) da2.f164949b;
        int i5 = bpsm.f138983a | 1;
        bpsm.f138983a = i5;
        bpsm.f138984b = i4;
        bpsm.f138983a = i5 | 2;
        bpsm.f138985c = i - 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsk bpsk4 = (bpsk) da.f164949b;
        bpsm bpsm2 = (bpsm) da2.mo74062i();
        bpsm2.getClass();
        bpsk4.f138970c = bpsm2;
        bpsk4.f138969b = 9;
        bjie.f122757a.mo65279c().mo65294a((bpsk) da.mo74062i(), this.f122639a.f122692a.f122724a.mo71762a());
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65099a(bwny bwny, Bundle bundle) {
        mo65097a(new bjhv(this.f122639a));
        this.f122751l = 2;
        this.f122752m = -1;
        super.mo65099a(bwny, bundle);
    }

    /* renamed from: b */
    public final void mo65252b(int i) {
        this.f122752m = i;
        m103530d(6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: cG */
    public void mo65086cG() {
        mo65257t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final bxvd mo65129o() {
        bxvd o = super.mo65129o();
        int i = this.f122751l;
        if (o.f164950c) {
            o.mo74035c();
            o.f164950c = false;
        }
        bwof bwof = (bwof) o.f164949b;
        int i2 = i - 1;
        bwof bwof2 = bwof.f160430f;
        if (i != 0) {
            bwof.f160434c = i2;
            int i3 = bwof.f160432a | 2;
            bwof.f160432a = i3;
            int i4 = this.f122752m;
            if (i4 != -1) {
                bwof.f160432a = i3 | 4;
                bwof.f160435d = i4;
            }
            return o;
        }
        throw null;
    }

    /* renamed from: p */
    public final void mo65253p() {
        m103530d(3);
    }

    /* renamed from: q */
    public final void mo65254q() {
        m103530d(4);
    }

    /* renamed from: r */
    public final void mo65255r() {
        m103530d(5);
    }

    /* renamed from: s */
    public final void mo65256s() {
        mo65252b(-1);
    }

    /* renamed from: t */
    public final void mo65257t() {
        int i = this.f122751l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int i3 = this.f122751l;
            int i4 = i3 - 1;
            if (i3 != 0) {
                objArr[0] = Integer.valueOf(i4);
                mo65114b(String.format(locale, "Unsupported functional data execution state: %s", objArr));
                return;
            }
            throw null;
        } else if (i2 == 2) {
            mo65258u();
        } else if (i2 == 3) {
            mo65260w();
        } else if (i2 == 4) {
            mo65259v();
        } else if (i2 == 5) {
            mo65261x();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo65258u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo65259v() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo65260w() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo65261x() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65100a(bwny bwny, bwny bwny2) {
        this.f122750DB = mo65109a(bpsg.EVENT_TYPE_FUNCTIONAL_DATA_VALUE_CHANGE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65101a(bwof bwof, bwof bwof2) {
        super.mo65101a(bwof, bwof2);
        if ((bwof2.f160432a & 2) != 0) {
            int a = bwoc.m122151a(bwof2.f160434c);
            if (a == 0) {
                a = 1;
            }
            this.f122751l = a;
        }
        if ((bwof2.f160432a & 4) != 0) {
            this.f122752m = bwof2.f160435d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65103a(bwoq bwoq) {
        boolean z;
        bxvj bxvj = bwoo.f160469e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwoo.f160469e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bwoo bwoo = (bwoo) b;
            int a = bwon.m122162a(bwoo.f160473c);
            if (a == 0 || a != 4) {
                super.mo65103a(bwoq);
                return;
            }
            int i = 1;
            if (bwoo.f160471a != 3) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a2 = bwon.m122162a(bwoo.f160473c);
                if (a2 != 0) {
                    i = a2;
                }
                objArr[0] = Integer.valueOf(i - 1);
                mo65114b(String.format(locale, "Should provide a new function data state when %s is provided", objArr));
                return;
            }
            int a3 = bwoc.m122151a(((Integer) bwoo.f160472b).intValue());
            if (a3 == 0) {
                a3 = 1;
            }
            if (a3 == 5 || a3 == 6) {
                z = false;
            } else {
                z = true;
            }
            bmxy.m108601b(z, String.format(Locale.US, "Unsupported resulting action functional data execution state: %s.", Integer.valueOf(a3 - 1)));
            m103531e(a3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo65110a(bwoi bwoi) {
        bxvj bxvj = bwol.f160461e;
        bwoi.mo74135a(bxvj);
        if (!bwoi.f164952m.mo73911a(bxvj.f164958d)) {
            return true;
        }
        bxvj bxvj2 = bwol.f160461e;
        bwoi.mo74135a(bxvj2);
        Object b = bwoi.f164952m.mo73913b(bxvj2.f164958d);
        if (b == null) {
            b = bxvj2.f164956b;
        } else {
            bxvj2.mo74139a(b);
        }
        bwol bwol = (bwol) b;
        int a = bwok.m122159a(bwol.f160465c);
        if (a == 0) {
            a = 1;
        }
        if (a != 2) {
            if (a == 3) {
                if (bwol.f160463a == 3) {
                    return ((Integer) bwol.f160464b).intValue() == this.f122752m;
                }
                mo65114b("Should provide a error code match state for error code match condition.");
            }
            return true;
        } else if (bwol.f160463a == 2) {
            int a2 = bwoc.m122151a(((Integer) bwol.f160464b).intValue());
            if (a2 == 0) {
                a2 = 1;
            }
            return a2 == this.f122751l;
        } else {
            mo65114b("Should provide a value match state for value match condition.");
            return true;
        }
    }
}
