package p000;

import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import java.io.File;

/* renamed from: aayc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aayc extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ File f56812a;

    /* renamed from: b */
    final /* synthetic */ boolean f56813b;

    /* renamed from: c */
    final /* synthetic */ File f56814c;

    /* renamed from: d */
    final /* synthetic */ String f56815d;

    /* renamed from: e */
    final /* synthetic */ Screenshot f56816e;

    /* renamed from: f */
    final /* synthetic */ aaye f56817f;

    public aayc(File file, boolean z, File file2, String str, Screenshot screenshot, aaye aaye) {
        this.f56812a = file;
        this.f56813b = z;
        this.f56814c = file2;
        this.f56815d = str;
        this.f56816e = screenshot;
        this.f56817f = aaye;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (this.f56812a.length() > 0) {
            return Screenshot.m66502a(BitmapFactory.decodeFile(this.f56812a.getAbsolutePath()));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Screenshot screenshot = (Screenshot) obj;
        if (this.f56812a != null && this.f56813b) {
            aayh.m47252a(this.f56814c, this.f56815d, ".bmp");
        }
        Screenshot screenshot2 = this.f56816e;
        if (screenshot != null) {
            screenshot2.f78922a = screenshot.f78922a;
            screenshot2.f78923b = screenshot.f78923b;
            screenshot2.f78924c = screenshot.f78924c;
        }
        aaye aaye = this.f56817f;
        if (aaye != null) {
            aaye.mo18595a(screenshot);
        }
    }
}
