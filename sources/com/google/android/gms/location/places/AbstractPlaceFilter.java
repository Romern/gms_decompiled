package com.google.android.gms.location.places;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.internal.PlaceEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class AbstractPlaceFilter extends AbstractSafeParcelable {
    /* renamed from: a */
    static List m66900a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return Collections.emptyList();
        }
        return new ArrayList(collection);
    }

    /* renamed from: a */
    public boolean mo43625a() {
        return false;
    }

    /* renamed from: b */
    public abstract Set mo43627b();

    /* renamed from: c */
    public abstract Set mo43628c();

    /* renamed from: a */
    static Set m66901a(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(list));
    }

    /* renamed from: a */
    public final boolean mo43626a(aelh aelh) {
        if (mo43625a() && ((PlaceEntity) aelh).f79541g) {
            return false;
        }
        Set b = mo43627b();
        if (!b.isEmpty() && !b.contains(((PlaceEntity) aelh).f79535a)) {
            return false;
        }
        Set c = mo43628c();
        if (c.isEmpty()) {
            return true;
        }
        for (Integer num : ((PlaceEntity) aelh).f79544j) {
            if (c.contains(num)) {
                return true;
            }
        }
        return false;
    }
}
