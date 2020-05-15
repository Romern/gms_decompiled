package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.location.reporting.collectors.LocationHistorianDataRetriever$LogDataReceiver;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bgtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgtq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f117513a;

    /* renamed from: b */
    final /* synthetic */ Intent f117514b;

    /* renamed from: c */
    final /* synthetic */ LocationHistorianDataRetriever$LogDataReceiver f117515c;

    public bgtq(LocationHistorianDataRetriever$LogDataReceiver locationHistorianDataRetriever$LogDataReceiver, Context context, Intent intent) {
        this.f117515c = locationHistorianDataRetriever$LogDataReceiver;
        this.f117513a = context;
        this.f117514b = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r2 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0022, B:12:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e A[SYNTHETIC, Splitter:B:40:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ed A[SYNTHETIC, Splitter:B:60:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    public final void run() {
        bgtp bgtp;
        InputStream inputStream;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        FileNotFoundException e;
        IOException e2;
        LocationHistorianDataRetriever$LogDataReceiver locationHistorianDataRetriever$LogDataReceiver = this.f117515c;
        Context context = this.f117513a;
        Intent intent = this.f117514b;
        String stringExtra = intent.getStringExtra("content_uri_key");
        bgtp bgtp2 = null;
        if (stringExtra != null) {
            Uri parse = Uri.parse(stringExtra);
            try {
                inputStream = context.getContentResolver().openInputStream(parse);
                if (inputStream == null) {
                    try {
                        String valueOf = String.valueOf(parse);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                        sb.append("Failed to open input stream at ");
                        sb.append(valueOf);
                        bgur.m100025c("GCoreUlr", sb.toString());
                        context.getContentResolver().delete(parse, null, null);
                        bArr = null;
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        byteArrayOutputStream = null;
                    } catch (IOException e4) {
                        e2 = e4;
                        byteArrayOutputStream = null;
                        try {
                            bgur.m100021b("GCoreUlr", "IOException when trying to read contentUri inputStream", e2);
                            context.getContentResolver().delete(parse, null, null);
                            if (inputStream != null) {
                            }
                            if (byteArrayOutputStream == null) {
                            }
                            if (bArr != null) {
                            }
                            locationHistorianDataRetriever$LogDataReceiver.f150862a = bgtp2;
                            bgtp = this.f117515c.f150862a;
                            if (bgtp == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            context.getContentResolver().delete(parse, null, null);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException | IllegalArgumentException e5) {
                                    bgur.m100021b("GCoreUlr", "Problem encountered while trying to close contentUri inputStream", e5);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                    }
                    if (bArr != null) {
                        bgtp2 = new bgtp(intent.getIntExtra("data_version_key", -1), intent.getLongExtra("boot_time", -1), intent.getLongExtra("last_event_time", -1), bArr);
                    }
                } else {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[200000];
                    while (true) {
                        int read = inputStream.read(bArr2, 0, 200000);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    context.getContentResolver().delete(parse, null, null);
                    try {
                        inputStream.close();
                    } catch (IOException | IllegalArgumentException e6) {
                        e = e6;
                    }
                    bArr = byteArrayOutputStream == null ? byteArrayOutputStream.toByteArray() : null;
                    if (bArr != null) {
                    }
                }
            } catch (FileNotFoundException e7) {
                e = e7;
                inputStream = null;
                byteArrayOutputStream = null;
                bgur.m100021b("GCoreUlr", "ContentUri file not found", e);
                context.getContentResolver().delete(parse, null, null);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (byteArrayOutputStream == null) {
                }
                if (bArr != null) {
                }
                locationHistorianDataRetriever$LogDataReceiver.f150862a = bgtp2;
                bgtp = this.f117515c.f150862a;
                if (bgtp == null) {
                }
            } catch (IOException e8) {
                e2 = e8;
                inputStream = null;
                byteArrayOutputStream = null;
                bgur.m100021b("GCoreUlr", "IOException when trying to read contentUri inputStream", e2);
                context.getContentResolver().delete(parse, null, null);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException | IllegalArgumentException e9) {
                        e = e9;
                    }
                }
                if (byteArrayOutputStream == null) {
                }
                if (bArr != null) {
                }
                locationHistorianDataRetriever$LogDataReceiver.f150862a = bgtp2;
                bgtp = this.f117515c.f150862a;
                if (bgtp == null) {
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                context.getContentResolver().delete(parse, null, null);
                if (inputStream != null) {
                }
                throw th;
            }
        }
        locationHistorianDataRetriever$LogDataReceiver.f150862a = bgtp2;
        bgtp = this.f117515c.f150862a;
        if (bgtp == null) {
            long j = bgtp.f117511c;
            StringBuilder sb2 = new StringBuilder(71);
            sb2.append("location historian data broadcast; last timestamp: ");
            sb2.append(j);
            sb2.toString();
            return;
        }
        return;
        bgur.m100021b("GCoreUlr", "Problem encountered while trying to close contentUri inputStream", e);
        if (byteArrayOutputStream == null) {
        }
        if (bArr != null) {
        }
        locationHistorianDataRetriever$LogDataReceiver.f150862a = bgtp2;
        bgtp = this.f117515c.f150862a;
        if (bgtp == null) {
        }
    }
}
