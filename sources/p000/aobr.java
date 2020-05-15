package p000;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import com.google.android.gms.plus.service.p063v1.MomentsFeed;
import java.util.List;

/* renamed from: aobr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobr extends aoba {

    /* renamed from: a */
    private final ClientContext f78115a;

    /* renamed from: b */
    private final antk f78116b;

    /* renamed from: c */
    private final int f78117c;

    /* renamed from: d */
    private final String f78118d;

    /* renamed from: e */
    private final Uri f78119e;

    /* renamed from: f */
    private final String f78120f;

    /* renamed from: g */
    private final String f78121g;

    /* renamed from: h */
    private final String f78122h;

    public aobr(ClientContext clientContext, int i, String str, Uri uri, String str2, String str3, String str4, antk antk) {
        this.f78115a = clientContext;
        this.f78117c = i;
        this.f78118d = str;
        this.f78119e = uri;
        this.f78120f = str2;
        this.f78121g = str3;
        this.f78122h = str4;
        this.f78116b = antk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c9, code lost:
        r13.f78116b.mo42236a(com.google.android.gms.common.data.DataHolder.m22536a(4, p000.anuj.m65341a(r14, r13.f78115a)), (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d9, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00da, code lost:
        r3 = new android.os.Bundle();
        r3.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r14, 0, r15.mo7366a(), 0));
        r13.f78116b.mo42236a(com.google.android.gms.common.data.DataHolder.m22536a(4, r3), (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f5, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8 A[ExcHandler: gid (e gid), Splitter:B:1:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9 A[ExcHandler: UserRecoverableAuthException (r15v1 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        String str;
        String str2;
        try {
            ClientContext clientContext = this.f78115a;
            int i = this.f78117c;
            String str3 = this.f78118d;
            Uri uri = this.f78119e;
            String str4 = this.f78120f;
            String str5 = this.f78121g;
            String str6 = this.f78122h;
            anrv anrv = anru.f77554e;
            if (uri != null) {
                str = uri.toString();
            } else {
                str = null;
            }
            aode aode = anrv.f77557a;
            String a = shd.m35268a(String.format("people/%1$s/moments/%2$s", shd.m35267a(str5), shd.m35267a(str6)), "maxResults", String.valueOf(Integer.valueOf(i)));
            if (str3 != null) {
                a = shd.m35268a(a, "pageToken", shd.m35267a(str3));
            }
            if (str != null) {
                a = shd.m35268a(a, "targetUrl", shd.m35267a(str));
            }
            if (str4 == null) {
                str2 = a;
            } else {
                str2 = shd.m35268a(a, "type", shd.m35267a(str4));
            }
            MomentsFeed momentsFeed = (MomentsFeed) aode.f78217a.mo25537a(clientContext, 0, str2, (Object) null, MomentsFeed.class, (FieldMappingDictionary) null);
            List list = momentsFeed.f82650d;
            int size = list.size();
            rtu a2 = DataHolder.m22537a(anue.f77733a);
            for (int i2 = 0; i2 < size; i2++) {
                ContentValues contentValues = new ContentValues(1);
                Parcel obtain = Parcel.obtain();
                ((MomentEntity) list.get(i2)).writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                contentValues.put("momentImpl", marshall);
                a2.mo25160a(contentValues);
            }
            this.f78116b.mo42236a(a2.mo25163a(0), momentsFeed.f82652f, momentsFeed.f82655i);
        } catch (VolleyError e) {
            throw e;
        } catch (UserRecoverableAuthException e2) {
        } catch (gid e3) {
        } catch (VolleyError e4) {
            this.f78116b.mo42236a(DataHolder.m22539b(7), (String) null, (String) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antk antk = this.f78116b;
        if (antk != null) {
            antk.mo42236a(DataHolder.m22539b(8), (String) null, (String) null);
        }
    }
}
