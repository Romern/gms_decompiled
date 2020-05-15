package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.ContentProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;

/* renamed from: auia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class auia extends ContentProvider {

    /* renamed from: a */
    private static final beju f91860a;

    /* renamed from: b */
    public static final /* synthetic */ int f91861b = 0;

    /* renamed from: c */
    private final Uri f91862c;

    /* renamed from: d */
    private final bmxj f91863d;

    /* renamed from: e */
    private final bxxc f91864e;

    /* renamed from: f */
    private belh f91865f;

    static {
        bejv bejv = new bejv();
        bejv.mo60768a(beku.f111735a);
        bejv.f111685a = bqfb.INSTANCE;
        bejv.f111686b = new befa(bngx.m109356a(new befu()));
        f91860a = bejv.mo60766a();
    }

    protected auia(Uri uri, bmxj bmxj, bxxc bxxc) {
        this.f91862c = uri;
        this.f91863d = bmxj;
        this.f91864e = bxxc;
    }

    /* renamed from: a */
    public static void m77091a(Bundle bundle, Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        if (obj instanceof Boolean) {
            bundle.putBoolean("value", ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            bundle.putString("value", (String) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt("value", ((Integer) obj).intValue());
        } else if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof byte[]) {
            bundle.putByteArray("value", (byte[]) obj);
        } else if (obj instanceof ArrayList) {
            bundle.putStringArrayList("value", (ArrayList) obj);
        } else if (obj instanceof Collection) {
            bundle.putStringArrayList("value", new ArrayList((Collection) obj));
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bmxj mo50547a(Uri uri, String str, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo50548a(Uri uri, bxxc bxxc);

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d6 A[Catch:{ bxwf -> 0x00af, ExecutionException -> 0x0110, InterruptedException -> 0x0109 }] */
    public final Bundle call(String str, String str2, Bundle bundle) {
        boolean z;
        boolean z2 = false;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        Uri.Builder buildUpon = this.f91862c.buildUpon();
        if (str2 == null) {
            str2 = "";
        }
        Uri build = buildUpon.appendPath(str2).build();
        try {
            int hashCode = str.hashCode();
            char c = 65535;
            if (hashCode != -1411068134) {
                if (hashCode != 3496342) {
                    if (hashCode == 113399775 && str.equals("write")) {
                        c = 1;
                        Bundle bundle2 = null;
                        if (c != 0) {
                            bundle2 = new Bundle();
                            if (build.getLastPathSegment() != null) {
                                m77091a(bundle2, mo50548a(build, (bxxc) this.f91865f.mo60776a().get()));
                            } else {
                                bundle2.putByteArray("value", ((bxxc) this.f91865f.mo60776a().get()).serializeToBytes());
                            }
                        } else if (c == 1 || c == 2) {
                            bmxy.m108588a(bundle != null);
                            bmxy.m108588a(bundle.containsKey("value"));
                            if (build.getLastPathSegment() == null) {
                                byte[] byteArray = bundle.getByteArray("value");
                                bxxc bxxc = this.f91864e;
                                if (byteArray != null) {
                                    z2 = true;
                                }
                                bmxy.m108588a(z2);
                                this.f91865f.mo60777a(new auhz(bxxc.mo73646aR().mo73633b(byteArray).mo74062i()), bqfb.INSTANCE).get();
                                getContext().getContentResolver().notifyChange(this.f91862c, null);
                            } else {
                                this.f91865f.mo60777a(mo50547a(build, str, bundle.get("value")), bqfb.INSTANCE).get();
                                getContext().getContentResolver().notifyChange(build, null);
                            }
                        } else {
                            throw new IllegalArgumentException("unknown method");
                        }
                        return bundle2;
                    }
                } else if (str.equals("read")) {
                    c = 0;
                    Bundle bundle22 = null;
                    if (c != 0) {
                    }
                    return bundle22;
                }
            } else if (str.equals("append")) {
                c = 2;
                Bundle bundle222 = null;
                if (c != 0) {
                }
                return bundle222;
            }
            Bundle bundle2222 = null;
            if (c != 0) {
            }
            return bundle2222;
        } catch (bxwf e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (InterruptedException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        beju beju = f91860a;
        bejq g = bejr.m95186g();
        g.mo60762a((Uri) this.f91863d.apply(getContext()));
        g.mo60764a(this.f91864e);
        this.f91865f = beju.mo60765a(g.mo60761a());
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final void shutdown() {
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
