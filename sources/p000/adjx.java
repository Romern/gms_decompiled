package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: adjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjx {

    /* renamed from: a */
    private static final adfs f61956a = new adfs("IntentSignatureUtil");

    /* renamed from: b */
    private static final C1225nr f61957b;

    /* renamed from: c */
    private final SharedPreferences f61958c;

    /* renamed from: d */
    private final SecretKey f61959d;

    static {
        C1225nr nrVar = new C1225nr(2);
        f61957b = nrVar;
        Collections.addAll(nrVar, "com.google.android.gms.instantapps.API_CALLER_PKG", "com.google.android.gms.instantapps.API_CALL_TIME_MS");
    }

    public adjx(SharedPreferences sharedPreferences) {
        this.f61958c = sharedPreferences;
        this.f61959d = m50671a(sharedPreferences);
    }

    /* renamed from: a */
    private static SecretKey m50671a(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("intentMacSecret", "");
        if (TextUtils.isEmpty(string)) {
            try {
                KeyGenerator instance = KeyGenerator.getInstance("HmacSHA256");
                instance.init(160);
                SecretKey generateKey = instance.generateKey();
                sharedPreferences.edit().putString("intentMacSecret", Base64.encodeToString(generateKey.getEncoded(), 0)).apply();
                return generateKey;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("All Java platforms are required to have HmacSHA256", e);
            }
        } else {
            try {
                return new SecretKeySpec(Base64.decode(string, 0), "HmacSHA256");
            } catch (IllegalArgumentException e2) {
                m50675b(sharedPreferences);
                throw new RuntimeException("secret key in shared prefs is bad", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m50674b(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            String scheme = data.getScheme();
            if (scheme != null) {
                String lowerCase = scheme.toLowerCase();
                if (lowerCase.equals("http") || lowerCase.equals("https")) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        for (String str : extras.keySet()) {
                            if (f61957b.contains(str)) {
                                intent.removeExtra(str);
                            }
                        }
                        return;
                    }
                    return;
                }
                throw new adjw("URI scheme is not supported");
            }
            throw new adjw("URI scheme is null");
        }
        throw new adjw("URI is null");
    }

    /* renamed from: c */
    public final byte[] mo33595c(Intent intent) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(this.f61959d);
            ByteBuffer allocate = ByteBuffer.allocate(4096);
            try {
                m50672a(intent.getData(), allocate);
                allocate.flip();
                instance.update(allocate);
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    ArrayList arrayList = new ArrayList(extras.keySet());
                    Collections.sort(arrayList);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) arrayList.get(i);
                        if (f61957b.contains(str)) {
                            allocate.clear();
                            allocate.put((byte) 0);
                            byte[] bytes = str.getBytes();
                            allocate.putInt(bytes.length);
                            allocate.put(bytes);
                            allocate.flip();
                            instance.update(allocate);
                            allocate.clear();
                            try {
                                Object obj = extras.get(str);
                                if (obj == null) {
                                    allocate.put((byte) 1);
                                } else if (obj instanceof String) {
                                    allocate.put((byte) 2);
                                    byte[] bytes2 = ((String) obj).getBytes();
                                    allocate.putInt(bytes2.length);
                                    allocate.put(bytes2);
                                } else if (obj instanceof Boolean) {
                                    allocate.put((byte) 3);
                                    allocate.put(((Boolean) obj).booleanValue() ^ true ? (byte) 1 : 0);
                                } else if (obj instanceof Integer) {
                                    allocate.put((byte) 4);
                                    allocate.putInt(((Integer) obj).intValue());
                                } else if (obj instanceof Long) {
                                    allocate.put((byte) 5);
                                    allocate.putLong(((Long) obj).longValue());
                                } else if (!(obj instanceof Parcelable)) {
                                    String valueOf = String.valueOf(str);
                                    String str2 = valueOf.length() == 0 ? new String("Unsupported extra value type for key ") : "Unsupported extra value type for key ".concat(valueOf);
                                    f61956a.mo33430d("%s", str2);
                                    throw new adjw(str2);
                                } else if (!(obj instanceof PendingIntent)) {
                                    allocate.put((byte) 7);
                                    m50673a((Parcelable) obj, allocate);
                                } else {
                                    allocate.put((byte) 6);
                                }
                                allocate.flip();
                                instance.update(allocate);
                            } catch (BufferOverflowException e) {
                                String valueOf2 = String.valueOf(str);
                                String str3 = valueOf2.length() == 0 ? new String("Extra value too big for key ") : "Extra value too big for key ".concat(valueOf2);
                                f61956a.mo33430d("%s", str3);
                                throw new adjw(str3, e);
                            }
                        }
                    }
                }
                return instance.doFinal();
            } catch (BufferOverflowException e2) {
                f61956a.mo33429c("URI too long", new Object[0]);
                throw new adjw("URI too long", e2);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException("All Java platforms are required to have HmacSHA256", e3);
        } catch (InvalidKeyException e4) {
            m50675b(this.f61958c);
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: b */
    private static void m50675b(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().remove("intentMacSecret").apply();
        m50671a(sharedPreferences);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adjx.a(android.os.Parcelable, java.nio.ByteBuffer):void
     arg types: [android.net.Uri, java.nio.ByteBuffer]
     candidates:
      adjx.a(android.net.Uri, java.nio.ByteBuffer):void
      adjx.a(android.os.Parcelable, java.nio.ByteBuffer):void */
    /* renamed from: a */
    private static void m50672a(Uri uri, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 8);
        if (uri == null) {
            byteBuffer.put((byte) 1);
            return;
        }
        try {
            m50673a((Parcelable) uri, byteBuffer);
        } catch (BufferOverflowException e) {
            f61956a.mo33429c("%s", "URL loo long");
            throw new adjw("URL loo long", e);
        }
    }

    /* renamed from: a */
    private static void m50673a(Parcelable parcelable, ByteBuffer byteBuffer) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        byteBuffer.putInt(marshall.length);
        byteBuffer.put(marshall);
    }

    /* renamed from: a */
    public final void mo33594a(Intent intent) {
        intent.putExtra("com.google.android.gms.instantapps.INTENT_HMAC", mo33595c(intent));
    }
}
