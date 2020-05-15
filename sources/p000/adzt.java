package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import com.google.android.gms.common.threads.TraceWrappingParcelable;

/* renamed from: adzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class adzt extends Handler {

    /* renamed from: g */
    public static adzs f62967g = null;

    public adzt() {
    }

    /* renamed from: a */
    private static final void m51488a(Message message, long j) {
        adzs adzs = f62967g;
        if (adzs != null) {
            adzs.mo25884a(message, j);
        }
    }

    /* renamed from: d */
    public final void mo33957d(Message message) {
        m51488a(message, 0);
        sendMessageAtFrontOfQueue(message);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    public final void dispatchMessage(Message message) {
        Boolean bool;
        TraceWrappingParcelable traceWrappingParcelable;
        adzs adzs = f62967g;
        if (adzs != null) {
            Object obj = message.obj;
            if (!(obj instanceof bliy) && !(obj instanceof sna)) {
                if (obj != null) {
                    Bundle peekData = message.peekData();
                    if (peekData != null) {
                        Parcelable parcelable = peekData.getParcelable("gctthpwp");
                        if (parcelable instanceof TraceWrappingParcelable) {
                            traceWrappingParcelable = (TraceWrappingParcelable) parcelable;
                            if (traceWrappingParcelable != null) {
                                message.setData(traceWrappingParcelable.f30391c);
                                Object obj2 = traceWrappingParcelable.f30390b;
                                soh soh = (soh) adzs;
                                if (soh.f44860b.mo66813a()) {
                                    sof sof = (sof) soh.f44860b.mo66814b();
                                    if (sof.f44856c < sof.f44855b.length) {
                                        traceWrappingParcelable.f30390b = null;
                                        traceWrappingParcelable.f30391c = null;
                                        if (sof.f44854a.compareAndSet(false, true)) {
                                            try {
                                                int i = sof.f44856c;
                                                TraceWrappingParcelable[] traceWrappingParcelableArr = sof.f44855b;
                                                if (i < traceWrappingParcelableArr.length) {
                                                    traceWrappingParcelableArr[i] = traceWrappingParcelable;
                                                    sof.f44856c = i + 1;
                                                }
                                            } finally {
                                                sof.f44854a.lazySet(false);
                                            }
                                        }
                                    }
                                }
                                obj = obj2;
                            }
                        }
                    }
                    traceWrappingParcelable = null;
                    if (traceWrappingParcelable != null) {
                    }
                }
                obj = null;
            } else {
                message.obj = null;
            }
            if (obj != null) {
                snc.m35690a(obj, null);
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            try {
                mo6820a(message);
                adzs.mo25885a(bool);
            } catch (Throwable th) {
                adzs.mo25885a(bool);
                throw th;
            }
        } else {
            mo6820a(message);
        }
    }

    public final boolean sendMessageAtTime(Message message, long j) {
        m51488a(message, j);
        return super.sendMessageAtTime(message, j);
    }

    public adzt(Handler.Callback callback) {
        super(callback);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6820a(Message message) {
        super.dispatchMessage(message);
    }

    public adzt(Looper looper) {
        super(looper);
    }

    /* renamed from: a */
    public final void mo33956a(Runnable runnable) {
        adzs adzs = f62967g;
        if (adzs != null) {
            Message obtain = Message.obtain(this, runnable);
            adzs.mo25884a(obtain, 0);
            sendMessageAtFrontOfQueue(obtain);
            return;
        }
        postAtFrontOfQueue(runnable);
    }

    public adzt(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
