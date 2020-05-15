package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.Spanned;
import com.google.android.chimera.Activity;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;
import com.google.android.libraries.walletp2p.model.Contact;
import java.util.List;

/* renamed from: axfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axfi {
    @Deprecated

    /* renamed from: a */
    public final Intent f95879a;

    /* renamed from: b */
    private final TransferParams f95880b;

    protected axfi(TransferParams transferParams, Intent intent) {
        this.f95880b = transferParams;
        this.f95879a = intent;
    }

    /* renamed from: a */
    public static Intent m82533a(TransferParams transferParams, Intent intent) {
        return new Intent("com.google.android.gms.walletp2p.COMPLETE_TRANSFER").putExtras(intent).putExtra("transfer_params", transferParams);
    }

    /* renamed from: a */
    public abstract int mo53073a();

    /* renamed from: a */
    public abstract Spanned mo53074a(Context context, String str);

    /* renamed from: a */
    public abstract String mo53075a(Context context);

    /* renamed from: a */
    public abstract void mo53076a(Context context, axif axif, Account account, axls axls, axls axls2);

    /* renamed from: a */
    public abstract void mo53077a(axif axif, Account account, axhe axhe);

    /* renamed from: a */
    public abstract void mo53078a(Activity activity, axif axif, Account account, rjx rjx, long j, long j2, byte[] bArr, List list, axfh axfh, String str);

    /* renamed from: b */
    public abstract String mo53079b(Context context);

    /* renamed from: b */
    public abstract boolean mo53080b();

    /* renamed from: c */
    public abstract String mo53081c(Context context);

    /* renamed from: c */
    public abstract boolean mo53082c();

    /* renamed from: d */
    public abstract String mo53083d(Context context);

    /* renamed from: d */
    public abstract boolean mo53084d();

    /* renamed from: e */
    public String mo53085e(Context context) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public abstract boolean mo53086e();

    /* renamed from: f */
    public String mo53087f(Context context) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public abstract boolean mo53088f();

    /* renamed from: g */
    public abstract boolean mo53089g();

    /* renamed from: h */
    public abstract boolean mo53090h();

    /* renamed from: i */
    public abstract boolean mo53091i();

    /* renamed from: j */
    public abstract boolean mo53092j();

    /* renamed from: k */
    public boolean mo53093k() {
        return false;
    }

    /* renamed from: l */
    public abstract boolean mo53094l();

    /* renamed from: m */
    public boolean mo53098m() {
        return true;
    }

    /* renamed from: n */
    public boolean mo53102n() {
        return true;
    }

    /* renamed from: o */
    public boolean mo53103o() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo53104p() {
        return this.f95880b.f110651j;
    }

    /* renamed from: q */
    public final boolean mo53105q() {
        return this.f95879a.getBooleanExtra("draft_mode", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo53106r() {
        return this.f95880b.f110648g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final String mo53107s() {
        return this.f95880b.f110649h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Contact mo53108t() {
        return this.f95880b.f110647f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final String mo53109u() {
        if (this.f95879a.hasExtra("transfer_instrument_id")) {
            return this.f95879a.getStringExtra("transfer_instrument_id");
        }
        return ((Instrument) this.f95879a.getParcelableExtra("transfer_instrument")).f110820a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final String mo53110v() {
        return this.f95879a.getStringExtra("transfer_idempotency_key");
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final btsb mo53111w() {
        return this.f95880b.f110643b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final String mo53112x() {
        return this.f95880b.f110645d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo53113y() {
        return this.f95880b.f110652k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final byte[] mo53114z() {
        return this.f95879a.getByteArrayExtra("funds_transfer_token");
    }
}
