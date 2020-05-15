package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.provider.ContactsContract;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aclx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aclx extends adzx {

    /* renamed from: a */
    public static aclx f60141a;

    /* renamed from: b */
    final AtomicBoolean f60142b = new AtomicBoolean(false);

    /* renamed from: c */
    private final Handler f60143c;

    /* renamed from: d */
    private final Runnable f60144d;

    public aclx(Context context) {
        super("icing", "ContactsContentObserver", null);
        this.f60143c = new adzt(context.getMainLooper());
        this.f60144d = new aclw(this, context);
    }

    /* renamed from: a */
    public static boolean m49425a(Context context) {
        int i = acmn.f60160a;
        boolean z = false;
        if (((Long) abzt.f58894ai.mo58455c()).longValue() < 0) {
            acnv.m49550c("Contacts content observer disabled.");
            m49426b(context);
            return false;
        } else if (acni.m49502a()) {
            synchronized (aclx.class) {
                if (f60141a == null) {
                    acnv.m49541a("Registering ContactsContentObserver.");
                    f60141a = new aclx(context.getApplicationContext());
                    try {
                        m49427c(context);
                        z = true;
                    } catch (SecurityException e) {
                        new abym(context).mo32447a("cp2_register_observer_failed");
                    }
                }
            }
            return z;
        } else {
            acnv.m49550c("Contacts corpus disabled.");
            m49426b(context);
            return false;
        }
    }

    /* renamed from: b */
    private static synchronized void m49426b(Context context) {
        synchronized (aclx.class) {
            if (f60141a != null) {
                acnv.m49541a("Unregistering contacts observer.");
                context.getContentResolver().unregisterContentObserver(f60141a);
                f60141a = null;
            }
        }
    }

    /* renamed from: c */
    private static synchronized void m49427c(Context context) {
        synchronized (aclx.class) {
            if (f60141a != null) {
                context.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, false, f60141a);
                acnv.m49541a("ContactsContentObserver is registered.");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        acnv.m49555d("ContactsContentObserver onChange selfChange=%b", Boolean.valueOf(z));
        if (!this.f60142b.getAndSet(true)) {
            acnv.m49541a("Scheduling delta update.");
            this.f60143c.postDelayed(this.f60144d, ((Long) abzt.f58894ai.mo58455c()).longValue());
            return;
        }
        acnv.m49541a("Delta update already scheduled.");
    }
}
