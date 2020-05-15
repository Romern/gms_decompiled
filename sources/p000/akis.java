package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.net.PlayServicesCronetProvider;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: akis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akis {
    /* renamed from: a */
    public static File m59847a(Context context) {
        File file = new File(context.getCacheDir(), "nearby/sharing/images");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    private static String m59848a(Context context, String str, CharSequence charSequence) {
        int integer = context.getResources().getInteger(C0126R.integer.sharing_max_name_length_bytes);
        int a = akid.m59786a(context.getString(C0126R.string.sharing_default_device_name, "", charSequence));
        if (a < integer) {
            return akiq.m59845a(str, integer - a);
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akis", "a", 305, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Device type string is longer than char limit.");
        return null;
    }

    /* renamed from: b */
    public static String m59851b(Context context) {
        String string = Settings.Global.getString(context.getContentResolver(), "device_name");
        if (TextUtils.isEmpty(string)) {
            string = Settings.System.getString(context.getContentResolver(), "device_name");
            if (TextUtils.isEmpty(string)) {
                string = Settings.System.getString(context.getContentResolver(), "bluetooth_name");
                if (TextUtils.isEmpty(string)) {
                    string = Settings.Secure.getString(context.getContentResolver(), "bluetooth_name");
                    if (TextUtils.isEmpty(string)) {
                        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                        if (defaultAdapter != null) {
                            string = defaultAdapter.getName();
                        } else {
                            string = null;
                        }
                        if (TextUtils.isEmpty(string)) {
                            string = Build.MODEL;
                        }
                    }
                }
            }
        }
        return akiq.m59845a(string, ((C1416ut) context).mo16091a().getInteger(C0126R.integer.sharing_max_name_length_bytes));
    }

    /* renamed from: a */
    private static boolean m59849a(Context context, String str, File file) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            new PlayServicesCronetProvider(context).createBuilder().build().newUrlRequestBuilder(str, new akir(file, countDownLatch), ahhr.m55807c()).build().start();
            try {
                countDownLatch.await(cfov.f185185a.mo6606a().mo82280P(), TimeUnit.MILLISECONDS);
                return true;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                srn srn = ajvp.f71371a;
                return false;
            }
        } catch (IllegalStateException e2) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("akis", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to download Url %s. Cronet provider is unavailable on this device.", str);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m59850a(String str) {
        try {
            return new URL(str).getHost().matches("lh[3-6].googleusercontent.com");
        } catch (MalformedURLException e) {
            return false;
        }
    }
}
