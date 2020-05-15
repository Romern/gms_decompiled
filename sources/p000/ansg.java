package p000;

import android.content.ContentValues;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ansg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ansg {

    /* renamed from: j */
    public static final shc f77576j;

    /* renamed from: a */
    public final aodi f77577a;

    /* renamed from: b */
    public final aodj f77578b;

    /* renamed from: c */
    public final aodk f77579c;

    /* renamed from: d */
    public final aodn f77580d;

    /* renamed from: e */
    public final aodo f77581e;

    /* renamed from: f */
    public final aodp f77582f;

    /* renamed from: g */
    public final aodq f77583g;

    /* renamed from: h */
    public final aodr f77584h;

    /* renamed from: i */
    public final shj f77585i;

    static {
        shc shc = new shc();
        shc.mo25530a("id");
        shc.mo25530a("displayName");
        f77576j = shc;
    }

    public ansg(shj shj) {
        this.f77585i = shj;
        shj.f44447g = 6400;
        this.f77577a = new aodi(shj);
        this.f77578b = new aodj(shj);
        this.f77580d = new aodn(shj);
        this.f77583g = new aodq(shj);
        this.f77579c = new aodk(shj);
        this.f77581e = new aodo(shj);
        this.f77582f = new aodp(shj);
        this.f77584h = new aodr(shj);
    }

    /* renamed from: a */
    public static ContentValues m65098a(String str) {
        ContentValues contentValues = new ContentValues(ansz.f77707a.length);
        for (int i = 0; i < ansz.f77707a.length; i++) {
            contentValues.putNull(ansz.f77707a[i]);
        }
        contentValues.put("url", str);
        return contentValues;
    }

    /* renamed from: a */
    public static aofd m65099a(String str, Bundle bundle) {
        aoex aoex = new aoex();
        aoex.mo42650a(str);
        if (bundle != null && !bundle.isEmpty()) {
            aomz.m66116a(bundle).mo43068a(aoex);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aoex.mo42649a());
        aofb aofb = new aofb();
        aofb.mo42652a(arrayList);
        aofc a = aofb.mo42651a();
        aoeu aoeu = new aoeu();
        aoeu.mo42648a(a);
        return aoeu.mo42647a();
    }

    /* renamed from: a */
    public static void m65100a(ContentValues contentValues, aofd aofd) {
        ActivityEntity.ObjectEntity objectEntity = ((ActivityEntity) aofd).f82762f;
        if (objectEntity != null) {
            List list = objectEntity.f82772d;
            if (list == null || list.isEmpty()) {
                throw new VolleyError("Link preview requires object.attachments[].");
            }
            ActivityEntity.ObjectEntity.AttachmentsEntity attachmentsEntity = (ActivityEntity.ObjectEntity.AttachmentsEntity) list.get(0);
            if (attachmentsEntity != null) {
                contentValues.put("title", attachmentsEntity.f82786f);
                contentValues.put("type", attachmentsEntity.f82788h);
                contentValues.put("description", attachmentsEntity.f82784d);
                if (attachmentsEntity.f82781a.contains(2)) {
                    contentValues.put("callToActionDisplayName", attachmentsEntity.f82783c.f82795d);
                }
                ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity imageEntity = attachmentsEntity.f82787g;
                if (imageEntity != null) {
                    contentValues.put("thumbnailUrl", imageEntity.f82810c);
                    return;
                }
                return;
            }
            throw new VolleyError("Link preview requires attachments.");
        }
        throw new VolleyError("Link preview requires object.");
    }

    /* renamed from: a */
    public static void m65101a(String str, ContentValues contentValues) {
        anry a = anry.m65083a();
        synchronized (a.f77564b) {
            a.f77564b.mo15547a(str, contentValues);
        }
    }
}
