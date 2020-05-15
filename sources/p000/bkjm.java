package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bkjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkjm extends bkdx implements bjwp {

    /* renamed from: d */
    public static final bnic f124424d = bnic.m109491a(4, 1, 2);

    /* renamed from: a */
    private final bjes f124425a = new bjes(1770);

    /* renamed from: b */
    private boolean f124426b = false;

    /* renamed from: e */
    public bkjl f124427e;

    /* renamed from: f */
    public Handler f124428f;

    /* renamed from: g */
    public bwey f124429g;

    /* renamed from: h */
    public boolean f124430h;

    /* renamed from: i */
    public int f124431i = 0;

    /* renamed from: j */
    public final List f124432j = new ArrayList(1);

    /* renamed from: k */
    public final List f124433k = new ArrayList(1);

    /* renamed from: l */
    public final List f124434l = new ArrayList(1);

    /* renamed from: b */
    private final void m106005b(int i, Bundle bundle) {
        this.f124431i = 0;
        this.f124427e.mo52057b(i, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Handler mo66083B() {
        if (this.f124428f == null) {
            this.f124428f = new adzt();
        }
        return this.f124428f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        return false;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return this.f124431i == 5;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return new ArrayList();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f124425a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo53012m() {
        throw new UnsupportedOperationException("showLockScreen is not supported.");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 501) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.f124431i = 1;
            this.f124430h = true;
            mo66088z();
        } else if (i2 == 0) {
            mo66084a(0);
            List list = this.f124432j;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.f124196aK.mo65590a((bjwj) list.get(i3));
            }
            Log.w("TPConsumerVerifFrag", "Show lock screen was canceled!");
        } else {
            mo66084a(2);
            Log.w("TPConsumerVerifFrag", "There was error during show lock screen!");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f124431i = bundle.getInt("state");
            this.f124430h = bundle.getBoolean("hasPerformedAuthentication");
            byte[] byteArray = bundle.getByteArray("networkToken");
            if (byteArray != null && byteArray.length != 0) {
                try {
                    this.f124429g = (bwey) GeneratedMessageLite.m124016a(bwey.f159035i, byteArray, bxus.m123744c());
                } catch (bxwf e) {
                    Log.w("TPConsumerVerifFrag", "Invalid Network Token parse from saved instance!");
                }
            }
        } else {
            this.f124431i = 0;
            this.f124430h = false;
        }
    }

    public void onPause() {
        super.onPause();
        this.f124426b = false;
    }

    public void onResume() {
        super.onResume();
        this.f124426b = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.f124431i);
        bundle.putBoolean("hasPerformedAuthentication", this.f124430h);
        bwey bwey = this.f124429g;
        if (bwey != null) {
            bundle.putByteArray("networkToken", bwey.serializeToBytes());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmkl.f129847j.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmkl) this.f124069w).f129850b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo53014u() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo53015v() {
        throw new UnsupportedOperationException("sendTapAndPayConsumerVerificationRequest not supported");
    }

    /* renamed from: w */
    public final void mo66086w() {
        int i;
        if (this.f124431i == 0) {
            if (!((bmkl) this.f124069w).f129855g) {
                i = 1;
            } else {
                i = 3;
            }
            this.f124431i = i;
        }
        mo66088z();
    }

    /* renamed from: x */
    public final bmkm mo66087x() {
        if (!mo52775bR()) {
            return null;
        }
        mo65884y();
        bxvd da = bmkm.f129858e.mo74144da();
        bmdn bmdn = ((bmkl) this.f124069w).f129850b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        String str = bmdn.f128834b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmkm bmkm = (bmkm) da.f164949b;
        str.getClass();
        bmkm.f129860a |= 1;
        bmkm.f129861b = str;
        bmdn bmdn2 = ((bmkl) this.f124069w).f129850b;
        if (bmdn2 == null) {
            bmdn2 = bmdn.f128831k;
        }
        ByteString bxtx = bmdn2.f128836d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmkm bmkm2 = (bmkm) da.f164949b;
        bxtx.getClass();
        int i = bmkm2.f129860a | 2;
        bmkm2.f129860a = i;
        bmkm2.f129862c = bxtx;
        bwey bwey = this.f124429g;
        if (bwey != null) {
            bwey.getClass();
            bmkm2.f129863d = bwey;
            bmkm2.f129860a = i | 4;
        }
        return (bmkm) da.mo74062i();
    }

    /* renamed from: z */
    public final void mo66088z() {
        bkjl bkjl;
        if (this.f124426b && mo53014u()) {
            int i = this.f124431i;
            if (i == 1) {
                this.f124431i = 2;
                mo53015v();
            } else if (i == 3) {
                this.f124431i = 4;
                mo53012m();
            } else if (i == 5 && (bkjl = this.f124427e) != null) {
                bkjl.mo52079z();
            }
        }
    }

    /* renamed from: a */
    public final void mo66084a(int i) {
        m106005b(i, null);
    }

    /* renamed from: a */
    public final void mo66085a(int i, String str, String str2) {
        Bundle bundle = new Bundle();
        bjvg.m104691a(bundle, 1, str, str2, null, null, getString(17039370));
        m106005b(i, bundle);
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            switch (a - 1) {
                case 13:
                    this.f124432j.add(bjwj);
                    break;
                case 14:
                    this.f124433k.add(bjwj);
                    break;
                case 15:
                    this.f124434l.add(bjwj);
                    break;
                default:
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                    if (a2 != 0) {
                        i2 = a2;
                    }
                    objArr[0] = Integer.valueOf(i2 - 1);
                    throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
            }
        }
    }
}
