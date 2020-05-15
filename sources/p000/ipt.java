package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ipt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ipt implements ipv {

    /* renamed from: a */
    public static final Logger f21530a = new Logger(new String[]{"DeviceMetadataLevelDbStore"}, (byte[]) null);

    /* renamed from: c */
    private static LevelDb f21531c;

    /* renamed from: b */
    public final Context f21532b;

    public ipt(Context context) {
        this.f21532b = context;
    }

    /* renamed from: c */
    public static final byte[] m15856c(String str, Account account) {
        String str2 = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(str2).length());
        sb.append("DEVICE_FEATURE_STATUS_");
        sb.append(str);
        sb.append("@@");
        sb.append(str2);
        return sb.toString().getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: d */
    private static final byte[] m15857d(String str, Account account) {
        String str2 = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(str2).length());
        sb.append("DEVICE_METADATA_");
        sb.append(str);
        sb.append("@@");
        sb.append(str2);
        return sb.toString().getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    public final List mo13231a(String str, Account account) {
        synchronized (ipt.class) {
            if (!mo13233a()) {
                return null;
            }
            try {
                List a = ipu.m15864a(f21531c.get(m15857d(str, account)));
                return a;
            } catch (IOException e) {
                f21530a.mo25417e("Error reading device metadata packet list from disk ", e, new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: b */
    public final List mo13236b(String str, Account account) {
        synchronized (ipt.class) {
            if (!mo13233a()) {
                return null;
            }
            try {
                List b = ipu.m15865b(f21531c.get(m15856c(str, account)));
                return b;
            } catch (IOException e) {
                f21530a.mo25417e("Error reading device metadata packet list from disk ", e, new Object[0]);
                return null;
            }
        }
    }

    public final void close() {
        synchronized (ipt.class) {
            if (f21531c != null) {
                f21531c.close();
                f21531c = null;
            }
        }
    }

    /* renamed from: a */
    public final Map mo13232a(String str) {
        synchronized (ipt.class) {
            HashMap hashMap = new HashMap();
            if (!mo13233a()) {
                return hashMap;
            }
            Context context = this.f21532b;
            for (Account account : soz.m35801d(context, context.getPackageName())) {
                List b = mo13236b(str, account);
                if (b != null) {
                    hashMap.put(account.name, b);
                }
            }
            return hashMap;
        }
    }

    /* renamed from: a */
    public final boolean mo13233a() {
        synchronized (ipt.class) {
            if (f21531c != null) {
                return true;
            }
            try {
                f21531c = LevelDb.open(this.f21532b.getDir("cryptauth_device_metadata_db", 0));
                return true;
            } catch (LevelDbException e) {
                f21530a.mo25417e("Couldn't open leveldb db: ", e, new Object[0]);
                return false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo13234a(String str, Account account, List list) {
        synchronized (ipt.class) {
            if (!mo13233a()) {
                return false;
            }
            try {
                boolean a = mo13235a(m15857d(str, account), ips.m15855a(list));
                return a;
            } catch (IOException e) {
                f21530a.mo25417e("Error serializing device metadata packet list", e, new Object[0]);
                return false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo13235a(byte[] bArr, byte[] bArr2) {
        synchronized (ipt.class) {
            if (!mo13233a()) {
                return false;
            }
            try {
                f21531c.put(bArr, bArr2);
                return true;
            } catch (IOException e) {
                f21530a.mo25417e("Error saving device metadata list to disk ", e, new Object[0]);
                return false;
            }
        }
    }
}
