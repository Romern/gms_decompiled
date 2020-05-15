package p000;

import android.content.Context;
import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: vwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwf implements vxt {

    /* renamed from: a */
    protected static WeakReference f50130a;

    /* renamed from: b */
    private qws f50131b;

    vwf() {
    }

    /* renamed from: a */
    public static synchronized vwf m41483a(Context context) {
        synchronized (vwf.class) {
            if (f50130a != null) {
                if (((vwf) f50130a.get()) != null) {
                    vwf vwf = (vwf) f50130a.get();
                    return vwf;
                }
            }
            vwf vwf2 = new vwf(context);
            f50130a = new WeakReference(vwf2);
            return vwf2;
        }
    }

    /* renamed from: b */
    public static vvy m41484b(Throwable th) {
        bxvd da = vvy.f50097b.mo74144da();
        while (th != null) {
            bxvd da2 = vvx.f50091e.mo74144da();
            String simpleName = th.getClass().getSimpleName();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            vvx vvx = (vvx) da2.f164949b;
            simpleName.getClass();
            vvx.f50093a |= 1;
            vvx.f50094b = simpleName;
            if (th.getMessage() != null) {
                String message = th.getMessage();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                vvx vvx2 = (vvx) da2.f164949b;
                message.getClass();
                vvx2.f50093a |= 2;
                vvx2.f50095c = message;
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                bxvd da3 = vwd.f50122g.mo74144da();
                if (stackTraceElement.getClassName() != null) {
                    String className = stackTraceElement.getClassName();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    vwd vwd = (vwd) da3.f164949b;
                    className.getClass();
                    vwd.f50124a |= 1;
                    vwd.f50125b = className;
                }
                if (stackTraceElement.getMethodName() != null) {
                    String methodName = stackTraceElement.getMethodName();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    vwd vwd2 = (vwd) da3.f164949b;
                    methodName.getClass();
                    vwd2.f50124a |= 2;
                    vwd2.f50126c = methodName;
                }
                if (stackTraceElement.getFileName() != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    vwd vwd3 = (vwd) da3.f164949b;
                    fileName.getClass();
                    vwd3.f50124a |= 4;
                    vwd3.f50127d = fileName;
                }
                if (!stackTraceElement.isNativeMethod()) {
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    vwd vwd4 = (vwd) da3.f164949b;
                    vwd4.f50124a |= 8;
                    vwd4.f50128e = lineNumber;
                } else {
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    vwd vwd5 = (vwd) da3.f164949b;
                    vwd5.f50124a |= 16;
                    vwd5.f50129f = true;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                vvx vvx3 = (vvx) da2.f164949b;
                vwd vwd6 = (vwd) da3.mo74062i();
                vwd6.getClass();
                if (!vvx3.f50096d.mo73666a()) {
                    vvx3.f50096d = GeneratedMessageLite.m124021a(vvx3.f50096d);
                }
                vvx3.f50096d.add(vwd6);
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            vvy vvy = (vvy) da.f164949b;
            vvx vvx4 = (vvx) da2.mo74062i();
            vvx4.getClass();
            vvy.mo28908a();
            vvy.f50099a.add(vvx4);
            th = th.getCause();
        }
        return (vvy) da.mo74062i();
    }

    private vwf(Context context) {
        this.f50131b = new qws(context, "DROIDGUARD", null);
    }

    /* renamed from: a */
    public final synchronized void mo28911a(Throwable th) {
        if (this.f50131b != null) {
            this.f50131b.mo24335a(m41484b(th).serializeToBytes()).mo24327b();
            return;
        }
        Log.e("DG", "ErrorReporter not initialized");
    }
}
