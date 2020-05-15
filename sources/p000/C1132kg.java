package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: kg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1132kg extends C1140ko {

    /* renamed from: a */
    public volatile C1131kf f24018a;

    /* renamed from: b */
    public long f24019b = -10000;

    /* renamed from: c */
    private Executor f24020c;

    /* renamed from: d */
    private volatile C1131kf f24021d;

    /* renamed from: e */
    private long f24022e;

    /* renamed from: f */
    private Handler f24023f;

    public C1132kg(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14457a() {
        if (this.f24021d == null && this.f24018a != null) {
            if (this.f24018a.f23964a) {
                this.f24018a.f23964a = false;
                this.f24023f.removeCallbacks(this.f24018a);
            }
            if (this.f24022e <= 0 || SystemClock.uptimeMillis() >= this.f24019b + this.f24022e) {
                if (this.f24020c == null) {
                    this.f24020c = getExecutor();
                }
                C1131kf kfVar = this.f24018a;
                Executor executor = this.f24020c;
                if (kfVar.f24919f != 1) {
                    int i = kfVar.f24919f;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    } else if (i2 == 1) {
                        throw new IllegalStateException("Cannot execute task: the task is already running.");
                    } else if (i2 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    } else {
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                } else {
                    kfVar.f24919f = 2;
                    executor.execute(kfVar.f24916c);
                }
            } else {
                this.f24018a.f23964a = true;
                this.f24023f.postAtTime(this.f24018a, this.f24019b + this.f24022e);
            }
        }
    }

    public void cancelLoadInBackground() {
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.f24018a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f24018a);
            printWriter.print(" waiting=");
            printWriter.println(this.f24018a.f23964a);
        }
        if (this.f24021d != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f24021d);
            printWriter.print(" waiting=");
            printWriter.println(this.f24021d.f23964a);
        }
        if (this.f24022e != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            printWriter.print(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(this.f24022e)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f24019b != -10000) {
                str2 = "-" + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - this.f24019b));
            } else {
                str2 = "--";
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    /* access modifiers changed from: protected */
    public Executor getExecutor() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.f24021d != null;
    }

    public abstract Object loadInBackground();

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        if (this.f24018a == null) {
            return false;
        }
        if (!isStarted()) {
            onContentChanged();
        }
        if (this.f24021d != null) {
            if (this.f24018a.f23964a) {
                this.f24018a.f23964a = false;
                this.f24023f.removeCallbacks(this.f24018a);
            }
            this.f24018a = null;
            return false;
        } else if (!this.f24018a.f23964a) {
            C1131kf kfVar = this.f24018a;
            kfVar.f24917d.set(true);
            boolean cancel = kfVar.f24916c.cancel(false);
            if (cancel) {
                this.f24021d = this.f24018a;
                cancelLoadInBackground();
            }
            this.f24018a = null;
            return cancel;
        } else {
            this.f24018a.f23964a = false;
            this.f24023f.removeCallbacks(this.f24018a);
            this.f24018a = null;
            return false;
        }
    }

    public void onCanceled(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        cancelLoad();
        this.f24018a = new C1131kf(this);
        mo14457a();
    }

    /* access modifiers changed from: protected */
    public Object onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.f24022e = j;
        if (j != 0) {
            this.f24023f = new Handler();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14458a(C1131kf kfVar, Object obj) {
        onCanceled(obj);
        if (this.f24021d == kfVar) {
            rollbackContentChanged();
            this.f24019b = SystemClock.uptimeMillis();
            this.f24021d = null;
            deliverCancellation();
            mo14457a();
        }
    }
}
