package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* renamed from: atue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class atue implements auat, auas {

    /* renamed from: f */
    public final TokenizePanChimeraActivity f90898f;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atue(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        this.f90898f = tokenizePanChimeraActivity;
    }

    /* renamed from: d */
    static final bpbr m76355d(atsy atsy) {
        bxvd da = bpbr.f135616f.mo74144da();
        String str = atsy.f90849l;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbr bpbr = (bpbr) da.f164949b;
        str.getClass();
        int i = 1;
        int i2 = bpbr.f135618a | 1;
        bpbr.f135618a = i2;
        bpbr.f135619b = str;
        String str2 = atsy.f90861x;
        str2.getClass();
        int i3 = i2 | 16;
        bpbr.f135618a = i3;
        bpbr.f135622e = str2;
        boolean z = atsy.f90852o;
        bpbr.f135618a = i3 | 4;
        bpbr.f135621d = false;
        if (bpbt.m111759a(atsy.f90839b) != 0) {
            i = bpbt.m111759a(atsy.f90839b);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbr bpbr2 = (bpbr) da.f164949b;
        int i4 = i - 1;
        if (i != 0) {
            bpbr2.f135620c = i4;
            bpbr2.f135618a |= 2;
            return (bpbr) da.mo74062i();
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50178a() {
        this.f90898f.finish();
    }

    /* renamed from: a */
    public void mo50172a(int i) {
    }

    /* renamed from: a */
    public void mo50173a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo50168a(int i, int i2, Intent intent, atsy atsy) {
    }

    /* renamed from: a */
    public void mo50171a(Message message, atsy atsy) {
    }

    /* renamed from: a */
    public abstract void mo50169a(atsy atsy);

    /* renamed from: a */
    public void mo50177a(MessageEventParcelable messageEventParcelable) {
    }

    /* renamed from: b */
    public final Handler mo50185b() {
        return this.f90898f.f108911h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final atam mo50188c(atsy atsy) {
        atam atam = new atam(this.f90898f, atsy.f90857t);
        atam.f89955a = atsy.f90838ad;
        return atam;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo50186b(int i) {
        return this.f90898f.getString(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo50189c() {
        TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90898f;
        tokenizePanChimeraActivity.mo59478a(null, tokenizePanChimeraActivity.getString(C0126R.string.common_try_again), tokenizePanChimeraActivity.getString(C0126R.string.common_cancel));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo50187b(int i, int i2) {
        this.f90898f.setResult(i, new Intent().putExtra("tokenization_result_code", i2));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity.a(boolean, int):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity.a(int, int):void
      com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity.a(java.lang.String, java.lang.String):void
      auat.a(int, int):void
      com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity.a(boolean, int):void */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo50190c(int i) {
        this.f90898f.mo59480a(true, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50179a(int i, Intent intent) {
        intent.hasExtra("tokenization_result_code");
        this.f90898f.setResult(i, intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50180a(int i, atsy atsy) {
        if (cgwn.m147263m()) {
            atam c = mo50188c(atsy);
            bpbr d = m76355d(atsy);
            bxvd da = bpbj.f135600d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbj bpbj = (bpbj) da.f164949b;
            bpbj.f135603b = 4;
            int i2 = 1;
            bpbj.f135602a |= 1;
            if (bpbt.m111759a(i) != 0) {
                i2 = bpbt.m111759a(i);
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbj bpbj2 = (bpbj) da.f164949b;
            int i3 = i2 - 1;
            if (i2 != 0) {
                bpbj2.f135604c = i3;
                bpbj2.f135602a |= 2;
                c.mo49739a(d, (bpbj) da.mo74062i());
            } else {
                throw null;
            }
        }
        this.f90898f.mo59481b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50181a(Intent intent, int i) {
        this.f90898f.startActivityForResult(intent, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50182a(Message message) {
        this.f90898f.f108912i.send(message);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50183a(btnf btnf) {
        this.f90898f.mo59477a(btnf);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50184a(String str, String str2) {
        this.f90898f.mo59479a(str, str2);
    }
}
