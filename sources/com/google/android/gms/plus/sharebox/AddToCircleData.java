package com.google.android.gms.plus.sharebox;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AddToCircleData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aokx();

    /* renamed from: a */
    public final int f83431a;

    /* renamed from: b */
    public String f83432b;

    /* renamed from: c */
    public String f83433c;

    /* renamed from: d */
    public Audience f83434d;

    /* renamed from: e */
    public Audience f83435e;

    /* renamed from: f */
    public ArrayList f83436f;

    /* renamed from: g */
    public Integer f83437g;

    /* renamed from: h */
    private Boolean f83438h;

    /* renamed from: i */
    private Boolean f83439i;

    public AddToCircleData(int i, String str, String str2, Audience audience, Audience audience2, ArrayList arrayList, Integer num, Boolean bool, Boolean bool2) {
        this.f83431a = i;
        this.f83432b = str;
        this.f83433c = str2;
        this.f83434d = audience;
        this.f83435e = audience2;
        this.f83436f = arrayList;
        this.f83437g = num;
        this.f83438h = bool;
        this.f83439i = bool2;
    }

    /* renamed from: a */
    private final int m69341a(String str) {
        if (!mo46773b() || TextUtils.isEmpty(str)) {
            return -1;
        }
        int size = this.f83436f.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(((Circle) this.f83436f.get(i)).f83446e)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: g */
    private final boolean m69342g() {
        return m69341a(this.f83432b) >= 0;
    }

    /* renamed from: b */
    public final boolean mo46773b() {
        return this.f83436f != null;
    }

    /* renamed from: c */
    public final int mo46774c() {
        Integer num = this.f83437g;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: d */
    public final boolean mo46775d() {
        Boolean bool = this.f83438h;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo46776e() {
        Boolean bool;
        return !((Boolean) ansx.f77664N.mo25081c()).booleanValue() || (bool = this.f83439i) == null || bool.booleanValue();
    }

    /* renamed from: f */
    public final Audience mo46777f() {
        Audience audience = this.f83435e;
        ArrayList arrayList = new ArrayList();
        if (audience != null) {
            int size = audience.f30287b.size();
            for (int i = 0; i < size; i++) {
                AudienceMember audienceMember = (AudienceMember) audience.f30287b.get(i);
                if (audienceMember.mo17847c() && audienceMember.f30298h.getBoolean("checked", false)) {
                    arrayList.add(audienceMember);
                }
            }
        }
        sfd sfd = new sfd();
        sfd.mo25467a(arrayList);
        return sfd.mo25465a();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(AddToCircleData.class.getSimpleName());
        stringBuffer.append("<");
        stringBuffer.append("circles=");
        ArrayList arrayList = this.f83436f;
        int i = 0;
        stringBuffer.append(arrayList != null ? arrayList.size() : 0);
        stringBuffer.append(" audience=");
        Audience audience = this.f83434d;
        stringBuffer.append(audience != null ? audience.f30287b.size() : 0);
        stringBuffer.append(" uncircledPeople=");
        Audience audience2 = this.f83435e;
        if (audience2 != null) {
            i = audience2.f30287b.size();
        }
        stringBuffer.append(i);
        stringBuffer.append(" index=");
        stringBuffer.append(mo46774c());
        stringBuffer.append(" checked=");
        stringBuffer.append(mo46775d());
        stringBuffer.append(" hidden=");
        stringBuffer.append(mo46776e());
        int size = mo46777f().f30287b.size();
        StringBuilder sb = new StringBuilder(24);
        sb.append(" peopleToAdd=");
        sb.append(size);
        stringBuffer.append(sb.toString());
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010b, code lost:
        if (r13 < 0) goto L_0x010d;
     */
    /* renamed from: a */
    public final void mo46771a(Audience audience, Audience audience2) {
        int i;
        Bundle bundle;
        Boolean bool;
        int indexOf;
        Bundle bundle2;
        Bundle bundle3;
        String str = null;
        if (audience != null) {
            this.f83434d = audience;
            ArrayList arrayList = new ArrayList();
            boolean z = true;
            if (audience != null) {
                int size = audience.f30287b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AudienceMember audienceMember = (AudienceMember) audience.f30287b.get(i2);
                    Bundle bundle4 = audienceMember.f30298h;
                    if (audienceMember.mo17847c() && bundle4 != null && (audienceMember == null || (bundle3 = audienceMember.f30298h) == null || bundle3.getBoolean("checkboxEnabled", true))) {
                        if (ancm.m64020i(audienceMember.f30295e) && !bundle4.containsKey("isCircled")) {
                            bundle4.putBoolean("isCircled", false);
                        }
                        if (bundle4.containsKey("isCircled") && !bundle4.getBoolean("isCircled")) {
                            if (audience2 == null || (indexOf = audience2.f30287b.indexOf(audienceMember)) < 0 || (bundle2 = ((AudienceMember) audience2.f30287b.get(indexOf)).f30298h) == null || !bundle2.containsKey("checked")) {
                                bool = null;
                            } else {
                                bool = Boolean.valueOf(bundle2.getBoolean("checked"));
                            }
                            if (bool != null) {
                                bundle4.putBoolean("checked", bool.booleanValue());
                            } else if (!bundle4.containsKey("checked")) {
                                bundle4.putBoolean("checked", true);
                            }
                            arrayList.add(audienceMember);
                        }
                    }
                }
            }
            Collections.sort(arrayList, aokz.f78380a);
            sfd sfd = new sfd();
            sfd.mo25467a(arrayList);
            Audience a = sfd.mo25465a();
            this.f83435e = a;
            int i3 = -1;
            if (!a.f30287b.isEmpty()) {
                ArrayList arrayList2 = this.f83436f;
                if (arrayList2 != null) {
                    if (!arrayList2.isEmpty()) {
                        Audience audience3 = this.f83434d;
                        if (audience3 != null && !audience3.f30287b.isEmpty()) {
                            int size2 = audience3.f30287b.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    AudienceMember audienceMember2 = (AudienceMember) audience3.f30287b.get(i4);
                                    if (audienceMember2 == null || !audienceMember2.mo17847c() || (bundle = audienceMember2.f30298h) == null || !bundle.containsKey("objectType") || !"page".equals(bundle.getString("objectType"))) {
                                        break;
                                    }
                                    i4++;
                                } else {
                                    i3 = m69341a(this.f83433c);
                                }
                            }
                        }
                        Audience audience4 = this.f83434d;
                        if (audience4 != null) {
                            i = audience4.f30287b.size();
                        } else {
                            i = 0;
                        }
                        int i5 = 0;
                        for (int i6 = 0; i6 < i; i6++) {
                            AudienceMember audienceMember3 = (AudienceMember) this.f83434d.f30287b.get(i6);
                            if (audienceMember3.mo17845a()) {
                                i5++;
                                if (str == null) {
                                    str = audienceMember3.f30296f;
                                }
                            }
                        }
                        if (i5 != 1 || (i3 = m69341a(str)) < 0) {
                            i3 = m69342g() ? m69341a(this.f83432b) : 0;
                        }
                    } else {
                        i3 = 0;
                    }
                }
                this.f83437g = Integer.valueOf(i3);
                this.f83438h = Boolean.valueOf(((Boolean) ansx.f77665O.mo25081c()).booleanValue() && m69342g());
                if (mo46773b() && this.f83437g.intValue() >= 0) {
                    z = false;
                }
                this.f83439i = Boolean.valueOf(z);
                return;
            }
            this.f83437g = -1;
            this.f83438h = false;
            this.f83439i = true;
            return;
        }
        Log.w("ShareBox", "Cannot calculate add to circle state unless audience is set");
        this.f83437g = null;
        this.f83438h = null;
        this.f83439i = null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f83432b, false);
        see.m35046a(parcel, 2, this.f83433c, false);
        see.m35040a(parcel, 3, this.f83434d, i, false);
        see.m35040a(parcel, 4, this.f83435e, i, false);
        see.m35066c(parcel, 5, this.f83436f, false);
        see.m35044a(parcel, 6, Integer.valueOf(mo46774c()));
        see.m35041a(parcel, 7, Boolean.valueOf(mo46775d()));
        see.m35041a(parcel, 8, Boolean.valueOf(mo46776e()));
        see.m35063b(parcel, 1000, this.f83431a);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final boolean mo46772a() {
        return (!mo46773b() || this.f83437g == null || this.f83438h == null || this.f83439i == null) ? false : true;
    }
}
