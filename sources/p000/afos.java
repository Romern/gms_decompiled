package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.mdd.FileGroupRequest;

/* renamed from: afos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afos extends aaab {

    /* renamed from: a */
    public final String f64458a;

    /* renamed from: b */
    protected final bbch f64459b;

    /* renamed from: c */
    protected final FileGroupRequest f64460c;

    /* renamed from: d */
    protected final String f64461d;

    /* renamed from: e */
    protected final int f64462e;

    /* renamed from: f */
    protected final afot f64463f;

    /* renamed from: g */
    protected final bbep f64464g;

    /* renamed from: h */
    protected final long f64465h = SystemClock.elapsedRealtime();

    public afos(String str, bbch bbch, FileGroupRequest fileGroupRequest, String str2, int i, afot afot, bbep bbep) {
        super(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, str);
        this.f64458a = str;
        this.f64459b = bbch;
        this.f64460c = fileGroupRequest;
        this.f64461d = str2;
        this.f64462e = i;
        this.f64463f = afot;
        this.f64464g = bbep;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo34989a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        Object[] objArr = new Object[7];
        objArr[0] = "AbstractFileGroupOp";
        objArr[1] = this.f64458a;
        FileGroupRequest fileGroupRequest = this.f64460c;
        objArr[2] = fileGroupRequest.f79958a;
        objArr[3] = fileGroupRequest.f79959b;
        Account account = fileGroupRequest.f79960c;
        if (account != null) {
            str = account.name;
        } else {
            str = "no account";
        }
        objArr[4] = str;
        objArr[5] = this.f64461d;
        objArr[6] = this.f64463f;
        bxvd da = bpwz.f139594g.mo74144da();
        String str2 = this.f64460c.f79958a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpwz bpwz = (bpwz) da.f164949b;
        str2.getClass();
        bpwz.f139596a |= 1;
        bpwz.f139597b = str2;
        bxvd da2 = bpxn.f139738g.mo74144da();
        int a = mo34989a();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpxn bpxn = (bpxn) da2.f164949b;
        if (a != 1) {
            bpxn.f139741b = a - 2;
            bpxn.f139740a |= 1;
            bxvd da3 = bpwo.f139538d.mo74144da();
            String str3 = this.f64461d;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpwo bpwo = (bpwo) da3.f164949b;
            str3.getClass();
            int i = bpwo.f139540a | 1;
            bpwo.f139540a = i;
            bpwo.f139541b = str3;
            int i2 = this.f64462e;
            bpwo.f139540a = i | 2;
            bpwo.f139542c = i2;
            bpwo bpwo2 = (bpwo) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxn bpxn2 = (bpxn) da2.f164949b;
            bpwo2.getClass();
            bpxn2.f139742c = bpwo2;
            bpxn2.f139740a |= 4;
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f64465h);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxn bpxn3 = (bpxn) da2.f164949b;
            bpxn3.f139740a |= 16;
            bpxn3.f139744e = elapsedRealtime;
            try {
                mo34990a(da, da2);
            } finally {
                int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - this.f64465h);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpxn bpxn4 = (bpxn) da2.f164949b;
                bpxn4.f139740a |= 32;
                bpxn4.f139745f = elapsedRealtime2;
                Object[] objArr2 = {"AbstractFileGroupOp", this.f64458a, Integer.valueOf(bpxn4.f139744e), Integer.valueOf(((bpxn) da2.f164949b).f139745f)};
                this.f64464g.mo34983a((bpwz) da.mo74062i(), (bpxn) da2.mo74062i());
            }
        } else {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo34990a(bxvd bxvd, bxvd bxvd2);
}
