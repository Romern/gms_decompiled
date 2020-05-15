package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;

/* renamed from: befj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befj {

    /* renamed from: a */
    private final Context f111499a;

    /* renamed from: b */
    private final befb f111500b;

    private befj(Context context, befb befb) {
        this.f111499a = context;
        this.f111500b = befb;
    }

    /* renamed from: a */
    public static befj m94963a(Context context) {
        return new befj(context, null);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public final File mo60665b(Uri uri) {
        char c;
        File file;
        m94965a(uri);
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str = (String) arrayList.get(0);
        switch (str.hashCode()) {
            case -1820761141:
                if (str.equals("external")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 94416770:
                if (str.equals("cache")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 97434231:
                if (str.equals("files")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 835260319:
                if (str.equals("managed")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 988548496:
                if (str.equals("directboot-cache")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 991565957:
                if (str.equals("directboot-files")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            int i = Build.VERSION.SDK_INT;
            file = this.f111499a.createDeviceProtectedStorageContext().getFilesDir();
        } else if (c == 1) {
            int i2 = Build.VERSION.SDK_INT;
            file = this.f111499a.createDeviceProtectedStorageContext().getCacheDir();
        } else if (c == 2) {
            file = befg.m94951a(this.f111499a);
        } else if (c == 3) {
            file = this.f111499a.getCacheDir();
        } else if (c == 4) {
            File file2 = new File(befg.m94951a(this.f111499a), "managed");
            if (arrayList.size() >= 3) {
                try {
                    Account a = befd.m94935a((String) arrayList.get(2));
                    if (!befd.m94937b(a)) {
                        befb befb = this.f111500b;
                        if (befb != null) {
                            arrayList.set(2, Integer.toString(((Integer) bqfy.m112768a(befb.mo60652a(a), begt.class)).intValue()));
                        } else {
                            throw new begt("AccountManager cannot be null");
                        }
                    }
                } catch (IllegalArgumentException e) {
                    throw new begt(e);
                }
            }
            file = file2;
        } else if (c == 5) {
            file = this.f111499a.getExternalFilesDir(null);
        } else {
            throw new begt(String.format("Path must start with a valid logical location: %s", uri));
        }
        return new File(file, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
    }

    /* renamed from: a */
    public static befj m94964a(Context context, befb befb) {
        return new befj(context, befb);
    }

    /* renamed from: a */
    public static void m94965a(Uri uri) {
        if (!uri.getScheme().equals("android")) {
            throw new begt("Scheme must be 'android'");
        } else if (uri.getPathSegments().isEmpty()) {
            throw new begt(String.format("Path must start with a valid logical location: %s", uri));
        } else if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new begt("Did not expect uri to have query");
        }
    }
}
