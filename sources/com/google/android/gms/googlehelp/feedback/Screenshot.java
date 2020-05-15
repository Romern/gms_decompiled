package com.google.android.gms.googlehelp.feedback;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Screenshot implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aayd();

    /* renamed from: a */
    public int f78922a;

    /* renamed from: b */
    public int f78923b;

    /* renamed from: c */
    public String f78924c;

    /* renamed from: a */
    public static Bitmap m66500a(byte[] bArr, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        int length = bArr.length;
        BitmapFactory.decodeByteArray(bArr, 0, length, options);
        int i2 = options.outWidth / 2;
        int i3 = options.outHeight / 2;
        if (z) {
            int i4 = options.outHeight;
            int i5 = options.outWidth;
            if (i4 > i3 || i5 > i2) {
                i = Math.max(Math.round(((float) i4) / ((float) i3)), Math.round(((float) i5) / ((float) i2)));
            }
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, 0, length, options);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f78924c);
        parcel.writeInt(this.f78922a);
        parcel.writeInt(this.f78923b);
    }

    /* renamed from: a */
    public static AsyncTask m66501a(File file, String str, Screenshot screenshot, boolean z, aaye aaye) {
        File file2 = new File(new File(file, "reports"), String.valueOf(str).concat(".bmp"));
        if (!file2.exists() || !file2.canRead() || !file2.canWrite()) {
            return null;
        }
        return new aayc(file2, z, file, str, screenshot, aaye).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: a */
    public static Screenshot m66502a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, (int) cdtr.m134940b(), byteArrayOutputStream);
            return m66504a(byteArrayOutputStream.toByteArray(), bitmap.getWidth(), bitmap.getHeight());
        }
        Log.e("gH_Screenshot", "Screenshot is either null or recycled");
        return null;
    }

    /* renamed from: a */
    public static Screenshot m66503a(String str, int i, int i2) {
        Screenshot screenshot = new Screenshot();
        screenshot.f78922a = i;
        screenshot.f78923b = i2;
        screenshot.f78924c = str;
        return screenshot;
    }

    /* renamed from: a */
    public static Screenshot m66504a(byte[] bArr, int i, int i2) {
        return m66503a(Base64.encodeToString(bArr, 0), i, i2);
    }

    /* renamed from: a */
    public static String m66505a(File file, String str, Bitmap bitmap) {
        File file2 = new File(file, str);
        if (!file2.exists() && !file2.mkdirs()) {
            Log.e("gH_Screenshot", "failed to create reports directory");
            return null;
        } else if (bitmap != null && !bitmap.isRecycled()) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            File file3 = new File(file2, String.valueOf(valueOf).concat(".bmp"));
            File[] listFiles = file2.listFiles();
            for (File file4 : listFiles) {
                if (file4.getName().endsWith(".bmp") && !file4.getName().equals(file3.getName())) {
                    file4.delete();
                }
                if (file4.getName().equals(file3.getName())) {
                    return valueOf;
                }
            }
            try {
                new aayb(file3, bitmap).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]).get(cdtr.f181715a.mo6606a().mo78324w(), TimeUnit.MILLISECONDS);
                return valueOf;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                return null;
            }
        } else {
            Log.e("gH_Screenshot", "Cannot save. Bitmap is null or recycled.");
            return null;
        }
    }

    /* renamed from: a */
    public static void m66506a(ErrorReport errorReport, Screenshot screenshot) {
        errorReport.f31566v = null;
        if (screenshot != null && !TextUtils.isEmpty(screenshot.f78924c)) {
            errorReport.f31567w = screenshot.f78923b;
            errorReport.f31568x = screenshot.f78922a;
            errorReport.f31565u = screenshot.f78924c;
            return;
        }
        errorReport.f31567w = 0;
        errorReport.f31568x = 0;
        errorReport.f31565u = null;
    }
}
