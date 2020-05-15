package p000;

import android.content.ContentProvider;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* renamed from: amqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amqb implements ContentProvider.PipeDataWriter {

    /* renamed from: a */
    final bxvd f75722a;

    public amqb(bxvd bxvd) {
        this.f75722a = bxvd;
    }

    public final /* bridge */ /* synthetic */ void writeDataToPipe(ParcelFileDescriptor parcelFileDescriptor, Uri uri, String str, Bundle bundle, Object obj) {
        InputStream inputStream = (InputStream) obj;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
            if (inputStream != null) {
                try {
                    byte[] bArr = new byte[1024];
                    long currentTimeMillis = System.currentTimeMillis();
                    do {
                        try {
                            int read = inputStream.read(bArr);
                            if (read != -1) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                try {
                                    inputStream.close();
                                    break;
                                } catch (IOException e) {
                                    e = e;
                                }
                            }
                        } catch (IOException e2) {
                            bxvd bxvd = this.f75722a;
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            amlc amlc = (amlc) bxvd.f164949b;
                            amlc amlc2 = amlc.f75159h;
                            amlc.f75163c = 13;
                            amlc.f75161a |= 2;
                            Log.e("Gal2ProviderPhotoImpl", "read photo data exception: ", e2);
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                e = e3;
                            }
                        }
                    } while (System.currentTimeMillis() - currentTimeMillis <= TimeUnit.SECONDS.toMillis(cfyo.m143934i()));
                    bxvd bxvd2 = this.f75722a;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    amlc amlc3 = (amlc) bxvd2.f164949b;
                    amlc amlc4 = amlc.f75159h;
                    amlc3.f75163c = 12;
                    amlc3.f75161a |= 2;
                    Log.e("Gal2ProviderPhotoImpl", "openFile timed out");
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e = e4;
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } else {
                Log.e("Gal2ProviderPhotoImpl", "Input stream cannot be null.");
            }
            fileOutputStream.close();
            Log.e("Gal2ProviderPhotoImpl", "Unable to close input stream", e);
            fileOutputStream.close();
        } catch (IOException e5) {
            Log.e("Gal2ProviderPhotoImpl", "Unable to close output stream");
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }
}
