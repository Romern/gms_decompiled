package p000;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.android.volley.Network;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import java.io.File;
import java.util.Locale;

/* renamed from: bjtx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtx {

    /* renamed from: a */
    public static final String f123321a = String.format(Locale.US, "unused/0 (%s %s); gzip", Build.DEVICE, Build.ID);

    /* renamed from: b */
    private static RequestQueue f123322b;

    /* renamed from: c */
    private static RequestQueue f123323c;

    /* renamed from: d */
    private static RequestQueue f123324d;

    /* renamed from: a */
    public static synchronized RequestQueue m104619a(Context context) {
        RequestQueue requestQueue;
        synchronized (bjtx.class) {
            if (f123322b == null) {
                RequestQueue requestQueue2 = new RequestQueue(new DiskBasedCache(new File(context.getCacheDir(), "wallet_im_volley_api_cache"), 1048576), m104625d(context), 2);
                f123322b = requestQueue2;
                requestQueue2.start();
            }
            requestQueue = f123322b;
        }
        return requestQueue;
    }

    /* renamed from: b */
    public static synchronized RequestQueue m104621b(Context context) {
        RequestQueue requestQueue;
        synchronized (bjtx.class) {
            if (f123323c == null) {
                RequestQueue requestQueue2 = new RequestQueue(new DiskBasedCache(new File(context.getCacheDir(), "wallet_im_volley_image_cache"), ((Integer) bjwd.f123462b.mo54082a()).intValue()), m104625d(context), 6);
                f123323c = requestQueue2;
                requestQueue2.start();
            }
            requestQueue = f123323c;
        }
        return requestQueue;
    }

    /* renamed from: c */
    public static synchronized RequestQueue m104623c(Context context) {
        RequestQueue requestQueue;
        synchronized (bjtx.class) {
            if (f123324d == null) {
                RequestQueue requestQueue2 = new RequestQueue(new DiskBasedCache(new File(context.getCacheDir(), "wallet_im_volley_document_cache"), 2097152), m104625d(context), 1);
                f123324d = requestQueue2;
                requestQueue2.start();
            }
            requestQueue = f123324d;
        }
        return requestQueue;
    }

    /* renamed from: d */
    private static Network m104625d(Context context) {
        return new BasicNetwork(new bjed(context, ((Boolean) bjwe.f123489j.mo54082a()).booleanValue()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return;
     */
    /* renamed from: a */
    public static synchronized void m104620a(RequestQueue requestQueue) {
        synchronized (bjtx.class) {
            if (requestQueue != f123322b) {
                if (f123322b != null) {
                    if (requestQueue != null) {
                        Log.e("WalletRequestQueue", "Trying to set request queue when one already exists");
                    }
                }
                f123322b = requestQueue;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return;
     */
    /* renamed from: c */
    public static synchronized void m104624c(RequestQueue requestQueue) {
        synchronized (bjtx.class) {
            if (requestQueue != f123324d) {
                if (f123324d != null) {
                    if (requestQueue != null) {
                        Log.e("WalletRequestQueue", "Trying to set document request queue when one already exists");
                    }
                }
                f123324d = requestQueue;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return;
     */
    /* renamed from: b */
    public static synchronized void m104622b(RequestQueue requestQueue) {
        synchronized (bjtx.class) {
            if (requestQueue != f123323c) {
                if (f123323c != null) {
                    if (requestQueue != null) {
                        Log.e("WalletRequestQueue", "Trying to set image request queue when one already exists");
                    }
                }
                f123323c = requestQueue;
            }
        }
    }
}
