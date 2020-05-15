package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ActivityEntity extends FastSafeParcelableJsonResponse implements aofd {
    public static final Parcelable.Creator CREATOR = new aofe();

    /* renamed from: l */
    private static final HashMap f82756l;

    /* renamed from: a */
    final Set f82757a;

    /* renamed from: b */
    final int f82758b;

    /* renamed from: c */
    AclEntity f82759c;

    /* renamed from: d */
    String f82760d;

    /* renamed from: e */
    public String f82761e;

    /* renamed from: f */
    public ObjectEntity f82762f;

    /* renamed from: g */
    String f82763g;

    /* renamed from: h */
    String f82764h;

    /* renamed from: i */
    String f82765i;

    /* renamed from: j */
    public String f82766j;

    /* renamed from: k */
    String f82767k;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class ObjectEntity extends FastSafeParcelableJsonResponse implements aofc {
        public static final Parcelable.Creator CREATOR = new aoff();

        /* renamed from: h */
        private static final HashMap f82768h;

        /* renamed from: a */
        final Set f82769a;

        /* renamed from: b */
        final int f82770b;

        /* renamed from: c */
        ActorEntity f82771c;

        /* renamed from: d */
        public List f82772d;

        /* renamed from: e */
        String f82773e;

        /* renamed from: f */
        PlusonersEntity f82774f;

        /* renamed from: g */
        RepliesEntity f82775g;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class ActorEntity extends FastSafeParcelableJsonResponse implements rty {
            public static final Parcelable.Creator CREATOR = new aofg();

            /* renamed from: d */
            private static final HashMap f82776d;

            /* renamed from: a */
            final Set f82777a;

            /* renamed from: b */
            final int f82778b;

            /* renamed from: c */
            String f82779c;

            static {
                HashMap hashMap = new HashMap();
                f82776d = hashMap;
                hashMap.put("displayName", FastJsonResponse$Field.m22666f("displayName", 2));
            }

            public ActorEntity() {
                this.f82778b = 1;
                this.f82777a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f82776d;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return this.f82779c;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            /* renamed from: bF */
            public final /* bridge */ /* synthetic */ Object mo7556bF() {
                return this;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof ActorEntity)) {
                    return false;
                }
                if (this != obj) {
                    ActorEntity actorEntity = (ActorEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82776d.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!actorEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(actorEntity.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (actorEntity.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82776d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    this.f82779c = str2;
                    this.f82777a.add(Integer.valueOf(i));
                    return;
                }
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
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
                Set set = this.f82777a;
                if (set.contains(1)) {
                    see.m35063b(parcel, 1, this.f82778b);
                }
                if (set.contains(2)) {
                    see.m35046a(parcel, 2, this.f82779c, true);
                }
                see.m35062b(parcel, a);
            }

            public ActorEntity(Set set, int i, String str) {
                this.f82777a = set;
                this.f82778b = i;
                this.f82779c = str;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f82777a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class AttachmentsEntity extends FastSafeParcelableJsonResponse implements aofa {
            public static final Parcelable.Creator CREATOR = new aofh();

            /* renamed from: k */
            private static final HashMap f82780k;

            /* renamed from: a */
            public final Set f82781a;

            /* renamed from: b */
            final int f82782b;

            /* renamed from: c */
            public ActionEntity f82783c;

            /* renamed from: d */
            public String f82784d;

            /* renamed from: e */
            DeepLinkEntity f82785e;

            /* renamed from: f */
            public String f82786f;

            /* renamed from: g */
            public ImageEntity f82787g;

            /* renamed from: h */
            public String f82788h;

            /* renamed from: i */
            List f82789i;

            /* renamed from: j */
            String f82790j;

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public final class ActionEntity extends FastSafeParcelableJsonResponse implements rty {
                public static final Parcelable.Creator CREATOR = new aofi();

                /* renamed from: f */
                private static final HashMap f82791f;

                /* renamed from: a */
                final Set f82792a;

                /* renamed from: b */
                final int f82793b;

                /* renamed from: c */
                DeepLinkEntity f82794c;

                /* renamed from: d */
                public String f82795d;

                /* renamed from: e */
                String f82796e;

                /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
                public final class DeepLinkEntity extends FastSafeParcelableJsonResponse implements rty {
                    public static final Parcelable.Creator CREATOR = new aofj();

                    /* renamed from: e */
                    private static final HashMap f82797e;

                    /* renamed from: a */
                    final Set f82798a;

                    /* renamed from: b */
                    final int f82799b;

                    /* renamed from: c */
                    String f82800c;

                    /* renamed from: d */
                    String f82801d;

                    static {
                        HashMap hashMap = new HashMap();
                        f82797e = hashMap;
                        hashMap.put("id", FastJsonResponse$Field.m22666f("id", 2));
                        f82797e.put("url", FastJsonResponse$Field.m22666f("url", 3));
                    }

                    public DeepLinkEntity() {
                        this.f82799b = 1;
                        this.f82798a = new HashSet();
                    }

                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ Map mo7367a() {
                        return f82797e;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: b */
                    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                        int i = fastJsonResponse$Field.f30319g;
                        if (i == 2) {
                            return this.f82800c;
                        }
                        if (i == 3) {
                            return this.f82801d;
                        }
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unknown safe parcelable id=");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                    }

                    /* renamed from: bF */
                    public final /* bridge */ /* synthetic */ Object mo7556bF() {
                        return this;
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof DeepLinkEntity)) {
                            return false;
                        }
                        if (this != obj) {
                            DeepLinkEntity deepLinkEntity = (DeepLinkEntity) obj;
                            for (FastJsonResponse$Field fastJsonResponse$Field : f82797e.values()) {
                                if (mo7370a(fastJsonResponse$Field)) {
                                    if (!deepLinkEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(deepLinkEntity.mo7371b(fastJsonResponse$Field))) {
                                        return false;
                                    }
                                } else if (deepLinkEntity.mo7370a(fastJsonResponse$Field)) {
                                    return false;
                                }
                            }
                        }
                        return true;
                    }

                    public final int hashCode() {
                        int i = 0;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f82797e.values()) {
                            if (mo7370a(fastJsonResponse$Field)) {
                                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                            }
                        }
                        return i;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                        int i = fastJsonResponse$Field.f30319g;
                        if (i == 2) {
                            this.f82800c = str2;
                        } else if (i == 3) {
                            this.f82801d = str2;
                        } else {
                            StringBuilder sb = new StringBuilder(54);
                            sb.append("Field with id=");
                            sb.append(i);
                            sb.append(" is not known to be a String.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                        this.f82798a.add(Integer.valueOf(i));
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
                        Set set = this.f82798a;
                        if (set.contains(1)) {
                            see.m35063b(parcel, 1, this.f82799b);
                        }
                        if (set.contains(2)) {
                            see.m35046a(parcel, 2, this.f82800c, true);
                        }
                        if (set.contains(3)) {
                            see.m35046a(parcel, 3, this.f82801d, true);
                        }
                        see.m35062b(parcel, a);
                    }

                    public DeepLinkEntity(Set set, int i, String str, String str2) {
                        this.f82798a = set;
                        this.f82799b = i;
                        this.f82800c = str;
                        this.f82801d = str2;
                    }

                    public DeepLinkEntity(Set set, String str, String str2) {
                        this.f82798a = set;
                        this.f82799b = 1;
                        this.f82800c = str;
                        this.f82801d = str2;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                        return this.f82798a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
                    }
                }

                static {
                    HashMap hashMap = new HashMap();
                    f82791f = hashMap;
                    hashMap.put("deepLink", FastJsonResponse$Field.m22653a("deepLink", 2, DeepLinkEntity.class));
                    f82791f.put("displayName", FastJsonResponse$Field.m22666f("displayName", 3));
                    f82791f.put("type", FastJsonResponse$Field.m22666f("type", 4));
                }

                public ActionEntity() {
                    this.f82793b = 1;
                    this.f82792a = new HashSet();
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Map mo7367a() {
                    return f82791f;
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 2) {
                        return this.f82794c;
                    }
                    if (i == 3) {
                        return this.f82795d;
                    }
                    if (i == 4) {
                        return this.f82796e;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                /* renamed from: bF */
                public final /* bridge */ /* synthetic */ Object mo7556bF() {
                    return this;
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof ActionEntity)) {
                        return false;
                    }
                    if (this != obj) {
                        ActionEntity actionEntity = (ActionEntity) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f82791f.values()) {
                            if (mo7370a(fastJsonResponse$Field)) {
                                if (!actionEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(actionEntity.mo7371b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (actionEntity.mo7370a(fastJsonResponse$Field)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }

                public final int hashCode() {
                    int i = 0;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82791f.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 3) {
                        this.f82795d = str2;
                    } else if (i == 4) {
                        this.f82796e = str2;
                    } else {
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Field with id=");
                        sb.append(i);
                        sb.append(" is not known to be a String.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f82792a.add(Integer.valueOf(i));
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
                    Set set = this.f82792a;
                    if (set.contains(1)) {
                        see.m35063b(parcel, 1, this.f82793b);
                    }
                    if (set.contains(2)) {
                        see.m35040a(parcel, 2, this.f82794c, i, true);
                    }
                    if (set.contains(3)) {
                        see.m35046a(parcel, 3, this.f82795d, true);
                    }
                    if (set.contains(4)) {
                        see.m35046a(parcel, 4, this.f82796e, true);
                    }
                    see.m35062b(parcel, a);
                }

                public ActionEntity(Set set, int i, DeepLinkEntity deepLinkEntity, String str, String str2) {
                    this.f82792a = set;
                    this.f82793b = i;
                    this.f82794c = deepLinkEntity;
                    this.f82795d = str;
                    this.f82796e = str2;
                }

                public ActionEntity(Set set, DeepLinkEntity deepLinkEntity, String str) {
                    this.f82792a = set;
                    this.f82793b = 1;
                    this.f82794c = deepLinkEntity;
                    this.f82795d = null;
                    this.f82796e = str;
                }

                /* renamed from: a */
                public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 2) {
                        this.f82794c = (DeepLinkEntity) sio;
                        this.f82792a.add(Integer.valueOf(i));
                        return;
                    }
                    String canonicalName = sio.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not a known custom type.  Found ");
                    sb.append(canonicalName);
                    sb.append(".");
                    throw new IllegalArgumentException(sb.toString());
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.f82792a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
                }
            }

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public final class DeepLinkEntity extends FastSafeParcelableJsonResponse implements rty {
                public static final Parcelable.Creator CREATOR = new aofk();

                /* renamed from: e */
                private static final HashMap f82802e;

                /* renamed from: a */
                final Set f82803a;

                /* renamed from: b */
                final int f82804b;

                /* renamed from: c */
                String f82805c;

                /* renamed from: d */
                String f82806d;

                static {
                    HashMap hashMap = new HashMap();
                    f82802e = hashMap;
                    hashMap.put("id", FastJsonResponse$Field.m22666f("id", 2));
                    f82802e.put("url", FastJsonResponse$Field.m22666f("url", 3));
                }

                public DeepLinkEntity() {
                    this.f82804b = 1;
                    this.f82803a = new HashSet();
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Map mo7367a() {
                    return f82802e;
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 2) {
                        return this.f82805c;
                    }
                    if (i == 3) {
                        return this.f82806d;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                /* renamed from: bF */
                public final /* bridge */ /* synthetic */ Object mo7556bF() {
                    return this;
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof DeepLinkEntity)) {
                        return false;
                    }
                    if (this != obj) {
                        DeepLinkEntity deepLinkEntity = (DeepLinkEntity) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f82802e.values()) {
                            if (mo7370a(fastJsonResponse$Field)) {
                                if (!deepLinkEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(deepLinkEntity.mo7371b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (deepLinkEntity.mo7370a(fastJsonResponse$Field)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }

                public final int hashCode() {
                    int i = 0;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82802e.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 2) {
                        this.f82805c = str2;
                    } else if (i == 3) {
                        this.f82806d = str2;
                    } else {
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Field with id=");
                        sb.append(i);
                        sb.append(" is not known to be a String.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f82803a.add(Integer.valueOf(i));
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
                    Set set = this.f82803a;
                    if (set.contains(1)) {
                        see.m35063b(parcel, 1, this.f82804b);
                    }
                    if (set.contains(2)) {
                        see.m35046a(parcel, 2, this.f82805c, true);
                    }
                    if (set.contains(3)) {
                        see.m35046a(parcel, 3, this.f82806d, true);
                    }
                    see.m35062b(parcel, a);
                }

                public DeepLinkEntity(Set set, int i, String str, String str2) {
                    this.f82803a = set;
                    this.f82804b = i;
                    this.f82805c = str;
                    this.f82806d = str2;
                }

                public DeepLinkEntity(Set set, String str) {
                    this.f82803a = set;
                    this.f82804b = 1;
                    this.f82805c = str;
                    this.f82806d = null;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.f82803a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
                }
            }

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public final class ImageEntity extends FastSafeParcelableJsonResponse implements rty {
                public static final Parcelable.Creator CREATOR = new aofl();

                /* renamed from: d */
                private static final HashMap f82807d;

                /* renamed from: a */
                final Set f82808a;

                /* renamed from: b */
                final int f82809b;

                /* renamed from: c */
                public String f82810c;

                static {
                    HashMap hashMap = new HashMap();
                    f82807d = hashMap;
                    hashMap.put("url", FastJsonResponse$Field.m22666f("url", 4));
                }

                public ImageEntity() {
                    this.f82809b = 1;
                    this.f82808a = new HashSet();
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Map mo7367a() {
                    return f82807d;
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 4) {
                        return this.f82810c;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                /* renamed from: bF */
                public final /* bridge */ /* synthetic */ Object mo7556bF() {
                    return this;
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof ImageEntity)) {
                        return false;
                    }
                    if (this != obj) {
                        ImageEntity imageEntity = (ImageEntity) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f82807d.values()) {
                            if (mo7370a(fastJsonResponse$Field)) {
                                if (!imageEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(imageEntity.mo7371b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (imageEntity.mo7370a(fastJsonResponse$Field)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }

                public final int hashCode() {
                    int i = 0;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82807d.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 4) {
                        this.f82810c = str2;
                        this.f82808a.add(Integer.valueOf(i));
                        return;
                    }
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
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
                    Set set = this.f82808a;
                    if (set.contains(1)) {
                        see.m35063b(parcel, 1, this.f82809b);
                    }
                    if (set.contains(4)) {
                        see.m35046a(parcel, 4, this.f82810c, true);
                    }
                    see.m35062b(parcel, a);
                }

                public ImageEntity(Set set, int i, String str) {
                    this.f82808a = set;
                    this.f82809b = i;
                    this.f82810c = str;
                }

                public ImageEntity(Set set, String str) {
                    this.f82808a = set;
                    this.f82809b = 1;
                    this.f82810c = str;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.f82808a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
                }
            }

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public final class ThumbnailsEntity extends FastSafeParcelableJsonResponse implements rty {
                public static final Parcelable.Creator CREATOR = new aofm();

                /* renamed from: e */
                private static final HashMap f82811e;

                /* renamed from: a */
                final Set f82812a;

                /* renamed from: b */
                final int f82813b;

                /* renamed from: c */
                ImageEntity f82814c;

                /* renamed from: d */
                String f82815d;

                /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
                public final class ImageEntity extends FastSafeParcelableJsonResponse implements rty {
                    public static final Parcelable.Creator CREATOR = new aofn();

                    /* renamed from: d */
                    private static final HashMap f82816d;

                    /* renamed from: a */
                    final Set f82817a;

                    /* renamed from: b */
                    final int f82818b;

                    /* renamed from: c */
                    String f82819c;

                    static {
                        HashMap hashMap = new HashMap();
                        f82816d = hashMap;
                        hashMap.put("url", FastJsonResponse$Field.m22666f("url", 4));
                    }

                    public ImageEntity() {
                        this.f82818b = 1;
                        this.f82817a = new HashSet();
                    }

                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ Map mo7367a() {
                        return f82816d;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: b */
                    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                        int i = fastJsonResponse$Field.f30319g;
                        if (i == 4) {
                            return this.f82819c;
                        }
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unknown safe parcelable id=");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                    }

                    /* renamed from: bF */
                    public final /* bridge */ /* synthetic */ Object mo7556bF() {
                        return this;
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof ImageEntity)) {
                            return false;
                        }
                        if (this != obj) {
                            ImageEntity imageEntity = (ImageEntity) obj;
                            for (FastJsonResponse$Field fastJsonResponse$Field : f82816d.values()) {
                                if (mo7370a(fastJsonResponse$Field)) {
                                    if (!imageEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(imageEntity.mo7371b(fastJsonResponse$Field))) {
                                        return false;
                                    }
                                } else if (imageEntity.mo7370a(fastJsonResponse$Field)) {
                                    return false;
                                }
                            }
                        }
                        return true;
                    }

                    public final int hashCode() {
                        int i = 0;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f82816d.values()) {
                            if (mo7370a(fastJsonResponse$Field)) {
                                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                            }
                        }
                        return i;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                        int i = fastJsonResponse$Field.f30319g;
                        if (i == 4) {
                            this.f82819c = str2;
                            this.f82817a.add(Integer.valueOf(i));
                            return;
                        }
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Field with id=");
                        sb.append(i);
                        sb.append(" is not known to be a String.");
                        throw new IllegalArgumentException(sb.toString());
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
                        Set set = this.f82817a;
                        if (set.contains(1)) {
                            see.m35063b(parcel, 1, this.f82818b);
                        }
                        if (set.contains(4)) {
                            see.m35046a(parcel, 4, this.f82819c, true);
                        }
                        see.m35062b(parcel, a);
                    }

                    public ImageEntity(Set set, int i, String str) {
                        this.f82817a = set;
                        this.f82818b = i;
                        this.f82819c = str;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                        return this.f82817a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
                    }
                }

                static {
                    HashMap hashMap = new HashMap();
                    f82811e = hashMap;
                    hashMap.put("image", FastJsonResponse$Field.m22653a("image", 4, ImageEntity.class));
                    f82811e.put("url", FastJsonResponse$Field.m22666f("url", 5));
                }

                public ThumbnailsEntity() {
                    this.f82813b = 1;
                    this.f82812a = new HashSet();
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Map mo7367a() {
                    return f82811e;
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 4) {
                        return this.f82814c;
                    }
                    if (i == 5) {
                        return this.f82815d;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                /* renamed from: bF */
                public final /* bridge */ /* synthetic */ Object mo7556bF() {
                    return this;
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof ThumbnailsEntity)) {
                        return false;
                    }
                    if (this != obj) {
                        ThumbnailsEntity thumbnailsEntity = (ThumbnailsEntity) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f82811e.values()) {
                            if (mo7370a(fastJsonResponse$Field)) {
                                if (!thumbnailsEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(thumbnailsEntity.mo7371b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (thumbnailsEntity.mo7370a(fastJsonResponse$Field)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }

                public final int hashCode() {
                    int i = 0;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82811e.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 5) {
                        this.f82815d = str2;
                        this.f82812a.add(Integer.valueOf(i));
                        return;
                    }
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
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
                    Set set = this.f82812a;
                    if (set.contains(1)) {
                        see.m35063b(parcel, 1, this.f82813b);
                    }
                    if (set.contains(4)) {
                        see.m35040a(parcel, 4, this.f82814c, i, true);
                    }
                    if (set.contains(5)) {
                        see.m35046a(parcel, 5, this.f82815d, true);
                    }
                    see.m35062b(parcel, a);
                }

                public ThumbnailsEntity(Set set, int i, ImageEntity imageEntity, String str) {
                    this.f82812a = set;
                    this.f82813b = i;
                    this.f82814c = imageEntity;
                    this.f82815d = str;
                }

                /* renamed from: a */
                public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 4) {
                        this.f82814c = (ImageEntity) sio;
                        this.f82812a.add(Integer.valueOf(i));
                        return;
                    }
                    String canonicalName = sio.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not a known custom type.  Found ");
                    sb.append(canonicalName);
                    sb.append(".");
                    throw new IllegalArgumentException(sb.toString());
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.f82812a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
                }
            }

            static {
                HashMap hashMap = new HashMap();
                f82780k = hashMap;
                hashMap.put("action", FastJsonResponse$Field.m22653a("action", 2, ActionEntity.class));
                f82780k.put("content", FastJsonResponse$Field.m22666f("content", 4));
                f82780k.put("deepLink", FastJsonResponse$Field.m22653a("deepLink", 5, DeepLinkEntity.class));
                f82780k.put("displayName", FastJsonResponse$Field.m22666f("displayName", 6));
                f82780k.put("image", FastJsonResponse$Field.m22653a("image", 10, ImageEntity.class));
                f82780k.put("objectType", FastJsonResponse$Field.m22666f("objectType", 11));
                f82780k.put("thumbnails", FastJsonResponse$Field.m22657b("thumbnails", 13, ThumbnailsEntity.class));
                f82780k.put("url", FastJsonResponse$Field.m22666f("url", 14));
            }

            public AttachmentsEntity() {
                this.f82782b = 1;
                this.f82781a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f82780k;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return this.f82783c;
                }
                if (i == 4) {
                    return this.f82784d;
                }
                if (i == 5) {
                    return this.f82785e;
                }
                if (i == 6) {
                    return this.f82786f;
                }
                if (i == 10) {
                    return this.f82787g;
                }
                if (i == 11) {
                    return this.f82788h;
                }
                if (i == 13) {
                    return this.f82789i;
                }
                if (i == 14) {
                    return this.f82790j;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            /* renamed from: bF */
            public final /* bridge */ /* synthetic */ Object mo7556bF() {
                return this;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof AttachmentsEntity)) {
                    return false;
                }
                if (this != obj) {
                    AttachmentsEntity attachmentsEntity = (AttachmentsEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82780k.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!attachmentsEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(attachmentsEntity.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (attachmentsEntity.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82780k.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 4) {
                    this.f82784d = str2;
                } else if (i == 6) {
                    this.f82786f = str2;
                } else if (i == 11) {
                    this.f82788h = str2;
                } else if (i == 14) {
                    this.f82790j = str2;
                } else {
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f82781a.add(Integer.valueOf(i));
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
                Set set = this.f82781a;
                if (set.contains(1)) {
                    see.m35063b(parcel, 1, this.f82782b);
                }
                if (set.contains(2)) {
                    see.m35040a(parcel, 2, this.f82783c, i, true);
                }
                if (set.contains(4)) {
                    see.m35046a(parcel, 4, this.f82784d, true);
                }
                if (set.contains(5)) {
                    see.m35040a(parcel, 5, this.f82785e, i, true);
                }
                if (set.contains(6)) {
                    see.m35046a(parcel, 6, this.f82786f, true);
                }
                if (set.contains(10)) {
                    see.m35040a(parcel, 10, this.f82787g, i, true);
                }
                if (set.contains(11)) {
                    see.m35046a(parcel, 11, this.f82788h, true);
                }
                if (set.contains(13)) {
                    see.m35066c(parcel, 13, this.f82789i, true);
                }
                if (set.contains(14)) {
                    see.m35046a(parcel, 14, this.f82790j, true);
                }
                see.m35062b(parcel, a);
            }

            public AttachmentsEntity(Set set, int i, ActionEntity actionEntity, String str, DeepLinkEntity deepLinkEntity, String str2, ImageEntity imageEntity, String str3, List list, String str4) {
                this.f82781a = set;
                this.f82782b = i;
                this.f82783c = actionEntity;
                this.f82784d = str;
                this.f82785e = deepLinkEntity;
                this.f82786f = str2;
                this.f82787g = imageEntity;
                this.f82788h = str3;
                this.f82789i = list;
                this.f82790j = str4;
            }

            public AttachmentsEntity(Set set, ActionEntity actionEntity, String str, DeepLinkEntity deepLinkEntity, String str2, ImageEntity imageEntity, String str3, String str4) {
                this.f82781a = set;
                this.f82782b = 1;
                this.f82783c = actionEntity;
                this.f82784d = str;
                this.f82785e = deepLinkEntity;
                this.f82786f = str2;
                this.f82787g = imageEntity;
                this.f82788h = str3;
                this.f82789i = null;
                this.f82790j = str4;
            }

            /* renamed from: a */
            public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 13) {
                    this.f82789i = arrayList;
                    this.f82781a.add(Integer.valueOf(i));
                    return;
                }
                String canonicalName = arrayList.getClass().getCanonicalName();
                StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not a known array of custom type.  Found ");
                sb.append(canonicalName);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            }

            /* renamed from: a */
            public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    this.f82783c = (ActionEntity) sio;
                } else if (i == 5) {
                    this.f82785e = (DeepLinkEntity) sio;
                } else if (i == 10) {
                    this.f82787g = (ImageEntity) sio;
                } else {
                    String canonicalName = sio.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not a known custom type.  Found ");
                    sb.append(canonicalName);
                    sb.append(".");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f82781a.add(Integer.valueOf(i));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f82781a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class PlusonersEntity extends FastSafeParcelableJsonResponse implements rty {
            public static final Parcelable.Creator CREATOR = new aofo();

            /* renamed from: d */
            private static final HashMap f82820d;

            /* renamed from: a */
            final Set f82821a;

            /* renamed from: b */
            final int f82822b;

            /* renamed from: c */
            int f82823c;

            static {
                HashMap hashMap = new HashMap();
                f82820d = hashMap;
                hashMap.put("totalItems", FastJsonResponse$Field.m22651a("totalItems", 3));
            }

            public PlusonersEntity() {
                this.f82822b = 1;
                this.f82821a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f82820d;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 3) {
                    return Integer.valueOf(this.f82823c);
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            /* renamed from: bF */
            public final /* bridge */ /* synthetic */ Object mo7556bF() {
                return this;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof PlusonersEntity)) {
                    return false;
                }
                if (this != obj) {
                    PlusonersEntity plusonersEntity = (PlusonersEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82820d.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!plusonersEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(plusonersEntity.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (plusonersEntity.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82820d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
                int i2 = fastJsonResponse$Field.f30319g;
                if (i2 == 3) {
                    this.f82823c = i;
                    this.f82821a.add(Integer.valueOf(i2));
                    return;
                }
                StringBuilder sb = new StringBuilder(52);
                sb.append("Field with id=");
                sb.append(i2);
                sb.append(" is not known to be an int.");
                throw new IllegalArgumentException(sb.toString());
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a = see.m35030a(parcel);
                Set set = this.f82821a;
                if (set.contains(1)) {
                    see.m35063b(parcel, 1, this.f82822b);
                }
                if (set.contains(3)) {
                    see.m35063b(parcel, 3, this.f82823c);
                }
                see.m35062b(parcel, a);
            }

            public PlusonersEntity(Set set, int i, int i2) {
                this.f82821a = set;
                this.f82822b = i;
                this.f82823c = i2;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f82821a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class RepliesEntity extends FastSafeParcelableJsonResponse implements rty {
            public static final Parcelable.Creator CREATOR = new aofp();

            /* renamed from: d */
            private static final HashMap f82824d;

            /* renamed from: a */
            final Set f82825a;

            /* renamed from: b */
            final int f82826b;

            /* renamed from: c */
            int f82827c;

            static {
                HashMap hashMap = new HashMap();
                f82824d = hashMap;
                hashMap.put("totalItems", FastJsonResponse$Field.m22651a("totalItems", 4));
            }

            public RepliesEntity() {
                this.f82826b = 1;
                this.f82825a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f82824d;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 4) {
                    return Integer.valueOf(this.f82827c);
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            /* renamed from: bF */
            public final /* bridge */ /* synthetic */ Object mo7556bF() {
                return this;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof RepliesEntity)) {
                    return false;
                }
                if (this != obj) {
                    RepliesEntity repliesEntity = (RepliesEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82824d.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!repliesEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(repliesEntity.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (repliesEntity.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82824d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
                int i2 = fastJsonResponse$Field.f30319g;
                if (i2 == 4) {
                    this.f82827c = i;
                    this.f82825a.add(Integer.valueOf(i2));
                    return;
                }
                StringBuilder sb = new StringBuilder(52);
                sb.append("Field with id=");
                sb.append(i2);
                sb.append(" is not known to be an int.");
                throw new IllegalArgumentException(sb.toString());
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a = see.m35030a(parcel);
                Set set = this.f82825a;
                if (set.contains(1)) {
                    see.m35063b(parcel, 1, this.f82826b);
                }
                if (set.contains(4)) {
                    see.m35063b(parcel, 4, this.f82827c);
                }
                see.m35062b(parcel, a);
            }

            public RepliesEntity(Set set, int i, int i2) {
                this.f82825a = set;
                this.f82826b = i;
                this.f82827c = i2;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f82825a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f82768h = hashMap;
            hashMap.put("actor", FastJsonResponse$Field.m22653a("actor", 2, ActorEntity.class));
            f82768h.put("attachments", FastJsonResponse$Field.m22657b("attachments", 3, AttachmentsEntity.class));
            f82768h.put("content", FastJsonResponse$Field.m22666f("content", 4));
            f82768h.put("plusoners", FastJsonResponse$Field.m22653a("plusoners", 9, PlusonersEntity.class));
            f82768h.put("replies", FastJsonResponse$Field.m22653a("replies", 10, RepliesEntity.class));
        }

        public ObjectEntity() {
            this.f82770b = 1;
            this.f82769a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82768h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f82771c;
            }
            if (i == 3) {
                return this.f82772d;
            }
            if (i == 4) {
                return this.f82773e;
            }
            if (i == 9) {
                return this.f82774f;
            }
            if (i == 10) {
                return this.f82775g;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectEntity)) {
                return false;
            }
            if (this != obj) {
                ObjectEntity objectEntity = (ObjectEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82768h.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!objectEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(objectEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (objectEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82768h.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                this.f82773e = str2;
                this.f82769a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
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
            Set set = this.f82769a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82770b);
            }
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f82771c, i, true);
            }
            if (set.contains(3)) {
                see.m35066c(parcel, 3, this.f82772d, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f82773e, true);
            }
            if (set.contains(9)) {
                see.m35040a(parcel, 9, this.f82774f, i, true);
            }
            if (set.contains(10)) {
                see.m35040a(parcel, 10, this.f82775g, i, true);
            }
            see.m35062b(parcel, a);
        }

        public ObjectEntity(Set set, int i, ActorEntity actorEntity, List list, String str, PlusonersEntity plusonersEntity, RepliesEntity repliesEntity) {
            this.f82769a = set;
            this.f82770b = i;
            this.f82771c = actorEntity;
            this.f82772d = list;
            this.f82773e = str;
            this.f82774f = plusonersEntity;
            this.f82775g = repliesEntity;
        }

        public ObjectEntity(Set set, List list, String str) {
            this.f82769a = set;
            this.f82770b = 1;
            this.f82771c = null;
            this.f82772d = list;
            this.f82773e = str;
            this.f82774f = null;
            this.f82775g = null;
        }

        /* renamed from: a */
        public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f82772d = arrayList;
                this.f82769a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f82771c = (ActorEntity) sio;
            } else if (i == 9) {
                this.f82774f = (PlusonersEntity) sio;
            } else if (i == 10) {
                this.f82775g = (RepliesEntity) sio;
            } else {
                String canonicalName = sio.getClass().getCanonicalName();
                StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not a known custom type.  Found ");
                sb.append(canonicalName);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f82769a.add(Integer.valueOf(i));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82769a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f82756l = hashMap;
        hashMap.put("access", FastJsonResponse$Field.m22653a("access", 2, AclEntity.class));
        f82756l.put("annotation", FastJsonResponse$Field.m22666f("annotation", 5));
        f82756l.put("id", FastJsonResponse$Field.m22666f("id", 10));
        f82756l.put("object", FastJsonResponse$Field.m22653a("object", 15, ObjectEntity.class));
        f82756l.put("placeName", FastJsonResponse$Field.m22666f("placeName", 17));
        f82756l.put("published", FastJsonResponse$Field.m22666f("published", 19));
        f82756l.put("updated", FastJsonResponse$Field.m22666f("updated", 23));
        f82756l.put("url", FastJsonResponse$Field.m22666f("url", 24));
        f82756l.put("verb", FastJsonResponse$Field.m22666f("verb", 25));
    }

    public ActivityEntity() {
        this.f82758b = 1;
        this.f82757a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82756l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82759c;
        }
        if (i == 5) {
            return this.f82760d;
        }
        if (i == 10) {
            return this.f82761e;
        }
        if (i == 15) {
            return this.f82762f;
        }
        if (i == 17) {
            return this.f82763g;
        }
        if (i == 19) {
            return this.f82764h;
        }
        switch (i) {
            case 23:
                return this.f82765i;
            case 24:
                return this.f82766j;
            case 25:
                return this.f82767k;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActivityEntity)) {
            return false;
        }
        if (this != obj) {
            ActivityEntity activityEntity = (ActivityEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82756l.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!activityEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(activityEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (activityEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82756l.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f82760d = str2;
        } else if (i == 10) {
            this.f82761e = str2;
        } else if (i == 17) {
            this.f82763g = str2;
        } else if (i != 19) {
            switch (i) {
                case 23:
                    this.f82765i = str2;
                    break;
                case 24:
                    this.f82766j = str2;
                    break;
                case 25:
                    this.f82767k = str2;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            this.f82764h = str2;
        }
        this.f82757a.add(Integer.valueOf(i));
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
        Set set = this.f82757a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82758b);
        }
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f82759c, i, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82760d, true);
        }
        if (set.contains(10)) {
            see.m35046a(parcel, 10, this.f82761e, true);
        }
        if (set.contains(15)) {
            see.m35040a(parcel, 15, this.f82762f, i, true);
        }
        if (set.contains(17)) {
            see.m35046a(parcel, 17, this.f82763g, true);
        }
        if (set.contains(19)) {
            see.m35046a(parcel, 19, this.f82764h, true);
        }
        if (set.contains(23)) {
            see.m35046a(parcel, 23, this.f82765i, true);
        }
        if (set.contains(24)) {
            see.m35046a(parcel, 24, this.f82766j, true);
        }
        if (set.contains(25)) {
            see.m35046a(parcel, 25, this.f82767k, true);
        }
        see.m35062b(parcel, a);
    }

    public ActivityEntity(Set set, int i, AclEntity aclEntity, String str, String str2, ObjectEntity objectEntity, String str3, String str4, String str5, String str6, String str7) {
        this.f82757a = set;
        this.f82758b = i;
        this.f82759c = aclEntity;
        this.f82760d = str;
        this.f82761e = str2;
        this.f82762f = objectEntity;
        this.f82763g = str3;
        this.f82764h = str4;
        this.f82765i = str5;
        this.f82766j = str6;
        this.f82767k = str7;
    }

    public ActivityEntity(Set set, AclEntity aclEntity, ObjectEntity objectEntity) {
        this.f82757a = set;
        this.f82758b = 1;
        this.f82759c = aclEntity;
        this.f82760d = null;
        this.f82761e = null;
        this.f82762f = objectEntity;
        this.f82763g = null;
        this.f82764h = null;
        this.f82765i = null;
        this.f82766j = null;
        this.f82767k = null;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82759c = (AclEntity) sio;
        } else if (i == 15) {
            this.f82762f = (ObjectEntity) sio;
        } else {
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82757a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82757a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
