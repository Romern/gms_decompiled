package p000;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.ParcelFileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: akho */
final /* synthetic */ class akho implements Callable {

    /* renamed from: a */
    private final Account f72017a;

    /* renamed from: b */
    private final Context f72018b;

    /* renamed from: c */
    private final rjx f72019c;

    public akho(rjx rjx, Account account, Context context) {
        this.f72019c = rjx;
        this.f72017a = account;
        this.f72018b = context;
    }

    public final Object call() {
        ParcelFileDescriptor b;
        rjx rjx = this.f72019c;
        Account account = this.f72017a;
        Context context = this.f72018b;
        allh allh = (allh) rjx.mo24713a(account.name, 1, 0).mo9455a();
        if (allh != null) {
            try {
                b = allh.mo40486b();
                Bitmap a = alls.m61238a(b);
                if (a != null) {
                    int a2 = akim.m59828a(context, 36);
                    if (a.getWidth() != a.getHeight() || a.getWidth() != a2) {
                        a = suj.m36369a(a, a2);
                    }
                    Bitmap a3 = suj.m36368a(context, a, new Paint());
                    srz.m36170a(b);
                    allh.mo12460c();
                    return a3;
                }
                throw new Exception("Failed to load image from People.Images API");
            } catch (Throwable th) {
                allh.mo12460c();
                throw th;
            }
        } else {
            throw new Exception("Failed to load image from People.Images API");
        }
    }
}
