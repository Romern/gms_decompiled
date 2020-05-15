package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContextDataFilterImpl extends AbstractSafeParcelable implements tiu, tlr, tmx {
    public static final Parcelable.Creator CREATOR = new tlo();

    /* renamed from: a */
    public final ArrayList f30670a;

    /* renamed from: b */
    public final ArrayList f30671b;

    /* renamed from: c */
    public final QueryFilterParameters f30672c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new tlp();

        /* renamed from: a */
        public final int f30673a;

        /* renamed from: b */
        public final int f30674b;

        /* renamed from: c */
        public final TimeFilterImpl f30675c;

        /* renamed from: d */
        public final KeyFilterImpl f30676d;

        public Inclusion(int i, int i2, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
            this.f30673a = i;
            this.f30674b = i2;
            this.f30675c = timeFilterImpl;
            this.f30676d = keyFilterImpl;
        }

        /* renamed from: a */
        public final boolean mo18059a() {
            return this.f30673a != -1;
        }

        /* renamed from: b */
        public final boolean mo18060b() {
            return this.f30674b != -1;
        }

        /* renamed from: c */
        public final boolean mo18061c() {
            return this.f30675c != null;
        }

        /* renamed from: d */
        public final boolean mo18062d() {
            return this.f30676d != null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Inclusion) {
                Inclusion inclusion = (Inclusion) obj;
                return this.f30673a == inclusion.f30673a && this.f30674b == inclusion.f30674b && this.f30675c.equals(inclusion.f30675c) && sdg.m34949a(this.f30676d, inclusion.f30676d);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30673a), Integer.valueOf(this.f30674b), this.f30675c, this.f30676d});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 2, this.f30673a);
            see.m35063b(parcel, 3, this.f30674b);
            see.m35040a(parcel, 4, this.f30675c, i, false);
            see.m35040a(parcel, 5, this.f30676d, i, false);
            see.m35062b(parcel, a);
        }
    }

    public ContextDataFilterImpl(ArrayList arrayList, ArrayList arrayList2, QueryFilterParameters queryFilterParameters) {
        this.f30670a = arrayList;
        this.f30671b = arrayList2;
        this.f30672c = queryFilterParameters;
    }

    /* renamed from: a */
    public final QueryFilterParameters mo18050a() {
        return this.f30672c;
    }

    /* renamed from: b */
    public final boolean mo18052b() {
        ArrayList arrayList = this.f30670a;
        return arrayList != null && arrayList.size() > 0;
    }

    /* renamed from: c */
    public final boolean mo18053c() {
        ArrayList arrayList = this.f30671b;
        return arrayList != null && arrayList.size() > 0;
    }

    /* renamed from: d */
    public final HashSet mo18054d() {
        ArrayList arrayList = this.f30670a;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = this.f30670a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(Integer.valueOf(((Inclusion) arrayList2.get(i)).f30674b));
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContextDataFilterImpl) {
            ContextDataFilterImpl contextDataFilterImpl = (ContextDataFilterImpl) obj;
            return sdg.m34949a(this.f30670a, contextDataFilterImpl.f30670a) && sdg.m34949a(this.f30671b, contextDataFilterImpl.f30671b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30670a, this.f30671b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("contexts=[");
        ArrayList arrayList = this.f30670a;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = this.f30670a;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                sb.append(((Inclusion) arrayList2.get(i)).f30674b);
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f30670a, false);
        see.m35065b(parcel, 3, this.f30671b, false);
        see.m35040a(parcel, 4, this.f30672c, i, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final boolean mo18051a(ContextData contextData) {
        if (mo18053c()) {
            ArrayList arrayList = this.f30671b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (!TextUtils.equals((String) arrayList.get(i), contextData.mo18015e().mo26585c())) {
                    i = i2;
                }
            }
            return false;
        }
        if (mo18052b()) {
            ArrayList arrayList2 = this.f30670a;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                int i4 = i3 + 1;
                Inclusion inclusion = (Inclusion) arrayList2.get(i3);
                if ((!inclusion.mo18059a() || inclusion.f30673a == contextData.mo18017f()) && (!inclusion.mo18060b() || inclusion.f30674b == contextData.mo18018g())) {
                    if (inclusion.mo18061c()) {
                        if (contextData.mo18022j() != null) {
                            TimeFilterImpl timeFilterImpl = inclusion.f30675c;
                            tnd j = contextData.mo18022j();
                            ArrayList arrayList3 = timeFilterImpl.f30699a;
                            int size3 = arrayList3.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    continue;
                                    break;
                                }
                                int i6 = i5 + 1;
                                tnd tnd = (TimeFilterImpl.Interval) arrayList3.get(i5);
                                long d = tnd.mo18097d() - tnd.mo18096c();
                                long d2 = j.mo18097d() - j.mo18096c();
                                tnd tnd2 = d > d2 ? tnd : j;
                                if (d > d2) {
                                    tnd = j;
                                }
                                long c = tnd2.mo18096c();
                                long d3 = tnd2.mo18097d();
                                long c2 = tnd.mo18096c();
                                long d4 = tnd.mo18097d();
                                if ((c2 >= c && c2 <= d3) || (d4 >= c && d4 <= d3)) {
                                    break;
                                }
                                i5 = i6;
                            }
                        } else {
                            dst.m9257b("ContextDataFilterImpl", "No context time specified for Context: [%s]", Integer.valueOf(contextData.mo18018g()));
                        }
                    }
                    if (inclusion.mo18062d()) {
                        KeyFilterImpl keyFilterImpl = inclusion.f30676d;
                        tju l = contextData.mo18024l();
                        if (!keyFilterImpl.f30692a.isEmpty()) {
                            ArrayList arrayList4 = keyFilterImpl.f30692a;
                            int size4 = arrayList4.size();
                            int i7 = 0;
                            while (i7 < size4) {
                                KeyFilterImpl.Inclusion inclusion2 = (KeyFilterImpl.Inclusion) arrayList4.get(i7);
                                i7++;
                                if (l != null && KeyFilterImpl.m22899a(l.mo26605b(), inclusion2.f30693a) && KeyFilterImpl.m22899a(l.mo26607d(), inclusion2.f30694b) && KeyFilterImpl.m22899a(l.mo26610f(), inclusion2.f30695c)) {
                                }
                            }
                            continue;
                        }
                    }
                    return true;
                }
                i3 = i4;
            }
        }
        return false;
    }
}
