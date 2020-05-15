package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.identity.models.ImageReference;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PersonImpl extends AbstractSafeParcelable implements Person {
    public static final Parcelable.Creator CREATOR = new alyn();

    /* renamed from: A */
    public String f81725A;

    /* renamed from: B */
    List f81726B;

    /* renamed from: C */
    List f81727C;

    /* renamed from: D */
    List f81728D;

    /* renamed from: E */
    List f81729E;

    /* renamed from: F */
    public SortKeysImpl f81730F;

    /* renamed from: G */
    List f81731G;

    /* renamed from: H */
    List f81732H;

    /* renamed from: I */
    List f81733I;

    /* renamed from: a */
    final Set f81734a;

    /* renamed from: b */
    List f81735b;

    /* renamed from: c */
    List f81736c;

    /* renamed from: d */
    String f81737d;

    /* renamed from: e */
    List f81738e;

    /* renamed from: f */
    List f81739f;

    /* renamed from: g */
    List f81740g;

    /* renamed from: h */
    List f81741h;

    /* renamed from: i */
    public List f81742i;

    /* renamed from: j */
    public String f81743j;

    /* renamed from: k */
    List f81744k;

    /* renamed from: l */
    List f81745l;

    /* renamed from: m */
    public String f81746m;

    /* renamed from: n */
    public List f81747n;

    /* renamed from: o */
    List f81748o;

    /* renamed from: p */
    public String f81749p;

    /* renamed from: q */
    public LegacyFieldsImpl f81750q;

    /* renamed from: r */
    List f81751r;

    /* renamed from: s */
    public List f81752s;

    /* renamed from: t */
    public PersonMetadataImpl f81753t;

    /* renamed from: u */
    public List f81754u;

    /* renamed from: v */
    List f81755v;

    /* renamed from: w */
    List f81756w;

    /* renamed from: x */
    List f81757x;

    /* renamed from: y */
    public List f81758y;

    /* renamed from: z */
    List f81759z;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class AboutsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alxr();

        /* renamed from: a */
        final Set f81760a;

        /* renamed from: b */
        public MetadataImpl f81761b;

        /* renamed from: c */
        public String f81762c;

        /* renamed from: d */
        public String f81763d;

        public AboutsImpl() {
            this.f81760a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public AboutsImpl(AboutsImpl aboutsImpl) {
            this();
            this.f81761b = null;
            MetadataImpl metadataImpl = aboutsImpl.f81761b;
            if (metadataImpl != null) {
                this.f81761b = new MetadataImpl(metadataImpl);
            }
            this.f81762c = null;
            String str = aboutsImpl.f81762c;
            if (str != null) {
                this.f81762c = str;
            }
            this.f81763d = null;
            String str2 = aboutsImpl.f81763d;
            if (str2 != null) {
                this.f81763d = str2;
            }
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
            Set set = this.f81760a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81761b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81762c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81763d, true);
            }
            see.m35062b(parcel, a);
        }

        public AboutsImpl(Set set, MetadataImpl metadataImpl, String str, String str2) {
            this.f81760a = set;
            this.f81761b = metadataImpl;
            this.f81762c = str;
            this.f81763d = str2;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class AddressesImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alxs();

        /* renamed from: a */
        final Set f81764a;

        /* renamed from: b */
        public MetadataImpl f81765b;

        /* renamed from: c */
        public String f81766c;

        /* renamed from: d */
        public String f81767d;

        /* renamed from: e */
        public String f81768e;

        /* renamed from: f */
        public String f81769f;

        /* renamed from: g */
        public String f81770g;

        /* renamed from: h */
        public String f81771h;

        /* renamed from: i */
        public String f81772i;

        /* renamed from: j */
        public String f81773j;

        /* renamed from: k */
        public String f81774k;

        /* renamed from: l */
        public String f81775l;

        public AddressesImpl() {
            this.f81764a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public AddressesImpl(AddressesImpl addressesImpl) {
            this();
            this.f81765b = null;
            MetadataImpl metadataImpl = addressesImpl.f81765b;
            if (metadataImpl != null) {
                this.f81765b = new MetadataImpl(metadataImpl);
            }
            this.f81766c = null;
            String str = addressesImpl.f81766c;
            if (str != null) {
                this.f81766c = str;
            }
            this.f81767d = null;
            String str2 = addressesImpl.f81767d;
            if (str2 != null) {
                this.f81767d = str2;
            }
            this.f81768e = null;
            String str3 = addressesImpl.f81768e;
            if (str3 != null) {
                this.f81768e = str3;
            }
            this.f81769f = null;
            String str4 = addressesImpl.f81769f;
            if (str4 != null) {
                this.f81769f = str4;
            }
            this.f81770g = null;
            String str5 = addressesImpl.f81770g;
            if (str5 != null) {
                this.f81770g = str5;
            }
            this.f81771h = null;
            String str6 = addressesImpl.f81771h;
            if (str6 != null) {
                this.f81771h = str6;
            }
            this.f81772i = null;
            String str7 = addressesImpl.f81772i;
            if (str7 != null) {
                this.f81772i = str7;
            }
            this.f81773j = null;
            String str8 = addressesImpl.f81773j;
            if (str8 != null) {
                this.f81773j = str8;
            }
            this.f81774k = null;
            String str9 = addressesImpl.f81774k;
            if (str9 != null) {
                this.f81774k = str9;
            }
            this.f81775l = null;
            String str10 = addressesImpl.f81775l;
            if (str10 != null) {
                this.f81775l = str10;
            }
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
            Set set = this.f81764a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81765b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81766c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81767d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f81768e, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f81769f, true);
            }
            if (set.contains(7)) {
                see.m35046a(parcel, 7, this.f81770g, true);
            }
            if (set.contains(8)) {
                see.m35046a(parcel, 8, this.f81771h, true);
            }
            if (set.contains(9)) {
                see.m35046a(parcel, 9, this.f81772i, true);
            }
            if (set.contains(10)) {
                see.m35046a(parcel, 10, this.f81773j, true);
            }
            if (set.contains(11)) {
                see.m35046a(parcel, 11, this.f81774k, true);
            }
            if (set.contains(12)) {
                see.m35046a(parcel, 12, this.f81775l, true);
            }
            see.m35062b(parcel, a);
        }

        public AddressesImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.f81764a = set;
            this.f81765b = metadataImpl;
            this.f81766c = str;
            this.f81767d = str2;
            this.f81768e = str3;
            this.f81769f = str4;
            this.f81770g = str5;
            this.f81771h = str6;
            this.f81772i = str7;
            this.f81773j = str8;
            this.f81774k = str9;
            this.f81775l = str10;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class BirthdaysImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alxt();

        /* renamed from: a */
        final Set f81776a;

        /* renamed from: b */
        public MetadataImpl f81777b;

        /* renamed from: c */
        public String f81778c;

        public BirthdaysImpl() {
            this.f81776a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public BirthdaysImpl(BirthdaysImpl birthdaysImpl) {
            this();
            this.f81777b = null;
            MetadataImpl metadataImpl = birthdaysImpl.f81777b;
            if (metadataImpl != null) {
                this.f81777b = new MetadataImpl(metadataImpl);
            }
            this.f81778c = null;
            String str = birthdaysImpl.f81778c;
            if (str != null) {
                this.f81778c = str;
            }
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
            Set set = this.f81776a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81777b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81778c, true);
            }
            see.m35062b(parcel, a);
        }

        public BirthdaysImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.f81776a = set;
            this.f81777b = metadataImpl;
            this.f81778c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class BraggingRightsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alxu();

        /* renamed from: a */
        final Set f81779a;

        /* renamed from: b */
        public MetadataImpl f81780b;

        /* renamed from: c */
        public String f81781c;

        public BraggingRightsImpl() {
            this.f81779a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public BraggingRightsImpl(BraggingRightsImpl braggingRightsImpl) {
            this();
            this.f81780b = null;
            MetadataImpl metadataImpl = braggingRightsImpl.f81780b;
            if (metadataImpl != null) {
                this.f81780b = new MetadataImpl(metadataImpl);
            }
            this.f81781c = null;
            String str = braggingRightsImpl.f81781c;
            if (str != null) {
                this.f81781c = str;
            }
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
            Set set = this.f81779a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81780b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81781c, true);
            }
            see.m35062b(parcel, a);
        }

        public BraggingRightsImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.f81779a = set;
            this.f81780b = metadataImpl;
            this.f81781c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class CoverPhotosImpl extends AbstractSafeParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new alxv();

        /* renamed from: a */
        final Set f81782a;

        /* renamed from: b */
        int f81783b;

        /* renamed from: c */
        public String f81784c;

        /* renamed from: d */
        public ImageReferenceImpl f81785d;

        /* renamed from: e */
        int f81786e;

        /* renamed from: f */
        boolean f81787f;

        public CoverPhotosImpl() {
            this.f81782a = new HashSet();
        }

        /* renamed from: a */
        public final void mo46302a(int i) {
            this.f81782a.add(2);
            this.f81783b = i;
        }

        /* renamed from: b */
        public final void mo46304b(int i) {
            this.f81782a.add(5);
            this.f81786e = i;
        }

        public CoverPhotosImpl(CoverPhotosImpl coverPhotosImpl) {
            this();
            this.f81782a.remove(2);
            if (coverPhotosImpl.f81782a.contains(2)) {
                mo46302a(coverPhotosImpl.f81783b);
            }
            this.f81784c = null;
            String str = coverPhotosImpl.f81784c;
            if (str != null) {
                this.f81784c = str;
            }
            this.f81785d = null;
            ImageReferenceImpl imageReferenceImpl = coverPhotosImpl.f81785d;
            if (imageReferenceImpl != null) {
                this.f81785d = new ImageReferenceImpl(imageReferenceImpl);
            }
            this.f81782a.remove(5);
            if (coverPhotosImpl.f81782a.contains(5)) {
                mo46304b(coverPhotosImpl.f81786e);
            }
            this.f81782a.remove(6);
            if (coverPhotosImpl.f81782a.contains(6)) {
                mo46303a(coverPhotosImpl.f81787f);
            }
        }

        /* renamed from: a */
        public final void mo46303a(boolean z) {
            this.f81782a.add(6);
            this.f81787f = z;
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
            Set set = this.f81782a;
            if (set.contains(2)) {
                see.m35063b(parcel, 2, this.f81783b);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81784c, true);
            }
            if (set.contains(4)) {
                see.m35040a(parcel, 4, this.f81785d, i, true);
            }
            if (set.contains(5)) {
                see.m35063b(parcel, 5, this.f81786e);
            }
            if (set.contains(6)) {
                see.m35051a(parcel, 6, this.f81787f);
            }
            see.m35062b(parcel, a);
        }

        public CoverPhotosImpl(Set set, int i, String str, ImageReferenceImpl imageReferenceImpl, int i2, boolean z) {
            this.f81782a = set;
            this.f81783b = i;
            this.f81784c = str;
            this.f81785d = imageReferenceImpl;
            this.f81786e = i2;
            this.f81787f = z;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class CustomFieldsImpl extends AbstractSafeParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new alxw();

        /* renamed from: a */
        final Set f81788a;

        /* renamed from: b */
        public String f81789b;

        /* renamed from: c */
        public String f81790c;

        public CustomFieldsImpl() {
            this.f81788a = new HashSet();
        }

        public CustomFieldsImpl(CustomFieldsImpl customFieldsImpl) {
            this();
            this.f81789b = null;
            String str = customFieldsImpl.f81789b;
            if (str != null) {
                this.f81789b = str;
            }
            this.f81790c = null;
            String str2 = customFieldsImpl.f81790c;
            if (str2 != null) {
                this.f81790c = str2;
            }
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
            Set set = this.f81788a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f81789b, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81790c, true);
            }
            see.m35062b(parcel, a);
        }

        public CustomFieldsImpl(Set set, String str, String str2) {
            this.f81788a = set;
            this.f81789b = str;
            this.f81790c = str2;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class EmailsImpl extends AbstractSafeParcelable implements Person.Emails {
        public static final Parcelable.Creator CREATOR = new alxz();

        /* renamed from: a */
        final Set f81791a;

        /* renamed from: b */
        public MetadataImpl f81792b;

        /* renamed from: c */
        public String f81793c;

        /* renamed from: d */
        public String f81794d;

        /* renamed from: e */
        public String f81795e;

        /* renamed from: f */
        int f81796f;

        public EmailsImpl() {
            this.f81791a = new HashSet();
        }

        /* renamed from: a */
        public final void mo46307a(int i) {
            this.f81791a.add(6);
            this.f81796f = i;
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            return this.f81792b != null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            return this.f81792b;
        }

        /* renamed from: d */
        public final boolean mo40918d() {
            return this.f81793c != null;
        }

        /* renamed from: e */
        public final String mo40919e() {
            return this.f81793c;
        }

        /* renamed from: f */
        public final boolean mo40920f() {
            return this.f81794d != null;
        }

        /* renamed from: g */
        public final String mo40921g() {
            return this.f81794d;
        }

        /* renamed from: h */
        public final boolean mo40922h() {
            return this.f81795e != null;
        }

        /* renamed from: i */
        public final String mo40923i() {
            return this.f81795e;
        }

        /* renamed from: j */
        public final boolean mo40924j() {
            return this.f81791a.contains(6);
        }

        /* renamed from: k */
        public final int mo40925k() {
            return this.f81796f;
        }

        public EmailsImpl(alza alza) {
            this();
            this.f81792b = null;
            if (alza.mo40954a()) {
                this.f81792b = new MetadataImpl(alza.mo40955c());
            }
            this.f81793c = null;
            if (alza.mo40918d()) {
                this.f81793c = alza.mo40919e();
            }
            this.f81794d = null;
            if (alza.mo40920f()) {
                this.f81794d = alza.mo40921g();
            }
            this.f81795e = null;
            if (alza.mo40922h()) {
                this.f81795e = alza.mo40923i();
            }
            this.f81791a.remove(6);
            if (alza.mo40924j()) {
                mo46307a(alza.mo40925k());
            }
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
            Set set = this.f81791a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81792b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81793c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81794d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f81795e, true);
            }
            if (set.contains(6)) {
                see.m35063b(parcel, 6, this.f81796f);
            }
            see.m35062b(parcel, a);
        }

        public EmailsImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3, int i) {
            this.f81791a = set;
            this.f81792b = metadataImpl;
            this.f81793c = str;
            this.f81794d = str2;
            this.f81795e = str3;
            this.f81796f = i;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class EventsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alya();

        /* renamed from: a */
        final Set f81797a;

        /* renamed from: b */
        public MetadataImpl f81798b;

        /* renamed from: c */
        public String f81799c;

        /* renamed from: d */
        public String f81800d;

        /* renamed from: e */
        public String f81801e;

        public EventsImpl() {
            this.f81797a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public EventsImpl(EventsImpl eventsImpl) {
            this();
            this.f81798b = null;
            MetadataImpl metadataImpl = eventsImpl.f81798b;
            if (metadataImpl != null) {
                this.f81798b = new MetadataImpl(metadataImpl);
            }
            this.f81799c = null;
            String str = eventsImpl.f81799c;
            if (str != null) {
                this.f81799c = str;
            }
            this.f81800d = null;
            String str2 = eventsImpl.f81800d;
            if (str2 != null) {
                this.f81800d = str2;
            }
            this.f81801e = null;
            String str3 = eventsImpl.f81801e;
            if (str3 != null) {
                this.f81801e = str3;
            }
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
            Set set = this.f81797a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81798b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81799c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81800d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f81801e, true);
            }
            see.m35062b(parcel, a);
        }

        public EventsImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3) {
            this.f81797a = set;
            this.f81798b = metadataImpl;
            this.f81799c = str;
            this.f81800d = str2;
            this.f81801e = str3;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class GendersImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alyb();

        /* renamed from: a */
        final Set f81802a;

        /* renamed from: b */
        public MetadataImpl f81803b;

        /* renamed from: c */
        public String f81804c;

        /* renamed from: d */
        public String f81805d;

        public GendersImpl() {
            this.f81802a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public GendersImpl(GendersImpl gendersImpl) {
            this();
            this.f81803b = null;
            MetadataImpl metadataImpl = gendersImpl.f81803b;
            if (metadataImpl != null) {
                this.f81803b = new MetadataImpl(metadataImpl);
            }
            this.f81804c = null;
            String str = gendersImpl.f81804c;
            if (str != null) {
                this.f81804c = str;
            }
            this.f81805d = null;
            String str2 = gendersImpl.f81805d;
            if (str2 != null) {
                this.f81805d = str2;
            }
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
            Set set = this.f81802a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81803b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81804c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81805d, true);
            }
            see.m35062b(parcel, a);
        }

        public GendersImpl(Set set, MetadataImpl metadataImpl, String str, String str2) {
            this.f81802a = set;
            this.f81803b = metadataImpl;
            this.f81804c = str;
            this.f81805d = str2;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ImagesImpl extends AbstractSafeParcelable implements Person.Images {
        public static final Parcelable.Creator CREATOR = new alyd();

        /* renamed from: a */
        final Set f81806a;

        /* renamed from: b */
        public MetadataImpl f81807b;

        /* renamed from: c */
        public ImageReferenceImpl f81808c;

        /* renamed from: d */
        boolean f81809d;

        public ImagesImpl() {
            this.f81806a = new HashSet();
        }

        /* renamed from: a */
        public final void mo46311a(boolean z) {
            this.f81806a.add(4);
            this.f81809d = z;
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            return this.f81807b != null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            return this.f81807b;
        }

        /* renamed from: d */
        public final boolean mo40926d() {
            return this.f81808c != null;
        }

        /* renamed from: e */
        public final boolean mo40927e() {
            return this.f81806a.contains(4);
        }

        /* renamed from: f */
        public final boolean mo40928f() {
            return this.f81809d;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ ImageReference mo46312g() {
            return this.f81808c;
        }

        /* renamed from: h */
        public final /* bridge */ /* synthetic */ alyz mo40929h() {
            return this.f81808c;
        }

        public ImagesImpl(alzb alzb) {
            this();
            this.f81807b = null;
            if (alzb.mo40954a()) {
                this.f81807b = new MetadataImpl(alzb.mo40955c());
            }
            this.f81808c = null;
            if (alzb.mo40926d()) {
                this.f81808c = new ImageReferenceImpl(alzb.mo40929h());
            }
            this.f81806a.remove(4);
            if (alzb.mo40927e()) {
                mo46311a(alzb.mo40928f());
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            Set set = this.f81806a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81807b, i, true);
            }
            if (set.contains(3)) {
                see.m35040a(parcel, 3, this.f81808c, i, true);
            }
            if (set.contains(4)) {
                see.m35051a(parcel, 4, this.f81809d);
            }
            see.m35062b(parcel, a);
        }

        public ImagesImpl(Set set, MetadataImpl metadataImpl, ImageReferenceImpl imageReferenceImpl, boolean z) {
            this.f81806a = set;
            this.f81807b = metadataImpl;
            this.f81808c = imageReferenceImpl;
            this.f81809d = z;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class InstantMessagingImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alye();

        /* renamed from: a */
        final Set f81810a;

        /* renamed from: b */
        public MetadataImpl f81811b;

        /* renamed from: c */
        public String f81812c;

        /* renamed from: d */
        public String f81813d;

        /* renamed from: e */
        public String f81814e;

        /* renamed from: f */
        public String f81815f;

        /* renamed from: g */
        public String f81816g;

        public InstantMessagingImpl() {
            this.f81810a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public InstantMessagingImpl(InstantMessagingImpl instantMessagingImpl) {
            this();
            this.f81811b = null;
            MetadataImpl metadataImpl = instantMessagingImpl.f81811b;
            if (metadataImpl != null) {
                this.f81811b = new MetadataImpl(metadataImpl);
            }
            this.f81812c = null;
            String str = instantMessagingImpl.f81812c;
            if (str != null) {
                this.f81812c = str;
            }
            this.f81813d = null;
            String str2 = instantMessagingImpl.f81813d;
            if (str2 != null) {
                this.f81813d = str2;
            }
            this.f81814e = null;
            String str3 = instantMessagingImpl.f81814e;
            if (str3 != null) {
                this.f81814e = str3;
            }
            this.f81815f = null;
            String str4 = instantMessagingImpl.f81815f;
            if (str4 != null) {
                this.f81815f = str4;
            }
            this.f81816g = null;
            String str5 = instantMessagingImpl.f81816g;
            if (str5 != null) {
                this.f81816g = str5;
            }
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
            Set set = this.f81810a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81811b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81812c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81813d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f81814e, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f81815f, true);
            }
            if (set.contains(7)) {
                see.m35046a(parcel, 7, this.f81816g, true);
            }
            see.m35062b(parcel, a);
        }

        public InstantMessagingImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3, String str4, String str5) {
            this.f81810a = set;
            this.f81811b = metadataImpl;
            this.f81812c = str;
            this.f81813d = str2;
            this.f81814e = str3;
            this.f81815f = str4;
            this.f81816g = str5;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class LegacyFieldsImpl extends AbstractSafeParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new alyf();

        /* renamed from: a */
        final Set f81817a;

        /* renamed from: b */
        public String f81818b;

        public LegacyFieldsImpl() {
            this.f81817a = new HashSet();
        }

        public LegacyFieldsImpl(LegacyFieldsImpl legacyFieldsImpl) {
            this();
            this.f81818b = null;
            String str = legacyFieldsImpl.f81818b;
            if (str != null) {
                this.f81818b = str;
            }
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
            if (this.f81817a.contains(2)) {
                see.m35046a(parcel, 2, this.f81818b, true);
            }
            see.m35062b(parcel, a);
        }

        public LegacyFieldsImpl(Set set, String str) {
            this.f81817a = set;
            this.f81818b = str;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class MembershipsImpl extends AbstractSafeParcelable implements Person.Memberships {
        public static final Parcelable.Creator CREATOR = new alyg();

        /* renamed from: a */
        final Set f81819a;

        /* renamed from: b */
        public MetadataImpl f81820b;

        /* renamed from: c */
        public String f81821c;

        /* renamed from: d */
        public String f81822d;

        /* renamed from: e */
        public String f81823e;

        public MembershipsImpl() {
            this.f81819a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            return this.f81820b != null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            return this.f81820b;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            return this.f81820b;
        }

        /* renamed from: d */
        public final boolean mo40930d() {
            return this.f81821c != null;
        }

        /* renamed from: e */
        public final String mo40931e() {
            return this.f81821c;
        }

        /* renamed from: f */
        public final boolean mo40932f() {
            return this.f81822d != null;
        }

        /* renamed from: g */
        public final String mo40933g() {
            return this.f81822d;
        }

        /* renamed from: h */
        public final boolean mo40934h() {
            return this.f81823e != null;
        }

        /* renamed from: i */
        public final String mo40935i() {
            return this.f81823e;
        }

        public MembershipsImpl(alzc alzc) {
            this();
            this.f81820b = null;
            if (alzc.mo40954a()) {
                this.f81820b = new MetadataImpl(alzc.mo40955c());
            }
            this.f81821c = null;
            if (alzc.mo40930d()) {
                this.f81821c = alzc.mo40931e();
            }
            this.f81822d = null;
            if (alzc.mo40932f()) {
                this.f81822d = alzc.mo40933g();
            }
            this.f81823e = null;
            if (alzc.mo40934h()) {
                this.f81823e = alzc.mo40935i();
            }
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
            Set set = this.f81819a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81820b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81821c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81822d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f81823e, true);
            }
            see.m35062b(parcel, a);
        }

        public MembershipsImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3) {
            this.f81819a = set;
            this.f81820b = metadataImpl;
            this.f81821c = str;
            this.f81822d = str2;
            this.f81823e = str3;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class MetadataImpl extends AbstractSafeParcelable implements Person.Metadata {
        public static final Parcelable.Creator CREATOR = new alyh();

        /* renamed from: a */
        final Set f81824a;

        /* renamed from: b */
        public String f81825b;

        /* renamed from: c */
        public String f81826c;

        /* renamed from: d */
        public String f81827d;

        /* renamed from: e */
        String f81828e;

        /* renamed from: f */
        boolean f81829f;

        /* renamed from: g */
        boolean f81830g;

        /* renamed from: h */
        boolean f81831h;

        /* renamed from: i */
        boolean f81832i;

        /* renamed from: j */
        int f81833j;

        public MetadataImpl() {
            this.f81824a = new HashSet();
        }

        /* renamed from: a */
        public final void mo46317a(int i) {
            this.f81824a.add(10);
            this.f81833j = i;
        }

        /* renamed from: a */
        public final boolean mo40936a() {
            return this.f81825b != null;
        }

        /* renamed from: b */
        public final String mo40937b() {
            return this.f81825b;
        }

        /* renamed from: c */
        public final void mo46320c(boolean z) {
            this.f81824a.add(9);
            this.f81832i = z;
        }

        /* renamed from: c */
        public final boolean mo40938c() {
            return this.f81826c != null;
        }

        /* renamed from: d */
        public final String mo40939d() {
            return this.f81826c;
        }

        /* renamed from: e */
        public final boolean mo40940e() {
            return this.f81827d != null;
        }

        /* renamed from: f */
        public final String mo40941f() {
            return this.f81827d;
        }

        /* renamed from: g */
        public final boolean mo40942g() {
            return this.f81828e != null;
        }

        /* renamed from: h */
        public final String mo40943h() {
            return this.f81828e;
        }

        /* renamed from: i */
        public final boolean mo40944i() {
            return this.f81824a.contains(6);
        }

        /* renamed from: j */
        public final boolean mo40945j() {
            return this.f81829f;
        }

        /* renamed from: k */
        public final boolean mo40946k() {
            return this.f81824a.contains(7);
        }

        /* renamed from: l */
        public final boolean mo40947l() {
            return this.f81830g;
        }

        /* renamed from: m */
        public final boolean mo40948m() {
            return this.f81824a.contains(8);
        }

        /* renamed from: n */
        public final boolean mo40949n() {
            return this.f81831h;
        }

        /* renamed from: o */
        public final boolean mo40950o() {
            return this.f81824a.contains(9);
        }

        /* renamed from: p */
        public final boolean mo40951p() {
            return this.f81832i;
        }

        /* renamed from: q */
        public final boolean mo40952q() {
            return this.f81824a.contains(10);
        }

        /* renamed from: r */
        public final int mo40953r() {
            return this.f81833j;
        }

        public MetadataImpl(alzd alzd) {
            this();
            this.f81825b = null;
            if (alzd.mo40936a()) {
                this.f81825b = alzd.mo40937b();
            }
            this.f81826c = null;
            if (alzd.mo40938c()) {
                this.f81826c = alzd.mo40939d();
            }
            this.f81827d = null;
            if (alzd.mo40940e()) {
                this.f81827d = alzd.mo40941f();
            }
            this.f81828e = null;
            if (alzd.mo40942g()) {
                this.f81828e = alzd.mo40943h();
            }
            this.f81824a.remove(6);
            if (alzd.mo40944i()) {
                boolean j = alzd.mo40945j();
                this.f81824a.add(6);
                this.f81829f = j;
            }
            this.f81824a.remove(7);
            if (alzd.mo40946k()) {
                mo46318a(alzd.mo40947l());
            }
            this.f81824a.remove(8);
            if (alzd.mo40948m()) {
                mo46319b(alzd.mo40949n());
            }
            this.f81824a.remove(9);
            if (alzd.mo40950o()) {
                mo46320c(alzd.mo40951p());
            }
            this.f81824a.remove(10);
            if (alzd.mo40952q()) {
                mo46317a(alzd.mo40953r());
            }
        }

        /* renamed from: a */
        public final void mo46318a(boolean z) {
            this.f81824a.add(7);
            this.f81830g = z;
        }

        /* renamed from: b */
        public final void mo46319b(boolean z) {
            this.f81824a.add(8);
            this.f81831h = z;
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
            Set set = this.f81824a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f81825b, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81826c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81827d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f81828e, true);
            }
            if (set.contains(6)) {
                see.m35051a(parcel, 6, this.f81829f);
            }
            if (set.contains(7)) {
                see.m35051a(parcel, 7, this.f81830g);
            }
            if (set.contains(8)) {
                see.m35051a(parcel, 8, this.f81831h);
            }
            if (set.contains(9)) {
                see.m35051a(parcel, 9, this.f81832i);
            }
            if (set.contains(10)) {
                see.m35063b(parcel, 10, this.f81833j);
            }
            see.m35062b(parcel, a);
        }

        public MetadataImpl(Set set, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, int i) {
            this.f81824a = set;
            this.f81825b = str;
            this.f81826c = str2;
            this.f81827d = str3;
            this.f81828e = str4;
            this.f81829f = z;
            this.f81830g = z2;
            this.f81831h = z3;
            this.f81832i = z4;
            this.f81833j = i;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class NamesImpl extends AbstractSafeParcelable implements Person.Names {
        public static final Parcelable.Creator CREATOR = new alyi();

        /* renamed from: a */
        final Set f81834a;

        /* renamed from: b */
        public MetadataImpl f81835b;

        /* renamed from: c */
        public String f81836c;

        /* renamed from: d */
        public String f81837d;

        /* renamed from: e */
        public String f81838e;

        /* renamed from: f */
        public String f81839f;

        /* renamed from: g */
        public String f81840g;

        /* renamed from: h */
        public String f81841h;

        /* renamed from: i */
        public String f81842i;

        /* renamed from: j */
        public String f81843j;

        /* renamed from: k */
        public String f81844k;

        /* renamed from: l */
        public String f81845l;

        /* renamed from: m */
        public String f81846m;

        public NamesImpl() {
            this.f81834a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            return this.f81835b != null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            return this.f81835b;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            return this.f81835b;
        }

        /* renamed from: d */
        public final boolean mo40956d() {
            return this.f81836c != null;
        }

        /* renamed from: e */
        public final String mo40957e() {
            return this.f81836c;
        }

        /* renamed from: f */
        public final boolean mo40958f() {
            return this.f81837d != null;
        }

        /* renamed from: g */
        public final String mo40959g() {
            return this.f81837d;
        }

        /* renamed from: h */
        public final boolean mo40960h() {
            return this.f81838e != null;
        }

        /* renamed from: i */
        public final String mo40961i() {
            return this.f81838e;
        }

        /* renamed from: j */
        public final boolean mo40962j() {
            return this.f81839f != null;
        }

        /* renamed from: k */
        public final String mo40963k() {
            return this.f81839f;
        }

        /* renamed from: l */
        public final boolean mo40964l() {
            return this.f81840g != null;
        }

        /* renamed from: m */
        public final String mo40965m() {
            return this.f81840g;
        }

        /* renamed from: n */
        public final boolean mo40966n() {
            return this.f81841h != null;
        }

        /* renamed from: o */
        public final String mo40967o() {
            return this.f81841h;
        }

        /* renamed from: p */
        public final boolean mo40968p() {
            return this.f81842i != null;
        }

        /* renamed from: q */
        public final String mo40969q() {
            return this.f81842i;
        }

        /* renamed from: r */
        public final boolean mo40970r() {
            return this.f81843j != null;
        }

        /* renamed from: s */
        public final String mo40971s() {
            return this.f81843j;
        }

        /* renamed from: t */
        public final boolean mo40972t() {
            return this.f81844k != null;
        }

        /* renamed from: u */
        public final String mo40973u() {
            return this.f81844k;
        }

        /* renamed from: v */
        public final boolean mo40974v() {
            return this.f81845l != null;
        }

        /* renamed from: w */
        public final String mo40975w() {
            return this.f81845l;
        }

        /* renamed from: x */
        public final boolean mo40976x() {
            return this.f81846m != null;
        }

        /* renamed from: y */
        public final String mo40977y() {
            return this.f81846m;
        }

        public NamesImpl(alzf alzf) {
            this();
            this.f81835b = null;
            if (alzf.mo40954a()) {
                this.f81835b = new MetadataImpl(alzf.mo40955c());
            }
            this.f81836c = null;
            if (alzf.mo40956d()) {
                this.f81836c = alzf.mo40957e();
            }
            this.f81837d = null;
            if (alzf.mo40958f()) {
                this.f81837d = alzf.mo40959g();
            }
            this.f81838e = null;
            if (alzf.mo40960h()) {
                this.f81838e = alzf.mo40961i();
            }
            this.f81839f = null;
            if (alzf.mo40962j()) {
                this.f81839f = alzf.mo40963k();
            }
            this.f81840g = null;
            if (alzf.mo40964l()) {
                this.f81840g = alzf.mo40965m();
            }
            this.f81841h = null;
            if (alzf.mo40966n()) {
                this.f81841h = alzf.mo40967o();
            }
            this.f81842i = null;
            if (alzf.mo40968p()) {
                this.f81842i = alzf.mo40969q();
            }
            this.f81843j = null;
            if (alzf.mo40970r()) {
                this.f81843j = alzf.mo40971s();
            }
            this.f81844k = null;
            if (alzf.mo40972t()) {
                this.f81844k = alzf.mo40973u();
            }
            this.f81845l = null;
            if (alzf.mo40974v()) {
                this.f81845l = alzf.mo40975w();
            }
            this.f81846m = null;
            if (alzf.mo40976x()) {
                this.f81846m = alzf.mo40977y();
            }
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
            Set set = this.f81834a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81835b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81836c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81837d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f81838e, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f81839f, true);
            }
            if (set.contains(7)) {
                see.m35046a(parcel, 7, this.f81840g, true);
            }
            if (set.contains(8)) {
                see.m35046a(parcel, 8, this.f81841h, true);
            }
            if (set.contains(9)) {
                see.m35046a(parcel, 9, this.f81842i, true);
            }
            if (set.contains(10)) {
                see.m35046a(parcel, 10, this.f81843j, true);
            }
            if (set.contains(11)) {
                see.m35046a(parcel, 11, this.f81844k, true);
            }
            if (set.contains(12)) {
                see.m35046a(parcel, 12, this.f81845l, true);
            }
            if (set.contains(13)) {
                see.m35046a(parcel, 13, this.f81846m, true);
            }
            see.m35062b(parcel, a);
        }

        public NamesImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.f81834a = set;
            this.f81835b = metadataImpl;
            this.f81836c = str;
            this.f81837d = str2;
            this.f81838e = str3;
            this.f81839f = str4;
            this.f81840g = str5;
            this.f81841h = str6;
            this.f81842i = str7;
            this.f81843j = str8;
            this.f81844k = str9;
            this.f81845l = str10;
            this.f81846m = str11;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class NicknamesImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alyj();

        /* renamed from: a */
        final Set f81847a;

        /* renamed from: b */
        public MetadataImpl f81848b;

        /* renamed from: c */
        public String f81849c;

        /* renamed from: d */
        public String f81850d;

        public NicknamesImpl() {
            this.f81847a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public NicknamesImpl(NicknamesImpl nicknamesImpl) {
            this();
            this.f81848b = null;
            MetadataImpl metadataImpl = nicknamesImpl.f81848b;
            if (metadataImpl != null) {
                this.f81848b = new MetadataImpl(metadataImpl);
            }
            this.f81849c = null;
            String str = nicknamesImpl.f81849c;
            if (str != null) {
                this.f81849c = str;
            }
            this.f81850d = null;
            String str2 = nicknamesImpl.f81850d;
            if (str2 != null) {
                this.f81850d = str2;
            }
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
            Set set = this.f81847a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81848b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81849c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81850d, true);
            }
            see.m35062b(parcel, a);
        }

        public NicknamesImpl(Set set, MetadataImpl metadataImpl, String str, String str2) {
            this.f81847a = set;
            this.f81848b = metadataImpl;
            this.f81849c = str;
            this.f81850d = str2;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class NotesImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alyk();

        /* renamed from: a */
        final Set f81851a;

        /* renamed from: b */
        public MetadataImpl f81852b;

        /* renamed from: c */
        public String f81853c;

        public NotesImpl() {
            this.f81851a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public NotesImpl(NotesImpl notesImpl) {
            this();
            this.f81852b = null;
            MetadataImpl metadataImpl = notesImpl.f81852b;
            if (metadataImpl != null) {
                this.f81852b = new MetadataImpl(metadataImpl);
            }
            this.f81853c = null;
            String str = notesImpl.f81853c;
            if (str != null) {
                this.f81853c = str;
            }
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
            Set set = this.f81851a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81852b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81853c, true);
            }
            see.m35062b(parcel, a);
        }

        public NotesImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.f81851a = set;
            this.f81852b = metadataImpl;
            this.f81853c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class OccupationsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alyl();

        /* renamed from: a */
        final Set f81854a;

        /* renamed from: b */
        public MetadataImpl f81855b;

        /* renamed from: c */
        public String f81856c;

        public OccupationsImpl() {
            this.f81854a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public OccupationsImpl(OccupationsImpl occupationsImpl) {
            this();
            this.f81855b = null;
            MetadataImpl metadataImpl = occupationsImpl.f81855b;
            if (metadataImpl != null) {
                this.f81855b = new MetadataImpl(metadataImpl);
            }
            this.f81856c = null;
            String str = occupationsImpl.f81856c;
            if (str != null) {
                this.f81856c = str;
            }
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
            Set set = this.f81854a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81855b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81856c, true);
            }
            see.m35062b(parcel, a);
        }

        public OccupationsImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.f81854a = set;
            this.f81855b = metadataImpl;
            this.f81856c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class OrganizationsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alym();

        /* renamed from: a */
        final Set f81857a;

        /* renamed from: b */
        public MetadataImpl f81858b;

        /* renamed from: c */
        boolean f81859c;

        /* renamed from: d */
        public String f81860d;

        /* renamed from: e */
        public String f81861e;

        /* renamed from: f */
        public String f81862f;

        /* renamed from: g */
        public String f81863g;

        /* renamed from: h */
        public String f81864h;

        /* renamed from: i */
        public String f81865i;

        /* renamed from: j */
        public String f81866j;

        /* renamed from: k */
        public String f81867k;

        /* renamed from: l */
        public String f81868l;

        /* renamed from: m */
        public String f81869m;

        /* renamed from: n */
        public String f81870n;

        public OrganizationsImpl() {
            this.f81857a = new HashSet();
        }

        /* renamed from: a */
        public final void mo46326a(boolean z) {
            this.f81857a.add(3);
            this.f81859c = z;
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public OrganizationsImpl(OrganizationsImpl organizationsImpl) {
            this();
            this.f81858b = null;
            MetadataImpl metadataImpl = organizationsImpl.f81858b;
            if (metadataImpl != null) {
                this.f81858b = new MetadataImpl(metadataImpl);
            }
            this.f81857a.remove(3);
            if (organizationsImpl.f81857a.contains(3)) {
                mo46326a(organizationsImpl.f81859c);
            }
            this.f81860d = null;
            String str = organizationsImpl.f81860d;
            if (str != null) {
                this.f81860d = str;
            }
            this.f81861e = null;
            String str2 = organizationsImpl.f81861e;
            if (str2 != null) {
                this.f81861e = str2;
            }
            this.f81862f = null;
            String str3 = organizationsImpl.f81862f;
            if (str3 != null) {
                this.f81862f = str3;
            }
            this.f81863g = null;
            String str4 = organizationsImpl.f81863g;
            if (str4 != null) {
                this.f81863g = str4;
            }
            this.f81864h = null;
            String str5 = organizationsImpl.f81864h;
            if (str5 != null) {
                this.f81864h = str5;
            }
            this.f81865i = null;
            String str6 = organizationsImpl.f81865i;
            if (str6 != null) {
                this.f81865i = str6;
            }
            this.f81866j = null;
            String str7 = organizationsImpl.f81866j;
            if (str7 != null) {
                this.f81866j = str7;
            }
            this.f81867k = null;
            String str8 = organizationsImpl.f81867k;
            if (str8 != null) {
                this.f81867k = str8;
            }
            this.f81868l = null;
            String str9 = organizationsImpl.f81868l;
            if (str9 != null) {
                this.f81868l = str9;
            }
            this.f81869m = null;
            String str10 = organizationsImpl.f81869m;
            if (str10 != null) {
                this.f81869m = str10;
            }
            this.f81870n = null;
            String str11 = organizationsImpl.f81870n;
            if (str11 != null) {
                this.f81870n = str11;
            }
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
            Set set = this.f81857a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81858b, i, true);
            }
            if (set.contains(3)) {
                see.m35051a(parcel, 3, this.f81859c);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81860d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f81861e, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f81862f, true);
            }
            if (set.contains(7)) {
                see.m35046a(parcel, 7, this.f81863g, true);
            }
            if (set.contains(8)) {
                see.m35046a(parcel, 8, this.f81864h, true);
            }
            if (set.contains(9)) {
                see.m35046a(parcel, 9, this.f81865i, true);
            }
            if (set.contains(10)) {
                see.m35046a(parcel, 10, this.f81866j, true);
            }
            if (set.contains(11)) {
                see.m35046a(parcel, 11, this.f81867k, true);
            }
            if (set.contains(12)) {
                see.m35046a(parcel, 12, this.f81868l, true);
            }
            if (set.contains(13)) {
                see.m35046a(parcel, 13, this.f81869m, true);
            }
            if (set.contains(14)) {
                see.m35046a(parcel, 14, this.f81870n, true);
            }
            see.m35062b(parcel, a);
        }

        public OrganizationsImpl(Set set, MetadataImpl metadataImpl, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.f81857a = set;
            this.f81858b = metadataImpl;
            this.f81859c = z;
            this.f81860d = str;
            this.f81861e = str2;
            this.f81862f = str3;
            this.f81863g = str4;
            this.f81864h = str5;
            this.f81865i = str6;
            this.f81866j = str7;
            this.f81867k = str8;
            this.f81868l = str9;
            this.f81869m = str10;
            this.f81870n = str11;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PersonMetadataImpl extends AbstractSafeParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new alyo();

        /* renamed from: a */
        final Set f81871a;

        /* renamed from: b */
        List f81872b;

        /* renamed from: c */
        List f81873c;

        /* renamed from: d */
        List f81874d;

        /* renamed from: e */
        List f81875e;

        /* renamed from: f */
        List f81876f;

        /* renamed from: g */
        List f81877g;

        /* renamed from: h */
        public String f81878h;

        /* renamed from: i */
        public String f81879i;

        /* renamed from: j */
        List f81880j;

        /* renamed from: k */
        public String f81881k;

        /* renamed from: l */
        public ProfileOwnerStatsImpl f81882l;

        /* renamed from: m */
        boolean f81883m;

        /* renamed from: n */
        boolean f81884n;

        /* renamed from: o */
        boolean f81885o;

        public PersonMetadataImpl() {
            this.f81871a = new HashSet();
        }

        /* renamed from: a */
        public final List mo46328a() {
            if (this.f81874d == null) {
                this.f81874d = new ArrayList();
            }
            return this.f81874d;
        }

        /* renamed from: b */
        public final void mo46331b(Collection collection) {
            if (this.f81873c == null) {
                this.f81873c = new ArrayList();
            }
            this.f81873c.addAll(collection);
        }

        /* renamed from: c */
        public final void mo46333c(Collection collection) {
            mo46328a().addAll(collection);
        }

        /* renamed from: d */
        public final void mo46335d(Collection collection) {
            if (this.f81875e == null) {
                this.f81875e = new ArrayList();
            }
            this.f81875e.addAll(collection);
        }

        /* renamed from: e */
        public final void mo46336e(Collection collection) {
            if (this.f81876f == null) {
                this.f81876f = new ArrayList();
            }
            this.f81876f.addAll(collection);
        }

        /* renamed from: f */
        public final void mo46337f(Collection collection) {
            if (this.f81877g == null) {
                this.f81877g = new ArrayList();
            }
            this.f81877g.addAll(collection);
        }

        /* renamed from: g */
        public final void mo46338g(Collection collection) {
            if (this.f81880j == null) {
                this.f81880j = new ArrayList();
            }
            this.f81880j.addAll(collection);
        }

        public PersonMetadataImpl(PersonMetadataImpl personMetadataImpl) {
            this();
            this.f81872b = null;
            List list = personMetadataImpl.f81872b;
            if (list != null) {
                mo46329a(list);
            }
            this.f81873c = null;
            List list2 = personMetadataImpl.f81873c;
            if (list2 != null) {
                mo46331b(list2);
            }
            this.f81874d = null;
            List list3 = personMetadataImpl.f81874d;
            if (list3 != null) {
                mo46333c(list3);
            }
            this.f81875e = null;
            List list4 = personMetadataImpl.f81875e;
            if (list4 != null) {
                mo46335d(list4);
            }
            this.f81876f = null;
            List list5 = personMetadataImpl.f81876f;
            if (list5 != null) {
                mo46336e(list5);
            }
            this.f81877g = null;
            List list6 = personMetadataImpl.f81877g;
            if (list6 != null) {
                mo46337f(list6);
            }
            this.f81878h = null;
            String str = personMetadataImpl.f81878h;
            if (str != null) {
                this.f81878h = str;
            }
            this.f81879i = null;
            String str2 = personMetadataImpl.f81879i;
            if (str2 != null) {
                this.f81879i = str2;
            }
            this.f81880j = null;
            List list7 = personMetadataImpl.f81880j;
            if (list7 != null) {
                mo46338g(list7);
            }
            this.f81881k = null;
            String str3 = personMetadataImpl.f81881k;
            if (str3 != null) {
                this.f81881k = str3;
            }
            this.f81882l = null;
            ProfileOwnerStatsImpl profileOwnerStatsImpl = personMetadataImpl.f81882l;
            if (profileOwnerStatsImpl != null) {
                this.f81882l = new ProfileOwnerStatsImpl(profileOwnerStatsImpl);
            }
            this.f81871a.remove(13);
            if (personMetadataImpl.f81871a.contains(13)) {
                mo46330a(personMetadataImpl.f81883m);
            }
            this.f81871a.remove(14);
            if (personMetadataImpl.f81871a.contains(14)) {
                mo46332b(personMetadataImpl.f81884n);
            }
            this.f81871a.remove(15);
            if (personMetadataImpl.f81871a.contains(15)) {
                mo46334c(personMetadataImpl.f81885o);
            }
        }

        /* renamed from: a */
        public final void mo46329a(Collection collection) {
            if (this.f81872b == null) {
                this.f81872b = new ArrayList();
            }
            this.f81872b.addAll(collection);
        }

        /* renamed from: c */
        public final void mo46334c(boolean z) {
            this.f81871a.add(15);
            this.f81885o = z;
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
            Set set = this.f81871a;
            if (set.contains(2)) {
                see.m35065b(parcel, 2, this.f81872b, true);
            }
            if (set.contains(3)) {
                see.m35065b(parcel, 3, this.f81873c, true);
            }
            if (set.contains(4)) {
                see.m35065b(parcel, 4, this.f81874d, true);
            }
            if (set.contains(5)) {
                see.m35065b(parcel, 5, this.f81875e, true);
            }
            if (set.contains(6)) {
                see.m35065b(parcel, 6, this.f81876f, true);
            }
            if (set.contains(7)) {
                see.m35065b(parcel, 7, this.f81877g, true);
            }
            if (set.contains(8)) {
                see.m35046a(parcel, 8, this.f81878h, true);
            }
            if (set.contains(9)) {
                see.m35046a(parcel, 9, this.f81879i, true);
            }
            if (set.contains(10)) {
                see.m35065b(parcel, 10, this.f81880j, true);
            }
            if (set.contains(11)) {
                see.m35046a(parcel, 11, this.f81881k, true);
            }
            if (set.contains(12)) {
                see.m35040a(parcel, 12, this.f81882l, i, true);
            }
            if (set.contains(13)) {
                see.m35051a(parcel, 13, this.f81883m);
            }
            if (set.contains(14)) {
                see.m35051a(parcel, 14, this.f81884n);
            }
            if (set.contains(15)) {
                see.m35051a(parcel, 15, this.f81885o);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: b */
        public final void mo46332b(boolean z) {
            this.f81871a.add(14);
            this.f81884n = z;
        }

        /* renamed from: a */
        public final void mo46330a(boolean z) {
            this.f81871a.add(13);
            this.f81883m = z;
        }

        public PersonMetadataImpl(Set set, List list, List list2, List list3, List list4, List list5, List list6, String str, String str2, List list7, String str3, ProfileOwnerStatsImpl profileOwnerStatsImpl, boolean z, boolean z2, boolean z3) {
            this.f81871a = set;
            this.f81872b = list;
            this.f81873c = list2;
            this.f81874d = list3;
            this.f81875e = list4;
            this.f81876f = list5;
            this.f81877g = list6;
            this.f81878h = str;
            this.f81879i = str2;
            this.f81880j = list7;
            this.f81881k = str3;
            this.f81882l = profileOwnerStatsImpl;
            this.f81883m = z;
            this.f81884n = z2;
            this.f81885o = z3;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PhoneNumbersImpl extends AbstractSafeParcelable implements Person.PhoneNumbers {
        public static final Parcelable.Creator CREATOR = new alyp();

        /* renamed from: a */
        final Set f81886a;

        /* renamed from: b */
        public MetadataImpl f81887b;

        /* renamed from: c */
        public String f81888c;

        /* renamed from: d */
        public String f81889d;

        /* renamed from: e */
        public String f81890e;

        /* renamed from: f */
        public String f81891f;

        /* renamed from: g */
        int f81892g;

        public PhoneNumbersImpl() {
            this.f81886a = new HashSet();
        }

        /* renamed from: a */
        public final void mo46340a(int i) {
            this.f81886a.add(7);
            this.f81892g = i;
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            return this.f81887b != null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            return this.f81887b;
        }

        /* renamed from: d */
        public final boolean mo40978d() {
            return this.f81888c != null;
        }

        /* renamed from: e */
        public final String mo40979e() {
            return this.f81888c;
        }

        /* renamed from: f */
        public final boolean mo40980f() {
            return this.f81889d != null;
        }

        /* renamed from: g */
        public final String mo40981g() {
            return this.f81889d;
        }

        /* renamed from: h */
        public final boolean mo40982h() {
            return this.f81890e != null;
        }

        /* renamed from: i */
        public final String mo40983i() {
            return this.f81890e;
        }

        /* renamed from: j */
        public final boolean mo40984j() {
            return this.f81891f != null;
        }

        /* renamed from: k */
        public final String mo40985k() {
            return this.f81891f;
        }

        /* renamed from: l */
        public final boolean mo40986l() {
            return this.f81886a.contains(7);
        }

        /* renamed from: m */
        public final int mo40987m() {
            return this.f81892g;
        }

        public PhoneNumbersImpl(alzg alzg) {
            this();
            this.f81887b = null;
            if (alzg.mo40954a()) {
                this.f81887b = new MetadataImpl(alzg.mo40955c());
            }
            this.f81888c = null;
            if (alzg.mo40978d()) {
                this.f81888c = alzg.mo40979e();
            }
            this.f81889d = null;
            if (alzg.mo40980f()) {
                this.f81889d = alzg.mo40981g();
            }
            this.f81890e = null;
            if (alzg.mo40982h()) {
                this.f81890e = alzg.mo40983i();
            }
            this.f81891f = null;
            if (alzg.mo40984j()) {
                this.f81891f = alzg.mo40985k();
            }
            this.f81886a.remove(7);
            if (alzg.mo40986l()) {
                mo46340a(alzg.mo40987m());
            }
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
            Set set = this.f81886a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81887b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81888c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81889d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f81890e, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f81891f, true);
            }
            if (set.contains(7)) {
                see.m35063b(parcel, 7, this.f81892g);
            }
            see.m35062b(parcel, a);
        }

        public PhoneNumbersImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3, String str4, int i) {
            this.f81886a = set;
            this.f81887b = metadataImpl;
            this.f81888c = str;
            this.f81889d = str2;
            this.f81890e = str3;
            this.f81891f = str4;
            this.f81892g = i;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PlacesLivedImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alyq();

        /* renamed from: a */
        final Set f81893a;

        /* renamed from: b */
        public MetadataImpl f81894b;

        /* renamed from: c */
        boolean f81895c;

        /* renamed from: d */
        public String f81896d;

        public PlacesLivedImpl() {
            this.f81893a = new HashSet();
        }

        /* renamed from: a */
        public final void mo46342a(boolean z) {
            this.f81893a.add(3);
            this.f81895c = z;
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public PlacesLivedImpl(PlacesLivedImpl placesLivedImpl) {
            this();
            this.f81894b = null;
            MetadataImpl metadataImpl = placesLivedImpl.f81894b;
            if (metadataImpl != null) {
                this.f81894b = new MetadataImpl(metadataImpl);
            }
            this.f81893a.remove(3);
            if (placesLivedImpl.f81893a.contains(3)) {
                mo46342a(placesLivedImpl.f81895c);
            }
            this.f81896d = null;
            String str = placesLivedImpl.f81896d;
            if (str != null) {
                this.f81896d = str;
            }
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
            Set set = this.f81893a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81894b, i, true);
            }
            if (set.contains(3)) {
                see.m35051a(parcel, 3, this.f81895c);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81896d, true);
            }
            see.m35062b(parcel, a);
        }

        public PlacesLivedImpl(Set set, MetadataImpl metadataImpl, boolean z, String str) {
            this.f81893a = set;
            this.f81894b = metadataImpl;
            this.f81895c = z;
            this.f81896d = str;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ProfileOwnerStatsImpl extends AbstractSafeParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new alyr();

        /* renamed from: a */
        final Set f81897a;

        /* renamed from: b */
        long f81898b;

        /* renamed from: c */
        long f81899c;

        public ProfileOwnerStatsImpl() {
            this.f81897a = new HashSet();
        }

        /* renamed from: a */
        public final void mo46344a(long j) {
            this.f81897a.add(2);
            this.f81898b = j;
        }

        /* renamed from: b */
        public final void mo46345b(long j) {
            this.f81897a.add(3);
            this.f81899c = j;
        }

        public ProfileOwnerStatsImpl(ProfileOwnerStatsImpl profileOwnerStatsImpl) {
            this();
            this.f81897a.remove(2);
            if (profileOwnerStatsImpl.f81897a.contains(2)) {
                mo46344a(profileOwnerStatsImpl.f81898b);
            }
            this.f81897a.remove(3);
            if (profileOwnerStatsImpl.f81897a.contains(3)) {
                mo46345b(profileOwnerStatsImpl.f81899c);
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            Set set = this.f81897a;
            if (set.contains(2)) {
                see.m35036a(parcel, 2, this.f81898b);
            }
            if (set.contains(3)) {
                see.m35036a(parcel, 3, this.f81899c);
            }
            see.m35062b(parcel, a);
        }

        public ProfileOwnerStatsImpl(Set set, long j, long j2) {
            this.f81897a = set;
            this.f81898b = j;
            this.f81899c = j2;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class RelationsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alys();

        /* renamed from: a */
        final Set f81900a;

        /* renamed from: b */
        public MetadataImpl f81901b;

        /* renamed from: c */
        public String f81902c;

        /* renamed from: d */
        public String f81903d;

        /* renamed from: e */
        public String f81904e;

        public RelationsImpl() {
            this.f81900a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public RelationsImpl(RelationsImpl relationsImpl) {
            this();
            this.f81901b = null;
            MetadataImpl metadataImpl = relationsImpl.f81901b;
            if (metadataImpl != null) {
                this.f81901b = new MetadataImpl(metadataImpl);
            }
            this.f81902c = null;
            String str = relationsImpl.f81902c;
            if (str != null) {
                this.f81902c = str;
            }
            this.f81903d = null;
            String str2 = relationsImpl.f81903d;
            if (str2 != null) {
                this.f81903d = str2;
            }
            this.f81904e = null;
            String str3 = relationsImpl.f81904e;
            if (str3 != null) {
                this.f81904e = str3;
            }
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
            Set set = this.f81900a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81901b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81902c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81903d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f81904e, true);
            }
            see.m35062b(parcel, a);
        }

        public RelationsImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3) {
            this.f81900a = set;
            this.f81901b = metadataImpl;
            this.f81902c = str;
            this.f81903d = str2;
            this.f81904e = str3;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class RelationshipInterestsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alyt();

        /* renamed from: a */
        final Set f81905a;

        /* renamed from: b */
        MetadataImpl f81906b;

        /* renamed from: c */
        String f81907c;

        public RelationshipInterestsImpl() {
            this.f81905a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
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
            Set set = this.f81905a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81906b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81907c, true);
            }
            see.m35062b(parcel, a);
        }

        public RelationshipInterestsImpl(RelationshipInterestsImpl relationshipInterestsImpl) {
            this.f81905a = new HashSet();
            this.f81906b = null;
            MetadataImpl metadataImpl = relationshipInterestsImpl.f81906b;
            if (metadataImpl != null) {
                this.f81906b = new MetadataImpl(metadataImpl);
            }
            this.f81907c = null;
            String str = relationshipInterestsImpl.f81907c;
            if (str != null) {
                this.f81907c = str;
            }
        }

        public RelationshipInterestsImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.f81905a = set;
            this.f81906b = metadataImpl;
            this.f81907c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class RelationshipStatusesImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alyu();

        /* renamed from: a */
        final Set f81908a;

        /* renamed from: b */
        MetadataImpl f81909b;

        /* renamed from: c */
        String f81910c;

        /* renamed from: d */
        String f81911d;

        public RelationshipStatusesImpl() {
            this.f81908a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
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
            Set set = this.f81908a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81909b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81910c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81911d, true);
            }
            see.m35062b(parcel, a);
        }

        public RelationshipStatusesImpl(RelationshipStatusesImpl relationshipStatusesImpl) {
            this.f81908a = new HashSet();
            this.f81909b = null;
            MetadataImpl metadataImpl = relationshipStatusesImpl.f81909b;
            if (metadataImpl != null) {
                this.f81909b = new MetadataImpl(metadataImpl);
            }
            this.f81910c = null;
            String str = relationshipStatusesImpl.f81910c;
            if (str != null) {
                this.f81910c = str;
            }
            this.f81911d = null;
            String str2 = relationshipStatusesImpl.f81911d;
            if (str2 != null) {
                this.f81911d = str2;
            }
        }

        public RelationshipStatusesImpl(Set set, MetadataImpl metadataImpl, String str, String str2) {
            this.f81908a = set;
            this.f81909b = metadataImpl;
            this.f81910c = str;
            this.f81911d = str2;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SkillsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alyv();

        /* renamed from: a */
        final Set f81912a;

        /* renamed from: b */
        public MetadataImpl f81913b;

        /* renamed from: c */
        public String f81914c;

        public SkillsImpl() {
            this.f81912a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public SkillsImpl(SkillsImpl skillsImpl) {
            this();
            this.f81913b = null;
            MetadataImpl metadataImpl = skillsImpl.f81913b;
            if (metadataImpl != null) {
                this.f81913b = new MetadataImpl(metadataImpl);
            }
            this.f81914c = null;
            String str = skillsImpl.f81914c;
            if (str != null) {
                this.f81914c = str;
            }
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
            Set set = this.f81912a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81913b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81914c, true);
            }
            see.m35062b(parcel, a);
        }

        public SkillsImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.f81912a = set;
            this.f81913b = metadataImpl;
            this.f81914c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SortKeysImpl extends AbstractSafeParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new alyw();

        /* renamed from: a */
        final Set f81915a;

        /* renamed from: b */
        public String f81916b;

        /* renamed from: c */
        public String f81917c;

        public SortKeysImpl() {
            this.f81915a = new HashSet();
        }

        public SortKeysImpl(SortKeysImpl sortKeysImpl) {
            this();
            this.f81916b = null;
            String str = sortKeysImpl.f81916b;
            if (str != null) {
                this.f81916b = str;
            }
            this.f81917c = null;
            String str2 = sortKeysImpl.f81917c;
            if (str2 != null) {
                this.f81917c = str2;
            }
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
            Set set = this.f81915a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f81916b, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81917c, true);
            }
            see.m35062b(parcel, a);
        }

        public SortKeysImpl(Set set, String str, String str2) {
            this.f81915a = set;
            this.f81916b = str;
            this.f81917c = str2;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class TaglinesImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alyx();

        /* renamed from: a */
        final Set f81918a;

        /* renamed from: b */
        public MetadataImpl f81919b;

        /* renamed from: c */
        public String f81920c;

        public TaglinesImpl() {
            this.f81918a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public TaglinesImpl(TaglinesImpl taglinesImpl) {
            this();
            this.f81919b = null;
            MetadataImpl metadataImpl = taglinesImpl.f81919b;
            if (metadataImpl != null) {
                this.f81919b = new MetadataImpl(metadataImpl);
            }
            this.f81920c = null;
            String str = taglinesImpl.f81920c;
            if (str != null) {
                this.f81920c = str;
            }
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
            Set set = this.f81918a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81919b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81920c, true);
            }
            see.m35062b(parcel, a);
        }

        public TaglinesImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.f81918a = set;
            this.f81919b = metadataImpl;
            this.f81920c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class UrlsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, alze {
        public static final Parcelable.Creator CREATOR = new alyy();

        /* renamed from: a */
        final Set f81921a;

        /* renamed from: b */
        public MetadataImpl f81922b;

        /* renamed from: c */
        public String f81923c;

        /* renamed from: d */
        public String f81924d;

        /* renamed from: e */
        public String f81925e;

        public UrlsImpl() {
            this.f81921a = new HashSet();
        }

        /* renamed from: a */
        public final boolean mo40954a() {
            throw null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Person.Metadata mo46297b() {
            throw null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ alzd mo40955c() {
            throw null;
        }

        public UrlsImpl(UrlsImpl urlsImpl) {
            this();
            this.f81922b = null;
            MetadataImpl metadataImpl = urlsImpl.f81922b;
            if (metadataImpl != null) {
                this.f81922b = new MetadataImpl(metadataImpl);
            }
            this.f81923c = null;
            String str = urlsImpl.f81923c;
            if (str != null) {
                this.f81923c = str;
            }
            this.f81924d = null;
            String str2 = urlsImpl.f81924d;
            if (str2 != null) {
                this.f81924d = str2;
            }
            this.f81925e = null;
            String str3 = urlsImpl.f81925e;
            if (str3 != null) {
                this.f81925e = str3;
            }
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
            Set set = this.f81921a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f81922b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f81923c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f81924d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f81925e, true);
            }
            see.m35062b(parcel, a);
        }

        public UrlsImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3) {
            this.f81921a = set;
            this.f81922b = metadataImpl;
            this.f81923c = str;
            this.f81924d = str2;
            this.f81925e = str3;
        }
    }

    public PersonImpl() {
        this.f81734a = new HashSet();
    }

    /* renamed from: A */
    public final boolean mo40988A() {
        return this.f81748o != null;
    }

    /* renamed from: B */
    public final List mo40989B() {
        return this.f81748o;
    }

    /* renamed from: C */
    public final boolean mo40990C() {
        return this.f81749p != null;
    }

    /* renamed from: D */
    public final String mo40991D() {
        return this.f81749p;
    }

    /* renamed from: E */
    public final boolean mo40992E() {
        return this.f81750q != null;
    }

    /* renamed from: F */
    public final boolean mo40993F() {
        return this.f81751r != null;
    }

    /* renamed from: G */
    public final List mo40994G() {
        return this.f81751r;
    }

    /* renamed from: H */
    public final boolean mo40995H() {
        return this.f81752s != null;
    }

    /* renamed from: I */
    public final List mo40996I() {
        return this.f81752s;
    }

    /* renamed from: J */
    public final boolean mo40997J() {
        return this.f81753t != null;
    }

    /* renamed from: K */
    public final boolean mo40998K() {
        return this.f81754u != null;
    }

    /* renamed from: L */
    public final List mo40999L() {
        return this.f81754u;
    }

    /* renamed from: M */
    public final boolean mo41000M() {
        return this.f81755v != null;
    }

    /* renamed from: N */
    public final List mo41001N() {
        return this.f81755v;
    }

    /* renamed from: O */
    public final boolean mo41002O() {
        return this.f81756w != null;
    }

    /* renamed from: P */
    public final List mo41003P() {
        return this.f81756w;
    }

    /* renamed from: Q */
    public final boolean mo41004Q() {
        return this.f81757x != null;
    }

    /* renamed from: R */
    public final List mo41005R() {
        return this.f81757x;
    }

    /* renamed from: S */
    public final boolean mo41006S() {
        return this.f81758y != null;
    }

    /* renamed from: T */
    public final List mo41007T() {
        return this.f81758y;
    }

    /* renamed from: U */
    public final boolean mo41008U() {
        return this.f81759z != null;
    }

    /* renamed from: V */
    public final List mo41009V() {
        return this.f81759z;
    }

    /* renamed from: W */
    public final boolean mo41010W() {
        return this.f81725A != null;
    }

    /* renamed from: X */
    public final String mo41011X() {
        return this.f81725A;
    }

    /* renamed from: Y */
    public final boolean mo41012Y() {
        return this.f81726B != null;
    }

    /* renamed from: Z */
    public final List mo41013Z() {
        return this.f81726B;
    }

    /* renamed from: a */
    public final void mo46273a(AboutsImpl aboutsImpl) {
        if (this.f81735b == null) {
            this.f81735b = new ArrayList();
        }
        this.f81735b.add(aboutsImpl);
    }

    /* renamed from: a */
    public final boolean mo41014a() {
        return this.f81735b != null;
    }

    /* renamed from: aa */
    public final boolean mo41015aa() {
        return this.f81727C != null;
    }

    /* renamed from: ab */
    public final List mo41016ab() {
        return this.f81727C;
    }

    /* renamed from: ac */
    public final boolean mo41017ac() {
        return this.f81728D != null;
    }

    /* renamed from: ad */
    public final List mo41018ad() {
        return this.f81728D;
    }

    /* renamed from: ae */
    public final boolean mo41019ae() {
        return this.f81729E != null;
    }

    /* renamed from: af */
    public final List mo41020af() {
        return this.f81729E;
    }

    /* renamed from: ag */
    public final boolean mo41021ag() {
        return this.f81730F != null;
    }

    /* renamed from: ah */
    public final boolean mo41022ah() {
        return this.f81731G != null;
    }

    /* renamed from: ai */
    public final List mo41023ai() {
        return this.f81731G;
    }

    /* renamed from: aj */
    public final boolean mo41024aj() {
        return this.f81732H != null;
    }

    /* renamed from: ak */
    public final List mo41025ak() {
        return this.f81732H;
    }

    /* renamed from: al */
    public final boolean mo41026al() {
        return this.f81733I != null;
    }

    /* renamed from: am */
    public final List mo41027am() {
        return this.f81733I;
    }

    /* renamed from: an */
    public final /* bridge */ /* synthetic */ SortKeysImpl mo41028an() {
        return this.f81730F;
    }

    /* renamed from: ao */
    public final /* bridge */ /* synthetic */ PersonMetadataImpl mo41029ao() {
        return this.f81753t;
    }

    /* renamed from: ap */
    public final /* bridge */ /* synthetic */ LegacyFieldsImpl mo41030ap() {
        return this.f81750q;
    }

    /* renamed from: b */
    public final List mo41031b() {
        return this.f81735b;
    }

    /* renamed from: c */
    public final boolean mo41032c() {
        return this.f81736c != null;
    }

    /* renamed from: d */
    public final List mo41033d() {
        return this.f81736c;
    }

    /* renamed from: e */
    public final boolean mo41034e() {
        return this.f81737d != null;
    }

    /* renamed from: f */
    public final String mo41035f() {
        return this.f81737d;
    }

    /* renamed from: g */
    public final boolean mo41036g() {
        return this.f81738e != null;
    }

    /* renamed from: h */
    public final List mo41037h() {
        return this.f81738e;
    }

    /* renamed from: i */
    public final boolean mo41038i() {
        return this.f81739f != null;
    }

    /* renamed from: j */
    public final List mo41039j() {
        return this.f81739f;
    }

    /* renamed from: k */
    public final boolean mo41040k() {
        return this.f81740g != null;
    }

    /* renamed from: l */
    public final List mo41041l() {
        return this.f81740g;
    }

    /* renamed from: m */
    public final boolean mo41042m() {
        return this.f81741h != null;
    }

    /* renamed from: n */
    public final List mo41043n() {
        return this.f81741h;
    }

    /* renamed from: o */
    public final boolean mo41044o() {
        return this.f81742i != null;
    }

    /* renamed from: p */
    public final List mo41045p() {
        return this.f81742i;
    }

    /* renamed from: q */
    public final boolean mo41046q() {
        return this.f81743j != null;
    }

    /* renamed from: r */
    public final String mo41047r() {
        return this.f81743j;
    }

    /* renamed from: s */
    public final boolean mo41048s() {
        return this.f81744k != null;
    }

    /* renamed from: t */
    public final List mo41049t() {
        return this.f81744k;
    }

    /* renamed from: u */
    public final boolean mo41050u() {
        return this.f81745l != null;
    }

    /* renamed from: v */
    public final List mo41051v() {
        return this.f81745l;
    }

    /* renamed from: w */
    public final boolean mo41052w() {
        return this.f81746m != null;
    }

    /* renamed from: x */
    public final String mo41053x() {
        return this.f81746m;
    }

    /* renamed from: y */
    public final boolean mo41054y() {
        return this.f81747n != null;
    }

    /* renamed from: z */
    public final List mo41055z() {
        return this.f81747n;
    }

    public PersonImpl(alzh alzh) {
        this();
        this.f81735b = null;
        if (alzh.mo41014a()) {
            for (AboutsImpl aboutsImpl : alzh.mo41031b()) {
                mo46273a(new AboutsImpl(aboutsImpl));
            }
        }
        this.f81736c = null;
        if (alzh.mo41032c()) {
            for (AddressesImpl addressesImpl : alzh.mo41033d()) {
                mo46274a(new AddressesImpl(addressesImpl));
            }
        }
        this.f81737d = null;
        if (alzh.mo41034e()) {
            this.f81737d = alzh.mo41035f();
        }
        this.f81738e = null;
        if (alzh.mo41036g()) {
            for (BirthdaysImpl birthdaysImpl : alzh.mo41037h()) {
                mo46275a(new BirthdaysImpl(birthdaysImpl));
            }
        }
        this.f81739f = null;
        if (alzh.mo41038i()) {
            for (BraggingRightsImpl braggingRightsImpl : alzh.mo41039j()) {
                mo46276a(new BraggingRightsImpl(braggingRightsImpl));
            }
        }
        this.f81740g = null;
        if (alzh.mo41040k()) {
            for (CoverPhotosImpl coverPhotosImpl : alzh.mo41041l()) {
                mo46277a(new CoverPhotosImpl(coverPhotosImpl));
            }
        }
        this.f81741h = null;
        if (alzh.mo41042m()) {
            for (CustomFieldsImpl customFieldsImpl : alzh.mo41043n()) {
                mo46278a(new CustomFieldsImpl(customFieldsImpl));
            }
        }
        this.f81742i = null;
        if (alzh.mo41044o()) {
            for (alza alza : alzh.mo41045p()) {
                mo46279a(new EmailsImpl(alza));
            }
        }
        this.f81743j = null;
        if (alzh.mo41046q()) {
            this.f81743j = alzh.mo41047r();
        }
        this.f81744k = null;
        if (alzh.mo41048s()) {
            for (EventsImpl eventsImpl : alzh.mo41049t()) {
                mo46280a(new EventsImpl(eventsImpl));
            }
        }
        this.f81745l = null;
        if (alzh.mo41050u()) {
            for (GendersImpl gendersImpl : alzh.mo41051v()) {
                mo46281a(new GendersImpl(gendersImpl));
            }
        }
        this.f81746m = null;
        if (alzh.mo41052w()) {
            this.f81746m = alzh.mo41053x();
        }
        this.f81747n = null;
        if (alzh.mo41054y()) {
            for (alzb alzb : alzh.mo41055z()) {
                mo46282a(new ImagesImpl(alzb));
            }
        }
        this.f81748o = null;
        if (alzh.mo40988A()) {
            for (InstantMessagingImpl instantMessagingImpl : alzh.mo40989B()) {
                mo46283a(new InstantMessagingImpl(instantMessagingImpl));
            }
        }
        this.f81749p = null;
        if (alzh.mo40990C()) {
            this.f81749p = alzh.mo40991D();
        }
        this.f81750q = null;
        if (alzh.mo40992E()) {
            this.f81750q = new LegacyFieldsImpl(alzh.mo41030ap());
        }
        this.f81751r = null;
        if (alzh.mo40993F()) {
            for (alzh alzh2 : alzh.mo40994G()) {
                PersonImpl personImpl = new PersonImpl(alzh2);
                if (this.f81751r == null) {
                    this.f81751r = new ArrayList();
                }
                this.f81751r.add(personImpl);
            }
        }
        this.f81752s = null;
        if (alzh.mo40995H()) {
            for (alzc alzc : alzh.mo40996I()) {
                mo46284a(new MembershipsImpl(alzc));
            }
        }
        this.f81753t = null;
        if (alzh.mo40997J()) {
            this.f81753t = new PersonMetadataImpl(alzh.mo41029ao());
        }
        this.f81754u = null;
        if (alzh.mo40998K()) {
            for (alzf alzf : alzh.mo40999L()) {
                mo46285a(new NamesImpl(alzf));
            }
        }
        this.f81755v = null;
        if (alzh.mo41000M()) {
            for (NicknamesImpl nicknamesImpl : alzh.mo41001N()) {
                mo46286a(new NicknamesImpl(nicknamesImpl));
            }
        }
        this.f81756w = null;
        if (alzh.mo41002O()) {
            for (OccupationsImpl occupationsImpl : alzh.mo41003P()) {
                mo46288a(new OccupationsImpl(occupationsImpl));
            }
        }
        this.f81757x = null;
        if (alzh.mo41004Q()) {
            for (OrganizationsImpl organizationsImpl : alzh.mo41005R()) {
                mo46289a(new OrganizationsImpl(organizationsImpl));
            }
        }
        this.f81758y = null;
        if (alzh.mo41006S()) {
            for (alzg alzg : alzh.mo41007T()) {
                mo46290a(new PhoneNumbersImpl(alzg));
            }
        }
        this.f81759z = null;
        if (alzh.mo41008U()) {
            for (PlacesLivedImpl placesLivedImpl : alzh.mo41009V()) {
                mo46291a(new PlacesLivedImpl(placesLivedImpl));
            }
        }
        this.f81725A = null;
        if (alzh.mo41010W()) {
            this.f81725A = alzh.mo41011X();
        }
        this.f81726B = null;
        if (alzh.mo41012Y()) {
            for (RelationsImpl relationsImpl : alzh.mo41013Z()) {
                mo46292a(new RelationsImpl(relationsImpl));
            }
        }
        this.f81727C = null;
        if (alzh.mo41015aa()) {
            for (RelationshipInterestsImpl relationshipInterestsImpl : alzh.mo41016ab()) {
                RelationshipInterestsImpl relationshipInterestsImpl2 = new RelationshipInterestsImpl(relationshipInterestsImpl);
                if (this.f81727C == null) {
                    this.f81727C = new ArrayList();
                }
                this.f81727C.add(relationshipInterestsImpl2);
            }
        }
        this.f81728D = null;
        if (alzh.mo41017ac()) {
            for (RelationshipStatusesImpl relationshipStatusesImpl : alzh.mo41018ad()) {
                RelationshipStatusesImpl relationshipStatusesImpl2 = new RelationshipStatusesImpl(relationshipStatusesImpl);
                if (this.f81728D == null) {
                    this.f81728D = new ArrayList();
                }
                this.f81728D.add(relationshipStatusesImpl2);
            }
        }
        this.f81729E = null;
        if (alzh.mo41019ae()) {
            for (SkillsImpl skillsImpl : alzh.mo41020af()) {
                mo46293a(new SkillsImpl(skillsImpl));
            }
        }
        this.f81730F = null;
        if (alzh.mo41021ag()) {
            this.f81730F = new SortKeysImpl(alzh.mo41028an());
        }
        this.f81731G = null;
        if (alzh.mo41022ah()) {
            for (TaglinesImpl taglinesImpl : alzh.mo41023ai()) {
                mo46294a(new TaglinesImpl(taglinesImpl));
            }
        }
        this.f81732H = null;
        if (alzh.mo41024aj()) {
            for (UrlsImpl urlsImpl : alzh.mo41025ak()) {
                mo46295a(new UrlsImpl(urlsImpl));
            }
        }
        this.f81733I = null;
        if (alzh.mo41026al()) {
            for (NotesImpl notesImpl : alzh.mo41027am()) {
                mo46287a(new NotesImpl(notesImpl));
            }
        }
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
        Set set = this.f81734a;
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f81735b, true);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f81736c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f81737d, true);
        }
        if (set.contains(5)) {
            see.m35066c(parcel, 5, this.f81738e, true);
        }
        if (set.contains(6)) {
            see.m35066c(parcel, 6, this.f81739f, true);
        }
        if (set.contains(7)) {
            see.m35066c(parcel, 7, this.f81740g, true);
        }
        if (set.contains(8)) {
            see.m35066c(parcel, 8, this.f81741h, true);
        }
        if (set.contains(9)) {
            see.m35066c(parcel, 9, this.f81742i, true);
        }
        if (set.contains(10)) {
            see.m35046a(parcel, 10, this.f81743j, true);
        }
        if (set.contains(11)) {
            see.m35066c(parcel, 11, this.f81744k, true);
        }
        if (set.contains(12)) {
            see.m35066c(parcel, 12, this.f81745l, true);
        }
        if (set.contains(13)) {
            see.m35046a(parcel, 13, this.f81746m, true);
        }
        if (set.contains(14)) {
            see.m35066c(parcel, 14, this.f81747n, true);
        }
        if (set.contains(15)) {
            see.m35066c(parcel, 15, this.f81748o, true);
        }
        if (set.contains(16)) {
            see.m35046a(parcel, 16, this.f81749p, true);
        }
        if (set.contains(17)) {
            see.m35040a(parcel, 17, this.f81750q, i, true);
        }
        if (set.contains(18)) {
            see.m35066c(parcel, 18, this.f81751r, true);
        }
        if (set.contains(19)) {
            see.m35066c(parcel, 19, this.f81752s, true);
        }
        if (set.contains(20)) {
            see.m35040a(parcel, 20, this.f81753t, i, true);
        }
        if (set.contains(21)) {
            see.m35066c(parcel, 21, this.f81754u, true);
        }
        if (set.contains(22)) {
            see.m35066c(parcel, 22, this.f81755v, true);
        }
        if (set.contains(23)) {
            see.m35066c(parcel, 23, this.f81756w, true);
        }
        if (set.contains(24)) {
            see.m35066c(parcel, 24, this.f81757x, true);
        }
        if (set.contains(25)) {
            see.m35066c(parcel, 25, this.f81758y, true);
        }
        if (set.contains(26)) {
            see.m35066c(parcel, 26, this.f81759z, true);
        }
        if (set.contains(27)) {
            see.m35046a(parcel, 27, this.f81725A, true);
        }
        if (set.contains(28)) {
            see.m35066c(parcel, 28, this.f81726B, true);
        }
        if (set.contains(29)) {
            see.m35066c(parcel, 29, this.f81727C, true);
        }
        if (set.contains(30)) {
            see.m35066c(parcel, 30, this.f81728D, true);
        }
        if (set.contains(31)) {
            see.m35066c(parcel, 31, this.f81729E, true);
        }
        if (set.contains(32)) {
            see.m35040a(parcel, 32, this.f81730F, i, true);
        }
        if (set.contains(33)) {
            see.m35066c(parcel, 33, this.f81731G, true);
        }
        if (set.contains(34)) {
            see.m35066c(parcel, 34, this.f81732H, true);
        }
        if (set.contains(35)) {
            see.m35066c(parcel, 35, this.f81733I, true);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo46274a(AddressesImpl addressesImpl) {
        if (this.f81736c == null) {
            this.f81736c = new ArrayList();
        }
        this.f81736c.add(addressesImpl);
    }

    /* renamed from: a */
    public final void mo46275a(BirthdaysImpl birthdaysImpl) {
        if (this.f81738e == null) {
            this.f81738e = new ArrayList();
        }
        this.f81738e.add(birthdaysImpl);
    }

    /* renamed from: a */
    public final void mo46276a(BraggingRightsImpl braggingRightsImpl) {
        if (this.f81739f == null) {
            this.f81739f = new ArrayList();
        }
        this.f81739f.add(braggingRightsImpl);
    }

    /* renamed from: a */
    public final void mo46277a(CoverPhotosImpl coverPhotosImpl) {
        if (this.f81740g == null) {
            this.f81740g = new ArrayList();
        }
        this.f81740g.add(coverPhotosImpl);
    }

    /* renamed from: a */
    public final void mo46278a(CustomFieldsImpl customFieldsImpl) {
        if (this.f81741h == null) {
            this.f81741h = new ArrayList();
        }
        this.f81741h.add(customFieldsImpl);
    }

    /* renamed from: a */
    public final void mo46279a(EmailsImpl emailsImpl) {
        if (this.f81742i == null) {
            this.f81742i = new ArrayList();
        }
        this.f81742i.add(emailsImpl);
    }

    /* renamed from: a */
    public final void mo46280a(EventsImpl eventsImpl) {
        if (this.f81744k == null) {
            this.f81744k = new ArrayList();
        }
        this.f81744k.add(eventsImpl);
    }

    /* renamed from: a */
    public final void mo46281a(GendersImpl gendersImpl) {
        if (this.f81745l == null) {
            this.f81745l = new ArrayList();
        }
        this.f81745l.add(gendersImpl);
    }

    /* renamed from: a */
    public final void mo46282a(ImagesImpl imagesImpl) {
        if (this.f81747n == null) {
            this.f81747n = new ArrayList();
        }
        this.f81747n.add(imagesImpl);
    }

    /* renamed from: a */
    public final void mo46283a(InstantMessagingImpl instantMessagingImpl) {
        if (this.f81748o == null) {
            this.f81748o = new ArrayList();
        }
        this.f81748o.add(instantMessagingImpl);
    }

    /* renamed from: a */
    public final void mo46284a(MembershipsImpl membershipsImpl) {
        if (this.f81752s == null) {
            this.f81752s = new ArrayList();
        }
        this.f81752s.add(membershipsImpl);
    }

    /* renamed from: a */
    public final void mo46285a(NamesImpl namesImpl) {
        if (this.f81754u == null) {
            this.f81754u = new ArrayList();
        }
        this.f81754u.add(namesImpl);
    }

    /* renamed from: a */
    public final void mo46286a(NicknamesImpl nicknamesImpl) {
        if (this.f81755v == null) {
            this.f81755v = new ArrayList();
        }
        this.f81755v.add(nicknamesImpl);
    }

    public PersonImpl(Set set, List list, List list2, String str, List list3, List list4, List list5, List list6, List list7, String str2, List list8, List list9, String str3, List list10, List list11, String str4, LegacyFieldsImpl legacyFieldsImpl, List list12, List list13, PersonMetadataImpl personMetadataImpl, List list14, List list15, List list16, List list17, List list18, List list19, String str5, List list20, List list21, List list22, List list23, SortKeysImpl sortKeysImpl, List list24, List list25, List list26) {
        this.f81734a = set;
        this.f81735b = list;
        this.f81736c = list2;
        this.f81737d = str;
        this.f81738e = list3;
        this.f81739f = list4;
        this.f81740g = list5;
        this.f81741h = list6;
        this.f81742i = list7;
        this.f81743j = str2;
        this.f81744k = list8;
        this.f81745l = list9;
        this.f81746m = str3;
        this.f81747n = list10;
        this.f81748o = list11;
        this.f81749p = str4;
        this.f81750q = legacyFieldsImpl;
        this.f81751r = list12;
        this.f81752s = list13;
        this.f81753t = personMetadataImpl;
        this.f81754u = list14;
        this.f81755v = list15;
        this.f81756w = list16;
        this.f81757x = list17;
        this.f81758y = list18;
        this.f81759z = list19;
        this.f81725A = str5;
        this.f81726B = list20;
        this.f81727C = list21;
        this.f81728D = list22;
        this.f81729E = list23;
        this.f81730F = sortKeysImpl;
        this.f81731G = list24;
        this.f81732H = list25;
        this.f81733I = list26;
    }

    /* renamed from: a */
    public final void mo46287a(NotesImpl notesImpl) {
        if (this.f81733I == null) {
            this.f81733I = new ArrayList();
        }
        this.f81733I.add(notesImpl);
    }

    /* renamed from: a */
    public final void mo46288a(OccupationsImpl occupationsImpl) {
        if (this.f81756w == null) {
            this.f81756w = new ArrayList();
        }
        this.f81756w.add(occupationsImpl);
    }

    /* renamed from: a */
    public final void mo46289a(OrganizationsImpl organizationsImpl) {
        if (this.f81757x == null) {
            this.f81757x = new ArrayList();
        }
        this.f81757x.add(organizationsImpl);
    }

    /* renamed from: a */
    public final void mo46290a(PhoneNumbersImpl phoneNumbersImpl) {
        if (this.f81758y == null) {
            this.f81758y = new ArrayList();
        }
        this.f81758y.add(phoneNumbersImpl);
    }

    /* renamed from: a */
    public final void mo46291a(PlacesLivedImpl placesLivedImpl) {
        if (this.f81759z == null) {
            this.f81759z = new ArrayList();
        }
        this.f81759z.add(placesLivedImpl);
    }

    /* renamed from: a */
    public final void mo46292a(RelationsImpl relationsImpl) {
        if (this.f81726B == null) {
            this.f81726B = new ArrayList();
        }
        this.f81726B.add(relationsImpl);
    }

    /* renamed from: a */
    public final void mo46293a(SkillsImpl skillsImpl) {
        if (this.f81729E == null) {
            this.f81729E = new ArrayList();
        }
        this.f81729E.add(skillsImpl);
    }

    /* renamed from: a */
    public final void mo46294a(TaglinesImpl taglinesImpl) {
        if (this.f81731G == null) {
            this.f81731G = new ArrayList();
        }
        this.f81731G.add(taglinesImpl);
    }

    /* renamed from: a */
    public final void mo46295a(UrlsImpl urlsImpl) {
        if (this.f81732H == null) {
            this.f81732H = new ArrayList();
        }
        this.f81732H.add(urlsImpl);
    }
}
