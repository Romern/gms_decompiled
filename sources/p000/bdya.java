package p000;

import android.os.Binder;

/* renamed from: bdya */
public final /* synthetic */ class bdya {
    /* renamed from: a */
    public static Object m91570a(bdyb bdyb) {
        long clearCallingIdentity;
        try {
            return bdyb.mo58431a();
        } catch (SecurityException e) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a = bdyb.mo58431a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
