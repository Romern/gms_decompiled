package p000;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: ko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1140ko {

    /* renamed from: a */
    private int f24553a;

    /* renamed from: b */
    private C1139kn f24554b;

    /* renamed from: c */
    private C1138km f24555c;

    /* renamed from: d */
    private final Context f24556d;

    /* renamed from: e */
    private boolean f24557e = false;

    /* renamed from: f */
    private boolean f24558f = false;

    /* renamed from: g */
    private boolean f24559g = true;

    /* renamed from: h */
    private boolean f24560h = false;

    /* renamed from: i */
    private boolean f24561i = false;

    public C1140ko(Context context) {
        this.f24556d = context.getApplicationContext();
    }

    public void abandon() {
        this.f24558f = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.f24561i = false;
    }

    public String dataToString(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        return sb.toString();
    }

    public void deliverCancellation() {
        C1138km kmVar = this.f24555c;
        if (kmVar != null) {
            kmVar.onLoadCanceled(this);
        }
    }

    public void deliverResult(Object obj) {
        C1139kn knVar = this.f24554b;
        if (knVar != null) {
            knVar.onLoadComplete(this, obj);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f24553a);
        printWriter.print(" mListener=");
        printWriter.println(this.f24554b);
        if (this.f24557e || this.f24560h || this.f24561i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f24557e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f24560h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f24561i);
        }
        if (this.f24558f || this.f24559g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f24558f);
            printWriter.print(" mReset=");
            printWriter.println(this.f24559g);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.f24556d;
    }

    public int getId() {
        return this.f24553a;
    }

    public boolean isAbandoned() {
        return this.f24558f;
    }

    public boolean isReset() {
        return this.f24559g;
    }

    public boolean isStarted() {
        return this.f24557e;
    }

    /* access modifiers changed from: protected */
    public void onAbandon() {
    }

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        return false;
    }

    public void onContentChanged() {
        if (!this.f24557e) {
            this.f24560h = true;
        } else {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
    }

    /* access modifiers changed from: protected */
    public void onReset() {
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
    }

    public void registerListener(int i, C1139kn knVar) {
        if (this.f24554b == null) {
            this.f24554b = knVar;
            this.f24553a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void registerOnLoadCanceledListener(C1138km kmVar) {
        if (this.f24555c == null) {
            this.f24555c = kmVar;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void reset() {
        onReset();
        this.f24559g = true;
        this.f24557e = false;
        this.f24558f = false;
        this.f24560h = false;
        this.f24561i = false;
    }

    public void rollbackContentChanged() {
        if (this.f24561i) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.f24557e = true;
        this.f24559g = false;
        this.f24558f = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.f24557e = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.f24560h;
        this.f24560h = false;
        this.f24561i |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.f24553a);
        sb.append("}");
        return sb.toString();
    }

    public void unregisterListener(C1139kn knVar) {
        C1139kn knVar2 = this.f24554b;
        if (knVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (knVar2 == knVar) {
            this.f24554b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public void unregisterOnLoadCanceledListener(C1138km kmVar) {
        C1138km kmVar2 = this.f24555c;
        if (kmVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (kmVar2 == kmVar) {
            this.f24555c = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }
}
