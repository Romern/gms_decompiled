package p000;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.p063v1.PeopleFeed;
import java.util.List;
import org.whispersystems.curve25519.Curve25519;

/* renamed from: aobu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobu extends aoba {

    /* renamed from: a */
    public boolean f78129a = false;

    /* renamed from: b */
    private final ClientContext f78130b;

    /* renamed from: c */
    private final antk f78131c;

    /* renamed from: d */
    private final int f78132d;

    /* renamed from: e */
    private final int f78133e;

    /* renamed from: f */
    private final int f78134f;

    /* renamed from: g */
    private final String f78135g;

    public aobu(ClientContext clientContext, int i, int i2, int i3, String str, antk antk) {
        this.f78130b = clientContext;
        this.f78132d = i;
        this.f78133e = i2;
        this.f78134f = i3;
        this.f78135g = str;
        this.f78131c = antk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0124, code lost:
        r1.f78131c.mo42235a(com.google.android.gms.common.data.DataHolder.m22536a(4, p000.anuj.m65341a(r2, r1.f78130b)), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0134, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0136, code lost:
        r4 = new android.os.Bundle();
        r4.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r2, 0, r0.mo7366a(), 0));
        r1.f78131c.mo42235a(com.google.android.gms.common.data.DataHolder.m22536a(4, r4), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0152, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0123 A[ExcHandler: gid (e gid), Splitter:B:3:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135 A[ExcHandler: UserRecoverableAuthException (r0v2 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:3:0x000a] */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        String str;
        String str2;
        String str3;
        Context context2 = context;
        if (!this.f78129a) {
            try {
                ClientContext clientContext = this.f78130b;
                int i = this.f78132d;
                int i2 = this.f78133e;
                int i3 = this.f78134f;
                if (i3 < 0) {
                    i3 = 100;
                }
                String str4 = this.f78135g;
                anse anse = anru.f77553d;
                String str5 = "visible";
                int i4 = 1;
                if (i != 1 && i == 2) {
                    str5 = "connected";
                }
                String str6 = "alphabetical";
                if (i2 != 0 && i2 == 1) {
                    str6 = Curve25519.BEST;
                }
                aodg aodg = anse.f77574a;
                String a = shd.m35268a(shd.m35268a(String.format("people/%1$s/people/%2$s", shd.m35267a("me"), shd.m35267a(str5)), "maxResults", String.valueOf(Integer.valueOf(i3))), "orderBy", shd.m35267a(str6));
                if (str4 == null) {
                    str = a;
                } else {
                    str = shd.m35268a(a, "pageToken", shd.m35267a(str4));
                }
                PeopleFeed peopleFeed = (PeopleFeed) aodg.f78218a.mo25536a(clientContext, 0, str, (Object) null, PeopleFeed.class);
                List list = peopleFeed.f82660d;
                int size = list.size();
                rtu a2 = DataHolder.m22537a(anuf.f77734a);
                int i5 = 0;
                while (i5 < size) {
                    anxo anxo = (anxo) list.get(i5);
                    if (anxo.mo42389d() != null) {
                        str2 = anxo.mo42389d().mo42386b();
                    } else {
                        str2 = null;
                    }
                    String b = anxo.mo42387b();
                    String c = anxo.mo42388c();
                    int f = anxo.mo42390f();
                    if (f == 0) {
                        str3 = "person";
                    } else if (f == i4) {
                        str3 = "page";
                    } else {
                        StringBuilder sb = new StringBuilder(37);
                        sb.append("Unknown objectType state: ");
                        sb.append(f);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    String g = anxo.mo42391g();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("displayName", b);
                    contentValues.put("personId", c);
                    contentValues.put("image", str2);
                    contentValues.put("objectType", str3);
                    contentValues.put("url", g);
                    a2.mo25160a(contentValues);
                    i5++;
                    i4 = 1;
                }
                Pair pair = new Pair(a2.mo25163a(0), peopleFeed.f82661e);
                this.f78131c.mo42235a((DataHolder) pair.first, (String) pair.second);
            } catch (VolleyError e) {
                throw e;
            } catch (UserRecoverableAuthException e2) {
            } catch (gid e3) {
            } catch (VolleyError e4) {
                this.f78131c.mo42235a(DataHolder.m22539b(7), (String) null);
            }
        } else {
            this.f78131c.mo42235a(DataHolder.m22536a(13, (Bundle) null), (String) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antk antk = this.f78131c;
        if (antk != null) {
            antk.mo42235a(DataHolder.m22539b(8), (String) null);
        }
    }
}
