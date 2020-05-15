package android.support.p002v7.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p001v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.RecyclerView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecyclerView extends ViewGroup implements C1265pd {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    public static final boolean ALLOW_THREAD_GAP_WORK = true;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION = true;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator = new abd();
    public aco mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public abh mAdapter;
    public C1491xn mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private abk mChildDrawingOrderCallback;
    public C1524yt mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private abl mEdgeEffectFactory;
    boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public C1555zx mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private aby mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public abp mItemAnimator;
    private abn mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    public abu mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final ace mObserver;
    private List mOnChildAttachStateListeners;
    private abx mOnFlingListener;
    private final ArrayList mOnItemTouchListeners;
    final List mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public C1553zv mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final acc mRecycler;
    public acd mRecyclerListener;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private abz mScrollListener;
    private List mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C1266pe mScrollingChildHelper;
    public final acj mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final C0004acl mViewFlinger;
    private final aei mViewInfoProcessCallback;
    public final aej mViewInfoStore;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = Build.VERSION.SDK_INT;
        int i6 = Build.VERSION.SDK_INT;
        int i7 = Build.VERSION.SDK_INT;
        int i8 = Build.VERSION.SDK_INT;
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(acm acm) {
        View view = acm.f201a;
        ViewParent parent = view.getParent();
        this.mRecycler.mo284b(getChildViewHolder(view));
        if (acm.mo334o()) {
            this.mChildHelper.mo16584a(view, -1, view.getLayoutParams(), true);
        } else if (parent == this) {
            C1524yt ytVar = this.mChildHelper;
            int a = ytVar.f27684c.mo147a(view);
            if (a >= 0) {
                ytVar.f27682a.mo16574a(a);
                ytVar.mo16583a(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else {
            this.mChildHelper.mo16585a(view, -1, true);
        }
    }

    private void animateChange(acm acm, acm acm2, abo abo, abo abo2, boolean z, boolean z2) {
        acm.mo317a(false);
        if (z) {
            addAnimatingView(acm);
        }
        if (acm != acm2) {
            if (z2) {
                addAnimatingView(acm2);
            }
            acm.f208h = acm2;
            addAnimatingView(acm);
            this.mRecycler.mo284b(acm);
            acm2.mo317a(false);
            acm2.f209i = acm;
        }
        if (this.mItemAnimator.mo200a(acm, acm2, abo, abo2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(acm acm) {
        WeakReference weakReference = acm.f202b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != acm.f201a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            acm.f202b = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(abu.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((abu) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e7);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            int i2 = Build.VERSION.SDK_INT;
            obtain.setContentChangeTypes(i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        aeh aeh;
        boolean z = true;
        this.mState.mo306a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f185i = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.mo528a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        acj acj = this.mState;
        if (!acj.f186j || !this.mItemsChanged) {
            z = false;
        }
        acj.f184h = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        acj.f183g = acj.f187k;
        acj.f181e = this.mAdapter.mo161a();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f186j) {
            int a = this.mChildHelper.mo16581a();
            for (int i = 0; i < a; i++) {
                acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16588b(i));
                if (!childViewHolderInt.mo320aO() && (!childViewHolderInt.mo330k() || this.mAdapter.f103b)) {
                    abp.m248g(childViewHolderInt);
                    childViewHolderInt.mo337r();
                    this.mViewInfoStore.mo530a(childViewHolderInt, abp.m249h(childViewHolderInt));
                    if (this.mState.f184h && childViewHolderInt.mo341u() && !childViewHolderInt.mo333n() && !childViewHolderInt.mo320aO() && !childViewHolderInt.mo330k()) {
                        this.mViewInfoStore.mo529a(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f187k) {
            saveOldPositions();
            acj acj2 = this.mState;
            boolean z2 = acj2.f182f;
            acj2.f182f = false;
            this.mLayout.mo34c(this.mRecycler, acj2);
            this.mState.f182f = z2;
            for (int i2 = 0; i2 < this.mChildHelper.mo16581a(); i2++) {
                acm childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.mo16588b(i2));
                if (!childViewHolderInt2.mo320aO() && ((aeh = (aeh) this.mViewInfoStore.f337a.get(childViewHolderInt2)) == null || (aeh.f334a & 4) == 0)) {
                    abp.m248g(childViewHolderInt2);
                    boolean a2 = childViewHolderInt2.mo318a(8192);
                    childViewHolderInt2.mo337r();
                    abo h = abp.m249h(childViewHolderInt2);
                    if (!a2) {
                        aej aej = this.mViewInfoStore;
                        aeh aeh2 = (aeh) aej.f337a.get(childViewHolderInt2);
                        if (aeh2 == null) {
                            aeh2 = aeh.m608a();
                            aej.f337a.put(childViewHolderInt2, aeh2);
                        }
                        aeh2.f334a |= 2;
                        aeh2.f335b = h;
                    } else {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, h);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f180d = 2;
    }

    private void dispatchLayoutStep2() {
        boolean z;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.mo306a(6);
        this.mAdapterHelper.mo16491e();
        this.mState.f181e = this.mAdapter.mo161a();
        this.mState.f179c = 0;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            int i = this.mAdapter.f104c;
            Parcelable parcelable = savedState.f1227c;
            if (parcelable != null) {
                this.mLayout.mo56a(parcelable);
            }
            this.mPendingSavedState = null;
        }
        acj acj = this.mState;
        acj.f183g = false;
        this.mLayout.mo34c(this.mRecycler, acj);
        acj acj2 = this.mState;
        acj2.f182f = false;
        if (!acj2.f186j || this.mItemAnimator == null) {
            z = false;
        } else {
            z = true;
        }
        acj2.f186j = z;
        acj2.f180d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.mo306a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        acj acj = this.mState;
        acj.f180d = 1;
        if (acj.f186j) {
            for (int a = this.mChildHelper.mo16581a() - 1; a >= 0; a--) {
                acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16588b(a));
                if (!childViewHolderInt.mo320aO()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    abo f = abp.m247f();
                    f.mo197a(childViewHolderInt);
                    acm acm = (acm) this.mViewInfoStore.f338b.mo15534a(changedHolderKey);
                    if (acm == null || acm.mo320aO()) {
                        this.mViewInfoStore.mo533b(childViewHolderInt, f);
                    } else {
                        boolean a2 = this.mViewInfoStore.mo531a(acm);
                        boolean a3 = this.mViewInfoStore.mo531a(childViewHolderInt);
                        if (a2 && acm == childViewHolderInt) {
                            this.mViewInfoStore.mo533b(childViewHolderInt, f);
                        } else {
                            abo a4 = this.mViewInfoStore.mo527a(acm, 4);
                            this.mViewInfoStore.mo533b(childViewHolderInt, f);
                            abo a5 = this.mViewInfoStore.mo527a(childViewHolderInt, 8);
                            if (a4 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, acm);
                            } else {
                                animateChange(acm, childViewHolderInt, a4, a5, a2, a3);
                            }
                        }
                    }
                }
            }
            aej aej = this.mViewInfoStore;
            aei aei = this.mViewInfoProcessCallback;
            for (int i = aej.f337a.f26809h - 1; i >= 0; i--) {
                acm acm2 = (acm) aej.f337a.mo15620b(i);
                aeh aeh = (aeh) aej.f337a.mo8152d(i);
                int i2 = aeh.f334a;
                if ((i2 & 3) == 3) {
                    aei.mo142a(acm2);
                } else if ((i2 & 1) != 0) {
                    abo abo = aeh.f335b;
                    if (abo == null) {
                        aei.mo142a(acm2);
                    } else {
                        aei.mo143a(acm2, abo, aeh.f336c);
                    }
                } else if ((i2 & 14) == 14) {
                    aei.mo144b(acm2, aeh.f335b, aeh.f336c);
                } else if ((i2 & 12) == 12) {
                    aei.mo145c(acm2, aeh.f335b, aeh.f336c);
                } else if ((i2 & 4) != 0) {
                    aei.mo143a(acm2, aeh.f335b, null);
                } else if ((i2 & 8) != 0) {
                    aei.mo144b(acm2, aeh.f335b, aeh.f336c);
                }
                aeh.m609a(aeh);
            }
        }
        this.mLayout.mo234b(this.mRecycler);
        acj acj2 = this.mState;
        acj2.f178b = acj2.f181e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        acj2.f186j = false;
        acj2.f187k = false;
        this.mLayout.f124v = false;
        ArrayList arrayList = this.mRecycler.f145b;
        if (arrayList != null) {
            arrayList.clear();
        }
        abu abu = this.mLayout;
        if (abu.f112A) {
            abu.f128z = 0;
            abu.f112A = false;
            this.mRecycler.mo283b();
        }
        this.mLayout.mo26a(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.mo528a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        aby aby = this.mInterceptingOnItemTouchListener;
        if (aby != null) {
            aby.mo267a(motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() != 0) {
            return findInterceptingOnItemTouchListener(motionEvent);
        } else {
            return false;
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            aby aby = (aby) this.mOnItemTouchListeners.get(i);
            if (aby.mo269a(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = aby;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int a = this.mChildHelper.mo16581a();
        if (a != 0) {
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            for (int i3 = 0; i3 < a; i3++) {
                acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16588b(i3));
                if (!childViewHolderInt.mo320aO()) {
                    int c = childViewHolderInt.mo322c();
                    if (c < i) {
                        i = c;
                    }
                    if (c > i2) {
                        i2 = c;
                    }
                }
            }
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
                if (findNestedRecyclerView != null) {
                    return findNestedRecyclerView;
                }
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        acm findViewHolderForAdapterPosition;
        acj acj = this.mState;
        int i = acj.f188l;
        if (i == -1) {
            i = 0;
        }
        int a = acj.mo305a();
        int i2 = i;
        while (i2 < a) {
            acm findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.f201a.hasFocusable()) {
                return findViewHolderForAdapterPosition2.f201a;
            } else {
                i2++;
            }
        }
        int min = Math.min(a, i) - 1;
        while (min >= 0 && (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) != null) {
            if (findViewHolderForAdapterPosition.f201a.hasFocusable()) {
                return findViewHolderForAdapterPosition.f201a;
            }
            min--;
        }
        return null;
    }

    public static acm getChildViewHolderInt(View view) {
        if (view != null) {
            return ((abv) view.getLayoutParams()).f129c;
        }
        return null;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        abv abv = (abv) view.getLayoutParams();
        Rect rect2 = abv.f130d;
        rect.set((view.getLeft() - rect2.left) - abv.leftMargin, (view.getTop() - rect2.top) - abv.topMargin, view.getRight() + rect2.right + abv.rightMargin, view.getBottom() + rect2.bottom + abv.bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private C1266pe getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C1266pe(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, acm acm, acm acm2) {
        int a = this.mChildHelper.mo16581a();
        for (int i = 0; i < a; i++) {
            acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16588b(i));
            if (childViewHolderInt != acm && getChangedHolderKey(childViewHolderInt) == j) {
                abh abh = this.mAdapter;
                if (abh == null || !abh.f103b) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + acm + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + acm + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + acm2 + " cannot be found but it is necessary for " + acm + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int a = this.mChildHelper.mo16581a();
        for (int i = 0; i < a; i++) {
            acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16588b(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo320aO() && childViewHolderInt.mo341u()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        if (C1280ps.m19903b(this) == 0) {
            C1280ps.m19877L(this);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C1524yt(new abf(this));
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        int i3;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        if (this.mLayout.mo248s() == 1) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if ((this.mTempRect.left < this.mTempRect2.left || this.mTempRect.right <= this.mTempRect2.left) && this.mTempRect.right < this.mTempRect2.right) {
            i3 = 1;
        } else {
            i3 = ((this.mTempRect.right > this.mTempRect2.right || this.mTempRect.left >= this.mTempRect2.right) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        if ((this.mTempRect.top < this.mTempRect2.top || this.mTempRect.bottom <= this.mTempRect2.top) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c = 1;
        } else if ((this.mTempRect.bottom <= this.mTempRect2.bottom && this.mTempRect.top < this.mTempRect2.bottom) || this.mTempRect.top <= this.mTempRect2.top) {
            c = 0;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    return i3 < 0;
                }
                if (i == 33) {
                    return c < 0;
                }
                if (i == 66) {
                    return i3 > 0;
                }
                if (i == 130) {
                    return c > 0;
                }
                throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
            } else if (c <= 0 && (c != 0 || i3 * i2 < 0)) {
                return false;
            } else {
                return true;
            }
        } else if (c >= 0 && (c != 0 || i3 * i2 > 0)) {
            return false;
        } else {
            return true;
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo32b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057 A[ADDED_TO_REGION] */
    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.mo16482a();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo35d();
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.mo16488b();
        } else {
            this.mAdapterHelper.mo16491e();
        }
        boolean z3 = true;
        if (this.mItemsAddedOrRemoved || this.mItemsChanged) {
            z = true;
        } else {
            z = false;
        }
        acj acj = this.mState;
        if (this.mFirstLayoutComplete && this.mItemAnimator != null) {
            boolean z4 = this.mDataSetHasChangedAfterLayout;
            if (!z4 && !z) {
                boolean z5 = this.mLayout.f124v;
                z2 = false;
                acj.f186j = z2;
                if (!z2) {
                }
                acj.f187k = z3;
            } else if (!z4 || this.mAdapter.f103b) {
                z2 = true;
                acj.f186j = z2;
                if (!z2) {
                    z3 = false;
                } else if (!z || this.mDataSetHasChangedAfterLayout || !predictiveItemAnimationsEnabled()) {
                    z3 = false;
                }
                acj.f187k = z3;
            }
        }
        z2 = false;
        acj.f186j = z2;
        if (!z2) {
        }
        acj.f187k = z3;
    }

    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z = true;
        if (f2 < 0.0f) {
            ensureLeftGlow();
            C1322rg.m20066a(this.mLeftGlow, (-f2) / ((float) getWidth()), 1.0f - (f3 / ((float) getHeight())));
        } else if (f2 > 0.0f) {
            ensureRightGlow();
            C1322rg.m20066a(this.mRightGlow, f2 / ((float) getWidth()), f3 / ((float) getHeight()));
        } else {
            z = false;
        }
        if (f4 < 0.0f) {
            ensureTopGlow();
            C1322rg.m20066a(this.mTopGlow, (-f4) / ((float) getHeight()), f / ((float) getWidth()));
        } else if (f4 > 0.0f) {
            ensureBottomGlow();
            C1322rg.m20066a(this.mBottomGlow, f4 / ((float) getHeight()), 1.0f - (f / ((float) getWidth())));
        } else if (!z && f2 == 0.0f && f4 == 0.0f) {
            return;
        }
        C1280ps.m19915e(this);
    }

    private void recoverFocusFromState() {
        acm acm;
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.mo16590c(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.mo16581a() == 0) {
                        requestFocus();
                        return;
                    }
                }
                long j = this.mState.f189m;
                View view = null;
                if (j == -1 || !this.mAdapter.f103b) {
                    acm = null;
                } else {
                    acm = findViewHolderForItemId(j);
                }
                if (acm != null && !this.mChildHelper.mo16590c(acm.f201a) && acm.f201a.hasFocusable()) {
                    view = acm.f201a;
                } else if (this.mChildHelper.mo16581a() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i = this.mState.f190n;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C1280ps.m19915e(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof abv) {
            abv abv = (abv) layoutParams;
            if (!abv.f131e) {
                Rect rect = abv.f130d;
                this.mTempRect.left -= rect.left;
                this.mTempRect.right += rect.right;
                this.mTempRect.top -= rect.top;
                this.mTempRect.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        abu abu = this.mLayout;
        Rect rect2 = this.mTempRect;
        boolean z2 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        abu.mo232a(this, view, rect2, z2, z);
    }

    private void resetFocusInfo() {
        acj acj = this.mState;
        acj.f189m = -1;
        acj.f188l = -1;
        acj.f190n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View view;
        long j;
        acm acm = null;
        if (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view != null) {
            acm = findContainingViewHolder(view);
        }
        if (acm != null) {
            acj acj = this.mState;
            if (this.mAdapter.f103b) {
                j = acm.f205e;
            } else {
                j = -1;
            }
            acj.f189m = j;
            acj.f188l = !this.mDataSetHasChangedAfterLayout ? acm.mo333n() ? acm.f204d : acm.mo324e() : -1;
            this.mState.f190n = getDeepestFocusedViewWithId(acm.f201a);
            return;
        }
        resetFocusInfo();
    }

    private void setAdapterInternal(abh abh, boolean z, boolean z2) {
        abh abh2 = this.mAdapter;
        if (abh2 != null) {
            abh2.mo174b(this.mObserver);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.mo16482a();
        abh abh3 = this.mAdapter;
        this.mAdapter = abh;
        if (abh != null) {
            abh.mo166a(this.mObserver);
            abh.mo179d(this);
        }
        abu abu = this.mLayout;
        if (abu != null) {
            abu.mo221D();
        }
        acc acc = this.mRecycler;
        abh abh4 = this.mAdapter;
        acc.mo278a();
        acb d = acc.mo289d();
        if (abh3 != null) {
            d.mo275b();
        }
        if (!z && d.f143b == 0) {
            for (int i = 0; i < d.f142a.size(); i++) {
                ((aca) d.f142a.valueAt(i)).f138a.clear();
            }
        }
        if (abh4 != null) {
            d.mo274a();
        }
        this.mState.f182f = true;
    }

    private void stopScrollersInternal() {
        aci aci;
        this.mViewFlinger.mo311b();
        abu abu = this.mLayout;
        if (abu != null && (aci = abu.f123u) != null) {
            aci.mo300a();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C1280ps.m19915e(this);
        }
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    public void addItemDecoration(abr abr) {
        addItemDecoration(abr, -1);
    }

    public void addOnChildAttachStateChangeListener(abw abw) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(abw);
    }

    public void addOnItemTouchListener(aby aby) {
        this.mOnItemTouchListeners.add(aby);
    }

    public void addOnScrollListener(abz abz) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abz);
    }

    public void animateAppearance(acm acm, abo abo, abo abo2) {
        acm.mo317a(false);
        if (this.mItemAnimator.mo203b(acm, abo, abo2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(acm acm, abo abo, abo abo2) {
        addAnimatingView(acm);
        acm.mo317a(false);
        if (this.mItemAnimator.mo199a(acm, abo, abo2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (this.mDispatchScrollCounter > 0) {
                Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
            }
        } else if (str == null) {
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        } else {
            throw new IllegalStateException(str);
        }
    }

    public boolean canReuseUpdatedViewHolder(acm acm) {
        abp abp = this.mItemAnimator;
        return abp == null || abp.mo201a(acm, acm.mo337r());
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof abv) && this.mLayout.mo29a((abv) layoutParams);
    }

    public void clearOldPositions() {
        int b = this.mChildHelper.mo16586b();
        for (int i = 0; i < b; i++) {
            acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16589c(i));
            if (!childViewHolderInt.mo320aO()) {
                childViewHolderInt.mo319aN();
            }
        }
        acc acc = this.mRecycler;
        int size = acc.f146c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((acm) acc.f146c.get(i2)).mo319aN();
        }
        int size2 = acc.f144a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((acm) acc.f144a.get(i3)).mo319aN();
        }
        ArrayList arrayList = acc.f145b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((acm) acc.f145b.get(i4)).mo319aN();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        abu abu = this.mLayout;
        if (abu == null || !abu.mo77j()) {
            return 0;
        }
        return this.mLayout.mo68d(this.mState);
    }

    public int computeHorizontalScrollOffset() {
        abu abu = this.mLayout;
        if (abu == null || !abu.mo77j()) {
            return 0;
        }
        return this.mLayout.mo60b(this.mState);
    }

    public int computeHorizontalScrollRange() {
        abu abu = this.mLayout;
        if (abu == null || !abu.mo77j()) {
            return 0;
        }
        return this.mLayout.mo73f(this.mState);
    }

    public int computeVerticalScrollExtent() {
        abu abu = this.mLayout;
        if (abu == null || !abu.mo78k()) {
            return 0;
        }
        return this.mLayout.mo70e(this.mState);
    }

    public int computeVerticalScrollOffset() {
        abu abu = this.mLayout;
        if (abu == null || !abu.mo78k()) {
            return 0;
        }
        return this.mLayout.mo65c(this.mState);
    }

    public int computeVerticalScrollRange() {
        abu abu = this.mLayout;
        if (abu == null || !abu.mo78k()) {
            return 0;
        }
        return this.mLayout.mo74g(this.mState);
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C1280ps.m19915e(this);
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C1192ml.m19643a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C1192ml.m19642a();
        } else if (!this.mAdapterHelper.mo16490d()) {
        } else {
            if (this.mAdapterHelper.mo16486a(4) && !this.mAdapterHelper.mo16486a(11)) {
                C1192ml.m19643a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.mo16488b();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.mo16489c();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                C1192ml.m19642a();
            } else if (this.mAdapterHelper.mo16490d()) {
                C1192ml.m19643a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                C1192ml.m19642a();
            }
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(abu.m276a(i, getPaddingLeft() + getPaddingRight(), C1280ps.m19929k(this)), abu.m276a(i2, getPaddingTop() + getPaddingBottom(), C1280ps.m19930l(this)));
    }

    public void dispatchChildAttached(View view) {
        acm childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        abh abh = this.mAdapter;
        if (!(abh == null || childViewHolderInt == null)) {
            abh.mo175b(childViewHolderInt);
        }
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((abw) this.mOnChildAttachStateListeners.get(size)).mo259a();
            }
        }
    }

    public void dispatchChildDetached(View view) {
        getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((abw) this.mOnChildAttachStateListeners.get(size)).mo260b();
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout != null) {
            acj acj = this.mState;
            acj.f185i = false;
            if (acj.f180d == 1) {
                dispatchLayoutStep1();
                this.mLayout.mo235b(this);
                dispatchLayoutStep2();
            } else {
                C1491xn xnVar = this.mAdapterHelper;
                if ((xnVar.f27592b.isEmpty() || xnVar.f27591a.isEmpty()) && this.mLayout.f115D == getWidth() && this.mLayout.f116E == getHeight()) {
                    this.mLayout.mo235b(this);
                } else {
                    this.mLayout.mo235b(this);
                    dispatchLayoutStep2();
                }
            }
            dispatchLayoutStep3();
        } else {
            Log.e(TAG, "No layout manager attached; skipping layout");
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo15679a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo15678a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo15684a(i, i2, iArr, iArr2);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo15683a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void dispatchOnScrollStateChanged(int i) {
        onScrollStateChanged(i);
        abz abz = this.mScrollListener;
        if (abz != null) {
            abz.mo270a(this, i);
        }
        List list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((abz) this.mScrollListeners.get(size)).mo270a(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        abz abz = this.mScrollListener;
        if (abz != null) {
            abz.mo271a(this, i, i2);
        }
        List list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((abz) this.mScrollListeners.get(size)).mo271a(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            acm acm = (acm) this.mPendingAccessibilityImportanceChange.get(size);
            if (acm.f201a.getParent() == this && !acm.mo320aO() && (i = acm.f216p) != -1) {
                C1280ps.m19906b(acm.f201a, i);
                acm.f216p = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((abr) this.mItemDecorations.get(i2)).mo212b(canvas, this);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i = getPaddingBottom();
            } else {
                i = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z = false;
            } else {
                z = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || (this.mItemAnimator != null && this.mItemDecorations.size() > 0 && this.mItemAnimator.mo202b())) {
            C1280ps.m19915e(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            EdgeEffect a = abl.m243a(this);
            this.mBottomGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            EdgeEffect a = abl.m243a(this);
            this.mLeftGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            EdgeEffect a = abl.m243a(this);
            this.mRightGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            EdgeEffect a = abl.m243a(this);
            this.mTopGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void fillRemainingScrollValues(acj acj) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f195c;
            acj.f191o = overScroller.getFinalX() - overScroller.getCurrX();
            acj.f192p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        acj.f191o = 0;
        acj.f192p = 0;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int a = this.mChildHelper.mo16581a() - 1; a >= 0; a--) {
            View b = this.mChildHelper.mo16588b(a);
            float translationX = b.getTranslationX();
            float translationY = b.getTranslationY();
            if (f >= ((float) b.getLeft()) + translationX && f <= ((float) b.getRight()) + translationX && f2 >= ((float) b.getTop()) + translationY && f2 <= ((float) b.getBottom()) + translationY) {
                return b;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public acm findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView != null) {
            return getChildViewHolder(findContainingItemView);
        }
        return null;
    }

    public acm findViewHolderForAdapterPosition(int i) {
        acm acm = null;
        if (!this.mDataSetHasChangedAfterLayout) {
            int b = this.mChildHelper.mo16586b();
            for (int i2 = 0; i2 < b; i2++) {
                acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16589c(i2));
                if (childViewHolderInt != null && !childViewHolderInt.mo333n() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                    if (!this.mChildHelper.mo16590c(childViewHolderInt.f201a)) {
                        return childViewHolderInt;
                    }
                    acm = childViewHolderInt;
                }
            }
        }
        return acm;
    }

    public acm findViewHolderForItemId(long j) {
        abh abh = this.mAdapter;
        acm acm = null;
        if (abh != null && abh.f103b) {
            int b = this.mChildHelper.mo16586b();
            for (int i = 0; i < b; i++) {
                acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16589c(i));
                if (childViewHolderInt != null && !childViewHolderInt.mo333n() && childViewHolderInt.f205e == j) {
                    if (!this.mChildHelper.mo16590c(childViewHolderInt.f201a)) {
                        return childViewHolderInt;
                    }
                    acm = childViewHolderInt;
                }
            }
        }
        return acm;
    }

    public acm findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public acm findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e6  */
    public boolean fling(int i, int i2) {
        abu layoutManager;
        int minFlingVelocity;
        int i3;
        View a;
        int i4;
        PointF d;
        int i5;
        int i6;
        abu abu = this.mLayout;
        if (abu == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.mLayoutSuppressed) {
            boolean j = abu.mo77j();
            boolean k = this.mLayout.mo78k();
            int i7 = (!j || Math.abs(i) < this.mMinFlingVelocity) ? 0 : i;
            int i8 = (!k || Math.abs(i2) < this.mMinFlingVelocity) ? 0 : i2;
            if (i7 == 0 && i8 == 0) {
                return false;
            }
            float f = (float) i7;
            float f2 = (float) i8;
            if (!dispatchNestedPreFling(f, f2)) {
                dispatchNestedFling(f, f2, true);
                abx abx = this.mOnFlingListener;
                if (!(abx == null || (layoutManager = abx.f133a.getLayoutManager()) == null || abx.f133a.getAdapter() == null || ((Math.abs(i8) <= (minFlingVelocity = abx.f133a.getMinFlingVelocity()) && Math.abs(i7) <= minFlingVelocity) || !(layoutManager instanceof ach)))) {
                    adi adi = new adi(abx, abx.f133a.getContext());
                    int A = layoutManager.mo218A();
                    if (!(A == 0 || (a = abx.mo262a(layoutManager)) == null || (i4 = abu.m288i(a)) == -1 || (d = ((ach) layoutManager).mo69d(A - 1)) == null)) {
                        if (layoutManager.mo77j()) {
                            i5 = abx.mo261a(layoutManager, abx.mo266c(layoutManager), i7, 0);
                            if (d.x < 0.0f) {
                                i5 = -i5;
                            }
                        } else {
                            i5 = 0;
                        }
                        if (layoutManager.mo78k()) {
                            i6 = abx.mo261a(layoutManager, abx.mo265b(layoutManager), 0, i8);
                            if (d.y < 0.0f) {
                                i6 = -i6;
                            }
                        } else {
                            i6 = 0;
                        }
                        if (layoutManager.mo78k()) {
                            i5 = i6;
                        }
                        if (i5 != 0) {
                            int i9 = i4 + i5;
                            if (i9 < 0) {
                                i9 = 0;
                            }
                            if (i9 < A) {
                                i3 = i9;
                            }
                            if (i3 != -1) {
                                adi.f161a = i3;
                                layoutManager.mo226a(adi);
                                return true;
                            }
                        }
                    }
                    i3 = -1;
                    if (i3 != -1) {
                    }
                }
                if (k) {
                    j |= true;
                }
                startNestedScroll(j ? 1 : 0, 1);
                int i10 = this.mMaxFlingVelocity;
                int max = Math.max(-i10, Math.min(i7, i10));
                int i11 = this.mMaxFlingVelocity;
                int max2 = Math.max(-i11, Math.min(i8, i11));
                C0004acl acl = this.mViewFlinger;
                acl.f197e.setScrollState(2);
                acl.f194b = 0;
                acl.f193a = 0;
                Interpolator interpolator = acl.f196d;
                Interpolator interpolator2 = sQuinticInterpolator;
                if (interpolator != interpolator2) {
                    acl.f196d = interpolator2;
                    acl.f195c = new OverScroller(acl.f197e.getContext(), sQuinticInterpolator);
                }
                acl.f195c.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                acl.mo309a();
                return true;
            }
        }
        return false;
    }

    public View focusSearch(View view, int i) {
        boolean z;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        boolean z5 = true;
        if (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) {
            z = false;
        } else {
            z = true;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (z && (i == 2 || i == 1)) {
            if (this.mLayout.mo78k()) {
                if (i == 2) {
                    i3 = 130;
                } else {
                    i3 = 33;
                }
                if (instance.findNextFocus(this, view, i3) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.mo77j()) {
                if (this.mLayout.mo248s() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!(z3 ^ z4)) {
                    i2 = 17;
                } else {
                    i2 = 66;
                }
                if (instance.findNextFocus(this, view, i2) != null) {
                    z5 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                    z2 = z5;
                } else {
                    z2 = z5;
                }
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo21a(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        } else {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus == null && z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.mo21a(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return !isPreferredNextFocus(view, view2, i) ? super.focusSearch(view, i) : view2;
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(view2, null);
        return view;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        abu abu = this.mLayout;
        if (abu != null) {
            return abu.mo17a();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        abu abu = this.mLayout;
        if (abu != null) {
            return abu.mo18a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    public abh getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(acm acm) {
        if (acm.mo318a(524) || !acm.mo332m()) {
            return -1;
        }
        C1491xn xnVar = this.mAdapterHelper;
        int i = acm.f203c;
        int size = xnVar.f27591a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1490xm xmVar = (C1490xm) xnVar.f27591a.get(i2);
            int i3 = xmVar.f27587a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = xmVar.f27588b;
                    if (i4 <= i) {
                        int i5 = xmVar.f27590d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = xmVar.f27588b;
                    if (i6 == i) {
                        i = xmVar.f27590d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (xmVar.f27590d <= i) {
                            i++;
                        }
                    }
                }
            } else if (xmVar.f27588b <= i) {
                i += xmVar.f27590d;
            }
        }
        return i;
    }

    public int getBaseline() {
        if (this.mLayout != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(acm acm) {
        return !this.mAdapter.f103b ? (long) acm.f203c : acm.f205e;
    }

    public int getChildAdapterPosition(View view) {
        acm childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo324e();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        abk abk = this.mChildDrawingOrderCallback;
        if (abk == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return abk.mo194a();
    }

    public long getChildItemId(View view) {
        acm childViewHolderInt;
        abh abh = this.mAdapter;
        if (abh == null || !abh.f103b || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.f205e;
    }

    public int getChildLayoutPosition(View view) {
        acm childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo322c();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public acm getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public aco getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public abl getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public abp getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        abv abv = (abv) view.getLayoutParams();
        if (!abv.f131e) {
            return abv.f130d;
        }
        if (this.mState.f183g && (abv.mo257b() || abv.f129c.mo330k())) {
            return abv.f130d;
        }
        Rect rect = abv.f130d;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            ((abr) this.mItemDecorations.get(i)).mo211a(this.mTempRect, view, this, this.mState);
            rect.left += this.mTempRect.left;
            rect.top += this.mTempRect.top;
            rect.right += this.mTempRect.right;
            rect.bottom += this.mTempRect.bottom;
        }
        abv.f131e = false;
        return rect;
    }

    public abr getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (abr) this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public abu getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public abx getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public acb getRecycledViewPool() {
        return this.mRecycler.mo289d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo15677a();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mo16490d();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C1491xn(new abg(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new C1548zq(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0126R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C0126R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0126R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            abu abu = this.mLayout;
            if (abu != null) {
                abu.mo59a("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        abp abp = this.mItemAnimator;
        return abp != null && abp.mo202b();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f26827a;
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.mo71e(i);
            awakenScrollBars();
        }
    }

    public void markItemDecorInsetsDirty() {
        int b = this.mChildHelper.mo16586b();
        for (int i = 0; i < b; i++) {
            ((abv) this.mChildHelper.mo16589c(i).getLayoutParams()).f131e = true;
        }
        acc acc = this.mRecycler;
        int size = acc.f146c.size();
        for (int i2 = 0; i2 < size; i2++) {
            abv abv = (abv) ((acm) acc.f146c.get(i2)).f201a.getLayoutParams();
            if (abv != null) {
                abv.f131e = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int b = this.mChildHelper.mo16586b();
        for (int i = 0; i < b; i++) {
            acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16589c(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo320aO()) {
                childViewHolderInt.mo321b(6);
            }
        }
        markItemDecorInsetsDirty();
        acc acc = this.mRecycler;
        int size = acc.f146c.size();
        for (int i2 = 0; i2 < size; i2++) {
            acm acm = (acm) acc.f146c.get(i2);
            if (acm != null) {
                acm.mo321b(6);
                acm.mo316a((Object) null);
            }
        }
        abh abh = acc.f152i.mAdapter;
        if (abh == null || !abh.f103b) {
            acc.mo286c();
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int a = this.mChildHelper.mo16581a();
        for (int i2 = 0; i2 < a; i2++) {
            this.mChildHelper.mo16588b(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int a = this.mChildHelper.mo16581a();
        for (int i2 = 0; i2 < a; i2++) {
            this.mChildHelper.mo16588b(i2).offsetTopAndBottom(i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acm.a(int, boolean):void
     arg types: [int, int]
     candidates:
      acm.a(int, int):void
      acm.a(acc, boolean):void
      acm.a(int, boolean):void */
    public void offsetPositionRecordsForInsert(int i, int i2) {
        int b = this.mChildHelper.mo16586b();
        for (int i3 = 0; i3 < b; i3++) {
            acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16589c(i3));
            if (childViewHolderInt != null && !childViewHolderInt.mo320aO() && childViewHolderInt.f203c >= i) {
                childViewHolderInt.mo314a(i2, false);
                this.mState.f182f = true;
            }
        }
        acc acc = this.mRecycler;
        int size = acc.f146c.size();
        for (int i4 = 0; i4 < size; i4++) {
            acm acm = (acm) acc.f146c.get(i4);
            if (acm != null && acm.f203c >= i) {
                acm.mo314a(i2, true);
            }
        }
        requestLayout();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acm.a(int, boolean):void
     arg types: [int, int]
     candidates:
      acm.a(int, int):void
      acm.a(acc, boolean):void
      acm.a(int, boolean):void */
    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int b = this.mChildHelper.mo16586b();
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        if (i < i2) {
            i4 = i2;
        } else {
            i4 = i;
        }
        if (i < i2) {
            i5 = i;
        } else {
            i5 = i2;
        }
        for (int i8 = 0; i8 < b; i8++) {
            acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16589c(i8));
            if (childViewHolderInt != null && (i7 = childViewHolderInt.f203c) >= i5 && i7 <= i4) {
                if (i7 == i) {
                    childViewHolderInt.mo314a(i2 - i, false);
                } else {
                    childViewHolderInt.mo314a(i3, false);
                }
                this.mState.f182f = true;
            }
        }
        acc acc = this.mRecycler;
        int size = acc.f146c.size();
        for (int i9 = 0; i9 < size; i9++) {
            acm acm = (acm) acc.f146c.get(i9);
            if (acm != null && (i6 = acm.f203c) >= i5 && i6 <= i4) {
                if (i6 == i) {
                    acm.mo314a(i2 - i, false);
                } else {
                    acm.mo314a(i3, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.mChildHelper.mo16586b();
        for (int i4 = 0; i4 < b; i4++) {
            acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16589c(i4));
            if (childViewHolderInt != null && !childViewHolderInt.mo320aO()) {
                int i5 = childViewHolderInt.f203c;
                if (i5 >= i3) {
                    childViewHolderInt.mo314a(-i2, z);
                    this.mState.f182f = true;
                } else if (i5 >= i) {
                    childViewHolderInt.mo321b(8);
                    childViewHolderInt.mo314a(-i2, z);
                    childViewHolderInt.f203c = i - 1;
                    this.mState.f182f = true;
                }
            }
        }
        acc acc = this.mRecycler;
        for (int size = acc.f146c.size() - 1; size >= 0; size--) {
            acm acm = (acm) acc.f146c.get(size);
            if (acm != null) {
                int i6 = acm.f203c;
                if (i6 >= i3) {
                    acm.mo314a(-i2, z);
                } else if (i6 >= i) {
                    acm.mo321b(8);
                    acc.mo287c(size);
                }
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            C1555zx zxVar = (C1555zx) C1555zx.f27811a.get();
            this.mGapWorker = zxVar;
            if (zxVar == null) {
                this.mGapWorker = new C1555zx();
                Display H = C1280ps.m19873H(this);
                float f = 60.0f;
                if (!isInEditMode() && H != null) {
                    float refreshRate = H.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                this.mGapWorker.f27815d = (long) (1.0E9f / f);
                C1555zx.f27811a.set(this.mGapWorker);
            }
            this.mGapWorker.f27813b.add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1555zx zxVar;
        super.onDetachedFromWindow();
        abp abp = this.mItemAnimator;
        if (abp != null) {
            abp.mo205d();
        }
        stopScroll();
        this.mIsAttached = false;
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        aeh.m610b();
        if (ALLOW_THREAD_GAP_WORK && (zxVar = this.mGapWorker) != null) {
            zxVar.f27813b.remove(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            ((abr) this.mItemDecorations.get(i)).mo210a(canvas, this);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.mLayout.mo78k()) {
                    f2 = -motionEvent.getAxisValue(9);
                } else {
                    f2 = 0.0f;
                }
                f = this.mLayout.mo77j() ? motionEvent.getAxisValue(10) : 0.0f;
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    f = motionEvent.getAxisValue(26);
                    if (this.mLayout.mo78k()) {
                        f2 = -f;
                        f = 0.0f;
                    } else if (this.mLayout.mo77j()) {
                        f2 = 0.0f;
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
            }
            if (!(f2 == 0.0f && f == 0.0f)) {
                scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c8, code lost:
        if (r0 != false) goto L_0x00ca;
     */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (!findInterceptingOnItemTouchListener(motionEvent)) {
            abu abu = this.mLayout;
            if (abu == null) {
                return false;
            }
            boolean j = abu.mo77j();
            boolean k = this.mLayout.mo78k();
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                if (this.mIgnoreMotionEventTillDown) {
                    this.mIgnoreMotionEventTillDown = false;
                }
                this.mScrollPointerId = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.mLastTouchX = x;
                this.mInitialTouchX = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.mLastTouchY = y;
                this.mInitialTouchY = y;
                if (this.mScrollState == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    stopNestedScroll(1);
                }
                int[] iArr = this.mNestedOffsets;
                iArr[1] = 0;
                iArr[0] = 0;
                if (k) {
                    j |= true;
                }
                startNestedScroll(j ? 1 : 0, 0);
            } else if (actionMasked == 1) {
                this.mVelocityTracker.clear();
                stopNestedScroll(0);
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (findPointerIndex < 0) {
                    Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                if (this.mScrollState != 1) {
                    int i = x2 - this.mInitialTouchX;
                    int i2 = y2 - this.mInitialTouchY;
                    if (!j || Math.abs(i) <= this.mTouchSlop) {
                        z = false;
                    } else {
                        this.mLastTouchX = x2;
                        z = true;
                    }
                    if (k && Math.abs(i2) > this.mTouchSlop) {
                        this.mLastTouchY = y2;
                    }
                    setScrollState(1);
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
            return this.mScrollState == 1;
        }
        cancelScroll();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1192ml.m19643a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C1192ml.m19642a();
        this.mFirstLayoutComplete = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        abu abu = this.mLayout;
        if (abu == null) {
            defaultOnMeasure(i, i2);
        } else if (abu.mo75h()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.mo225a(this.mRecycler, i, i2);
            if ((mode != 1073741824 || mode2 != 1073741824) && this.mAdapter != null) {
                if (this.mState.f180d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.mo240d(i, i2);
                this.mState.f185i = true;
                dispatchLayoutStep2();
                this.mLayout.mo241e(i, i2);
                if (this.mLayout.mo82o()) {
                    this.mLayout.mo240d(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
                    this.mState.f185i = true;
                    dispatchLayoutStep2();
                    this.mLayout.mo241e(i, i2);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.mo225a(this.mRecycler, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                acj acj = this.mState;
                if (!acj.f187k) {
                    this.mAdapterHelper.mo16491e();
                    this.mState.f183g = false;
                } else {
                    acj.f183g = true;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f187k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            abh abh = this.mAdapter;
            if (abh != null) {
                this.mState.f181e = abh.mo161a();
            } else {
                this.mState.f181e = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.mo225a(this.mRecycler, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f183g = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (!isComputingLayout()) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.f1048b);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 == null) {
            abu abu = this.mLayout;
            parcelable = abu != null ? abu.mo76i() : null;
        } else {
            parcelable = savedState2.f1227c;
        }
        savedState.f1227c = parcelable;
        return savedState;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        MotionEvent motionEvent2 = motionEvent;
        int i5 = 0;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (!dispatchToOnItemTouchListeners(motionEvent)) {
            abu abu = this.mLayout;
            if (abu == null) {
                return false;
            }
            boolean j = abu.mo77j();
            boolean k = this.mLayout.mo78k();
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.mNestedOffsets;
                iArr[1] = 0;
                iArr[0] = 0;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int[] iArr2 = this.mNestedOffsets;
            obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
            if (actionMasked == 0) {
                this.mScrollPointerId = motionEvent2.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.mLastTouchX = x;
                this.mInitialTouchX = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.mLastTouchY = y;
                this.mInitialTouchY = y;
                if (k) {
                    j |= true;
                }
                startNestedScroll(j ? 1 : 0, 0);
            } else if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(obtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, (float) this.mMaxFlingVelocity);
                if (j) {
                    f = -this.mVelocityTracker.getXVelocity(this.mScrollPointerId);
                } else {
                    f = 0.0f;
                }
                if (k) {
                    f2 = -this.mVelocityTracker.getYVelocity(this.mScrollPointerId);
                } else {
                    f2 = 0.0f;
                }
                if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                    setScrollState(0);
                }
                resetScroll();
                obtain.recycle();
                return true;
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.mScrollPointerId);
                if (findPointerIndex < 0) {
                    Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent2.getX(findPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent2.getY(findPointerIndex) + 0.5f);
                int i6 = this.mLastTouchX - x2;
                int i7 = this.mLastTouchY - y2;
                if (this.mScrollState != 1) {
                    if (!j) {
                        z = false;
                    } else {
                        if (i6 <= 0) {
                            i6 = Math.min(0, i6 + this.mTouchSlop);
                        } else {
                            i6 = Math.max(0, i6 - this.mTouchSlop);
                        }
                        z = i6 != 0;
                    }
                    if (k) {
                        if (i7 <= 0) {
                            i7 = Math.min(0, i7 + this.mTouchSlop);
                        } else {
                            i7 = Math.max(0, i7 - this.mTouchSlop);
                        }
                        if (i7 != 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        setScrollState(1);
                    }
                }
                int i8 = i6;
                int i9 = i7;
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    if (!j) {
                        i = 0;
                    } else {
                        i = i8;
                    }
                    if (!k) {
                        i2 = 0;
                    } else {
                        i2 = i9;
                    }
                    if (dispatchNestedPreScroll(i, i2, iArr3, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        i8 -= iArr4[0];
                        int i10 = i9 - iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i11 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i11 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                        i3 = i10;
                    } else {
                        i3 = i9;
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x2 - iArr7[0];
                    this.mLastTouchY = y2 - iArr7[1];
                    if (!j) {
                        i4 = 0;
                    } else {
                        i4 = i8;
                    }
                    if (k) {
                        i5 = i3;
                    }
                    if (scrollByInternal(i4, i5, motionEvent2)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    C1555zx zxVar = this.mGapWorker;
                    if (!(zxVar == null || (i8 == 0 && i3 == 0))) {
                        zxVar.mo16647a(this, i8, i3);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent2.getPointerId(actionIndex);
                int x3 = (int) (motionEvent2.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent2.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return true;
        }
        cancelScroll();
        return true;
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C1280ps.m19891a(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(acm acm, abo abo) {
        acm.mo313a(0, 8192);
        if (this.mState.f184h && acm.mo341u() && !acm.mo333n() && !acm.mo320aO()) {
            this.mViewInfoStore.mo529a(getChangedHolderKey(acm), acm);
        }
        this.mViewInfoStore.mo530a(acm, abo);
    }

    public void removeAndRecycleViews() {
        abp abp = this.mItemAnimator;
        if (abp != null) {
            abp.mo205d();
        }
        abu abu = this.mLayout;
        if (abu != null) {
            abu.mo239c(this.mRecycler);
            this.mLayout.mo234b(this.mRecycler);
        }
        this.mRecycler.mo278a();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        C1524yt ytVar = this.mChildHelper;
        int a = ytVar.f27684c.mo147a(view);
        boolean z = true;
        if (a == -1) {
            ytVar.mo16592d(view);
        } else if (ytVar.f27682a.mo16577c(a)) {
            ytVar.f27682a.mo16578d(a);
            ytVar.mo16592d(view);
            ytVar.f27684c.mo148a(a);
        } else {
            z = false;
        }
        if (z) {
            acm childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.mo284b(childViewHolderInt);
            this.mRecycler.mo279a(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    public void removeDetachedView(View view, boolean z) {
        acm childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.mo334o()) {
                childViewHolderInt.mo329j();
            } else if (!childViewHolderInt.mo320aO()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(abr abr) {
        boolean z;
        abu abu = this.mLayout;
        if (abu != null) {
            abu.mo59a("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abr);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeOnChildAttachStateChangeListener(abw abw) {
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(abw);
        }
    }

    public void removeOnItemTouchListener(aby aby) {
        this.mOnItemTouchListeners.remove(aby);
        if (this.mInterceptingOnItemTouchListener == aby) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(abz abz) {
        List list = this.mScrollListeners;
        if (list != null) {
            list.remove(abz);
        }
    }

    public void repositionShadowingViews() {
        acm acm;
        int a = this.mChildHelper.mo16581a();
        for (int i = 0; i < a; i++) {
            View b = this.mChildHelper.mo16588b(i);
            acm childViewHolder = getChildViewHolder(b);
            if (!(childViewHolder == null || (acm = childViewHolder.f209i) == null)) {
                View view = acm.f201a;
                int left = b.getLeft();
                int top = b.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        aci aci = this.mLayout.f123u;
        if ((aci == null || !aci.f165e) && !isComputingLayout() && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abu.a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean
     arg types: [android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, int]
     candidates:
      abu.a(int, int, int, int, boolean):int
      abu.a(android.view.View, int, int, int, int):void
      abu.a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean */
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.mo232a(this, view, rect, z, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            ((aby) this.mOnItemTouchListeners.get(i)).mo268a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    public void saveOldPositions() {
        int b = this.mChildHelper.mo16586b();
        for (int i = 0; i < b; i++) {
            acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16589c(i));
            if (!childViewHolderInt.mo320aO() && childViewHolderInt.f204d == -1) {
                childViewHolderInt.f204d = childViewHolderInt.f203c;
            }
        }
    }

    public void scrollBy(int i, int i2) {
        abu abu = this.mLayout;
        if (abu == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean j = abu.mo77j();
            boolean k = this.mLayout.mo78k();
            if (j || k) {
                if (!j) {
                    i = 0;
                }
                if (!k) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, null);
            }
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i7, i8, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i6 = i10;
            i5 = i9;
            i4 = i7 - i9;
            i3 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i6, i4, i3, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = iArr4[0];
        int i12 = i4 - i11;
        int i13 = iArr4[1];
        int i14 = i3 - i13;
        boolean z = i11 != 0 ? true : i13 != 0;
        int i15 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i16 = iArr5[0];
        this.mLastTouchX = i15 - i16;
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i16;
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (!(motionEvent == null || (motionEvent.getSource() & FragmentTransaction.TRANSIT_FRAGMENT_CLOSE) == 8194)) {
                pullGlows(motionEvent.getX(), (float) i12, motionEvent.getY(), (float) i14);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (!(i5 == 0 && i6 == 0)) {
            dispatchOnScrolled(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i6 == 0) ? false : true;
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C1192ml.m19643a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i != 0) {
            i3 = this.mLayout.mo15a(i, this.mRecycler, this.mState);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.mLayout.mo30b(i2, this.mRecycler, this.mState);
        } else {
            i4 = 0;
        }
        C1192ml.m19642a();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            abu abu = this.mLayout;
            if (abu == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            abu.mo71e(i);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(aco aco) {
        this.mAccessibilityDelegate = aco;
        C1280ps.m19894a(this, aco);
    }

    public void setAdapter(abh abh) {
        setLayoutFrozen(false);
        setAdapterInternal(abh, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(abk abk) {
        if (abk != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = abk;
            setChildrenDrawingOrderEnabled(abk != null);
        }
    }

    public boolean setChildImportantForAccessibilityInternal(acm acm, int i) {
        if (isComputingLayout()) {
            acm.f216p = i;
            this.mPendingAccessibilityImportanceChange.add(acm);
            return false;
        }
        C1280ps.m19906b(acm.f201a, i);
        return true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(abl abl) {
        C1244oj.m19766a(abl);
        this.mEdgeEffectFactory = abl;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(abp abp) {
        abp abp2 = this.mItemAnimator;
        if (abp2 != null) {
            abp2.mo205d();
            this.mItemAnimator.f108h = null;
        }
        this.mItemAnimator = abp;
        if (abp != null) {
            abp.f108h = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        acc acc = this.mRecycler;
        acc.f148e = i;
        acc.mo283b();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(abu abu) {
        if (abu != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                abp abp = this.mItemAnimator;
                if (abp != null) {
                    abp.mo205d();
                }
                this.mLayout.mo239c(this.mRecycler);
                this.mLayout.mo234b(this.mRecycler);
                this.mRecycler.mo278a();
                this.mLayout.mo227a((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.mo278a();
            }
            C1524yt ytVar = this.mChildHelper;
            ytVar.f27682a.mo16573a();
            for (int size = ytVar.f27683b.size() - 1; size >= 0; size--) {
                ytVar.f27684c.mo150b((View) ytVar.f27683b.get(size));
                ytVar.f27683b.remove(size);
            }
            abf abf = ytVar.f27684c;
            int a = abf.mo146a();
            for (int i = 0; i < a; i++) {
                View b = abf.mo149b(i);
                abf.f100a.dispatchChildDetached(b);
                b.clearAnimation();
            }
            abf.f100a.removeAllViews();
            this.mLayout = abu;
            if (abu != null) {
                if (abu.f120r == null) {
                    this.mLayout.mo227a(this);
                } else {
                    throw new IllegalArgumentException("LayoutManager " + abu + " is already attached to a RecyclerView:" + abu.f120r.exceptionLabel());
                }
            }
            this.mRecycler.mo283b();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        int i = Build.VERSION.SDK_INT;
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo15676a(z);
    }

    public void setOnFlingListener(abx abx) {
        this.mOnFlingListener = abx;
    }

    @Deprecated
    public void setOnScrollListener(abz abz) {
        this.mScrollListener = abz;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(acb acb) {
        acc acc = this.mRecycler;
        acb acb2 = acc.f150g;
        if (acb2 != null) {
            acb2.mo275b();
        }
        acc.f150g = acb;
        if (acc.f150g != null && acc.f152i.getAdapter() != null) {
            acc.f150g.mo274a();
        }
    }

    public void setRecyclerListener(acd acd) {
        this.mRecyclerListener = acd;
    }

    public void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(ack ack) {
        this.mRecycler.f151h = ack;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            int i3 = Build.VERSION.SDK_INT;
            i = accessibilityEvent.getContentChangeTypes();
        } else {
            i = 0;
        }
        if (i != 0) {
            i2 = i;
        }
        this.mEatenAccessibilityChangeFlags |= i2;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            abu abu = this.mLayout;
            if (abu == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                abu.mo57a(this, i);
            }
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo15687b(i);
    }

    public void stopInterceptRequestLayout(boolean z) {
        int i = this.mInterceptRequestLayoutDepth;
        if (i <= 0) {
            this.mInterceptRequestLayoutDepth = 1;
            i = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (i == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo15686b();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(abh abh, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(abh, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int b = this.mChildHelper.mo16586b();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < b; i6++) {
            View c = this.mChildHelper.mo16589c(i6);
            acm childViewHolderInt = getChildViewHolderInt(c);
            if (childViewHolderInt != null && !childViewHolderInt.mo320aO() && (i4 = childViewHolderInt.f203c) >= i && i4 < i5) {
                childViewHolderInt.mo321b(2);
                childViewHolderInt.mo316a(obj);
                ((abv) c.getLayoutParams()).f131e = true;
            }
        }
        acc acc = this.mRecycler;
        for (int size = acc.f146c.size() - 1; size >= 0; size--) {
            acm acm = (acm) acc.f146c.get(size);
            if (acm != null && (i3 = acm.f203c) >= i && i3 < i5) {
                acm.mo321b(2);
                acc.mo287c(size);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.recyclerViewStyle);
    }

    public void addItemDecoration(abr abr, int i) {
        abu abu = this.mLayout;
        if (abu != null) {
            abu.mo59a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(abr);
        } else {
            this.mItemDecorations.add(i, abr);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo15685a(i, i2, iArr, iArr2, i3);
    }

    public acm findViewHolderForPosition(int i, boolean z) {
        int b = this.mChildHelper.mo16586b();
        acm acm = null;
        for (int i2 = 0; i2 < b; i2++) {
            acm childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo16589c(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo333n()) {
                if (!z) {
                    if (childViewHolderInt.mo322c() != i) {
                        continue;
                    }
                } else if (childViewHolderInt.f203c != i) {
                    continue;
                }
                if (!this.mChildHelper.mo16590c(childViewHolderInt.f201a)) {
                    return childViewHolderInt;
                }
                acm = childViewHolderInt;
            }
        }
        return acm;
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().mo15680a(i);
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i <= 0) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().mo15681a(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().mo15688c(i);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$SavedState */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new acf();

        /* renamed from: c */
        Parcelable f1227c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1227c = parcel.readParcelable(classLoader == null ? abu.class.getClassLoader() : classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f1227c, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [android.support.v7.widget.RecyclerView, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1553zv zvVar;
        this.mObserver = new ace(this);
        this.mRecycler = new acc(this);
        this.mViewInfoStore = new aej();
        this.mUpdateChildViewsRunnable = new abb(this);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList();
        this.mOnItemTouchListeners = new ArrayList();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new abl();
        this.mItemAnimator = new C1538zg();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C0004acl(this);
        if (ALLOW_THREAD_GAP_WORK) {
            zvVar = new C1553zv();
        } else {
            zvVar = null;
        }
        this.mPrefetchRegistry = zvVar;
        this.mState = new acj();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new abq(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new abc(this);
        this.mViewInfoProcessCallback = new abe(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C1281pt.m19945a(viewConfiguration);
        this.mScaledVerticalScrollFactor = C1281pt.m19946b(viewConfiguration);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f108h = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C1280ps.m19917f(this) == 0) {
            C1280ps.m19906b((View) this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new aco(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1394ty.f27231a, i, 0);
        C1280ps.m19886a(this, context, C1394ty.f27231a, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(1, true);
        boolean z = obtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(6), obtainStyledAttributes.getDrawable(7), (StateListDrawable) obtainStyledAttributes.getDrawable(4), obtainStyledAttributes.getDrawable(5));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int i2 = Build.VERSION.SDK_INT;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i, 0);
        C1280ps.m19886a(this, context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo15682a(i, i2, i3, i4, iArr);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        abu abu = this.mLayout;
        if (abu != null) {
            return abu.mo19a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo15683a(i, i2, i3, i4, iArr, i5, null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        abu abu = this.mLayout;
        if (abu == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i4 = 0;
            if (!abu.mo77j()) {
                i = 0;
            }
            if (!this.mLayout.mo78k()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        startNestedScroll(i4, 1);
                    }
                    this.mViewFlinger.mo310a(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }
}
