package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: cijd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cijd extends cije implements Serializable {
    private static final long serialVersionUID = -7046029254386353129L;

    /* renamed from: a */
    protected final cijj f190429a;

    /* renamed from: b */
    protected final int f190430b;

    /* renamed from: c */
    protected int f190431c;

    public cijd(cijj cijj, int i, int i2) {
        this.f190429a = cijj;
        this.f190430b = i;
        this.f190431c = i2;
    }

    /* renamed from: a */
    public final long mo86163a(int i) {
        mo86189e(i);
        return this.f190429a.mo86163a(this.f190430b + i);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        super.add(i, (Long) obj);
    }

    public final boolean addAll(int i, Collection collection) {
        mo86187d(i);
        this.f190431c += collection.size();
        return this.f190429a.addAll(this.f190430b + i, collection);
    }

    /* renamed from: b */
    public final long mo86168b(int i) {
        mo86189e(i);
        this.f190431c--;
        return this.f190429a.mo86168b(this.f190430b + i);
    }

    /* renamed from: c */
    public final cijk mo86171c(int i) {
        mo86187d(i);
        return new cijc(this, i);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return super.get(i);
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        return super.remove(i);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return super.set(i, (Long) obj);
    }

    public final int size() {
        return this.f190431c - this.f190430b;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator();
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ciji mo86142a() {
        return listIterator();
    }

    /* renamed from: b */
    public final long mo86169b(int i, long j) {
        mo86189e(i);
        return this.f190429a.mo86169b(this.f190430b + i, j);
    }

    /* renamed from: c */
    public final boolean mo86146c(long j) {
        int d = mo86186d(j);
        if (d == -1) {
            return false;
        }
        this.f190431c--;
        this.f190429a.mo86168b(this.f190430b + d);
        return true;
    }

    /* renamed from: a */
    public final void mo86164a(int i, int i2) {
        mo86187d(i);
        mo86187d(i2);
        cijj cijj = this.f190429a;
        int i3 = this.f190430b;
        cijj.mo86164a(i3 + i, i3 + i2);
        this.f190431c -= i2 - i;
    }

    /* renamed from: b */
    public final cijj mo86170b(int i, int i2) {
        mo86187d(i);
        mo86187d(i2);
        if (i <= i2) {
            return new cijd(this, i, i2);
        }
        throw new IllegalArgumentException("Start index (" + i + ") is greater than end index (" + i2 + ")");
    }

    /* renamed from: a */
    public final void mo86165a(int i, long j) {
        mo86187d(i);
        this.f190429a.mo86165a(this.f190430b + i, j);
        this.f190431c++;
    }

    /* renamed from: a */
    public final boolean mo86143a(long j) {
        this.f190429a.mo86165a(this.f190431c, j);
        this.f190431c++;
        return true;
    }
}
