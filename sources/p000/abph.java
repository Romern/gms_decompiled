package p000;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;

/* renamed from: abph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abph implements OnAccountsUpdateListener {

    /* renamed from: h */
    public static final /* synthetic */ int f57842h = 0;

    /* renamed from: a */
    public final Context f57843a;

    /* renamed from: b */
    public final abqv f57844b;

    /* renamed from: c */
    public final NativeIndex f57845c;

    /* renamed from: d */
    public final abzo f57846d;

    /* renamed from: e */
    public final acao f57847e;

    /* renamed from: f */
    public final abym f57848f;

    /* renamed from: g */
    public final adyd f57849g;

    /* renamed from: i */
    private final acpl f57850i;

    public abph(Context context, acpl acpl, abqv abqv, NativeIndex nativeIndex, abzo abzo, acao acao, abym abym) {
        this.f57843a = context;
        this.f57850i = acpl;
        this.f57844b = abqv;
        this.f57845c = nativeIndex;
        this.f57846d = abzo;
        this.f57847e = acao;
        this.f57848f = abym;
        this.f57849g = adyd.m51363a(context);
    }

    public final void onAccountsUpdated(Account[] accountArr) {
        this.f57850i.mo32995d(new abpf(this, bqbd.READ_UPDATED_ACCOUNTS, accountArr));
        if (cenc.m137460e()) {
            this.f57850i.mo32995d(new abpg(this, bqbd.USER_ACTIONS_UPLOAD_ACCOUNT_CHANGE));
        }
    }
}
