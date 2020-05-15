package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: ki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1134ki extends C1132kg {

    /* renamed from: c */
    private final C1137kl f24192c = new C1137kl(this);

    /* renamed from: d */
    private Uri f24193d;

    /* renamed from: e */
    private String[] f24194e;

    /* renamed from: f */
    private String f24195f;

    /* renamed from: g */
    private String[] f24196g;

    /* renamed from: h */
    private String f24197h;

    /* renamed from: i */
    private Cursor f24198i;

    /* renamed from: j */
    private C1187mg f24199j;

    public C1134ki(Context context) {
        super(context);
    }

    public void cancelLoadInBackground() {
        synchronized (this) {
            C1187mg mgVar = this.f24199j;
            if (mgVar != null) {
                mgVar.mo15461b();
            }
        }
    }

    public void deliverResult(Cursor cursor) {
        if (!isReset()) {
            Cursor cursor2 = this.f24198i;
            this.f24198i = cursor;
            if (isStarted()) {
                super.deliverResult((Object) cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f24193d);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f24194e));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f24195f);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f24196g));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f24197h);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f24198i);
    }

    public String[] getProjection() {
        return this.f24194e;
    }

    public String getSelection() {
        return this.f24195f;
    }

    public String[] getSelectionArgs() {
        return this.f24196g;
    }

    public String getSortOrder() {
        return this.f24197h;
    }

    public Uri getUri() {
        return this.f24193d;
    }

    public Cursor loadInBackground() {
        Cursor query;
        synchronized (this) {
            if (!isLoadInBackgroundCanceled()) {
                this.f24199j = new C1187mg();
            } else {
                throw new C1191mk();
            }
        }
        try {
            ContentResolver contentResolver = getContext().getContentResolver();
            Uri uri = this.f24193d;
            String[] strArr = this.f24194e;
            String str = this.f24195f;
            String[] strArr2 = this.f24196g;
            String str2 = this.f24197h;
            C1187mg mgVar = this.f24199j;
            int i = Build.VERSION.SDK_INT;
            query = contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) (mgVar != null ? mgVar.mo15462c() : null));
            if (query != null) {
                query.getCount();
                query.registerContentObserver(this.f24192c);
            }
            synchronized (this) {
                this.f24199j = null;
            }
            return query;
        } catch (RuntimeException e) {
            query.close();
            throw e;
        } catch (Exception e2) {
            if (e2 instanceof OperationCanceledException) {
                throw new C1191mk();
            }
            throw e2;
        } catch (Throwable th) {
            synchronized (this) {
                this.f24199j = null;
                throw th;
            }
        }
    }

    public void onCanceled(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        onStopLoading();
        Cursor cursor = this.f24198i;
        if (cursor != null && !cursor.isClosed()) {
            this.f24198i.close();
        }
        this.f24198i = null;
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
        Cursor cursor = this.f24198i;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.f24198i == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
        cancelLoad();
    }

    public void setProjection(String[] strArr) {
        this.f24194e = strArr;
    }

    public void setSelection(String str) {
        this.f24195f = str;
    }

    public void setSelectionArgs(String[] strArr) {
        this.f24196g = strArr;
    }

    public void setSortOrder(String str) {
        this.f24197h = str;
    }

    public void setUri(Uri uri) {
        this.f24193d = uri;
    }

    public C1134ki(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f24193d = uri;
        this.f24194e = strArr;
        this.f24195f = str;
        this.f24196g = strArr2;
        this.f24197h = str2;
    }
}
