package p000;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.Person;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aquw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aquw implements aqrp {

    /* renamed from: a */
    public final List f86858a = new ArrayList();

    /* renamed from: b */
    public Person f86859b;

    /* renamed from: c */
    public final aqwf f86860c;

    /* renamed from: d */
    public final aquy f86861d;

    /* renamed from: e */
    public int f86862e;

    /* renamed from: f */
    private final List f86863f = new ArrayList();

    /* renamed from: g */
    private List f86864g;

    /* renamed from: h */
    private List f86865h;

    /* renamed from: i */
    private int f86866i = 0;

    /* renamed from: j */
    private int f86867j = 0;

    /* renamed from: k */
    private final aquz f86868k;

    public aquw(aqwf aqwf, aquy aquy, aquz aquz) {
        this.f86860c = aqwf;
        this.f86861d = aquy;
        this.f86868k = aquz;
    }

    /* renamed from: a */
    public static final Set m72121a(Person person) {
        HashSet hashSet = new HashSet();
        List list = ((PersonImpl) person).f81752s;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Person.Memberships memberships = (Person.Memberships) list.get(i);
                if (memberships.mo40954a()) {
                    Person.Metadata b = memberships.mo46297b();
                    if (b.mo40936a() && b.mo40937b().equals("cp2")) {
                        hashSet.add(b.mo40941f());
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo48048a(List list, List list2, List list3) {
        this.f86864g = list;
        this.f86865h = list2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final void mo48171a() {
        ByteArrayOutputStream byteArrayOutputStream;
        aqux aqux = new aqux(this.f86861d);
        if (!TextUtils.isEmpty(this.f86868k.f86879b)) {
            aqux.f86870b.putExtra("name", this.f86868k.f86879b);
        }
        List list = this.f86865h;
        if (list != null && !list.isEmpty()) {
            List list2 = this.f86865h;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                bzhr bzhr = (bzhr) list2.get(i);
                if (!bzhr.f170110b.isEmpty()) {
                    String str = bzhr.f170110b;
                    String str2 = bzhr.f170111c;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    contentValues.put("data2", (Integer) 0);
                    if (!TextUtils.isEmpty(str2)) {
                        contentValues.put("data3", str2);
                    }
                    contentValues.put("data1", str);
                    aqux.f86869a.add(contentValues);
                }
            }
        }
        List list3 = this.f86864g;
        if (list3 != null && !list3.isEmpty()) {
            List list4 = this.f86864g;
            int size2 = list4.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bzhq bzhq = (bzhq) list4.get(i2);
                if (!bzhq.f170104b.isEmpty()) {
                    String str3 = bzhq.f170104b;
                    String str4 = bzhq.f170105c;
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("mimetype", "vnd.android.cursor.item/email_v2");
                    contentValues2.put("data2", (Integer) 0);
                    if (!TextUtils.isEmpty(str4)) {
                        contentValues2.put("data3", str4);
                    }
                    contentValues2.put("data1", str3);
                    aqux.f86869a.add(contentValues2);
                }
            }
        }
        Person person = this.f86859b;
        String str5 = ((PersonImpl) person).f81746m;
        if (person.mo41010W() && str5 != null && str5.matches("[0-9]+")) {
            String format = String.format("http://www.google.com/profiles/%s", str5);
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("mimetype", "vnd.android.cursor.item/website");
            contentValues3.put("data1", format);
            aqux.f86869a.add(contentValues3);
        }
        Bitmap bitmap = this.f86868k.f86878a;
        if (bitmap != null) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("mimetype", "vnd.android.cursor.item/photo");
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    contentValues4.put("data15", byteArrayOutputStream.toByteArray());
                    aqux.f86869a.add(contentValues4);
                    srz.m36171a(byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                    srz.m36171a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
                srz.m36171a(byteArrayOutputStream);
                throw th;
            }
        }
        aqux.f86870b.putParcelableArrayListExtra("data", aqux.f86869a);
        aqux.f86871c.f86872a.startActivityForResult(aqux.f86870b, 1);
    }

    /* renamed from: a */
    public final void mo48172a(int i, int i2) {
        if (this.f86866i != i || this.f86867j != i2) {
            this.f86866i = i;
            this.f86867j = i2;
            List list = this.f86863f;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((aquv) list.get(i3)).mo48076a(i, i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo48173a(aquu aquu) {
        this.f86858a.add(aquu);
        if (this.f86862e == 1) {
            aquu.mo48040a(this.f86859b);
        }
    }

    /* renamed from: a */
    public final void mo48174a(aquv aquv) {
        this.f86863f.add(aquv);
        aquv.mo48076a(this.f86866i, this.f86867j);
    }

    /* renamed from: a */
    public final void mo48175a(boolean z) {
        aqwf aqwf = this.f86860c;
        aqwf.f86965a.restartLoader(11, null, new aqwd(aqwf, m72121a(this.f86859b), z, new aqut(this)));
    }
}
