package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PersonEntity extends AbstractSafeParcelable implements Person {
    public static final Parcelable.Creator CREATOR = new amoy();

    /* renamed from: a */
    public final String f82019a;

    /* renamed from: b */
    private final List f82020b;

    /* renamed from: c */
    private final List f82021c;

    /* renamed from: d */
    private final List f82022d;

    /* renamed from: e */
    private final List f82023e;

    /* renamed from: f */
    private final List f82024f;

    /* renamed from: g */
    private List f82025g;

    /* renamed from: h */
    private List f82026h;

    /* renamed from: i */
    private List f82027i;

    /* renamed from: j */
    private List f82028j;

    /* renamed from: k */
    private List f82029k;

    public PersonEntity(String str, List list, List list2, List list3, List list4, List list5) {
        this.f82019a = str;
        this.f82020b = list;
        this.f82021c = list2;
        this.f82022d = list3;
        this.f82023e = list4;
        this.f82024f = list5;
    }

    /* renamed from: a */
    public final String mo46439a() {
        return this.f82019a;
    }

    /* renamed from: b */
    public final List mo46440b() {
        List list;
        if (this.f82025g == null && (list = this.f82020b) != null) {
            this.f82025g = new ArrayList(list.size());
            List list2 = this.f82020b;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.f82025g.add((Name) list2.get(i));
            }
        }
        return this.f82025g;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final List mo46441c() {
        List list;
        if (this.f82026h == null && (list = this.f82021c) != null) {
            this.f82026h = new ArrayList(list.size());
            List list2 = this.f82021c;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.f82026h.add((Photo) list2.get(i));
            }
        }
        return this.f82026h;
    }

    /* renamed from: d */
    public final List mo46442d() {
        List list;
        if (this.f82027i == null && (list = this.f82022d) != null) {
            this.f82027i = new ArrayList(list.size());
            List list2 = this.f82022d;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.f82027i.add((Email) list2.get(i));
            }
        }
        return this.f82027i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Person person = (Person) obj;
        return sdg.m34949a(mo46439a(), person.mo46439a()) && sdg.m34949a(mo46440b(), person.mo46440b()) && sdg.m34949a(mo46441c(), person.mo46441c()) && sdg.m34949a(mo46442d(), person.mo46442d()) && sdg.m34949a(mo46443f(), person.mo46443f()) && sdg.m34949a(mo46444g(), person.mo46444g());
    }

    /* renamed from: f */
    public final List mo46443f() {
        List list;
        if (this.f82028j == null && (list = this.f82023e) != null) {
            this.f82028j = new ArrayList(list.size());
            List list2 = this.f82023e;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.f82028j.add((Phone) list2.get(i));
            }
        }
        return this.f82028j;
    }

    /* renamed from: g */
    public final List mo46444g() {
        List list;
        if (this.f82029k == null && (list = this.f82024f) != null) {
            this.f82029k = new ArrayList(list.size());
            List list2 = this.f82024f;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.f82029k.add((Birthday) list2.get(i));
            }
        }
        return this.f82029k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo46439a(), mo46440b(), mo46441c(), mo46442d(), mo46443f(), mo46444g()});
    }

    public PersonEntity(String str, List list, List list2, List list3, List list4, List list5, boolean z) {
        List list6 = list;
        List list7 = list2;
        List list8 = list3;
        List list9 = list4;
        List list10 = list5;
        this.f82019a = str;
        if (z) {
            this.f82025g = list6;
            if (list6 != null) {
                this.f82020b = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f82020b.add((NameEntity) ((Name) it.next()));
                }
            } else {
                this.f82020b = null;
            }
            this.f82026h = list7;
            if (list7 != null) {
                this.f82021c = new ArrayList(list2.size());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    this.f82021c.add((PhotoEntity) ((Photo) it2.next()));
                }
            } else {
                this.f82021c = null;
            }
            this.f82027i = list8;
            if (list8 != null) {
                this.f82022d = new ArrayList(list3.size());
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    this.f82022d.add((EmailEntity) ((Email) it3.next()));
                }
            } else {
                this.f82022d = null;
            }
            this.f82028j = list9;
            if (list9 != null) {
                this.f82023e = new ArrayList(list4.size());
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    this.f82023e.add((PhoneEntity) ((Phone) it4.next()));
                }
            } else {
                this.f82023e = null;
            }
            this.f82029k = list10;
            if (list10 != null) {
                this.f82024f = new ArrayList(list5.size());
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    this.f82024f.add((BirthdayEntity) ((Birthday) it5.next()));
                }
                return;
            }
            this.f82024f = null;
            return;
        }
        this.f82025g = list6;
        if (list6 != null) {
            this.f82020b = new ArrayList(list.size());
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                Name name = (Name) it6.next();
                this.f82020b.add(new NameEntity(name.mo46429a(), name.mo46430b(), name.mo46431c(), name.mo46432d(), name.mo46433f(), name.mo46434g(), name.mo46435h(), false));
            }
        } else {
            this.f82020b = null;
        }
        this.f82026h = list7;
        if (list7 != null) {
            this.f82021c = new ArrayList(list2.size());
            Iterator it7 = list2.iterator();
            while (it7.hasNext()) {
                Photo photo = (Photo) it7.next();
                this.f82021c.add(new PhotoEntity(photo.mo46459a(), photo.mo46460b(), false));
            }
        } else {
            this.f82021c = null;
        }
        this.f82027i = list8;
        if (list8 != null) {
            this.f82022d = new ArrayList(list3.size());
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                Email email = (Email) it8.next();
                this.f82022d.add(new EmailEntity(email.mo46420a(), email.mo46421b(), false));
            }
        } else {
            this.f82022d = null;
        }
        this.f82028j = list9;
        if (list9 != null) {
            this.f82023e = new ArrayList(list4.size());
            Iterator it9 = list4.iterator();
            while (it9.hasNext()) {
                Phone phone = (Phone) it9.next();
                this.f82023e.add(new PhoneEntity(phone.mo46453a(), phone.mo46454b(), phone.mo46455c(), false));
            }
        } else {
            this.f82023e = null;
        }
        this.f82029k = list10;
        if (list10 != null) {
            this.f82024f = new ArrayList(list5.size());
            Iterator it10 = list5.iterator();
            while (it10.hasNext()) {
                Birthday birthday = (Birthday) it10.next();
                this.f82024f.add(new BirthdayEntity(birthday.mo46411a(), birthday.mo46412b(), false));
            }
            return;
        }
        this.f82024f = null;
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
        see.m35046a(parcel, 2, this.f82019a, false);
        see.m35066c(parcel, 4, mo46440b(), false);
        see.m35066c(parcel, 5, mo46441c(), false);
        see.m35066c(parcel, 9, mo46444g(), false);
        see.m35066c(parcel, 11, mo46442d(), false);
        see.m35066c(parcel, 13, mo46443f(), false);
        see.m35062b(parcel, a);
    }
}
