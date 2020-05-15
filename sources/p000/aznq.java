package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: aznq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aznq extends soa {

    /* renamed from: a */
    public final int f99743a;

    /* renamed from: b */
    public final aznn f99744b;

    /* renamed from: c */
    public final Context f99745c;

    /* renamed from: d */
    public final String f99746d;

    /* renamed from: h */
    public final String f99747h;

    /* renamed from: i */
    public Uri f99748i;

    /* renamed from: j */
    public int f99749j;

    /* renamed from: k */
    private final int f99750k;

    /* renamed from: l */
    private final int f99751l;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9 A[Catch:{ all -> 0x00ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce A[Catch:{ all -> 0x00ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db A[SYNTHETIC, Splitter:B:38:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3 A[Catch:{ IOException -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2 A[SYNTHETIC, Splitter:B:48:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fa A[Catch:{ IOException -> 0x00f6 }] */
    public final void run() {
        InputStream inputStream;
        InputStream inputStream2;
        FileNotFoundException e;
        int a = DatabaseProvider.m94514a(this.f99745c.getContentResolver(), this.f99746d);
        this.f99749j = a;
        Bitmap bitmap = null;
        bitmap = null;
        InputStream inputStream3 = null;
        bitmap = null;
        bitmap = null;
        bitmap = null;
        if (a != 2) {
            new Object[1][0] = Integer.valueOf(this.f99743a);
        } else {
            String a2 = azoc.m85903a(DatabaseProvider.m94539c(this.f99745c.getContentResolver(), this.f99746d));
            if (!TextUtils.isEmpty(a2)) {
                Uri parse = Uri.parse(a2);
                this.f99748i = parse;
                Context context = this.f99745c;
                String str = this.f99746d;
                int i = this.f99750k;
                int i2 = this.f99751l;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                try {
                    inputStream2 = context.getContentResolver().openInputStream(parse);
                    try {
                        BitmapFactory.decodeStream(inputStream2, null, options);
                        options.inSampleSize = azpi.m86057a(options, i, i2);
                        Object[] objArr = {parse, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(options.inSampleSize)};
                        options.inJustDecodeBounds = false;
                        inputStream = context.getContentResolver().openInputStream(parse);
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        inputStream = null;
                        try {
                            if (context.getContentResolver().delete(DatabaseProvider.m94544h("media"), "message_id = ? ", new String[]{str}) > 0) {
                            }
                            azoj.m85931a("ImageUtil", e, "Error loading image.", new Object[0]);
                            if (inputStream2 != null) {
                            }
                            if (inputStream != null) {
                            }
                            this.f99744b.f99731a.post(new azno(this, bitmap));
                        } catch (Throwable th) {
                            th = th;
                            inputStream3 = inputStream2;
                            if (inputStream3 != null) {
                            }
                            if (inputStream != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = null;
                        inputStream3 = inputStream2;
                        if (inputStream3 != null) {
                        }
                        if (inputStream != null) {
                        }
                        throw th;
                    }
                    try {
                        bitmap = BitmapFactory.decodeStream(inputStream, null, options);
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e3) {
                                azoj.m85931a("ImageUtil", e3, "Error closing streams.", new Object[0]);
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        if (context.getContentResolver().delete(DatabaseProvider.m94544h("media"), "message_id = ? ", new String[]{str}) > 0) {
                        }
                        azoj.m85931a("ImageUtil", e, "Error loading image.", new Object[0]);
                        if (inputStream2 != null) {
                        }
                        if (inputStream != null) {
                        }
                        this.f99744b.f99731a.post(new azno(this, bitmap));
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream3 = inputStream2;
                        if (inputStream3 != null) {
                        }
                        if (inputStream != null) {
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e5) {
                    e = e5;
                    inputStream = null;
                    inputStream2 = null;
                    if (context.getContentResolver().delete(DatabaseProvider.m94544h("media"), "message_id = ? ", new String[]{str}) > 0) {
                        new Object[1][0] = str;
                    } else {
                        new Object[1][0] = str;
                    }
                    azoj.m85931a("ImageUtil", e, "Error loading image.", new Object[0]);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e6) {
                            azoj.m85931a("ImageUtil", e6, "Error closing streams.", new Object[0]);
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.f99744b.f99731a.post(new azno(this, bitmap));
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                    if (inputStream3 != null) {
                        try {
                            inputStream3.close();
                        } catch (IOException e7) {
                            azoj.m85931a("ImageUtil", e7, "Error closing streams.", new Object[0]);
                            throw th;
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }
        this.f99744b.f99731a.post(new azno(this, bitmap));
    }

    public /* synthetic */ aznq(int i, aznn aznn, Context context, String str, int i2, int i3, String str2) {
        super(9);
        this.f99743a = i;
        this.f99744b = aznn;
        this.f99746d = str;
        this.f99745c = context.getApplicationContext();
        this.f99750k = i2;
        this.f99751l = i3;
        this.f99747h = str2;
    }
}
