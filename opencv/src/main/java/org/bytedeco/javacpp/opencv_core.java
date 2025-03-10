// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class opencv_core extends org.bytedeco.javacpp.helper.opencv_core {
    static { Loader.load(); }

@Name("std::vector<std::vector<char> >") public static class ByteVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ByteVectorVector(Pointer p) { super(p); }
    public ByteVectorVector(byte[] ... array) { this(array.length); put(array); }
    public ByteVectorVector()       { allocate();  }
    public ByteVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef ByteVectorVector put(@ByRef ByteVectorVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);
    public native @Index long size(@Cast("size_t") long i);
    public native @Index void resize(@Cast("size_t") long i, @Cast("size_t") long n);

    @Index public native @Cast("char") byte get(@Cast("size_t") long i, @Cast("size_t") long j);
    public native ByteVectorVector put(@Cast("size_t") long i, @Cast("size_t") long j, byte value);

    public ByteVectorVector put(byte[] ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            if (size(i) != array[i].length) { resize(i, array[i].length); }
            for (int j = 0; j < array[i].length; j++) {
                put(i, j, array[i][j]);
            }
        }
        return this;
    }
}

@Name("std::vector<std::vector<int> >") public static class IntVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntVectorVector(Pointer p) { super(p); }
    public IntVectorVector(int[] ... array) { this(array.length); put(array); }
    public IntVectorVector()       { allocate();  }
    public IntVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef IntVectorVector put(@ByRef IntVectorVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);
    public native @Index long size(@Cast("size_t") long i);
    public native @Index void resize(@Cast("size_t") long i, @Cast("size_t") long n);

    @Index public native int get(@Cast("size_t") long i, @Cast("size_t") long j);
    public native IntVectorVector put(@Cast("size_t") long i, @Cast("size_t") long j, int value);

    public IntVectorVector put(int[] ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            if (size(i) != array[i].length) { resize(i, array[i].length); }
            for (int j = 0; j < array[i].length; j++) {
                put(i, j, array[i][j]);
            }
        }
        return this;
    }
}

@Name("std::vector<cv::String>") public static class StringVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringVector(Pointer p) { super(p); }
    public StringVector(BytePointer ... array) { this(array.length); put(array); }
    public StringVector(String ... array) { this(array.length); put(array); }
    public StringVector()       { allocate();  }
    public StringVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef StringVector put(@ByRef StringVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @Str BytePointer get(@Cast("size_t") long i);
    public native StringVector put(@Cast("size_t") long i, BytePointer value);
    @ValueSetter @Index public native StringVector put(@Cast("size_t") long i, @Str String value);

    public StringVector put(BytePointer ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }

    public StringVector put(String ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<cv::Point_<int> >") public static class PointVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PointVector(Pointer p) { super(p); }
    public PointVector(Point ... array) { this(array.length); put(array); }
    public PointVector()       { allocate();  }
    public PointVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef PointVector put(@ByRef PointVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef Point get(@Cast("size_t") long i);
    public native PointVector put(@Cast("size_t") long i, Point value);

    public PointVector put(Point ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<cv::Point_<float> >") public static class Point2fVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point2fVector(Pointer p) { super(p); }
    public Point2fVector(Point2f ... array) { this(array.length); put(array); }
    public Point2fVector()       { allocate();  }
    public Point2fVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef Point2fVector put(@ByRef Point2fVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef Point2f get(@Cast("size_t") long i);
    public native Point2fVector put(@Cast("size_t") long i, Point2f value);

    public Point2fVector put(Point2f ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<cv::Point_<double> >") public static class Point2dVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point2dVector(Pointer p) { super(p); }
    public Point2dVector(Point2d ... array) { this(array.length); put(array); }
    public Point2dVector()       { allocate();  }
    public Point2dVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef Point2dVector put(@ByRef Point2dVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef Point2d get(@Cast("size_t") long i);
    public native Point2dVector put(@Cast("size_t") long i, Point2d value);

    public Point2dVector put(Point2d ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<cv::Size_<int> >") public static class SizeVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SizeVector(Pointer p) { super(p); }
    public SizeVector(Size ... array) { this(array.length); put(array); }
    public SizeVector()       { allocate();  }
    public SizeVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef SizeVector put(@ByRef SizeVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef Size get(@Cast("size_t") long i);
    public native SizeVector put(@Cast("size_t") long i, Size value);

    public SizeVector put(Size ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<cv::Rect_<int> >") public static class RectVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RectVector(Pointer p) { super(p); }
    public RectVector(Rect ... array) { this(array.length); put(array); }
    public RectVector()       { allocate();  }
    public RectVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef RectVector put(@ByRef RectVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef Rect get(@Cast("size_t") long i);
    public native RectVector put(@Cast("size_t") long i, Rect value);

    public RectVector put(Rect ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<cv::KeyPoint>") public static class KeyPointVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KeyPointVector(Pointer p) { super(p); }
    public KeyPointVector(KeyPoint ... array) { this(array.length); put(array); }
    public KeyPointVector()       { allocate();  }
    public KeyPointVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef KeyPointVector put(@ByRef KeyPointVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef KeyPoint get(@Cast("size_t") long i);
    public native KeyPointVector put(@Cast("size_t") long i, KeyPoint value);

    public KeyPointVector put(KeyPoint ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<cv::DMatch>") public static class DMatchVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DMatchVector(Pointer p) { super(p); }
    public DMatchVector(DMatch ... array) { this(array.length); put(array); }
    public DMatchVector()       { allocate();  }
    public DMatchVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef DMatchVector put(@ByRef DMatchVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef DMatch get(@Cast("size_t") long i);
    public native DMatchVector put(@Cast("size_t") long i, DMatch value);

    public DMatchVector put(DMatch ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<std::vector<cv::Point_<int> > >") public static class PointVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PointVectorVector(Pointer p) { super(p); }
    public PointVectorVector(PointVector ... array) { this(array.length); put(array); }
    public PointVectorVector()       { allocate();  }
    public PointVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef PointVectorVector put(@ByRef PointVectorVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef PointVector get(@Cast("size_t") long i);
    public native PointVectorVector put(@Cast("size_t") long i, PointVector value);

    public PointVectorVector put(PointVector ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<std::vector<cv::Point_<float> > >") public static class Point2fVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point2fVectorVector(Pointer p) { super(p); }
    public Point2fVectorVector(Point2fVector ... array) { this(array.length); put(array); }
    public Point2fVectorVector()       { allocate();  }
    public Point2fVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef Point2fVectorVector put(@ByRef Point2fVectorVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef Point2fVector get(@Cast("size_t") long i);
    public native Point2fVectorVector put(@Cast("size_t") long i, Point2fVector value);

    public Point2fVectorVector put(Point2fVector ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<std::vector<cv::Point_<double> > >") public static class Point2dVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point2dVectorVector(Pointer p) { super(p); }
    public Point2dVectorVector(Point2dVector ... array) { this(array.length); put(array); }
    public Point2dVectorVector()       { allocate();  }
    public Point2dVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef Point2dVectorVector put(@ByRef Point2dVectorVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef Point2dVector get(@Cast("size_t") long i);
    public native Point2dVectorVector put(@Cast("size_t") long i, Point2dVector value);

    public Point2dVectorVector put(Point2dVector ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<std::vector<cv::Rect_<int> > >") public static class RectVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RectVectorVector(Pointer p) { super(p); }
    public RectVectorVector(RectVector ... array) { this(array.length); put(array); }
    public RectVectorVector()       { allocate();  }
    public RectVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef RectVectorVector put(@ByRef RectVectorVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef RectVector get(@Cast("size_t") long i);
    public native RectVectorVector put(@Cast("size_t") long i, RectVector value);

    public RectVectorVector put(RectVector ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<std::vector<cv::KeyPoint> >") public static class KeyPointVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KeyPointVectorVector(Pointer p) { super(p); }
    public KeyPointVectorVector(KeyPointVector ... array) { this(array.length); put(array); }
    public KeyPointVectorVector()       { allocate();  }
    public KeyPointVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef KeyPointVectorVector put(@ByRef KeyPointVectorVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef KeyPointVector get(@Cast("size_t") long i);
    public native KeyPointVectorVector put(@Cast("size_t") long i, KeyPointVector value);

    public KeyPointVectorVector put(KeyPointVector ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<std::vector<cv::DMatch> >") public static class DMatchVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DMatchVectorVector(Pointer p) { super(p); }
    public DMatchVectorVector(DMatchVector ... array) { this(array.length); put(array); }
    public DMatchVectorVector()       { allocate();  }
    public DMatchVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef DMatchVectorVector put(@ByRef DMatchVectorVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef DMatchVector get(@Cast("size_t") long i);
    public native DMatchVectorVector put(@Cast("size_t") long i, DMatchVector value);

    public DMatchVectorVector put(DMatchVector ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<cv::Mat>") public static class MatVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatVector(Pointer p) { super(p); }
    public MatVector(Mat ... array) { this(array.length); put(array); }
    public MatVector()       { allocate();  }
    public MatVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef MatVector put(@ByRef MatVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef Mat get(@Cast("size_t") long i);
    public native MatVector put(@Cast("size_t") long i, Mat value);

    public MatVector put(Mat ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<cv::UMat>") public static class UMatVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UMatVector(Pointer p) { super(p); }
    public UMatVector(UMat ... array) { this(array.length); put(array); }
    public UMatVector()       { allocate();  }
    public UMatVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef UMatVector put(@ByRef UMatVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef UMat get(@Cast("size_t") long i);
    public native UMatVector put(@Cast("size_t") long i, UMat value);

    public UMatVector put(UMat ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<std::pair<int,int> >") public static class IntIntPairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntIntPairVector(Pointer p) { super(p); }
    public IntIntPairVector(int[] firstValue, int[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public IntIntPairVector()       { allocate();  }
    public IntIntPairVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef IntIntPairVector put(@ByRef IntIntPairVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native int first(@Cast("size_t") long i); public native IntIntPairVector first(@Cast("size_t") long i, int first);
    @Index public native int second(@Cast("size_t") long i);  public native IntIntPairVector second(@Cast("size_t") long i, int second);

    public IntIntPairVector put(int[] firstValue, int[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

@Name("std::vector<std::pair<cv::Mat,unsigned char> >") public static class MatBytePairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatBytePairVector(Pointer p) { super(p); }
    public MatBytePairVector(Mat[] firstValue, byte[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public MatBytePairVector()       { allocate();  }
    public MatBytePairVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef MatBytePairVector put(@ByRef MatBytePairVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef Mat first(@Cast("size_t") long i); public native MatBytePairVector first(@Cast("size_t") long i, Mat first);
    @Index public native byte second(@Cast("size_t") long i);  public native MatBytePairVector second(@Cast("size_t") long i, byte second);

    public MatBytePairVector put(Mat[] firstValue, byte[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

@Name("std::vector<std::pair<cv::UMat,unsigned char> >") public static class UMatBytePairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UMatBytePairVector(Pointer p) { super(p); }
    public UMatBytePairVector(UMat[] firstValue, byte[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public UMatBytePairVector()       { allocate();  }
    public UMatBytePairVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef UMatBytePairVector put(@ByRef UMatBytePairVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef UMat first(@Cast("size_t") long i); public native UMatBytePairVector first(@Cast("size_t") long i, UMat first);
    @Index public native byte second(@Cast("size_t") long i);  public native UMatBytePairVector second(@Cast("size_t") long i, byte second);

    public UMatBytePairVector put(UMat[] firstValue, byte[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

@NoOffset @Name("std::pair<int,int>") public static class IntIntPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntIntPair(Pointer p) { super(p); }
    public IntIntPair(int firstValue, int secondValue) { this(); put(firstValue, secondValue); }
    public IntIntPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef IntIntPair put(@ByRef IntIntPair x);


    @MemberGetter public native int first(); public native IntIntPair first(int first);
    @MemberGetter public native int second();  public native IntIntPair second(int second);

    public IntIntPair put(int firstValue, int secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

// Parsed from <opencv2/core/hal/interface.h>

// #ifndef _HAL_INTERFACE_HPP_INCLUDED_
// #define _HAL_INTERFACE_HPP_INCLUDED_

/** \addtogroup core_hal_interface
 *  \{ */

public static final int CV_HAL_ERROR_OK = 0;
public static final int CV_HAL_ERROR_NOT_IMPLEMENTED = 1;
public static final int CV_HAL_ERROR_UNKNOWN = -1;

public static final int CV_HAL_CMP_EQ = 0;
public static final int CV_HAL_CMP_GT = 1;
public static final int CV_HAL_CMP_GE = 2;
public static final int CV_HAL_CMP_LT = 3;
public static final int CV_HAL_CMP_LE = 4;
public static final int CV_HAL_CMP_NE = 5;

// #ifdef __cplusplus
// #include <cstddef>
// #else
// #endif

/* primitive types */
/*
  schar  - signed 1 byte integer
  uchar  - unsigned 1 byte integer
  short  - signed 2 byte integer
  ushort - unsigned 2 byte integer
  int    - signed 4 byte integer
  uint   - unsigned 4 byte integer
  int64  - signed 8 byte integer
  uint64 - unsigned 8 byte integer
*/

// #if !defined _MSC_VER && !defined __BORLANDC__
// #  if defined __cplusplus && __cplusplus >= 201103L && !defined __APPLE__
// #    include <cstdint>
// #  else
// #    include <stdint.h>
// #  endif
// #else
// #endif

// #ifndef __IPL_H__
// #endif

// #if defined _MSC_VER || defined __BORLANDC__
// #  define CV_BIG_INT(n)   n##I64
// #  define CV_BIG_UINT(n)  n##UI64
// #else
// #  define CV_BIG_INT(n)   n##LL
// #  define CV_BIG_UINT(n)  n##ULL
// #endif

/** \} */

// #endif


// Parsed from <opencv2/core/cvdef.h>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Copyright (C) 2015, Itseez Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_CORE_CVDEF_H__
// #define __OPENCV_CORE_CVDEF_H__

/** \addtogroup core_utils
 *  \{ */

// #if !defined _CRT_SECURE_NO_DEPRECATE && defined _MSC_VER && _MSC_VER > 1300
// #  define _CRT_SECURE_NO_DEPRECATE /* to avoid multiple Visual Studio warnings */
// #endif

// undef problematic defines sometimes defined by system headers (windows.h in particular)
// #undef small
// #undef min
// #undef max
// #undef abs
// #undef Complex

// #if !defined _CRT_SECURE_NO_DEPRECATE && defined _MSC_VER && _MSC_VER > 1300 /* to avoid multiple Visual Studio warnings */
// #endif

// #include <limits.h>
// #include "opencv2/core/hal/interface.h"

// #if defined __ICL
// #elif defined __ICC
// #elif defined __ECL
// #elif defined __ECC
// #elif defined __INTEL_COMPILER
// #endif

// #ifndef CV_INLINE
// #  if defined __cplusplus
// #    define CV_INLINE static inline
// #  elif defined _MSC_VER
// #    define CV_INLINE __inline
// #  else
// #    define CV_INLINE static
// #  endif
// #endif

// #if defined CV_ICC && !defined CV_ENABLE_UNROLLED
// #  define CV_ENABLE_UNROLLED 0
// #else
// #  define CV_ENABLE_UNROLLED 1
// #endif

// #ifdef __GNUC__
// #  define CV_DECL_ALIGNED(x) __attribute__ ((aligned (x)))
// #elif defined _MSC_VER
// #  define CV_DECL_ALIGNED(x) __declspec(align(x))
// #else
// #  define CV_DECL_ALIGNED(x)
// #endif

/* CPU features and intrinsics support */
public static final int CV_CPU_NONE =             0;
public static final int CV_CPU_MMX =              1;
public static final int CV_CPU_SSE =              2;
public static final int CV_CPU_SSE2 =             3;
public static final int CV_CPU_SSE3 =             4;
public static final int CV_CPU_SSSE3 =            5;
public static final int CV_CPU_SSE4_1 =           6;
public static final int CV_CPU_SSE4_2 =           7;
public static final int CV_CPU_POPCNT =           8;

public static final int CV_CPU_AVX =              10;
public static final int CV_CPU_AVX2 =             11;
public static final int CV_CPU_FMA3 =             12;

public static final int CV_CPU_AVX_512F =         13;
public static final int CV_CPU_AVX_512BW =        14;
public static final int CV_CPU_AVX_512CD =        15;
public static final int CV_CPU_AVX_512DQ =        16;
public static final int CV_CPU_AVX_512ER =        17;
public static final int CV_CPU_AVX_512IFMA512 =   18;
public static final int CV_CPU_AVX_512PF =        19;
public static final int CV_CPU_AVX_512VBMI =      20;
public static final int CV_CPU_AVX_512VL =        21;

public static final int CV_CPU_NEON =   100;

// when adding to this list remember to update the following enum
public static final int CV_HARDWARE_MAX_FEATURE = 255;

/** \brief Available CPU features.
*/
/** enum CpuFeatures */
public static final int
    CPU_MMX             = 1,
    CPU_SSE             = 2,
    CPU_SSE2            = 3,
    CPU_SSE3            = 4,
    CPU_SSSE3           = 5,
    CPU_SSE4_1          = 6,
    CPU_SSE4_2          = 7,
    CPU_POPCNT          = 8,

    CPU_AVX             = 10,
    CPU_AVX2            = 11,
    CPU_FMA3            = 12,

    CPU_AVX_512F        = 13,
    CPU_AVX_512BW       = 14,
    CPU_AVX_512CD       = 15,
    CPU_AVX_512DQ       = 16,
    CPU_AVX_512ER       = 17,
    CPU_AVX_512IFMA512  = 18,
    CPU_AVX_512PF       = 19,
    CPU_AVX_512VBMI     = 20,
    CPU_AVX_512VL       = 21,

    CPU_NEON            = 100;

// do not include SSE/AVX/NEON headers for NVCC compiler
// #ifndef __CUDACC__

// #if defined __SSE2__ || defined _M_X64 || (defined _M_IX86_FP && _M_IX86_FP >= 2)
// #  include <emmintrin.h>
public static final int CV_MMX = 1;
public static final int CV_SSE = 1;
public static final int CV_SSE2 = 1;
// #  if defined __SSE3__ || (defined _MSC_VER && _MSC_VER >= 1500)
// #    include <pmmintrin.h>
public static final int CV_SSE3 = 1;
// #  endif
// #  if defined __SSSE3__  || (defined _MSC_VER && _MSC_VER >= 1500)
// #    include <tmmintrin.h>
public static final int CV_SSSE3 = 1;
// #  endif
// #  if defined __SSE4_1__ || (defined _MSC_VER && _MSC_VER >= 1500)
// #    include <smmintrin.h>
public static final int CV_SSE4_1 = 1;
// #  endif
// #  if defined __SSE4_2__ || (defined _MSC_VER && _MSC_VER >= 1500)
// #    include <nmmintrin.h>
public static final int CV_SSE4_2 = 1;
// #  endif
// #  if defined __POPCNT__ || (defined _MSC_VER && _MSC_VER >= 1500)
// #    ifdef _MSC_VER
// #      include <nmmintrin.h>
// #    else
// #      include <popcntintrin.h>
// #    endif
public static final int CV_POPCNT = 1;
// #  endif
// #  if defined __AVX__ || (defined _MSC_VER && _MSC_VER >= 1600 && 0)
// MS Visual Studio 2010 (2012?) has no macro pre-defined to identify the use of /arch:AVX
// See: http://connect.microsoft.com/VisualStudio/feedback/details/605858/arch-avx-should-define-a-predefined-macro-in-x64-and-set-a-unique-value-for-m-ix86-fp-in-win32
// #    include <immintrin.h>
public static final int CV_AVX = 1;
// #    if defined(_XCR_XFEATURE_ENABLED_MASK)
// #      define __xgetbv() _xgetbv(_XCR_XFEATURE_ENABLED_MASK)
// #    else
// #      define __xgetbv() 0
// #    endif
// #  endif
// #  if defined __AVX2__ || (defined _MSC_VER && _MSC_VER >= 1800 && 0)
// #    include <immintrin.h>
public static final int CV_AVX2 = 1;
// #    if defined __FMA__
public static final int CV_FMA3 = 1;
// #    endif
// #  endif
// #endif

// #if (defined WIN32 || defined _WIN32) && defined(_M_ARM)
// # include <Intrin.h>
// # include "arm_neon.h"
// # define CV_NEON 1
// # define CPU_HAS_NEON_FEATURE (true)
// #elif defined(__ARM_NEON__) || (defined (__ARM_NEON) && defined(__aarch64__))
// #  include <arm_neon.h>
// #  define CV_NEON 1
// #endif

// #if defined __GNUC__ && defined __arm__ && (defined __ARM_PCS_VFP || defined __ARM_VFPV3__ || defined __ARM_NEON__) && !defined __SOFTFP__
public static final int CV_VFP = 1;
// #endif

// #endif // __CUDACC__

// #ifndef CV_POPCNT
// #endif
// #ifndef CV_MMX
// #endif
// #ifndef CV_SSE
// #endif
// #ifndef CV_SSE2
// #endif
// #ifndef CV_SSE3
// #endif
// #ifndef CV_SSSE3
// #endif
// #ifndef CV_SSE4_1
// #endif
// #ifndef CV_SSE4_2
// #endif
// #ifndef CV_AVX
// #endif
// #ifndef CV_AVX2
// #endif
// #ifndef CV_FMA3
// #endif
// #ifndef CV_AVX_512F
public static final int CV_AVX_512F = 0;
// #endif
// #ifndef CV_AVX_512BW
public static final int CV_AVX_512BW = 0;
// #endif
// #ifndef CV_AVX_512CD
public static final int CV_AVX_512CD = 0;
// #endif
// #ifndef CV_AVX_512DQ
public static final int CV_AVX_512DQ = 0;
// #endif
// #ifndef CV_AVX_512ER
public static final int CV_AVX_512ER = 0;
// #endif
// #ifndef CV_AVX_512IFMA512
public static final int CV_AVX_512IFMA512 = 0;
// #endif
// #ifndef CV_AVX_512PF
public static final int CV_AVX_512PF = 0;
// #endif
// #ifndef CV_AVX_512VBMI
public static final int CV_AVX_512VBMI = 0;
// #endif
// #ifndef CV_AVX_512VL
public static final int CV_AVX_512VL = 0;
// #endif

// #ifndef CV_NEON
// #  define CV_NEON 0
// #endif

// #ifndef CV_VFP
// #endif

/* fundamental constants */
public static final double CV_PI =   3.1415926535897932384626433832795;
public static final double CV_2PI = 6.283185307179586476925286766559;
public static final double CV_LOG2 = 0.69314718055994530941723212145818;

public static class Cv32suf extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Cv32suf() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Cv32suf(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Cv32suf(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public Cv32suf position(int position) {
        return (Cv32suf)super.position(position);
    }

    public native int i(); public native Cv32suf i(int i);
    public native @Cast("unsigned") int u(); public native Cv32suf u(int u);
    public native float f(); public native Cv32suf f(float f);
}

public static class Cv64suf extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Cv64suf() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Cv64suf(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Cv64suf(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public Cv64suf position(int position) {
        return (Cv64suf)super.position(position);
    }

    public native @Cast("int64") long i(); public native Cv64suf i(long i);
    public native @Cast("uint64") int u(); public native Cv64suf u(int u);
    public native double f(); public native Cv64suf f(double f);
}

public static final int OPENCV_ABI_COMPATIBILITY = 300;

// #ifdef __OPENCV_BUILD
// #  define DISABLE_OPENCV_24_COMPATIBILITY
// #endif

// #if (defined WIN32 || defined _WIN32 || defined WINCE || defined __CYGWIN__) && defined CVAPI_EXPORTS
// #  define CV_EXPORTS __declspec(dllexport)
// #elif defined __GNUC__ && __GNUC__ >= 4
// #  define CV_EXPORTS __attribute__ ((visibility ("default")))
// #else
// #  define CV_EXPORTS
// #endif

// #ifndef CV_EXTERN_C
// #  ifdef __cplusplus
// #    define CV_EXTERN_C extern "C"
// #  else
// #  endif
// #endif

/* special informative macros for wrapper generators */
// #define CV_EXPORTS_W CV_EXPORTS
// #define CV_EXPORTS_W_SIMPLE CV_EXPORTS
// #define CV_EXPORTS_AS(synonym) CV_EXPORTS
// #define CV_EXPORTS_W_MAP CV_EXPORTS
// #define CV_IN_OUT
// #define CV_OUT
// #define CV_PROP
// #define CV_PROP_RW
// #define CV_WRAP
// #define CV_WRAP_AS(synonym)

/****************************************************************************************\
*                                  Matrix type (Mat)                                     *
\****************************************************************************************/

public static final int CV_CN_MAX =     512;
public static final int CV_CN_SHIFT =   3;
public static final int CV_DEPTH_MAX =  (1 << CV_CN_SHIFT);

public static final int CV_8U =   0;
public static final int CV_8S =   1;
public static final int CV_16U =  2;
public static final int CV_16S =  3;
public static final int CV_32S =  4;
public static final int CV_32F =  5;
public static final int CV_64F =  6;
public static final int CV_USRTYPE1 = 7;

public static final int CV_MAT_DEPTH_MASK =       (CV_DEPTH_MAX - 1);
public static native int CV_MAT_DEPTH(int flags);

public static native int CV_MAKETYPE(int depth, int cn);
public static native int CV_MAKE_TYPE(int arg1, int arg2);

public static final int CV_8UC1 = CV_MAKETYPE(CV_8U,1);
public static final int CV_8UC2 = CV_MAKETYPE(CV_8U,2);
public static final int CV_8UC3 = CV_MAKETYPE(CV_8U,3);
public static final int CV_8UC4 = CV_MAKETYPE(CV_8U,4);
public static native int CV_8UC(int n);

public static final int CV_8SC1 = CV_MAKETYPE(CV_8S,1);
public static final int CV_8SC2 = CV_MAKETYPE(CV_8S,2);
public static final int CV_8SC3 = CV_MAKETYPE(CV_8S,3);
public static final int CV_8SC4 = CV_MAKETYPE(CV_8S,4);
public static native int CV_8SC(int n);

public static final int CV_16UC1 = CV_MAKETYPE(CV_16U,1);
public static final int CV_16UC2 = CV_MAKETYPE(CV_16U,2);
public static final int CV_16UC3 = CV_MAKETYPE(CV_16U,3);
public static final int CV_16UC4 = CV_MAKETYPE(CV_16U,4);
public static native int CV_16UC(int n);

public static final int CV_16SC1 = CV_MAKETYPE(CV_16S,1);
public static final int CV_16SC2 = CV_MAKETYPE(CV_16S,2);
public static final int CV_16SC3 = CV_MAKETYPE(CV_16S,3);
public static final int CV_16SC4 = CV_MAKETYPE(CV_16S,4);
public static native int CV_16SC(int n);

public static final int CV_32SC1 = CV_MAKETYPE(CV_32S,1);
public static final int CV_32SC2 = CV_MAKETYPE(CV_32S,2);
public static final int CV_32SC3 = CV_MAKETYPE(CV_32S,3);
public static final int CV_32SC4 = CV_MAKETYPE(CV_32S,4);
public static native int CV_32SC(int n);

public static final int CV_32FC1 = CV_MAKETYPE(CV_32F,1);
public static final int CV_32FC2 = CV_MAKETYPE(CV_32F,2);
public static final int CV_32FC3 = CV_MAKETYPE(CV_32F,3);
public static final int CV_32FC4 = CV_MAKETYPE(CV_32F,4);
public static native int CV_32FC(int n);

public static final int CV_64FC1 = CV_MAKETYPE(CV_64F,1);
public static final int CV_64FC2 = CV_MAKETYPE(CV_64F,2);
public static final int CV_64FC3 = CV_MAKETYPE(CV_64F,3);
public static final int CV_64FC4 = CV_MAKETYPE(CV_64F,4);
public static native int CV_64FC(int n);

public static final int CV_MAT_CN_MASK =          ((CV_CN_MAX - 1) << CV_CN_SHIFT);
public static native int CV_MAT_CN(int flags);
public static final int CV_MAT_TYPE_MASK =        (CV_DEPTH_MAX*CV_CN_MAX - 1);
public static native int CV_MAT_TYPE(int flags);
public static final int CV_MAT_CONT_FLAG_SHIFT =  14;
public static final int CV_MAT_CONT_FLAG =        (1 << CV_MAT_CONT_FLAG_SHIFT);
public static native int CV_IS_MAT_CONT(int flags);
public static native int CV_IS_CONT_MAT(int arg1);
public static final int CV_SUBMAT_FLAG_SHIFT =    15;
public static final int CV_SUBMAT_FLAG =          (1 << CV_SUBMAT_FLAG_SHIFT);
// #define CV_IS_SUBMAT(flags)     ((flags) & CV_MAT_SUBMAT_FLAG)

/** Size of each channel item,
   0x124489 = 1000 0100 0100 0010 0010 0001 0001 ~ array of sizeof(arr_type_elem) */
// #define CV_ELEM_SIZE1(type)
//     ((((sizeof(size_t)<<28)|0x8442211) >> CV_MAT_DEPTH(type)*4) & 15)

/** 0x3a50 = 11 10 10 01 01 00 00 ~ array of log2(sizeof(arr_type_elem)) */
// #define CV_ELEM_SIZE(type)
//     (CV_MAT_CN(type) << ((((sizeof(size_t)/4+1)*16384|0x3a50) >> CV_MAT_DEPTH(type)*2) & 3))

// #ifndef MIN
// #  define MIN(a,b)  ((a) > (b) ? (b) : (a))
// #endif

// #ifndef MAX
// #  define MAX(a,b)  ((a) < (b) ? (b) : (a))
// #endif

/****************************************************************************************\
*          exchange-add operation for atomic operations on reference counters            *
\****************************************************************************************/

// #if defined __INTEL_COMPILER && !(defined WIN32 || defined _WIN32)
// #elif defined __GNUC__
// #elif defined _MSC_VER && !defined RC_INVOKED
// #  include <intrin.h>
// #  define CV_XADD(addr, delta) (int)_InterlockedExchangeAdd((long volatile*)addr, delta)
// #else
   
// #endif


/****************************************************************************************\
*                                  CV_NORETURN attribute                                 *
\****************************************************************************************/

// #ifndef CV_NORETURN
// #  if defined(__GNUC__)
// #  elif defined(_MSC_VER) && (_MSC_VER >= 1300)
// #    define CV_NORETURN __declspec(noreturn)
// #  else
// #    define CV_NORETURN /* nothing by default */
// #  endif
// #endif


/****************************************************************************************\
*                                    C++ Move semantics                                  *
\****************************************************************************************/

// #ifndef CV_CXX_MOVE_SEMANTICS
// #  if __cplusplus >= 201103L || defined(__GXX_EXPERIMENTAL_CXX0X__) || defined(_MSC_VER) && _MSC_VER >= 1600
public static final int CV_CXX_MOVE_SEMANTICS = 1;
// #  elif defined(__clang)
// #    if __has_feature(cxx_rvalue_references)
// #    endif
// #  endif
// #else
// #  if CV_CXX_MOVE_SEMANTICS == 0
// #    undef CV_CXX_MOVE_SEMANTICS
// #  endif
// #endif

/** \} */

// #endif // __OPENCV_CORE_CVDEF_H__


// Parsed from <opencv2/core/hal/hal.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Copyright (C) 2015, Itseez Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_HAL_HPP__
// #define __OPENCV_HAL_HPP__

// #include "opencv2/core/cvdef.h"
// #include "opencv2/core/hal/interface.h"

/** \cond IGNORED */
// #define CALL_HAL(name, fun, ...)
//     int res = fun(__VA_ARGS__);
//     if (res == CV_HAL_ERROR_OK)
//         return;
//     else if (res != CV_HAL_ERROR_NOT_IMPLEMENTED)
//         CV_Error_(cv::Error::StsInternal,
//             ("HAL implementation " CVAUX_STR(name) " ==> " CVAUX_STR(fun) " returned %d (0x%08x)", res, res));
/** \endcond */

/** \addtogroup core_hal_functions
 *  \{ */

@Namespace("cv::hal") public static native int normHamming(@Cast("const uchar*") BytePointer a, int n);
@Namespace("cv::hal") public static native int normHamming(@Cast("const uchar*") ByteBuffer a, int n);
@Namespace("cv::hal") public static native int normHamming(@Cast("const uchar*") byte[] a, int n);
@Namespace("cv::hal") public static native int normHamming(@Cast("const uchar*") BytePointer a, @Cast("const uchar*") BytePointer b, int n);
@Namespace("cv::hal") public static native int normHamming(@Cast("const uchar*") ByteBuffer a, @Cast("const uchar*") ByteBuffer b, int n);
@Namespace("cv::hal") public static native int normHamming(@Cast("const uchar*") byte[] a, @Cast("const uchar*") byte[] b, int n);

@Namespace("cv::hal") public static native int normHamming(@Cast("const uchar*") BytePointer a, int n, int cellSize);
@Namespace("cv::hal") public static native int normHamming(@Cast("const uchar*") ByteBuffer a, int n, int cellSize);
@Namespace("cv::hal") public static native int normHamming(@Cast("const uchar*") byte[] a, int n, int cellSize);
@Namespace("cv::hal") public static native int normHamming(@Cast("const uchar*") BytePointer a, @Cast("const uchar*") BytePointer b, int n, int cellSize);
@Namespace("cv::hal") public static native int normHamming(@Cast("const uchar*") ByteBuffer a, @Cast("const uchar*") ByteBuffer b, int n, int cellSize);
@Namespace("cv::hal") public static native int normHamming(@Cast("const uchar*") byte[] a, @Cast("const uchar*") byte[] b, int n, int cellSize);

@Namespace("cv::hal") public static native int LU32f(FloatPointer A, @Cast("size_t") long astep, int m, FloatPointer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native int LU32f(FloatBuffer A, @Cast("size_t") long astep, int m, FloatBuffer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native int LU32f(float[] A, @Cast("size_t") long astep, int m, float[] b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native int LU64f(DoublePointer A, @Cast("size_t") long astep, int m, DoublePointer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native int LU64f(DoubleBuffer A, @Cast("size_t") long astep, int m, DoubleBuffer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native int LU64f(double[] A, @Cast("size_t") long astep, int m, double[] b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native @Cast("bool") boolean Cholesky32f(FloatPointer A, @Cast("size_t") long astep, int m, FloatPointer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native @Cast("bool") boolean Cholesky32f(FloatBuffer A, @Cast("size_t") long astep, int m, FloatBuffer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native @Cast("bool") boolean Cholesky32f(float[] A, @Cast("size_t") long astep, int m, float[] b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native @Cast("bool") boolean Cholesky64f(DoublePointer A, @Cast("size_t") long astep, int m, DoublePointer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native @Cast("bool") boolean Cholesky64f(DoubleBuffer A, @Cast("size_t") long astep, int m, DoubleBuffer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native @Cast("bool") boolean Cholesky64f(double[] A, @Cast("size_t") long astep, int m, double[] b, @Cast("size_t") long bstep, int n);

@Namespace("cv::hal") public static native int normL1_(@Cast("const uchar*") BytePointer a, @Cast("const uchar*") BytePointer b, int n);
@Namespace("cv::hal") public static native int normL1_(@Cast("const uchar*") ByteBuffer a, @Cast("const uchar*") ByteBuffer b, int n);
@Namespace("cv::hal") public static native int normL1_(@Cast("const uchar*") byte[] a, @Cast("const uchar*") byte[] b, int n);
@Namespace("cv::hal") public static native float normL1_(@Const FloatPointer a, @Const FloatPointer b, int n);
@Namespace("cv::hal") public static native float normL1_(@Const FloatBuffer a, @Const FloatBuffer b, int n);
@Namespace("cv::hal") public static native float normL1_(@Const float[] a, @Const float[] b, int n);
@Namespace("cv::hal") public static native float normL2Sqr_(@Const FloatPointer a, @Const FloatPointer b, int n);
@Namespace("cv::hal") public static native float normL2Sqr_(@Const FloatBuffer a, @Const FloatBuffer b, int n);
@Namespace("cv::hal") public static native float normL2Sqr_(@Const float[] a, @Const float[] b, int n);

@Namespace("cv::hal") public static native void exp32f(@Const FloatPointer src, FloatPointer dst, int n);
@Namespace("cv::hal") public static native void exp32f(@Const FloatBuffer src, FloatBuffer dst, int n);
@Namespace("cv::hal") public static native void exp32f(@Const float[] src, float[] dst, int n);
@Namespace("cv::hal") public static native void exp64f(@Const DoublePointer src, DoublePointer dst, int n);
@Namespace("cv::hal") public static native void exp64f(@Const DoubleBuffer src, DoubleBuffer dst, int n);
@Namespace("cv::hal") public static native void exp64f(@Const double[] src, double[] dst, int n);
@Namespace("cv::hal") public static native void log32f(@Const FloatPointer src, FloatPointer dst, int n);
@Namespace("cv::hal") public static native void log32f(@Const FloatBuffer src, FloatBuffer dst, int n);
@Namespace("cv::hal") public static native void log32f(@Const float[] src, float[] dst, int n);
@Namespace("cv::hal") public static native void log64f(@Const DoublePointer src, DoublePointer dst, int n);
@Namespace("cv::hal") public static native void log64f(@Const DoubleBuffer src, DoubleBuffer dst, int n);
@Namespace("cv::hal") public static native void log64f(@Const double[] src, double[] dst, int n);

@Namespace("cv::hal") public static native void fastAtan2(@Const FloatPointer y, @Const FloatPointer x, FloatPointer dst, int n, @Cast("bool") boolean angleInDegrees);
@Namespace("cv::hal") public static native void fastAtan2(@Const FloatBuffer y, @Const FloatBuffer x, FloatBuffer dst, int n, @Cast("bool") boolean angleInDegrees);
@Namespace("cv::hal") public static native void fastAtan2(@Const float[] y, @Const float[] x, float[] dst, int n, @Cast("bool") boolean angleInDegrees);
@Namespace("cv::hal") public static native void magnitude32f(@Const FloatPointer x, @Const FloatPointer y, FloatPointer dst, int n);
@Namespace("cv::hal") public static native void magnitude32f(@Const FloatBuffer x, @Const FloatBuffer y, FloatBuffer dst, int n);
@Namespace("cv::hal") public static native void magnitude32f(@Const float[] x, @Const float[] y, float[] dst, int n);
@Namespace("cv::hal") public static native void magnitude64f(@Const DoublePointer x, @Const DoublePointer y, DoublePointer dst, int n);
@Namespace("cv::hal") public static native void magnitude64f(@Const DoubleBuffer x, @Const DoubleBuffer y, DoubleBuffer dst, int n);
@Namespace("cv::hal") public static native void magnitude64f(@Const double[] x, @Const double[] y, double[] dst, int n);
@Namespace("cv::hal") public static native void sqrt32f(@Const FloatPointer src, FloatPointer dst, int len);
@Namespace("cv::hal") public static native void sqrt32f(@Const FloatBuffer src, FloatBuffer dst, int len);
@Namespace("cv::hal") public static native void sqrt32f(@Const float[] src, float[] dst, int len);
@Namespace("cv::hal") public static native void sqrt64f(@Const DoublePointer src, DoublePointer dst, int len);
@Namespace("cv::hal") public static native void sqrt64f(@Const DoubleBuffer src, DoubleBuffer dst, int len);
@Namespace("cv::hal") public static native void sqrt64f(@Const double[] src, double[] dst, int len);
@Namespace("cv::hal") public static native void invSqrt32f(@Const FloatPointer src, FloatPointer dst, int len);
@Namespace("cv::hal") public static native void invSqrt32f(@Const FloatBuffer src, FloatBuffer dst, int len);
@Namespace("cv::hal") public static native void invSqrt32f(@Const float[] src, float[] dst, int len);
@Namespace("cv::hal") public static native void invSqrt64f(@Const DoublePointer src, DoublePointer dst, int len);
@Namespace("cv::hal") public static native void invSqrt64f(@Const DoubleBuffer src, DoubleBuffer dst, int len);
@Namespace("cv::hal") public static native void invSqrt64f(@Const double[] src, double[] dst, int len);

@Namespace("cv::hal") public static native void split8u(@Cast("const uchar*") BytePointer src, @Cast("uchar**") PointerPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void split8u(@Cast("const uchar*") BytePointer src, @Cast("uchar**") @ByPtrPtr BytePointer dst, int len, int cn );
@Namespace("cv::hal") public static native void split8u(@Cast("const uchar*") ByteBuffer src, @Cast("uchar**") @ByPtrPtr ByteBuffer dst, int len, int cn );
@Namespace("cv::hal") public static native void split8u(@Cast("const uchar*") byte[] src, @Cast("uchar**") @ByPtrPtr byte[] dst, int len, int cn );
@Namespace("cv::hal") public static native void split16u(@Cast("const ushort*") ShortPointer src, @Cast("ushort**") PointerPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void split16u(@Cast("const ushort*") ShortPointer src, @Cast("ushort**") @ByPtrPtr ShortPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void split16u(@Cast("const ushort*") ShortBuffer src, @Cast("ushort**") @ByPtrPtr ShortBuffer dst, int len, int cn );
@Namespace("cv::hal") public static native void split16u(@Cast("const ushort*") short[] src, @Cast("ushort**") @ByPtrPtr short[] dst, int len, int cn );
@Namespace("cv::hal") public static native void split32s(@Const IntPointer src, @Cast("int**") PointerPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void split32s(@Const IntPointer src, @ByPtrPtr IntPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void split32s(@Const IntBuffer src, @ByPtrPtr IntBuffer dst, int len, int cn );
@Namespace("cv::hal") public static native void split32s(@Const int[] src, @ByPtrPtr int[] dst, int len, int cn );
@Namespace("cv::hal") public static native void split64s(@Cast("const int64*") LongPointer src, @Cast("int64**") PointerPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void split64s(@Cast("const int64*") LongPointer src, @Cast("int64**") @ByPtrPtr LongPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void split64s(@Cast("const int64*") LongBuffer src, @Cast("int64**") @ByPtrPtr LongBuffer dst, int len, int cn );
@Namespace("cv::hal") public static native void split64s(@Cast("const int64*") long[] src, @Cast("int64**") @ByPtrPtr long[] dst, int len, int cn );

@Namespace("cv::hal") public static native void merge8u(@Cast("const uchar**") PointerPointer src, @Cast("uchar*") BytePointer dst, int len, int cn );
@Namespace("cv::hal") public static native void merge8u(@Cast("const uchar**") @ByPtrPtr BytePointer src, @Cast("uchar*") BytePointer dst, int len, int cn );
@Namespace("cv::hal") public static native void merge8u(@Cast("const uchar**") @ByPtrPtr ByteBuffer src, @Cast("uchar*") ByteBuffer dst, int len, int cn );
@Namespace("cv::hal") public static native void merge8u(@Cast("const uchar**") @ByPtrPtr byte[] src, @Cast("uchar*") byte[] dst, int len, int cn );
@Namespace("cv::hal") public static native void merge16u(@Cast("const ushort**") PointerPointer src, @Cast("ushort*") ShortPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void merge16u(@Cast("const ushort**") @ByPtrPtr ShortPointer src, @Cast("ushort*") ShortPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void merge16u(@Cast("const ushort**") @ByPtrPtr ShortBuffer src, @Cast("ushort*") ShortBuffer dst, int len, int cn );
@Namespace("cv::hal") public static native void merge16u(@Cast("const ushort**") @ByPtrPtr short[] src, @Cast("ushort*") short[] dst, int len, int cn );
@Namespace("cv::hal") public static native void merge32s(@Cast("const int**") PointerPointer src, IntPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void merge32s(@Const @ByPtrPtr IntPointer src, IntPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void merge32s(@Const @ByPtrPtr IntBuffer src, IntBuffer dst, int len, int cn );
@Namespace("cv::hal") public static native void merge32s(@Const @ByPtrPtr int[] src, int[] dst, int len, int cn );
@Namespace("cv::hal") public static native void merge64s(@Cast("const int64**") PointerPointer src, @Cast("int64*") LongPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void merge64s(@Cast("const int64**") @ByPtrPtr LongPointer src, @Cast("int64*") LongPointer dst, int len, int cn );
@Namespace("cv::hal") public static native void merge64s(@Cast("const int64**") @ByPtrPtr LongBuffer src, @Cast("int64*") LongBuffer dst, int len, int cn );
@Namespace("cv::hal") public static native void merge64s(@Cast("const int64**") @ByPtrPtr long[] src, @Cast("int64*") long[] dst, int len, int cn );

@Namespace("cv::hal") public static native void add8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add8s( @Cast("const schar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const schar*") BytePointer src2, @Cast("size_t") long step2, @Cast("schar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add8s( @Cast("const schar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const schar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("schar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add8s( @Cast("const schar*") byte[] src1, @Cast("size_t") long step1, @Cast("const schar*") byte[] src2, @Cast("size_t") long step2, @Cast("schar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add16u( @Cast("const ushort*") ShortPointer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortPointer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add16u( @Cast("const ushort*") ShortBuffer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortBuffer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add16u( @Cast("const ushort*") short[] src1, @Cast("size_t") long step1, @Cast("const ushort*") short[] src2, @Cast("size_t") long step2, @Cast("ushort*") short[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add16s( @Const ShortPointer src1, @Cast("size_t") long step1, @Const ShortPointer src2, @Cast("size_t") long step2, ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add16s( @Const ShortBuffer src1, @Cast("size_t") long step1, @Const ShortBuffer src2, @Cast("size_t") long step2, ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add16s( @Const short[] src1, @Cast("size_t") long step1, @Const short[] src2, @Cast("size_t") long step2, short[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add32s( @Const IntPointer src1, @Cast("size_t") long step1, @Const IntPointer src2, @Cast("size_t") long step2, IntPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add32s( @Const IntBuffer src1, @Cast("size_t") long step1, @Const IntBuffer src2, @Cast("size_t") long step2, IntBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add32s( @Const int[] src1, @Cast("size_t") long step1, @Const int[] src2, @Cast("size_t") long step2, int[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add32f( @Const FloatPointer src1, @Cast("size_t") long step1, @Const FloatPointer src2, @Cast("size_t") long step2, FloatPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add32f( @Const FloatBuffer src1, @Cast("size_t") long step1, @Const FloatBuffer src2, @Cast("size_t") long step2, FloatBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add32f( @Const float[] src1, @Cast("size_t") long step1, @Const float[] src2, @Cast("size_t") long step2, float[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add64f( @Const DoublePointer src1, @Cast("size_t") long step1, @Const DoublePointer src2, @Cast("size_t") long step2, DoublePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add64f( @Const DoubleBuffer src1, @Cast("size_t") long step1, @Const DoubleBuffer src2, @Cast("size_t") long step2, DoubleBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void add64f( @Const double[] src1, @Cast("size_t") long step1, @Const double[] src2, @Cast("size_t") long step2, double[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );

@Namespace("cv::hal") public static native void sub8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub8s( @Cast("const schar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const schar*") BytePointer src2, @Cast("size_t") long step2, @Cast("schar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub8s( @Cast("const schar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const schar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("schar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub8s( @Cast("const schar*") byte[] src1, @Cast("size_t") long step1, @Cast("const schar*") byte[] src2, @Cast("size_t") long step2, @Cast("schar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub16u( @Cast("const ushort*") ShortPointer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortPointer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub16u( @Cast("const ushort*") ShortBuffer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortBuffer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub16u( @Cast("const ushort*") short[] src1, @Cast("size_t") long step1, @Cast("const ushort*") short[] src2, @Cast("size_t") long step2, @Cast("ushort*") short[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub16s( @Const ShortPointer src1, @Cast("size_t") long step1, @Const ShortPointer src2, @Cast("size_t") long step2, ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub16s( @Const ShortBuffer src1, @Cast("size_t") long step1, @Const ShortBuffer src2, @Cast("size_t") long step2, ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub16s( @Const short[] src1, @Cast("size_t") long step1, @Const short[] src2, @Cast("size_t") long step2, short[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub32s( @Const IntPointer src1, @Cast("size_t") long step1, @Const IntPointer src2, @Cast("size_t") long step2, IntPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub32s( @Const IntBuffer src1, @Cast("size_t") long step1, @Const IntBuffer src2, @Cast("size_t") long step2, IntBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub32s( @Const int[] src1, @Cast("size_t") long step1, @Const int[] src2, @Cast("size_t") long step2, int[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub32f( @Const FloatPointer src1, @Cast("size_t") long step1, @Const FloatPointer src2, @Cast("size_t") long step2, FloatPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub32f( @Const FloatBuffer src1, @Cast("size_t") long step1, @Const FloatBuffer src2, @Cast("size_t") long step2, FloatBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub32f( @Const float[] src1, @Cast("size_t") long step1, @Const float[] src2, @Cast("size_t") long step2, float[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub64f( @Const DoublePointer src1, @Cast("size_t") long step1, @Const DoublePointer src2, @Cast("size_t") long step2, DoublePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub64f( @Const DoubleBuffer src1, @Cast("size_t") long step1, @Const DoubleBuffer src2, @Cast("size_t") long step2, DoubleBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void sub64f( @Const double[] src1, @Cast("size_t") long step1, @Const double[] src2, @Cast("size_t") long step2, double[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );

@Namespace("cv::hal") public static native void max8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max8s( @Cast("const schar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const schar*") BytePointer src2, @Cast("size_t") long step2, @Cast("schar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max8s( @Cast("const schar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const schar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("schar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max8s( @Cast("const schar*") byte[] src1, @Cast("size_t") long step1, @Cast("const schar*") byte[] src2, @Cast("size_t") long step2, @Cast("schar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max16u( @Cast("const ushort*") ShortPointer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortPointer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max16u( @Cast("const ushort*") ShortBuffer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortBuffer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max16u( @Cast("const ushort*") short[] src1, @Cast("size_t") long step1, @Cast("const ushort*") short[] src2, @Cast("size_t") long step2, @Cast("ushort*") short[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max16s( @Const ShortPointer src1, @Cast("size_t") long step1, @Const ShortPointer src2, @Cast("size_t") long step2, ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max16s( @Const ShortBuffer src1, @Cast("size_t") long step1, @Const ShortBuffer src2, @Cast("size_t") long step2, ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max16s( @Const short[] src1, @Cast("size_t") long step1, @Const short[] src2, @Cast("size_t") long step2, short[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max32s( @Const IntPointer src1, @Cast("size_t") long step1, @Const IntPointer src2, @Cast("size_t") long step2, IntPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max32s( @Const IntBuffer src1, @Cast("size_t") long step1, @Const IntBuffer src2, @Cast("size_t") long step2, IntBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max32s( @Const int[] src1, @Cast("size_t") long step1, @Const int[] src2, @Cast("size_t") long step2, int[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max32f( @Const FloatPointer src1, @Cast("size_t") long step1, @Const FloatPointer src2, @Cast("size_t") long step2, FloatPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max32f( @Const FloatBuffer src1, @Cast("size_t") long step1, @Const FloatBuffer src2, @Cast("size_t") long step2, FloatBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max32f( @Const float[] src1, @Cast("size_t") long step1, @Const float[] src2, @Cast("size_t") long step2, float[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max64f( @Const DoublePointer src1, @Cast("size_t") long step1, @Const DoublePointer src2, @Cast("size_t") long step2, DoublePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max64f( @Const DoubleBuffer src1, @Cast("size_t") long step1, @Const DoubleBuffer src2, @Cast("size_t") long step2, DoubleBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void max64f( @Const double[] src1, @Cast("size_t") long step1, @Const double[] src2, @Cast("size_t") long step2, double[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );

@Namespace("cv::hal") public static native void min8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min8s( @Cast("const schar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const schar*") BytePointer src2, @Cast("size_t") long step2, @Cast("schar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min8s( @Cast("const schar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const schar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("schar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min8s( @Cast("const schar*") byte[] src1, @Cast("size_t") long step1, @Cast("const schar*") byte[] src2, @Cast("size_t") long step2, @Cast("schar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min16u( @Cast("const ushort*") ShortPointer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortPointer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min16u( @Cast("const ushort*") ShortBuffer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortBuffer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min16u( @Cast("const ushort*") short[] src1, @Cast("size_t") long step1, @Cast("const ushort*") short[] src2, @Cast("size_t") long step2, @Cast("ushort*") short[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min16s( @Const ShortPointer src1, @Cast("size_t") long step1, @Const ShortPointer src2, @Cast("size_t") long step2, ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min16s( @Const ShortBuffer src1, @Cast("size_t") long step1, @Const ShortBuffer src2, @Cast("size_t") long step2, ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min16s( @Const short[] src1, @Cast("size_t") long step1, @Const short[] src2, @Cast("size_t") long step2, short[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min32s( @Const IntPointer src1, @Cast("size_t") long step1, @Const IntPointer src2, @Cast("size_t") long step2, IntPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min32s( @Const IntBuffer src1, @Cast("size_t") long step1, @Const IntBuffer src2, @Cast("size_t") long step2, IntBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min32s( @Const int[] src1, @Cast("size_t") long step1, @Const int[] src2, @Cast("size_t") long step2, int[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min32f( @Const FloatPointer src1, @Cast("size_t") long step1, @Const FloatPointer src2, @Cast("size_t") long step2, FloatPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min32f( @Const FloatBuffer src1, @Cast("size_t") long step1, @Const FloatBuffer src2, @Cast("size_t") long step2, FloatBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min32f( @Const float[] src1, @Cast("size_t") long step1, @Const float[] src2, @Cast("size_t") long step2, float[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min64f( @Const DoublePointer src1, @Cast("size_t") long step1, @Const DoublePointer src2, @Cast("size_t") long step2, DoublePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min64f( @Const DoubleBuffer src1, @Cast("size_t") long step1, @Const DoubleBuffer src2, @Cast("size_t") long step2, DoubleBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void min64f( @Const double[] src1, @Cast("size_t") long step1, @Const double[] src2, @Cast("size_t") long step2, double[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );

@Namespace("cv::hal") public static native void absdiff8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff8s( @Cast("const schar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const schar*") BytePointer src2, @Cast("size_t") long step2, @Cast("schar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff8s( @Cast("const schar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const schar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("schar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff8s( @Cast("const schar*") byte[] src1, @Cast("size_t") long step1, @Cast("const schar*") byte[] src2, @Cast("size_t") long step2, @Cast("schar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff16u( @Cast("const ushort*") ShortPointer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortPointer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff16u( @Cast("const ushort*") ShortBuffer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortBuffer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff16u( @Cast("const ushort*") short[] src1, @Cast("size_t") long step1, @Cast("const ushort*") short[] src2, @Cast("size_t") long step2, @Cast("ushort*") short[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff16s( @Const ShortPointer src1, @Cast("size_t") long step1, @Const ShortPointer src2, @Cast("size_t") long step2, ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff16s( @Const ShortBuffer src1, @Cast("size_t") long step1, @Const ShortBuffer src2, @Cast("size_t") long step2, ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff16s( @Const short[] src1, @Cast("size_t") long step1, @Const short[] src2, @Cast("size_t") long step2, short[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff32s( @Const IntPointer src1, @Cast("size_t") long step1, @Const IntPointer src2, @Cast("size_t") long step2, IntPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff32s( @Const IntBuffer src1, @Cast("size_t") long step1, @Const IntBuffer src2, @Cast("size_t") long step2, IntBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff32s( @Const int[] src1, @Cast("size_t") long step1, @Const int[] src2, @Cast("size_t") long step2, int[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff32f( @Const FloatPointer src1, @Cast("size_t") long step1, @Const FloatPointer src2, @Cast("size_t") long step2, FloatPointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff32f( @Const FloatBuffer src1, @Cast("size_t") long step1, @Const FloatBuffer src2, @Cast("size_t") long step2, FloatBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff32f( @Const float[] src1, @Cast("size_t") long step1, @Const float[] src2, @Cast("size_t") long step2, float[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff64f( @Const DoublePointer src1, @Cast("size_t") long step1, @Const DoublePointer src2, @Cast("size_t") long step2, DoublePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff64f( @Const DoubleBuffer src1, @Cast("size_t") long step1, @Const DoubleBuffer src2, @Cast("size_t") long step2, DoubleBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void absdiff64f( @Const double[] src1, @Cast("size_t") long step1, @Const double[] src2, @Cast("size_t") long step2, double[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );

@Namespace("cv::hal") public static native void and8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void and8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void and8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void or8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void or8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void or8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void xor8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void xor8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void xor8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void not8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void not8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );
@Namespace("cv::hal") public static native void not8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer arg8 );

@Namespace("cv::hal") public static native void cmp8u(@Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp8u(@Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp8u(@Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp8s(@Cast("const schar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const schar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp8s(@Cast("const schar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const schar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp8s(@Cast("const schar*") byte[] src1, @Cast("size_t") long step1, @Cast("const schar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp16u(@Cast("const ushort*") ShortPointer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortPointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp16u(@Cast("const ushort*") ShortBuffer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp16u(@Cast("const ushort*") short[] src1, @Cast("size_t") long step1, @Cast("const ushort*") short[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp16s(@Const ShortPointer src1, @Cast("size_t") long step1, @Const ShortPointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp16s(@Const ShortBuffer src1, @Cast("size_t") long step1, @Const ShortBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp16s(@Const short[] src1, @Cast("size_t") long step1, @Const short[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp32s(@Const IntPointer src1, @Cast("size_t") long step1, @Const IntPointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp32s(@Const IntBuffer src1, @Cast("size_t") long step1, @Const IntBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp32s(@Const int[] src1, @Cast("size_t") long step1, @Const int[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp32f(@Const FloatPointer src1, @Cast("size_t") long step1, @Const FloatPointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp32f(@Const FloatBuffer src1, @Cast("size_t") long step1, @Const FloatBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp32f(@Const float[] src1, @Cast("size_t") long step1, @Const float[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp64f(@Const DoublePointer src1, @Cast("size_t") long step1, @Const DoublePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp64f(@Const DoubleBuffer src1, @Cast("size_t") long step1, @Const DoubleBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);
@Namespace("cv::hal") public static native void cmp64f(@Const double[] src1, @Cast("size_t") long step1, @Const double[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer _cmpop);

@Namespace("cv::hal") public static native void mul8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul8s( @Cast("const schar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const schar*") BytePointer src2, @Cast("size_t") long step2, @Cast("schar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul8s( @Cast("const schar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const schar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("schar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul8s( @Cast("const schar*") byte[] src1, @Cast("size_t") long step1, @Cast("const schar*") byte[] src2, @Cast("size_t") long step2, @Cast("schar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul16u( @Cast("const ushort*") ShortPointer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortPointer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul16u( @Cast("const ushort*") ShortBuffer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortBuffer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul16u( @Cast("const ushort*") short[] src1, @Cast("size_t") long step1, @Cast("const ushort*") short[] src2, @Cast("size_t") long step2, @Cast("ushort*") short[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul16s( @Const ShortPointer src1, @Cast("size_t") long step1, @Const ShortPointer src2, @Cast("size_t") long step2, ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul16s( @Const ShortBuffer src1, @Cast("size_t") long step1, @Const ShortBuffer src2, @Cast("size_t") long step2, ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul16s( @Const short[] src1, @Cast("size_t") long step1, @Const short[] src2, @Cast("size_t") long step2, short[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul32s( @Const IntPointer src1, @Cast("size_t") long step1, @Const IntPointer src2, @Cast("size_t") long step2, IntPointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul32s( @Const IntBuffer src1, @Cast("size_t") long step1, @Const IntBuffer src2, @Cast("size_t") long step2, IntBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul32s( @Const int[] src1, @Cast("size_t") long step1, @Const int[] src2, @Cast("size_t") long step2, int[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul32f( @Const FloatPointer src1, @Cast("size_t") long step1, @Const FloatPointer src2, @Cast("size_t") long step2, FloatPointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul32f( @Const FloatBuffer src1, @Cast("size_t") long step1, @Const FloatBuffer src2, @Cast("size_t") long step2, FloatBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul32f( @Const float[] src1, @Cast("size_t") long step1, @Const float[] src2, @Cast("size_t") long step2, float[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul64f( @Const DoublePointer src1, @Cast("size_t") long step1, @Const DoublePointer src2, @Cast("size_t") long step2, DoublePointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul64f( @Const DoubleBuffer src1, @Cast("size_t") long step1, @Const DoubleBuffer src2, @Cast("size_t") long step2, DoubleBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void mul64f( @Const double[] src1, @Cast("size_t") long step1, @Const double[] src2, @Cast("size_t") long step2, double[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);

@Namespace("cv::hal") public static native void div8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div8s( @Cast("const schar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const schar*") BytePointer src2, @Cast("size_t") long step2, @Cast("schar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div8s( @Cast("const schar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const schar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("schar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div8s( @Cast("const schar*") byte[] src1, @Cast("size_t") long step1, @Cast("const schar*") byte[] src2, @Cast("size_t") long step2, @Cast("schar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div16u( @Cast("const ushort*") ShortPointer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortPointer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div16u( @Cast("const ushort*") ShortBuffer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortBuffer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div16u( @Cast("const ushort*") short[] src1, @Cast("size_t") long step1, @Cast("const ushort*") short[] src2, @Cast("size_t") long step2, @Cast("ushort*") short[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div16s( @Const ShortPointer src1, @Cast("size_t") long step1, @Const ShortPointer src2, @Cast("size_t") long step2, ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div16s( @Const ShortBuffer src1, @Cast("size_t") long step1, @Const ShortBuffer src2, @Cast("size_t") long step2, ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div16s( @Const short[] src1, @Cast("size_t") long step1, @Const short[] src2, @Cast("size_t") long step2, short[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div32s( @Const IntPointer src1, @Cast("size_t") long step1, @Const IntPointer src2, @Cast("size_t") long step2, IntPointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div32s( @Const IntBuffer src1, @Cast("size_t") long step1, @Const IntBuffer src2, @Cast("size_t") long step2, IntBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div32s( @Const int[] src1, @Cast("size_t") long step1, @Const int[] src2, @Cast("size_t") long step2, int[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div32f( @Const FloatPointer src1, @Cast("size_t") long step1, @Const FloatPointer src2, @Cast("size_t") long step2, FloatPointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div32f( @Const FloatBuffer src1, @Cast("size_t") long step1, @Const FloatBuffer src2, @Cast("size_t") long step2, FloatBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div32f( @Const float[] src1, @Cast("size_t") long step1, @Const float[] src2, @Cast("size_t") long step2, float[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div64f( @Const DoublePointer src1, @Cast("size_t") long step1, @Const DoublePointer src2, @Cast("size_t") long step2, DoublePointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div64f( @Const DoubleBuffer src1, @Cast("size_t") long step1, @Const DoubleBuffer src2, @Cast("size_t") long step2, DoubleBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void div64f( @Const double[] src1, @Cast("size_t") long step1, @Const double[] src2, @Cast("size_t") long step2, double[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);

@Namespace("cv::hal") public static native void recip8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip8s( @Cast("const schar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const schar*") BytePointer src2, @Cast("size_t") long step2, @Cast("schar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip8s( @Cast("const schar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const schar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("schar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip8s( @Cast("const schar*") byte[] src1, @Cast("size_t") long step1, @Cast("const schar*") byte[] src2, @Cast("size_t") long step2, @Cast("schar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip16u( @Cast("const ushort*") ShortPointer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortPointer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip16u( @Cast("const ushort*") ShortBuffer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortBuffer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip16u( @Cast("const ushort*") short[] src1, @Cast("size_t") long step1, @Cast("const ushort*") short[] src2, @Cast("size_t") long step2, @Cast("ushort*") short[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip16s( @Const ShortPointer src1, @Cast("size_t") long step1, @Const ShortPointer src2, @Cast("size_t") long step2, ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip16s( @Const ShortBuffer src1, @Cast("size_t") long step1, @Const ShortBuffer src2, @Cast("size_t") long step2, ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip16s( @Const short[] src1, @Cast("size_t") long step1, @Const short[] src2, @Cast("size_t") long step2, short[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip32s( @Const IntPointer src1, @Cast("size_t") long step1, @Const IntPointer src2, @Cast("size_t") long step2, IntPointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip32s( @Const IntBuffer src1, @Cast("size_t") long step1, @Const IntBuffer src2, @Cast("size_t") long step2, IntBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip32s( @Const int[] src1, @Cast("size_t") long step1, @Const int[] src2, @Cast("size_t") long step2, int[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip32f( @Const FloatPointer src1, @Cast("size_t") long step1, @Const FloatPointer src2, @Cast("size_t") long step2, FloatPointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip32f( @Const FloatBuffer src1, @Cast("size_t") long step1, @Const FloatBuffer src2, @Cast("size_t") long step2, FloatBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip32f( @Const float[] src1, @Cast("size_t") long step1, @Const float[] src2, @Cast("size_t") long step2, float[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip64f( @Const DoublePointer src1, @Cast("size_t") long step1, @Const DoublePointer src2, @Cast("size_t") long step2, DoublePointer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip64f( @Const DoubleBuffer src1, @Cast("size_t") long step1, @Const DoubleBuffer src2, @Cast("size_t") long step2, DoubleBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scale);
@Namespace("cv::hal") public static native void recip64f( @Const double[] src1, @Cast("size_t") long step1, @Const double[] src2, @Cast("size_t") long step2, double[] dst, @Cast("size_t") long step, int width, int height, Pointer scale);

@Namespace("cv::hal") public static native void addWeighted8u( @Cast("const uchar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const uchar*") BytePointer src2, @Cast("size_t") long step2, @Cast("uchar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer _scalars );
@Namespace("cv::hal") public static native void addWeighted8u( @Cast("const uchar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const uchar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("uchar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer _scalars );
@Namespace("cv::hal") public static native void addWeighted8u( @Cast("const uchar*") byte[] src1, @Cast("size_t") long step1, @Cast("const uchar*") byte[] src2, @Cast("size_t") long step2, @Cast("uchar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer _scalars );
@Namespace("cv::hal") public static native void addWeighted8s( @Cast("const schar*") BytePointer src1, @Cast("size_t") long step1, @Cast("const schar*") BytePointer src2, @Cast("size_t") long step2, @Cast("schar*") BytePointer dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted8s( @Cast("const schar*") ByteBuffer src1, @Cast("size_t") long step1, @Cast("const schar*") ByteBuffer src2, @Cast("size_t") long step2, @Cast("schar*") ByteBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted8s( @Cast("const schar*") byte[] src1, @Cast("size_t") long step1, @Cast("const schar*") byte[] src2, @Cast("size_t") long step2, @Cast("schar*") byte[] dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted16u( @Cast("const ushort*") ShortPointer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortPointer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted16u( @Cast("const ushort*") ShortBuffer src1, @Cast("size_t") long step1, @Cast("const ushort*") ShortBuffer src2, @Cast("size_t") long step2, @Cast("ushort*") ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted16u( @Cast("const ushort*") short[] src1, @Cast("size_t") long step1, @Cast("const ushort*") short[] src2, @Cast("size_t") long step2, @Cast("ushort*") short[] dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted16s( @Const ShortPointer src1, @Cast("size_t") long step1, @Const ShortPointer src2, @Cast("size_t") long step2, ShortPointer dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted16s( @Const ShortBuffer src1, @Cast("size_t") long step1, @Const ShortBuffer src2, @Cast("size_t") long step2, ShortBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted16s( @Const short[] src1, @Cast("size_t") long step1, @Const short[] src2, @Cast("size_t") long step2, short[] dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted32s( @Const IntPointer src1, @Cast("size_t") long step1, @Const IntPointer src2, @Cast("size_t") long step2, IntPointer dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted32s( @Const IntBuffer src1, @Cast("size_t") long step1, @Const IntBuffer src2, @Cast("size_t") long step2, IntBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted32s( @Const int[] src1, @Cast("size_t") long step1, @Const int[] src2, @Cast("size_t") long step2, int[] dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted32f( @Const FloatPointer src1, @Cast("size_t") long step1, @Const FloatPointer src2, @Cast("size_t") long step2, FloatPointer dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted32f( @Const FloatBuffer src1, @Cast("size_t") long step1, @Const FloatBuffer src2, @Cast("size_t") long step2, FloatBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted32f( @Const float[] src1, @Cast("size_t") long step1, @Const float[] src2, @Cast("size_t") long step2, float[] dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted64f( @Const DoublePointer src1, @Cast("size_t") long step1, @Const DoublePointer src2, @Cast("size_t") long step2, DoublePointer dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted64f( @Const DoubleBuffer src1, @Cast("size_t") long step1, @Const DoubleBuffer src2, @Cast("size_t") long step2, DoubleBuffer dst, @Cast("size_t") long step, int width, int height, Pointer scalars );
@Namespace("cv::hal") public static native void addWeighted64f( @Const double[] src1, @Cast("size_t") long step1, @Const double[] src2, @Cast("size_t") long step2, double[] dst, @Cast("size_t") long step, int width, int height, Pointer scalars );

/** \} core_hal */

//=============================================================================
// for binary compatibility with 3.0

/** \cond IGNORED */

@Namespace("cv::hal") public static native int LU(FloatPointer A, @Cast("size_t") long astep, int m, FloatPointer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native int LU(FloatBuffer A, @Cast("size_t") long astep, int m, FloatBuffer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native int LU(float[] A, @Cast("size_t") long astep, int m, float[] b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native int LU(DoublePointer A, @Cast("size_t") long astep, int m, DoublePointer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native int LU(DoubleBuffer A, @Cast("size_t") long astep, int m, DoubleBuffer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native int LU(double[] A, @Cast("size_t") long astep, int m, double[] b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native @Cast("bool") boolean Cholesky(FloatPointer A, @Cast("size_t") long astep, int m, FloatPointer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native @Cast("bool") boolean Cholesky(FloatBuffer A, @Cast("size_t") long astep, int m, FloatBuffer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native @Cast("bool") boolean Cholesky(float[] A, @Cast("size_t") long astep, int m, float[] b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native @Cast("bool") boolean Cholesky(DoublePointer A, @Cast("size_t") long astep, int m, DoublePointer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native @Cast("bool") boolean Cholesky(DoubleBuffer A, @Cast("size_t") long astep, int m, DoubleBuffer b, @Cast("size_t") long bstep, int n);
@Namespace("cv::hal") public static native @Cast("bool") boolean Cholesky(double[] A, @Cast("size_t") long astep, int m, double[] b, @Cast("size_t") long bstep, int n);

@Namespace("cv::hal") public static native void exp(@Const FloatPointer src, FloatPointer dst, int n);
@Namespace("cv::hal") public static native void exp(@Const FloatBuffer src, FloatBuffer dst, int n);
@Namespace("cv::hal") public static native void exp(@Const float[] src, float[] dst, int n);
@Namespace("cv::hal") public static native void exp(@Const DoublePointer src, DoublePointer dst, int n);
@Namespace("cv::hal") public static native void exp(@Const DoubleBuffer src, DoubleBuffer dst, int n);
@Namespace("cv::hal") public static native void exp(@Const double[] src, double[] dst, int n);
@Namespace("cv::hal") public static native void log(@Const FloatPointer src, FloatPointer dst, int n);
@Namespace("cv::hal") public static native void log(@Const FloatBuffer src, FloatBuffer dst, int n);
@Namespace("cv::hal") public static native void log(@Const float[] src, float[] dst, int n);
@Namespace("cv::hal") public static native void log(@Const DoublePointer src, DoublePointer dst, int n);
@Namespace("cv::hal") public static native void log(@Const DoubleBuffer src, DoubleBuffer dst, int n);
@Namespace("cv::hal") public static native void log(@Const double[] src, double[] dst, int n);

@Namespace("cv::hal") public static native void magnitude(@Const FloatPointer x, @Const FloatPointer y, FloatPointer dst, int n);
@Namespace("cv::hal") public static native void magnitude(@Const FloatBuffer x, @Const FloatBuffer y, FloatBuffer dst, int n);
@Namespace("cv::hal") public static native void magnitude(@Const float[] x, @Const float[] y, float[] dst, int n);
@Namespace("cv::hal") public static native void magnitude(@Const DoublePointer x, @Const DoublePointer y, DoublePointer dst, int n);
@Namespace("cv::hal") public static native void magnitude(@Const DoubleBuffer x, @Const DoubleBuffer y, DoubleBuffer dst, int n);
@Namespace("cv::hal") public static native void magnitude(@Const double[] x, @Const double[] y, double[] dst, int n);
@Namespace("cv::hal") public static native void sqrt(@Const FloatPointer src, FloatPointer dst, int len);
@Namespace("cv::hal") public static native void sqrt(@Const FloatBuffer src, FloatBuffer dst, int len);
@Namespace("cv::hal") public static native void sqrt(@Const float[] src, float[] dst, int len);
@Namespace("cv::hal") public static native void sqrt(@Const DoublePointer src, DoublePointer dst, int len);
@Namespace("cv::hal") public static native void sqrt(@Const DoubleBuffer src, DoubleBuffer dst, int len);
@Namespace("cv::hal") public static native void sqrt(@Const double[] src, double[] dst, int len);
@Namespace("cv::hal") public static native void invSqrt(@Const FloatPointer src, FloatPointer dst, int len);
@Namespace("cv::hal") public static native void invSqrt(@Const FloatBuffer src, FloatBuffer dst, int len);
@Namespace("cv::hal") public static native void invSqrt(@Const float[] src, float[] dst, int len);
@Namespace("cv::hal") public static native void invSqrt(@Const DoublePointer src, DoublePointer dst, int len);
@Namespace("cv::hal") public static native void invSqrt(@Const DoubleBuffer src, DoubleBuffer dst, int len);
@Namespace("cv::hal") public static native void invSqrt(@Const double[] src, double[] dst, int len);

/** \endcond */

 //cv::hal

// #endif //__OPENCV_HAL_HPP__


// Parsed from <opencv2/core/fast_math.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Copyright (C) 2015, Itseez Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_CORE_FAST_MATH_HPP__
// #define __OPENCV_CORE_FAST_MATH_HPP__

// #include "opencv2/core/cvdef.h"

/** \addtogroup core_utils
 *  \{
<p>
/****************************************************************************************\
*                                      fast math                                         *
\****************************************************************************************/

// #if defined __BORLANDC__ */
// #  include <fastmath.h>
// #elif defined __cplusplus
// #  include <cmath>
// #else
// #  include <math.h>
// #endif

// #ifdef HAVE_TEGRA_OPTIMIZATION
// #  include "tegra_round.hpp"
// #endif

// #if CV_VFP
    // 1. general scheme
//     #define ARM_ROUND(_value, _asm_string)
//         int res;
//         float temp;
//         asm(_asm_string : [res] "=r" (res), [temp] "=w" (temp) : [value] "w" (_value));
//         return res
    // 2. version for double
//     #ifdef __clang__
//         #define ARM_ROUND_DBL(value) ARM_ROUND(value, "vcvtr.s32.f64 %[temp], %[value] \n vmov %[res], %[temp]")
//     #else
//         #define ARM_ROUND_DBL(value) ARM_ROUND(value, "vcvtr.s32.f64 %[temp], %P[value] \n vmov %[res], %[temp]")
//     #endif
    // 3. version for float
//     #define ARM_ROUND_FLT(value) ARM_ROUND(value, "vcvtr.s32.f32 %[temp], %[value]\n vmov %[res], %[temp]")
// #endif // CV_VFP

/** \brief Rounds floating-point number to the nearest integer
 <p>
 @param value floating-point number. If the value is outside of INT_MIN ... INT_MAX range, the
 result is not defined.
 */
public static native int cvRound( double value );


/** \brief Rounds floating-point number to the nearest integer not larger than the original.
 <p>
 The function computes an integer i such that:
 \f[i \le \texttt{value} < i+1\f]
 @param value floating-point number. If the value is outside of INT_MIN ... INT_MAX range, the
 result is not defined.
 */
public static native int cvFloor( double value );

/** \brief Rounds floating-point number to the nearest integer not smaller than the original.
 <p>
 The function computes an integer i such that:
 \f[i \le \texttt{value} < i+1\f]
 @param value floating-point number. If the value is outside of INT_MIN ... INT_MAX range, the
 result is not defined.
 */
public static native int cvCeil( double value );

/** \brief Determines if the argument is Not A Number.
 <p>
 @param value The input floating-point value
 <p>
 The function returns 1 if the argument is Not A Number (as defined by IEEE754 standard), 0
 otherwise. */
public static native int cvIsNaN( double value );

/** \brief Determines if the argument is Infinity.
 <p>
 @param value The input floating-point value
 <p>
 The function returns 1 if the argument is a plus or minus infinity (as defined by IEEE754 standard)
 and 0 otherwise. */
public static native int cvIsInf( double value );

// #ifdef __cplusplus

/** \overload */
public static native int cvRound(float value);

/** \overload */
public static native int cvRound( int value );

/** \overload */
public static native int cvFloor( float value );

/** \overload */
public static native int cvFloor( int value );

/** \overload */
public static native int cvCeil( float value );

/** \overload */
public static native int cvCeil( int value );

/** \overload */
public static native int cvIsNaN( float value );

/** \overload */
public static native int cvIsInf( float value );

// #endif // __cplusplus

/** \} core_utils */

// #endif


// Parsed from <opencv2/core/saturate.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Copyright (C) 2014, Itseez Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_CORE_SATURATE_HPP__
// #define __OPENCV_CORE_SATURATE_HPP__

// #include "opencv2/core/cvdef.h"
// #include "opencv2/core/fast_math.hpp"

/** \addtogroup core_utils
 *  \{
<p>
/////////////// saturate_cast (used in image & signal processing) ///////////////////
<p>
/** \brief Template function for accurate conversion from one primitive type to another.
 <p>
 The functions saturate_cast resemble the standard C++ cast operations, such as static_cast\<T\>()
 and others. They perform an efficient and accurate conversion from one primitive type to another
 (see the introduction chapter). saturate in the name means that when the input value v is out of the
 range of the target type, the result is not formed just by taking low bits of the input, but instead
 the value is clipped. For example:
 <pre>{@code
 uchar a = saturate_cast<uchar>(-100); // a = 0 (UCHAR_MIN)
 short b = saturate_cast<short>(33333.33333); // b = 32767 (SHRT_MAX)
 }</pre>
 Such clipping is done when the target type is unsigned char , signed char , unsigned short or
 signed short . For 32-bit integers, no clipping is done.
 <p>
 When the parameter is a floating-point value and the target type is an integer (8-, 16- or 32-bit),
 the floating-point value is first rounded to the nearest integer and then clipped if needed (when
 the target type is 8- or 16-bit).
 <p>
 This operation is used in the simplest or most complex image processing functions in OpenCV.
 <p>
 @param v Function parameter.
 \sa add, subtract, multiply, divide, Mat::convertTo
 */

/** \overload */
@Namespace("cv") public static native @Cast("uchar") @Name("saturate_cast<uchar>") byte ucharSaturateCast(@Cast("schar") byte v);
@Namespace("cv") public static native @Cast("schar") @Name("saturate_cast<schar>") byte scharSaturateCast(@Cast("schar") byte v);
@Namespace("cv") public static native @Cast("ushort") @Name("saturate_cast<ushort>") short ushortSaturateCast(@Cast("schar") byte v);
@Namespace("cv") public static native @Name("saturate_cast<short>") short shortSaturateCast(@Cast("schar") byte v);
@Namespace("cv") public static native @Name("saturate_cast<int>") int intSaturate(@Cast("schar") byte v);
@Namespace("cv") public static native @Cast("unsigned") @Name("saturate_cast<unsigned>") int unsignedSaturateCast(@Cast("schar") byte v);
/** \overload */

/** \overload */
@Namespace("cv") public static native @Cast("uchar") @Name("saturate_cast<uchar>") byte ucharSaturateCast(short v);
@Namespace("cv") public static native @Cast("schar") @Name("saturate_cast<schar>") byte scharSaturateCast(short v);
@Namespace("cv") public static native @Cast("ushort") @Name("saturate_cast<ushort>") short ushortSaturateCast(short v);
@Namespace("cv") public static native @Name("saturate_cast<short>") short shortSaturateCast(short v);
@Namespace("cv") public static native @Name("saturate_cast<int>") int intSaturate(short v);
@Namespace("cv") public static native @Cast("unsigned") @Name("saturate_cast<unsigned>") int unsignedSaturateCast(short v);
/** \overload */

/** \overload */
@Namespace("cv") public static native @Cast("uchar") @Name("saturate_cast<uchar>") byte ucharSaturateCast(int v);
@Namespace("cv") public static native @Cast("schar") @Name("saturate_cast<schar>") byte scharSaturateCast(int v);
@Namespace("cv") public static native @Cast("ushort") @Name("saturate_cast<ushort>") short ushortSaturateCast(int v);
@Namespace("cv") public static native @Name("saturate_cast<short>") short shortSaturateCast(int v);
@Namespace("cv") public static native @Name("saturate_cast<int>") int intSaturate(int v);
@Namespace("cv") public static native @Cast("unsigned") @Name("saturate_cast<unsigned>") int unsignedSaturateCast(int v);
/** \overload */
@Namespace("cv") public static native @Cast("uchar") @Name("saturate_cast<uchar>") byte ucharSaturateCast(float v);
@Namespace("cv") public static native @Cast("schar") @Name("saturate_cast<schar>") byte scharSaturateCast(float v);
@Namespace("cv") public static native @Cast("ushort") @Name("saturate_cast<ushort>") short ushortSaturateCast(float v);
@Namespace("cv") public static native @Name("saturate_cast<short>") short shortSaturateCast(float v);
@Namespace("cv") public static native @Name("saturate_cast<int>") int intSaturate(float v);
@Namespace("cv") public static native @Cast("unsigned") @Name("saturate_cast<unsigned>") int unsignedSaturateCast(float v);
/** \overload */
@Namespace("cv") public static native @Cast("uchar") @Name("saturate_cast<uchar>") byte ucharSaturateCast(double v);
@Namespace("cv") public static native @Cast("schar") @Name("saturate_cast<schar>") byte scharSaturateCast(double v);
@Namespace("cv") public static native @Cast("ushort") @Name("saturate_cast<ushort>") short ushortSaturateCast(double v);
@Namespace("cv") public static native @Name("saturate_cast<short>") short shortSaturateCast(double v);
@Namespace("cv") public static native @Name("saturate_cast<int>") int intSaturate(double v);
@Namespace("cv") public static native @Cast("unsigned") @Name("saturate_cast<unsigned>") int unsignedSaturateCast(double v);
/** \overload */
@Namespace("cv") public static native @Cast("uchar") @Name("saturate_cast<uchar>") byte ucharSaturateCast(@Cast("int64") long v);
@Namespace("cv") public static native @Cast("schar") @Name("saturate_cast<schar>") byte scharSaturateCast(@Cast("int64") long v);
@Namespace("cv") public static native @Cast("ushort") @Name("saturate_cast<ushort>") short ushortSaturateCast(@Cast("int64") long v);
@Namespace("cv") public static native @Name("saturate_cast<short>") short shortSaturateCast(@Cast("int64") long v);
@Namespace("cv") public static native @Name("saturate_cast<int>") int intSaturate(@Cast("int64") long v);
@Namespace("cv") public static native @Cast("unsigned") @Name("saturate_cast<unsigned>") int unsignedSaturateCast(@Cast("int64") long v);
/** \overload */

// we intentionally do not clip negative numbers, to make -1 become 0xffffffff etc.

/** \} */

 // cv

// #endif // __OPENCV_CORE_SATURATE_HPP__


// Parsed from <opencv2/core/version.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                        Intel License Agreement
//                For Open Source Computer Vision Library
//
// Copyright( C) 2000-2015, Intel Corporation, all rights reserved.
// Copyright (C) 2011-2013, NVIDIA Corporation, all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Copyright (C) 2015, Itseez Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of Intel Corporation may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
//(including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort(including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

/*
  definition of the current version of OpenCV
  Usefull to test in user programs
*/

// #ifndef __OPENCV_VERSION_HPP__
// #define __OPENCV_VERSION_HPP__

public static final int CV_VERSION_MAJOR =    3;
public static final int CV_VERSION_MINOR =    1;
public static final int CV_VERSION_REVISION = 0;
public static final String CV_VERSION_STATUS =   "";

// #define CVAUX_STR_EXP(__A)  #__A
// #define CVAUX_STR(__A)      CVAUX_STR_EXP(__A)

// #define CVAUX_STRW_EXP(__A)  L#__A
// #define CVAUX_STRW(__A)      CVAUX_STRW_EXP(__A)

public static native @MemberGetter String CV_VERSION();
public static final String CV_VERSION = CV_VERSION();

/* old  style version constants*/
public static final int CV_MAJOR_VERSION =    CV_VERSION_MAJOR;
public static final int CV_MINOR_VERSION =    CV_VERSION_MINOR;
public static final int CV_SUBMINOR_VERSION = CV_VERSION_REVISION;

// #endif


// Parsed from <opencv2/core/base.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Copyright (C) 2014, Itseez Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_CORE_BASE_HPP__
// #define __OPENCV_CORE_BASE_HPP__

// #ifndef __cplusplus
// #endif

// #include <climits>
// #include <algorithm>

// #include "opencv2/core/cvdef.h"
// #include "opencv2/core/cvstd.hpp"

/** \addtogroup core_utils
 *  \{ */
/** error codes */
/** enum cv::Error::Code */
public static final int
    /** everithing is ok */
    StsOk= 0,
    /** pseudo error for back trace */
    StsBackTrace= -1,
    /** unknown /unspecified error */
    StsError= -2,
    /** internal error (bad state) */
    StsInternal= -3,
    /** insufficient memory */
    StsNoMem= -4,
    /** function arg/param is bad */
    StsBadArg= -5,
    /** unsupported function */
    StsBadFunc= -6,
    /** iter. didn't converge */
    StsNoConv= -7,
    /** tracing */
    StsAutoTrace= -8,
    /** image header is NULL */
    HeaderIsNull= -9,
    /** image size is invalid */
    BadImageSize= -10,
    /** offset is invalid */
    BadOffset= -11,
    //!<
    BadDataPtr= -12,
    //!<
    BadStep= -13,
    //!<
    BadModelOrChSeq= -14,
    //!<
    BadNumChannels= -15,
    //!<
    BadNumChannel1U= -16,
    //!<
    BadDepth= -17,
    //!<
    BadAlphaChannel= -18,
    //!<
    BadOrder= -19,
    //!<
    BadOrigin= -20,
    //!<
    BadAlign= -21,
    //!<
    BadCallBack= -22,
    //!<
    BadTileSize= -23,
    //!<
    BadCOI= -24,
    //!<
    BadROISize= -25,
    //!<
    MaskIsTiled= -26,
    /** null pointer */
    StsNullPtr= -27,
    /** incorrect vector length */
    StsVecLengthErr= -28,
    /** incorr. filter structure content */
    StsFilterStructContentErr= -29,
    /** incorr. transform kernel content */
    StsKernelStructContentErr= -30,
    /** incorrect filter ofset value */
    StsFilterOffsetErr= -31,
    /** the input/output structure size is incorrect */
    StsBadSize= -201,
    /** division by zero */
    StsDivByZero= -202,
    /** in-place operation is not supported */
    StsInplaceNotSupported= -203,
    /** request can't be completed */
    StsObjectNotFound= -204,
    /** formats of input/output arrays differ */
    StsUnmatchedFormats= -205,
    /** flag is wrong or not supported */
    StsBadFlag= -206,
    /** bad CvPoint */
    StsBadPoint= -207,
    /** bad format of mask (neither 8uC1 nor 8sC1) */
    StsBadMask= -208,
    /** sizes of input/output structures do not match */
    StsUnmatchedSizes= -209,
    /** the data format/type is not supported by the function */
    StsUnsupportedFormat= -210,
    /** some of parameters are out of range */
    StsOutOfRange= -211,
    /** invalid syntax/structure of the parsed file */
    StsParseError= -212,
    /** the requested function/feature is not implemented */
    StsNotImplemented= -213,
    /** an allocated block has been corrupted */
    StsBadMemBlock= -214,
    /** assertion failed */
    StsAssert= -215,
    GpuNotSupported= -216,
    GpuApiCallError= -217,
    OpenGlNotSupported= -218,
    OpenGlApiCallError= -219,
    OpenCLApiCallError= -220,
    OpenCLDoubleNotSupported= -221,
    OpenCLInitError= -222,
    OpenCLNoAMDBlasFft= -223;
 //Error

/** \} core_utils
 <p>
 *  \addtogroup core_array
 *  \{
 <p>
 *  matrix decomposition types */
/** enum cv::DecompTypes */
public static final int
    /** Gaussian elimination with the optimal pivot element chosen. */
    DECOMP_LU       = 0,
    /** singular value decomposition (SVD) method; the system can be over-defined and/or the matrix
    src1 can be singular */
    DECOMP_SVD      = 1,
    /** eigenvalue decomposition; the matrix src1 must be symmetrical */
    DECOMP_EIG      = 2,
    /** Cholesky \f$LL^T\f$ factorization; the matrix src1 must be symmetrical and positively
    defined */
    DECOMP_CHOLESKY = 3,
    /** QR factorization; the system can be over-defined and/or the matrix src1 can be singular */
    DECOMP_QR       = 4,
    /** while all the previous flags are mutually exclusive, this flag can be used together with
    any of the previous; it means that the normal equations
    \f$\texttt{src1}^T\cdot\texttt{src1}\cdot\texttt{dst}=\texttt{src1}^T\texttt{src2}\f$ are
    solved instead of the original system
    \f$\texttt{src1}\cdot\texttt{dst}=\texttt{src2}\f$ */
    DECOMP_NORMAL   = 16;

/** norm types
- For one array:
\f[norm =  \forkthree{\|\texttt{src1}\|_{L_{\infty}} =  \max _I | \texttt{src1} (I)|}{if  \(\texttt{normType} = \texttt{NORM_INF}\) }
{ \| \texttt{src1} \| _{L_1} =  \sum _I | \texttt{src1} (I)|}{if  \(\texttt{normType} = \texttt{NORM_L1}\) }
{ \| \texttt{src1} \| _{L_2} =  \sqrt{\sum_I \texttt{src1}(I)^2} }{if  \(\texttt{normType} = \texttt{NORM_L2}\) }\f]
<p>
- Absolute norm for two arrays
\f[norm =  \forkthree{\|\texttt{src1}-\texttt{src2}\|_{L_{\infty}} =  \max _I | \texttt{src1} (I) -  \texttt{src2} (I)|}{if  \(\texttt{normType} = \texttt{NORM_INF}\) }
{ \| \texttt{src1} - \texttt{src2} \| _{L_1} =  \sum _I | \texttt{src1} (I) -  \texttt{src2} (I)|}{if  \(\texttt{normType} = \texttt{NORM_L1}\) }
{ \| \texttt{src1} - \texttt{src2} \| _{L_2} =  \sqrt{\sum_I (\texttt{src1}(I) - \texttt{src2}(I))^2} }{if  \(\texttt{normType} = \texttt{NORM_L2}\) }\f]
<p>
- Relative norm for two arrays
\f[norm =  \forkthree{\frac{\|\texttt{src1}-\texttt{src2}\|_{L_{\infty}}    }{\|\texttt{src2}\|_{L_{\infty}} }}{if  \(\texttt{normType} = \texttt{NORM_RELATIVE_INF}\) }
{ \frac{\|\texttt{src1}-\texttt{src2}\|_{L_1} }{\|\texttt{src2}\|_{L_1}} }{if  \(\texttt{normType} = \texttt{NORM_RELATIVE_L1}\) }
{ \frac{\|\texttt{src1}-\texttt{src2}\|_{L_2} }{\|\texttt{src2}\|_{L_2}} }{if  \(\texttt{normType} = \texttt{NORM_RELATIVE_L2}\) }\f]
<p>
As example for one array consider the function \f$r(x)= \begin{pmatrix} x \\ 1-x \end{pmatrix}, x \in [-1;1]\f$.
The \f$ L_{1}, L_{2} \f$ and \f$ L_{\infty} \f$ norm for the sample value \f$r(-1) = \begin{pmatrix} -1 \\ 2 \end{pmatrix}\f$
is calculated as follows
\f{align*}
    \| r(-1) \|_{L_1} &= |-1| + |2| = 3 \\
    \| r(-1) \|_{L_2} &= \sqrt{(-1)^{2} + (2)^{2}} = \sqrt{5} \\
    \| r(-1) \|_{L_\infty} &= \max(|-1|,|2|) = 2
\f}
and for \f$r(0.5) = \begin{pmatrix} 0.5 \\ 0.5 \end{pmatrix}\f$ the calculation is
\f{align*}
    \| r(0.5) \|_{L_1} &= |0.5| + |0.5| = 1 \\
    \| r(0.5) \|_{L_2} &= \sqrt{(0.5)^{2} + (0.5)^{2}} = \sqrt{0.5} \\
    \| r(0.5) \|_{L_\infty} &= \max(|0.5|,|0.5|) = 0.5.
\f}
The following graphic shows all values for the three norm functions \f$\| r(x) \|_{L_1}, \| r(x) \|_{L_2}\f$ and \f$\| r(x) \|_{L_\infty}\f$.
It is notable that the \f$ L_{1} \f$ norm forms the upper and the \f$ L_{\infty} \f$ norm forms the lower border for the example function \f$ r(x) \f$.
![Graphs for the different norm functions from the above example](pics/NormTypes_OneArray_1-2-INF.png)
 */
/** enum cv::NormTypes */
public static final int NORM_INF       = 1,
                 NORM_L1        = 2,
                 NORM_L2        = 4,
                 NORM_L2SQR     = 5,
                 NORM_HAMMING   = 6,
                 NORM_HAMMING2  = 7,
                 NORM_TYPE_MASK = 7,
                 /** flag */
                 NORM_RELATIVE  = 8,
                 /** flag */
                 NORM_MINMAX    = 32;

/** comparison types */
/** enum cv::CmpTypes */
public static final int /** src1 is equal to src2. */
 CMP_EQ = 0,
                /** src1 is greater than src2. */
                CMP_GT = 1,
                /** src1 is greater than or equal to src2. */
                CMP_GE = 2,
                /** src1 is less than src2. */
                CMP_LT = 3,
                /** src1 is less than or equal to src2. */
                CMP_LE = 4,
                /** src1 is unequal to src2. */
                CMP_NE = 5;

/** generalized matrix multiplication flags */
/** enum cv::GemmFlags */
public static final int /** transposes src1 */
 GEMM_1_T = 1,
                 /** transposes src2 */
                 GEMM_2_T = 2,
                 /** transposes src3 */
                 GEMM_3_T = 4;

/** enum cv::DftFlags */
public static final int
    /** performs an inverse 1D or 2D transform instead of the default forward
        transform. */
    DFT_INVERSE        = 1,
    /** scales the result: divide it by the number of array elements. Normally, it is
        combined with DFT_INVERSE. */
    DFT_SCALE          = 2,
    /** performs a forward or inverse transform of every individual row of the input
        matrix; this flag enables you to transform multiple vectors simultaneously and can be used to
        decrease the overhead (which is sometimes several times larger than the processing itself) to
        perform 3D and higher-dimensional transformations and so forth.*/
    DFT_ROWS           = 4,
    /** performs a forward transformation of 1D or 2D real array; the result,
        though being a complex array, has complex-conjugate symmetry (*CCS*, see the function
        description below for details), and such an array can be packed into a real array of the same
        size as input, which is the fastest option and which is what the function does by default;
        however, you may wish to get a full complex array (for simpler spectrum analysis, and so on) -
        pass the flag to enable the function to produce a full-size complex output array. */
    DFT_COMPLEX_OUTPUT = 16,
    /** performs an inverse transformation of a 1D or 2D complex array; the
        result is normally a complex array of the same size, however, if the input array has
        conjugate-complex symmetry (for example, it is a result of forward transformation with
        DFT_COMPLEX_OUTPUT flag), the output is a real array; while the function itself does not
        check whether the input is symmetrical or not, you can pass the flag and then the function
        will assume the symmetry and produce the real output array (note that when the input is packed
        into a real array and inverse transformation is executed, the function treats the input as a
        packed complex-conjugate symmetrical array, and the output will also be a real array). */
    DFT_REAL_OUTPUT    = 32,
    /** performs an inverse 1D or 2D transform instead of the default forward transform. */
    DCT_INVERSE        =  DFT_INVERSE,
    /** performs a forward or inverse transform of every individual row of the input
        matrix. This flag enables you to transform multiple vectors simultaneously and can be used to
        decrease the overhead (which is sometimes several times larger than the processing itself) to
        perform 3D and higher-dimensional transforms and so forth.*/
    DCT_ROWS           =  DFT_ROWS;

/** Various border types, image boundaries are denoted with {@code |}
 *  @see borderInterpolate, copyMakeBorder */
/** enum cv::BorderTypes */
public static final int
    /** {@code iiiiii|abcdefgh|iiiiiii}  with some specified {@code i} */
    BORDER_CONSTANT    = 0,
    /** {@code aaaaaa|abcdefgh|hhhhhhh} */
    BORDER_REPLICATE   = 1,
    /** {@code fedcba|abcdefgh|hgfedcb} */
    BORDER_REFLECT     = 2,
    /** {@code cdefgh|abcdefgh|abcdefg} */
    BORDER_WRAP        = 3,
    /** {@code gfedcb|abcdefgh|gfedcba} */
    BORDER_REFLECT_101 = 4,
    /** {@code uvwxyz|absdefgh|ijklmno} */
    BORDER_TRANSPARENT = 5,

    /** same as BORDER_REFLECT_101 */
    BORDER_REFLECT101  =  BORDER_REFLECT_101,
    /** same as BORDER_REFLECT_101 */
    BORDER_DEFAULT     =  BORDER_REFLECT_101,
    /** do not look outside of ROI */
    BORDER_ISOLATED    = 16;

/** \} core_array
 <p>
 *  \addtogroup core_utils
 *  \{
 <p>
 *  \cond IGNORED
<p>
//////////////// static assert ///////////////// */
// #define CVAUX_CONCAT_EXP(a, b) a##b
// #define CVAUX_CONCAT(a, b) CVAUX_CONCAT_EXP(a,b)

// #if defined(__clang__)
// #elif defined(__GNUC__)
// #elif defined(_MSC_VER)
// #endif
// #ifndef CV_StaticAssert
// #endif

// Suppress warning "-Wdeprecated-declarations" / C4996
// #if defined(_MSC_VER)
// #elif defined(__GNUC__)
// #else
//     #define CV_DO_PRAGMA(x)
// #endif

// #ifdef _MSC_VER
// #define CV_SUPPRESS_DEPRECATED_START
//     CV_DO_PRAGMA(warning(push))
//     CV_DO_PRAGMA(warning(disable: 4996))
// #define CV_SUPPRESS_DEPRECATED_END CV_DO_PRAGMA(warning(pop))
// #elif defined (__clang__) || ((__GNUC__)  && (__GNUC__*100 + __GNUC_MINOR__ > 405))
// #define CV_SUPPRESS_DEPRECATED_START
//     CV_DO_PRAGMA(GCC diagnostic push)
//     CV_DO_PRAGMA(GCC diagnostic ignored "-Wdeprecated-declarations")
// #define CV_SUPPRESS_DEPRECATED_END CV_DO_PRAGMA(GCC diagnostic pop)
// #else
// #define CV_SUPPRESS_DEPRECATED_START
// #define CV_SUPPRESS_DEPRECATED_END
// #endif
// #define CV_UNUSED(name) (void)name
/** \endcond
<p>
/** \brief Signals an error and raises the exception.
<p>
By default the function prints information about the error to stderr,
then it either stops if setBreakOnError() had been called before or raises the exception.
It is possible to alternate error processing by using redirectError().
@param _code - error code (Error::Code)
@param _err - error description
@param _func - function name. Available only when the compiler supports getting it
@param _file - source file name where the error has occured
@param _line - line number in the source file where the error has occured
@see CV_Error, CV_Error_, CV_ErrorNoReturn, CV_ErrorNoReturn_, CV_Assert, CV_DbgAssert
 */
@Namespace("cv") public static native void error(int _code, @Str BytePointer _err, @Cast("const char*") BytePointer _func, @Cast("const char*") BytePointer _file, int _line);
@Namespace("cv") public static native void error(int _code, @Str String _err, String _func, String _file, int _line);

// #ifdef __GNUC__
// # if defined __clang__ || defined __APPLE__
// #   pragma GCC diagnostic push
// #   pragma GCC diagnostic ignored "-Winvalid-noreturn"
// # endif
// #endif

/** same as cv::error, but does not return */
@Namespace("cv") public static native void errorNoReturn(int _code, @Str BytePointer _err, @Cast("const char*") BytePointer _func, @Cast("const char*") BytePointer _file, int _line);
@Namespace("cv") public static native void errorNoReturn(int _code, @Str String _err, String _func, String _file, int _line);
// #ifdef __GNUC__
// # if defined __clang__ || defined __APPLE__
// #   pragma GCC diagnostic pop
// # endif
// #endif

// #if defined __GNUC__
// #elif defined _MSC_VER
// #define CV_Func __FUNCTION__
// #else
// #define CV_Func ""
// #endif

/** \brief Call the error handler.
<p>
Currently, the error handler prints the error code and the error message to the standard
error stream {@code stderr}. In the Debug configuration, it then provokes memory access violation, so that
the execution stack and all the parameters can be analyzed by the debugger. In the Release
configuration, the exception is thrown.
<p>
@param code one of Error::Code
@param msg error message
*/
// #define CV_Error( code, msg ) cv::error( code, msg, CV_Func, __FILE__, __LINE__ )

/**  \brief Call the error handler.
<p>
This macro can be used to construct an error message on-fly to include some dynamic information,
for example:
<pre>{@code
    // note the extra parentheses around the formatted text message
    CV_Error_( CV_StsOutOfRange,
    ("the value at (%d, %d)=%g is out of range", badPt.x, badPt.y, badValue));
}</pre>
@param code one of Error::Code
@param args printf-like formatted error message in parentheses
*/
// #define CV_Error_( code, args ) cv::error( code, cv::format args, CV_Func, __FILE__, __LINE__ )

/** \brief Checks a condition at runtime and throws exception if it fails
<p>
The macros CV_Assert (and CV_DbgAssert(expr)) evaluate the specified expression. If it is 0, the macros
raise an error (see cv::error). The macro CV_Assert checks the condition in both Debug and Release
configurations while CV_DbgAssert is only retained in the Debug configuration.
*/
// #define CV_Assert( expr ) if(!!(expr)) ; else cv::error( cv::Error::StsAssert, #expr, CV_Func, __FILE__, __LINE__ )

/** same as CV_Error(code,msg), but does not return */
// #define CV_ErrorNoReturn( code, msg ) cv::errorNoReturn( code, msg, CV_Func, __FILE__, __LINE__ )

/** same as CV_Error_(code,args), but does not return */
// #define CV_ErrorNoReturn_( code, args ) cv::errorNoReturn( code, cv::format args, CV_Func, __FILE__, __LINE__ )

/** replaced with CV_Assert(expr) in Debug configuration */
// #ifdef _DEBUG
// #  define CV_DbgAssert(expr) CV_Assert(expr)
// #else
// #  define CV_DbgAssert(expr)
// #endif

/*
 * Hamming distance functor - counts the bit differences between two strings - useful for the Brief descriptor
 * bit count of A exclusive XOR'ed with B
 */
@Namespace("cv") public static class Hamming extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Hamming() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Hamming(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Hamming(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public Hamming position(int position) {
        return (Hamming)super.position(position);
    }

    /** enum cv::Hamming:: */
    public static final int normType =  NORM_HAMMING;

    /** this will count the bits in a ^ b
     */
    public native @Cast("cv::Hamming::ResultType") @Name("operator ()") int apply( @Cast("const unsigned char*") BytePointer a, @Cast("const unsigned char*") BytePointer b, int size );
    public native @Cast("cv::Hamming::ResultType") @Name("operator ()") int apply( @Cast("const unsigned char*") ByteBuffer a, @Cast("const unsigned char*") ByteBuffer b, int size );
    public native @Cast("cv::Hamming::ResultType") @Name("operator ()") int apply( @Cast("const unsigned char*") byte[] a, @Cast("const unsigned char*") byte[] b, int size );
}

/////////////////////////////////// inline norms ////////////////////////////////////
@Namespace("cv") public static native int cv_abs(@Cast("uchar") byte x);
@Namespace("cv") public static native int cv_abs(@Cast("ushort") short x);















/** \brief Computes the cube root of an argument.
 <p>
 The function cubeRoot computes \f$\sqrt[3]{\texttt{val}}\f$. Negative arguments are handled correctly.
 NaN and Inf are not handled. The accuracy approaches the maximum possible accuracy for
 single-precision data.
 @param val A function argument.
 */
@Namespace("cv") public static native float cubeRoot(float val);

/** \brief Calculates the angle of a 2D vector in degrees.
 <p>
 The function fastAtan2 calculates the full-range angle of an input 2D vector. The angle is measured
 in degrees and varies from 0 to 360 degrees. The accuracy is about 0.3 degrees.
 @param x x-coordinate of the vector.
 @param y y-coordinate of the vector.
 */
@Namespace("cv") public static native float fastAtan2(float y, float x);

/** proxy for hal::LU */
/** proxy for hal::LU */
/** proxy for hal::Cholesky */
/** proxy for hal::Cholesky */

////////////////// forward declarations for important OpenCV types //////////////////

/** \cond IGNORED */
    @Namespace("cv::ogl") @Opaque public static class Buffer extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Buffer() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Buffer(Pointer p) { super(p); }
    }
    @Namespace("cv::ogl") @Opaque public static class Texture2D extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Texture2D() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Texture2D(Pointer p) { super(p); }
    }
    @Namespace("cv::ogl") @Opaque public static class Arrays extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Arrays() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Arrays(Pointer p) { super(p); }
    }

    @Namespace("cv::cuda") @Opaque public static class HostMem extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public HostMem() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public HostMem(Pointer p) { super(p); }
    }
    @Namespace("cv::cuda") @Opaque public static class Stream extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Stream() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Stream(Pointer p) { super(p); }
    }
    @Namespace("cv::cuda") @Opaque public static class Event extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Event() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Event(Pointer p) { super(p); }
    }


@Namespace("cv::ipp") public static native int getIppFeatures();
@Namespace("cv::ipp") public static native void setIppStatus(int status, @Cast("const char*") BytePointer funcname/*=NULL*/, @Cast("const char*") BytePointer filename/*=NULL*/,
                             int line/*=0*/);
@Namespace("cv::ipp") public static native void setIppStatus(int status);
@Namespace("cv::ipp") public static native void setIppStatus(int status, String funcname/*=NULL*/, String filename/*=NULL*/,
                             int line/*=0*/);
@Namespace("cv::ipp") public static native int getIppStatus();
@Namespace("cv::ipp") public static native @Str BytePointer getIppErrorLocation();
@Namespace("cv::ipp") public static native @Cast("bool") boolean useIPP();
@Namespace("cv::ipp") public static native void setUseIPP(@Cast("bool") boolean flag);

 // ipp

/** \endcond
 <p>
 *  \} core_utils */




 // cv

// #include "opencv2/core/neon_utils.hpp"

// #endif //__OPENCV_CORE_BASE_HPP__


// Parsed from <opencv2/core/cvstd.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_CORE_CVSTD_HPP__
// #define __OPENCV_CORE_CVSTD_HPP__

// #ifndef __cplusplus
// #endif

// #include "opencv2/core/cvdef.h"

// #include <cstddef>
// #include <cstring>
// #include <cctype>

// #ifndef OPENCV_NOSTL
// #  include <string>
// #endif

// import useful primitives from stl
// #ifndef OPENCV_NOSTL_TRANSITIONAL
// #  include <algorithm>
// #  include <utility>
// #  include <cstdlib> //for abs(int)
// #  include <cmath>

    @Namespace("std") public static native @Cast("uchar") byte abs(@Cast("uchar") byte a);
    @Namespace("std") public static native @Cast("ushort") short abs(@Cast("ushort") short a);
    @Namespace("std") public static native @Cast("unsigned") int abs(@Cast("unsigned") int a);


// #else
// #endif

/** \addtogroup core_utils
 *  \{
<p>
//////////////////////////// memory management functions ////////////////////////////
<p>
/** \brief Allocates an aligned memory buffer.
<p>
The function allocates the buffer of the specified size and returns it. When the buffer size is 16
bytes or more, the returned buffer is aligned to 16 bytes.
@param bufSize Allocated buffer size.
 */
@Namespace("cv") public static native Pointer fastMalloc(@Cast("size_t") long bufSize);

/** \brief Deallocates a memory buffer.
<p>
The function deallocates the buffer allocated with fastMalloc . If NULL pointer is passed, the
function does nothing. C version of the function clears the pointer *pptr* to avoid problems with
double memory deallocation.
@param ptr Pointer to the allocated buffer.
 */
@Namespace("cv") public static native void fastFree(Pointer ptr);

/**
  The STL-compilant memory Allocator based on cv::fastMalloc() and cv::fastFree()
*/

/** \} core_utils
 <p>
 *  \cond IGNORED */

// Metafunction to avoid taking a reference to void.

@Name("cv::detail::RefOrVoid<void>") public static class RefOrVoid extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RefOrVoid() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public RefOrVoid(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RefOrVoid(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public RefOrVoid position(int position) {
        return (RefOrVoid)super.position(position);
    }
 @Opaque public static class type extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public type() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public type(Pointer p) { super(p); }
} }

// This class would be private to Ptr, if it didn't have to be a non-template.
@Namespace("cv::detail") @Opaque public static class PtrOwner extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PtrOwner() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PtrOwner(Pointer p) { super(p); }
}



/** \endcond
 <p>
 *  \addtogroup core_basic
 *  \{
<p>
/** \brief Template class for smart pointers with shared ownership
<p>
A Ptr\<T\> pretends to be a pointer to an object of type T. Unlike an ordinary pointer, however, the
object will be automatically cleaned up once all Ptr instances pointing to it are destroyed.
<p>
Ptr is similar to boost::shared_ptr that is part of the Boost library
(<http://www.boost.org/doc/libs/release/libs/smart_ptr/shared_ptr.htm>) and std::shared_ptr from
the [C++11](http://en.wikipedia.org/wiki/C++11) standard.
<p>
This class provides the following advantages:
-   Default constructor, copy constructor, and assignment operator for an arbitrary C++ class or C
    structure. For some objects, like files, windows, mutexes, sockets, and others, a copy
    constructor or an assignment operator are difficult to define. For some other objects, like
    complex classifiers in OpenCV, copy constructors are absent and not easy to implement. Finally,
    some of complex OpenCV and your own data structures may be written in C. However, copy
    constructors and default constructors can simplify programming a lot. Besides, they are often
    required (for example, by STL containers). By using a Ptr to such an object instead of the
    object itself, you automatically get all of the necessary constructors and the assignment
    operator.
-   *O(1)* complexity of the above-mentioned operations. While some structures, like std::vector,
    provide a copy constructor and an assignment operator, the operations may take a considerable
    amount of time if the data structures are large. But if the structures are put into a Ptr, the
    overhead is small and independent of the data size.
-   Automatic and customizable cleanup, even for C structures. See the example below with FILE\*.
-   Heterogeneous collections of objects. The standard STL and most other C++ and OpenCV containers
    can store only objects of the same type and the same size. The classical solution to store
    objects of different types in the same container is to store pointers to the base class (Base\*)
    instead but then you lose the automatic memory management. Again, by using Ptr\<Base\> instead
    of raw pointers, you can solve the problem.
<p>
A Ptr is said to *own* a pointer - that is, for each Ptr there is a pointer that will be deleted
once all Ptr instances that own it are destroyed. The owned pointer may be null, in which case
nothing is deleted. Each Ptr also *stores* a pointer. The stored pointer is the pointer the Ptr
pretends to be; that is, the one you get when you use Ptr::get or the conversion to T\*. It's
usually the same as the owned pointer, but if you use casts or the general shared-ownership
constructor, the two may diverge: the Ptr will still own the original pointer, but will itself point
to something else.
<p>
The owned pointer is treated as a black box. The only thing Ptr needs to know about it is how to
delete it. This knowledge is encapsulated in the *deleter* - an auxiliary object that is associated
with the owned pointer and shared between all Ptr instances that own it. The default deleter is an
instance of DefaultDeleter, which uses the standard C++ delete operator; as such it will work with
any pointer allocated with the standard new operator.
<p>
However, if the pointer must be deleted in a different way, you must specify a custom deleter upon
Ptr construction. A deleter is simply a callable object that accepts the pointer as its sole
argument. For example, if you want to wrap FILE, you may do so as follows:
<pre>{@code
    Ptr<FILE> f(fopen("myfile.txt", "w"), fclose);
    if(!f) throw ...;
    fprintf(f, ....);
    ...
    // the file will be closed automatically by f's destructor.
}</pre>
Alternatively, if you want all pointers of a particular type to be deleted the same way, you can
specialize DefaultDeleter<T>::operator() for that type, like this:
<pre>{@code
    namespace cv {
    template<> void DefaultDeleter<FILE>::operator ()(FILE * obj) const
    {
        fclose(obj);
    }
    }
}</pre>
For convenience, the following types from the OpenCV C API already have such a specialization that
calls the appropriate release function:
-   CvCapture
-   CvFileStorage
-   CvHaarClassifierCascade
-   CvMat
-   CvMatND
-   CvMemStorage
-   CvSparseMat
-   CvVideoWriter
-   IplImage
\note The shared ownership mechanism is implemented with reference counting. As such, cyclic
ownership (e.g. when object a contains a Ptr to object b, which contains a Ptr to object a) will
lead to all involved objects never being cleaned up. Avoid such situations.
\note It is safe to concurrently read (but not write) a Ptr instance from multiple threads and
therefore it is normally safe to use it in multi-threaded applications. The same is true for Mat and
other C++ OpenCV classes that use internal reference counts.
*/

/** Equivalent to ptr1.swap(ptr2). Provided to help write generic algorithms. */

/** Return whether ptr1.get() and ptr2.get() are equal and not equal, respectively. */

/** {@code makePtr<T>(...)} is equivalent to {@code Ptr<T>(new T(...))}. It is shorter than the latter, and it's
marginally safer than using a constructor or Ptr::reset, since it ensures that the owned pointer
is new and thus not owned by any other Ptr instance.
Unfortunately, perfect forwarding is impossible to implement in C++03, and so makePtr is limited
to constructors of T that have up to 10 arguments, none of which are non-const references.
 */
/** \overload */
/** \overload */
/** \overload */
/** \overload */
/** \overload */
/** \overload */
/** \overload */
/** \overload */
/** \overload */
/** \overload */

//////////////////////////////// string class //////////////////////////////// //for string constructor from FileNode

/** \} core_basic
<p>
////////////////////////// cv::String implementation /////////////////////////
 <p>
 *  \cond IGNORED */



























































































/** \endcond */

// ************************* cv::String non-member functions *************************

/** \relates cv::String
/** \{ */

@Namespace("cv") public static native @Str @Name("operator +") BytePointer add(@Str BytePointer lhs, @Str BytePointer rhs);
@Namespace("cv") public static native @Str @Name("operator +") String add(@Str String lhs, @Str String rhs);

@Namespace("cv") public static native @Str @Name("operator +") BytePointer add(@Str BytePointer lhs, @Cast("char") byte rhs);
@Namespace("cv") public static native @Str @Name("operator +") String add(@Str String lhs, @Cast("char") byte rhs);

@Namespace("cv") public static native @Str @Name("operator +") BytePointer add(@Cast("char") byte lhs, @Str BytePointer rhs);
@Namespace("cv") public static native @Str @Name("operator +") String add(@Cast("char") byte lhs, @Str String rhs);

@Namespace("cv") public static native @Cast("bool") @Name("operator ==") boolean equals(@Str BytePointer lhs, @Str BytePointer rhs);
@Namespace("cv") public static native @Cast("bool") @Name("operator ==") boolean equals(@Str String lhs, @Str String rhs);
@Namespace("cv") public static native @Cast("bool") @Name("operator !=") boolean notEquals(@Str BytePointer lhs, @Str BytePointer rhs);
@Namespace("cv") public static native @Cast("bool") @Name("operator !=") boolean notEquals(@Str String lhs, @Str String rhs);
@Namespace("cv") public static native @Cast("bool") @Name("operator <") boolean lessThan(@Str BytePointer lhs, @Str BytePointer rhs);
@Namespace("cv") public static native @Cast("bool") @Name("operator <") boolean lessThan(@Str String lhs, @Str String rhs);
@Namespace("cv") public static native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Str BytePointer lhs, @Str BytePointer rhs);
@Namespace("cv") public static native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Str String lhs, @Str String rhs);
@Namespace("cv") public static native @Cast("bool") @Name("operator >") boolean greaterThan(@Str BytePointer lhs, @Str BytePointer rhs);
@Namespace("cv") public static native @Cast("bool") @Name("operator >") boolean greaterThan(@Str String lhs, @Str String rhs);
@Namespace("cv") public static native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Str BytePointer lhs, @Str BytePointer rhs);
@Namespace("cv") public static native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Str String lhs, @Str String rhs);

/** \} relates cv::String */

 // cv

// #ifndef OPENCV_NOSTL_TRANSITIONAL
    @Namespace("std") public static native void swap(@Str BytePointer a, @Str BytePointer b);
    @Namespace("std") public static native void swap(@Str String a, @Str String b);

// #else
// #endif

// #include "opencv2/core/ptr.inl.hpp"

// #endif //__OPENCV_CORE_CVSTD_HPP__


// Parsed from <opencv2/core/utility.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Copyright (C) 2015, Itseez Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_CORE_UTILITY_H__
// #define __OPENCV_CORE_UTILITY_H__

// #ifndef __cplusplus
// #endif

// #include "opencv2/core.hpp"

// #ifdef CV_COLLECT_IMPL_DATA
// #else
// #define CV_IMPL_ADD(impl)
// #endif

/** \addtogroup core_utils
 *  \{
<p>
/** \brief  Automatically Allocated Buffer Class
 <p>
 The class is used for temporary buffers in functions and methods.
 If a temporary buffer is usually small (a few K's of memory),
 but its size depends on the parameters, it makes sense to create a small
 fixed-size array on stack and use it if it's large enough. If the required buffer size
 is larger than the fixed size, another buffer of sufficient size is allocated dynamically
 and released after the processing. Therefore, in typical cases, when the buffer size is small,
 there is no overhead associated with malloc()/free().
 At the same time, there is no limit on the size of processed data.
 <p>
 This is what AutoBuffer does. The template takes 2 parameters - type of the buffer elements and
 the number of stack-allocated elements. Here is how the class is used:
 <p>
 <pre>{@code
 void my_func(const cv::Mat& m)
 {
    cv::AutoBuffer<float> buf; // create automatic buffer containing 1000 floats

    buf.allocate(m.rows); // if m.rows <= 1000, the pre-allocated buffer is used,
                          // otherwise the buffer of "m.rows" floats will be allocated
                          // dynamically and deallocated in cv::AutoBuffer destructor
    ...
 }
 }</pre>
*/

/**  \brief Sets/resets the break-on-error mode.
<p>
When the break-on-error mode is set, the default error handler issues a hardware exception, which
can make debugging more convenient.
<p>
@return the previous state
 */
@Namespace("cv") public static native @Cast("bool") boolean setBreakOnError(@Cast("bool") boolean flag); public static class ErrorCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ErrorCallback(Pointer p) { super(p); }
    protected ErrorCallback() { allocate(); }
    private native void allocate();
    public native int call( int status, @Cast("const char*") BytePointer func_name,
                                       @Cast("const char*") BytePointer err_msg, @Cast("const char*") BytePointer file_name,
                                       int line, Pointer userdata );
}


/** \brief Sets the new error handler and the optional user data.
  <p>
  The function sets the new error handler, called from cv::error().
  <p>
  @param errCallback the new error handler. If NULL, the default error handler is used.
  @param userdata the optional user data pointer, passed to the callback.
  @param prevUserdata the optional output parameter where the previous user data pointer is stored
  <p>
  @return the previous error handler
*/
@Namespace("cv") public static native ErrorCallback redirectError( ErrorCallback errCallback, Pointer userdata/*=0*/, @Cast("void**") PointerPointer prevUserdata/*=0*/);
@Namespace("cv") public static native ErrorCallback redirectError( ErrorCallback errCallback);
@Namespace("cv") public static native ErrorCallback redirectError( ErrorCallback errCallback, Pointer userdata/*=0*/, @Cast("void**") @ByPtrPtr Pointer prevUserdata/*=0*/);

/** \brief Returns a text string formatted using the printf-like expression.
<p>
The function acts like sprintf but forms and returns an STL string. It can be used to form an error
message in the Exception constructor.
@param fmt printf-compatible formatting specifiers.
 */
@Namespace("cv") public static native @Str BytePointer format( @Cast("const char*") BytePointer fmt );
@Namespace("cv") public static native @Str String format( String fmt );
@Namespace("cv") public static native @Str BytePointer tempfile( @Cast("const char*") BytePointer suffix/*=0*/);
@Namespace("cv") public static native @Str BytePointer tempfile();
@Namespace("cv") public static native @Str String tempfile( String suffix/*=0*/);
@Namespace("cv") public static native void glob(@Str BytePointer pattern, @ByRef StringVector result, @Cast("bool") boolean recursive/*=false*/);
@Namespace("cv") public static native void glob(@Str BytePointer pattern, @ByRef StringVector result);
@Namespace("cv") public static native void glob(@Str String pattern, @ByRef StringVector result, @Cast("bool") boolean recursive/*=false*/);
@Namespace("cv") public static native void glob(@Str String pattern, @ByRef StringVector result);

/** \brief OpenCV will try to set the number of threads for the next parallel region.
<p>
If threads == 0, OpenCV will disable threading optimizations and run all it's functions
sequentially. Passing threads \< 0 will reset threads number to system default. This function must
be called outside of parallel region.
<p>
OpenCV will try to run it's functions with specified threads number, but some behaviour differs from
framework:
-   {@code TBB} – User-defined parallel constructions will run with the same threads number, if
    another does not specified. If late on user creates own scheduler, OpenCV will be use it.
-   {@code OpenMP} – No special defined behaviour.
-   {@code Concurrency} – If threads == 1, OpenCV will disable threading optimizations and run it's
    functions sequentially.
-   {@code GCD} – Supports only values \<= 0.
-   {@code C=} – No special defined behaviour.
@param nthreads Number of threads used by OpenCV.
\sa getNumThreads, getThreadNum
 */
@Namespace("cv") public static native void setNumThreads(int nthreads);

/** \brief Returns the number of threads used by OpenCV for parallel regions.
<p>
Always returns 1 if OpenCV is built without threading support.
<p>
The exact meaning of return value depends on the threading framework used by OpenCV library:
- {@code TBB} – The number of threads, that OpenCV will try to use for parallel regions. If there is
  any tbb::thread_scheduler_init in user code conflicting with OpenCV, then function returns
  default number of threads used by TBB library.
- {@code OpenMP} – An upper bound on the number of threads that could be used to form a new team.
- {@code Concurrency} – The number of threads, that OpenCV will try to use for parallel regions.
- {@code GCD} – Unsupported; returns the GCD thread pool limit (512) for compatibility.
- {@code C=} – The number of threads, that OpenCV will try to use for parallel regions, if before
  called setNumThreads with threads \> 0, otherwise returns the number of logical CPUs,
  available for the process.
\sa setNumThreads, getThreadNum
 */
@Namespace("cv") public static native int getNumThreads();

/** \brief Returns the index of the currently executed thread within the current parallel region. Always
returns 0 if called outside of parallel region.
<p>
The exact meaning of return value depends on the threading framework used by OpenCV library:
- {@code TBB} – Unsupported with current 4.1 TBB release. May be will be supported in future.
- {@code OpenMP} – The thread number, within the current team, of the calling thread.
- {@code Concurrency} – An ID for the virtual processor that the current context is executing on (0
  for master thread and unique number for others, but not necessary 1,2,3,...).
- {@code GCD} – System calling thread's ID. Never returns 0 inside parallel region.
- {@code C=} – The index of the current parallel task.
\sa setNumThreads, getNumThreads
 */
@Namespace("cv") public static native int getThreadNum();

/** \brief Returns full configuration time cmake output.
<p>
Returned value is raw cmake output including version control system revision, compiler version,
compiler flags, enabled modules and third party libraries, etc. Output format depends on target
architecture.
 */
@Namespace("cv") public static native @Str BytePointer getBuildInformation();

/** \brief Returns the number of ticks.
<p>
The function returns the number of ticks after the certain event (for example, when the machine was
turned on). It can be used to initialize RNG or to measure a function execution time by reading the
tick count before and after the function call. See also the tick frequency.
 */
@Namespace("cv") public static native @Cast("int64") long getTickCount();

/** \brief Returns the number of ticks per second.
<p>
The function returns the number of ticks per second. That is, the following code computes the
execution time in seconds:
<pre>{@code
    double t = (double)getTickCount();
    // do something ...
    t = ((double)getTickCount() - t)/getTickFrequency();
}</pre>
 */
@Namespace("cv") public static native double getTickFrequency();

/** \brief Returns the number of CPU ticks.
<p>
The function returns the current number of CPU ticks on some architectures (such as x86, x64,
PowerPC). On other platforms the function is equivalent to getTickCount. It can also be used for
very accurate time measurements, as well as for RNG initialization. Note that in case of multi-CPU
systems a thread, from which getCPUTickCount is called, can be suspended and resumed at another CPU
with its own counter. So, theoretically (and practically) the subsequent calls to the function do
not necessary return the monotonously increasing values. Also, since a modern CPU varies the CPU
frequency depending on the load, the number of CPU clocks spent in some code cannot be directly
converted to time units. Therefore, getTickCount is generally a preferable solution for measuring
execution time.
 */
@Namespace("cv") public static native @Cast("int64") long getCPUTickCount();

/** \brief Returns true if the specified feature is supported by the host hardware.
<p>
The function returns true if the host hardware supports the specified feature. When user calls
setUseOptimized(false), the subsequent calls to checkHardwareSupport() will return false until
setUseOptimized(true) is called. This way user can dynamically switch on and off the optimized code
in OpenCV.
@param feature The feature of interest, one of cv::CpuFeatures
 */
@Namespace("cv") public static native @Cast("bool") boolean checkHardwareSupport(int feature);

/** \brief Returns the number of logical CPUs available for the process.
 */
@Namespace("cv") public static native int getNumberOfCPUs();


/** \brief Aligns a pointer to the specified number of bytes.
<p>
The function returns the aligned pointer of the same type as the input pointer:
\f[\texttt{(_Tp*)(((size_t)ptr + n-1) & -n)}\f]
@param ptr Aligned pointer.
@param n Alignment size that must be a power of two.
 */

/** \brief Aligns a buffer size to the specified number of bytes.
<p>
The function returns the minimum number that is greater or equal to sz and is divisible by n :
\f[\texttt{(sz + n-1) & -n}\f]
@param sz Buffer size to align.
@param n Alignment size that must be a power of two.
 */
@Namespace("cv") public static native @Cast("size_t") long alignSize(@Cast("size_t") long sz, int n);

/** \brief Enables or disables the optimized code.
<p>
The function can be used to dynamically turn on and off optimized code (code that uses SSE2, AVX,
and other instructions on the platforms that support it). It sets a global flag that is further
checked by OpenCV functions. Since the flag is not checked in the inner OpenCV loops, it is only
safe to call the function on the very top level in your application where you can be sure that no
other OpenCV function is currently executed.
<p>
By default, the optimized code is enabled unless you disable it in CMake. The current status can be
retrieved using useOptimized.
@param onoff The boolean flag specifying whether the optimized code should be used (onoff=true)
or not (onoff=false).
 */
@Namespace("cv") public static native void setUseOptimized(@Cast("bool") boolean onoff);

/** \brief Returns the status of optimized code usage.
<p>
The function returns true if the optimized code is enabled. Otherwise, it returns false.
 */
@Namespace("cv") public static native @Cast("bool") boolean useOptimized();

@Namespace("cv") public static native @Cast("size_t") long getElemSize(int type);

/////////////////////////////// Parallel Primitives //////////////////////////////////

/** \brief Base class for parallel data processors
*/
@Namespace("cv") public static class ParallelLoopBody extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParallelLoopBody(Pointer p) { super(p); }

    public native @Name("operator ()") void apply(@Const @ByRef Range range);
}

/** \brief Parallel data processor
*/
@Namespace("cv") public static native void parallel_for_(@Const @ByRef Range range, @Const @ByRef ParallelLoopBody body, double nstripes/*=-1.*/);
@Namespace("cv") public static native void parallel_for_(@Const @ByRef Range range, @Const @ByRef ParallelLoopBody body);

/////////////////////////////// forEach method of cv::Mat ////////////////////////////


/////////////////////////// Synchronization Primitives ///////////////////////////////

@Namespace("cv") @NoOffset public static class Mutex extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Mutex(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Mutex(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Mutex position(int position) {
        return (Mutex)super.position(position);
    }

    public Mutex() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Mutex(@Const @ByRef Mutex m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef Mutex m);
    public native @ByRef @Name("operator =") Mutex put(@Const @ByRef Mutex m);

    public native void lock();
    public native @Cast("bool") boolean trylock();
    public native void unlock();

    @Opaque public static class Impl extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Impl() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Impl(Pointer p) { super(p); }
    }
}

@Namespace("cv") @NoOffset public static class AutoLock extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutoLock(Pointer p) { super(p); }

    public AutoLock(@ByRef Mutex m) { super((Pointer)null); allocate(m); }
    private native void allocate(@ByRef Mutex m);
}

// TLS interface
@Namespace("cv") @NoOffset public static class TLSDataContainer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TLSDataContainer(Pointer p) { super(p); }

    public native Pointer getData();
// #endif
    public native Pointer createDataInstance();
    public native void deleteDataInstance(Pointer pData);

    public native int key_(); public native TLSDataContainer key_(int key_);
}

// Main TLS data class

/** \brief Designed for command line parsing
<p>
The sample below demonstrates how to use CommandLineParser:
<pre>{@code
    CommandLineParser parser(argc, argv, keys);
    parser.about("Application name v1.0.0");

    if (parser.has("help"))
    {
        parser.printMessage();
        return 0;
    }

    int N = parser.get<int>("N");
    double fps = parser.get<double>("fps");
    String path = parser.get<String>("path");

    use_time_stamp = parser.has("timestamp");

    String img1 = parser.get<String>(0);
    String img2 = parser.get<String>(1);

    int repeat = parser.get<int>(2);

    if (!parser.check())
    {
        parser.printErrors();
        return 0;
    }
}</pre>
<p>
### Keys syntax
<p>
The keys parameter is a string containing several blocks, each one is enclosed in curley braces and
describes one argument. Each argument contains three parts separated by the {@code |} symbol:
<p>
-# argument names is a space-separated list of option synonyms (to mark argument as positional, prefix it with the {@code @} symbol)
-# default value will be used if the argument was not provided (can be empty)
-# help message (can be empty)
<p>
For example:
<p>
<pre>{@code {.cpp}
    const String keys =
        "{help h usage ? |      | print this message   }"
        "{@image1        |      | image1 for compare   }"
        "{@image2        |<none>| image2 for compare   }"
        "{@repeat        |1     | number               }"
        "{path           |.     | path to file         }"
        "{fps            | -1.0 | fps for output video }"
        "{N count        |100   | count of objects     }"
        "{ts timestamp   |      | use time stamp       }"
        ;
}
}</pre>
<p>
Note that there are no default values for {@code help} and {@code timestamp} so we can check their presence using the {@code has()} method.
Arguments with default values are considered to be always present. Use the {@code get()} method in these cases to check their
actual value instead.
<p>
String keys like {@code get<String>("@image1")} return the empty string {@code ""} by default - even with an empty default value.
Use the special {@code <none>} default value to enforce that the returned string must not be empty. (like in {@code get<String>("@image2")})
<p>
### Usage
<p>
For the described keys:
<p>
<pre>{@code {.sh}
    # Good call (3 positional parameters: image1, image2 and repeat; N is 200, ts is true)
    $ ./app -N=200 1.png 2.jpg 19 -ts

    # Bad call
    $ ./app -fps=aaa
    ERRORS:
    Parameter 'fps': can not convert: [aaa] to [double]
}</pre>
 */

/** \} core_utils
 <p>
 *  \cond IGNORED
<p>
/////////////////////////////// AutoBuffer implementation //////////////////////////////////////// */























// #ifndef OPENCV_NOSTL


// #endif // OPENCV_NOSTL

/** \endcond */

 //namespace cv

// #ifndef DISABLE_OPENCV_24_COMPATIBILITY
// #include "opencv2/core/core_c.h"
// #endif

// #endif //__OPENCV_CORE_UTILITY_H__


// Parsed from <opencv2/core/types_c.h>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_CORE_TYPES_H__
// #define __OPENCV_CORE_TYPES_H__

// #ifdef HAVE_IPL
// #  ifndef __IPL_H__
// #    if defined WIN32 || defined _WIN32
// #    else
// #      include <ipl/ipl.h>
// #    endif
// #  endif
// #elif defined __IPL_H__
// #  define HAVE_IPL
// #endif

// #include "opencv2/core/cvdef.h"

// #ifndef SKIP_INCLUDES
// #include <assert.h>
// #include <stdlib.h>
// #include <string.h>
// #include <float.h>
// #endif // SKIP_INCLUDES

// #if defined WIN32 || defined _WIN32
// #else
// #  define CV_CDECL
// #  define CV_STDCALL
// #endif

// #ifndef CV_DEFAULT
// #  ifdef __cplusplus
// #    define CV_DEFAULT(val) = val
// #  else
// #  endif
// #endif

// #ifndef CV_EXTERN_C_FUNCPTR
// #  ifdef __cplusplus
// #    define CV_EXTERN_C_FUNCPTR(x) extern "C" { typedef x; }
// #  else
// #  endif
// #endif

// #ifndef CVAPI
// #  define CVAPI(rettype) CV_EXTERN_C CV_EXPORTS rettype CV_CDECL
// #endif

// #ifndef CV_IMPL
// #  define CV_IMPL CV_EXTERN_C
// #endif

// #ifdef __cplusplus
// #  include "opencv2/core.hpp"
// #endif

/** \addtogroup core_c
    \{
*/

/** \brief This is the "metatype" used *only* as a function parameter.
<p>
It denotes that the function accepts arrays of multiple types, such as IplImage*, CvMat* or even
CvSeq* sometimes. The particular array type is determined at runtime by analyzing the first 4
bytes of the header. In C++ interface the role of CvArr is played by InputArray and OutputArray.
 */

/** @see cv::Error::Code */
/** enum  */
public static final int
 /** everything is ok                */
 CV_StsOk= 0,
 /** pseudo error for back trace     */
 CV_StsBackTrace= -1,
 /** unknown /unspecified error      */
 CV_StsError= -2,
 /** internal error (bad state)      */
 CV_StsInternal= -3,
 /** insufficient memory             */
 CV_StsNoMem= -4,
 /** function arg/param is bad       */
 CV_StsBadArg= -5,
 /** unsupported function            */
 CV_StsBadFunc= -6,
 /** iter. didn't converge           */
 CV_StsNoConv= -7,
 /** tracing                         */
 CV_StsAutoTrace= -8,
 /** image header is NULL            */
 CV_HeaderIsNull= -9,
 /** image size is invalid           */
 CV_BadImageSize= -10,
 /** offset is invalid               */
 CV_BadOffset= -11,
 CV_BadDataPtr= -12,  /**/
 CV_BadStep= -13,  /**/
 CV_BadModelOrChSeq= -14,  /**/
 CV_BadNumChannels= -15,  /**/
 CV_BadNumChannel1U= -16,  /**/
 CV_BadDepth= -17,  /**/
 CV_BadAlphaChannel= -18,  /**/
 CV_BadOrder= -19,  /**/
 CV_BadOrigin= -20,  /**/
 CV_BadAlign= -21,  /**/
 CV_BadCallBack= -22,  /**/
 CV_BadTileSize= -23,  /**/
 CV_BadCOI= -24,  /**/
 CV_BadROISize= -25,  /**/
 CV_MaskIsTiled= -26,  /**/
 /** null pointer */
 CV_StsNullPtr= -27,
 /** incorrect vector length */
 CV_StsVecLengthErr= -28,
 /** incorr. filter structure content */
 CV_StsFilterStructContentErr= -29,
 /** incorr. transform kernel content */
 CV_StsKernelStructContentErr= -30,
 /** incorrect filter offset value */
 CV_StsFilterOffsetErr= -31,
 /** the input/output structure size is incorrect  */
 CV_StsBadSize= -201,
 /** division by zero */
 CV_StsDivByZero= -202,
 /** in-place operation is not supported */
 CV_StsInplaceNotSupported= -203,
 /** request can't be completed */
 CV_StsObjectNotFound= -204,
 /** formats of input/output arrays differ */
 CV_StsUnmatchedFormats= -205,
 /** flag is wrong or not supported */
 CV_StsBadFlag= -206,
 /** bad CvPoint */
 CV_StsBadPoint= -207,
 /** bad format of mask (neither 8uC1 nor 8sC1)*/
 CV_StsBadMask= -208,
 /** sizes of input/output structures do not match */
 CV_StsUnmatchedSizes= -209,
 /** the data format/type is not supported by the function*/
 CV_StsUnsupportedFormat= -210,
 /** some of parameters are out of range */
 CV_StsOutOfRange= -211,
 /** invalid syntax/structure of the parsed file */
 CV_StsParseError= -212,
 /** the requested function/feature is not implemented */
 CV_StsNotImplemented= -213,
 /** an allocated block has been corrupted */
 CV_StsBadMemBlock= -214,
 /** assertion failed */
 CV_StsAssert= -215,
 CV_GpuNotSupported= -216,
 CV_GpuApiCallError= -217,
 CV_OpenGlNotSupported= -218,
 CV_OpenGlApiCallError= -219,
 CV_OpenCLApiCallError= -220,
 CV_OpenCLDoubleNotSupported= -221,
 CV_OpenCLInitError= -222,
 CV_OpenCLNoAMDBlasFft= -223;

/****************************************************************************************\
*                             Common macros and inline functions                         *
\****************************************************************************************/

// #define CV_SWAP(a,b,t) ((t) = (a), (a) = (b), (b) = (t))

/** min & max without jumps */
// #define  CV_IMIN(a, b)  ((a) ^ (((a)^(b)) & (((a) < (b)) - 1)))

// #define  CV_IMAX(a, b)  ((a) ^ (((a)^(b)) & (((a) > (b)) - 1)))

/** absolute value without jumps */
// #ifndef __cplusplus
// #else
// #  define  CV_IABS(a)     abs(a)
// #endif
// #define  CV_CMP(a,b)    (((a) > (b)) - ((a) < (b)))
// #define  CV_SIGN(a)     CV_CMP((a),0)

// #define cvInvSqrt(value) ((float)(1./sqrt(value)))
// #define cvSqrt(value)  ((float)sqrt(value))


/*************** Random number generation *******************/

public static final long CV_RNG_COEFF = 4164903690L;

/** \brief Initializes a random number generator state.
<p>
The function initializes a random number generator and returns the state. The pointer to the state
can be then passed to the cvRandInt, cvRandReal and cvRandArr functions. In the current
implementation a multiply-with-carry generator is used.
@param seed 64-bit value used to initiate a random sequence
\sa the C++ class RNG replaced CvRNG.
 */
public static native @Cast("CvRNG") long cvRNG( @Cast("int64") long seed/*=-1*/);
public static native @Cast("CvRNG") long cvRNG();

/** \brief Returns a 32-bit unsigned integer and updates RNG.
<p>
The function returns a uniformly-distributed random 32-bit unsigned integer and updates the RNG
state. It is similar to the rand() function from the C runtime library, except that OpenCV functions
always generates a 32-bit random number, regardless of the platform.
@param rng CvRNG state initialized by cvRNG.
 */
public static native @Cast("unsigned") int cvRandInt( @Cast("CvRNG*") LongPointer rng );
public static native @Cast("unsigned") int cvRandInt( @Cast("CvRNG*") LongBuffer rng );
public static native @Cast("unsigned") int cvRandInt( @Cast("CvRNG*") long[] rng );

/** \brief Returns a floating-point random number and updates RNG.
<p>
The function returns a uniformly-distributed random floating-point number between 0 and 1 (1 is not
included).
@param rng RNG state initialized by cvRNG
 */
public static native double cvRandReal( @Cast("CvRNG*") LongPointer rng );
public static native double cvRandReal( @Cast("CvRNG*") LongBuffer rng );
public static native double cvRandReal( @Cast("CvRNG*") long[] rng );

/****************************************************************************************\
*                                  Image type (IplImage)                                 *
\****************************************************************************************/

// #ifndef HAVE_IPL

/*
 * The following definitions (until #endif)
 * is an extract from IPL headers.
 * Copyright (c) 1995 Intel Corporation.
 */
public static final int IPL_DEPTH_SIGN = 0x80000000;

public static final int IPL_DEPTH_1U =     1;
public static final int IPL_DEPTH_8U =     8;
public static final int IPL_DEPTH_16U =   16;
public static final int IPL_DEPTH_32F =   32;

public static final int IPL_DEPTH_8S =  (IPL_DEPTH_SIGN| 8);
public static final int IPL_DEPTH_16S = (IPL_DEPTH_SIGN|16);
public static final int IPL_DEPTH_32S = (IPL_DEPTH_SIGN|32);

public static final int IPL_DATA_ORDER_PIXEL =  0;
public static final int IPL_DATA_ORDER_PLANE =  1;

public static final int IPL_ORIGIN_TL = 0;
public static final int IPL_ORIGIN_BL = 1;

public static final int IPL_ALIGN_4BYTES =   4;
public static final int IPL_ALIGN_8BYTES =   8;
public static final int IPL_ALIGN_16BYTES = 16;
public static final int IPL_ALIGN_32BYTES = 32;

public static final int IPL_ALIGN_DWORD =   IPL_ALIGN_4BYTES;
public static final int IPL_ALIGN_QWORD =   IPL_ALIGN_8BYTES;

public static final int IPL_BORDER_CONSTANT =   0;
public static final int IPL_BORDER_REPLICATE =  1;
public static final int IPL_BORDER_REFLECT =    2;
public static final int IPL_BORDER_WRAP =       3;

/** The IplImage is taken from the Intel Image Processing Library, in which the format is native. OpenCV
only supports a subset of possible IplImage formats, as outlined in the parameter list above.
<p>
In addition to the above restrictions, OpenCV handles ROIs differently. OpenCV functions require
that the image size or ROI size of all source and destination images match exactly. On the other
hand, the Intel Image Processing Library processes the area of intersection between the source and
destination images (or ROIs), allowing them to vary independently.
*/
@NoOffset public static class IplImage extends AbstractIplImage {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IplImage(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public IplImage(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public IplImage position(int position) {
        return (IplImage)super.position(position);
    }

    /** sizeof(IplImage) */
    public native int nSize(); public native IplImage nSize(int nSize);
    /** version (=0)*/
    public native int ID(); public native IplImage ID(int ID);
    /** Most of OpenCV functions support 1,2,3 or 4 channels */
    public native int nChannels(); public native IplImage nChannels(int nChannels);
    /** Ignored by OpenCV */
    public native int alphaChannel(); public native IplImage alphaChannel(int alphaChannel);
    /** Pixel depth in bits: IPL_DEPTH_8U, IPL_DEPTH_8S, IPL_DEPTH_16S,
                                   IPL_DEPTH_32S, IPL_DEPTH_32F and IPL_DEPTH_64F are supported.  */
    public native int depth(); public native IplImage depth(int depth);
    /** Ignored by OpenCV */
    public native @Cast("char") byte colorModel(int i); public native IplImage colorModel(int i, byte colorModel);
    @MemberGetter public native @Cast("char*") BytePointer colorModel();
    /** ditto */
    public native @Cast("char") byte channelSeq(int i); public native IplImage channelSeq(int i, byte channelSeq);
    @MemberGetter public native @Cast("char*") BytePointer channelSeq();
    /** 0 - interleaved color channels, 1 - separate color channels.
                                   cvCreateImage can only create interleaved images */
    public native int dataOrder(); public native IplImage dataOrder(int dataOrder);
    /** 0 - top-left origin,
                                   1 - bottom-left origin (Windows bitmaps style).  */
    public native int origin(); public native IplImage origin(int origin);
    /** Alignment of image rows (4 or 8).
                                   OpenCV ignores it and uses widthStep instead.    */
    public native int align(); public native IplImage align(int align);
    /** Image width in pixels.                           */
    public native int width(); public native IplImage width(int width);
    /** Image height in pixels.                          */
    public native int height(); public native IplImage height(int height);
    /** Image ROI. If NULL, the whole image is selected. */
    public native IplROI roi(); public native IplImage roi(IplROI roi);
    /** Must be NULL. */
    public native IplImage maskROI(); public native IplImage maskROI(IplImage maskROI);
    /** "           " */
    public native Pointer imageId(); public native IplImage imageId(Pointer imageId);
    /** "           " */
    public native IplTileInfo tileInfo(); public native IplImage tileInfo(IplTileInfo tileInfo);
    /** Image data size in bytes
                                   (==image->height*image->widthStep
                                   in case of interleaved data)*/
    public native int imageSize(); public native IplImage imageSize(int imageSize);
    /** Pointer to aligned image data.         */
    public native @Cast("char*") BytePointer imageData(); public native IplImage imageData(BytePointer imageData);
    /** Size of aligned image row in bytes.    */
    public native int widthStep(); public native IplImage widthStep(int widthStep);
    /** Ignored by OpenCV.                     */
    public native int BorderMode(int i); public native IplImage BorderMode(int i, int BorderMode);
    @MemberGetter public native IntPointer BorderMode();
    /** Ditto.                                 */
    public native int BorderConst(int i); public native IplImage BorderConst(int i, int BorderConst);
    @MemberGetter public native IntPointer BorderConst();
    /** Pointer to very origin of image data
                                   (not necessarily aligned) -
                                   needed for correct deallocation */
    public native @Cast("char*") BytePointer imageDataOrigin(); public native IplImage imageDataOrigin(BytePointer imageDataOrigin);

// #ifdef __cplusplus
    public IplImage() { super((Pointer)null); allocate(); }
    private native void allocate();
    public IplImage(@Const @ByRef Mat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef Mat m);
// #endif
}

@Opaque public static class IplTileInfo extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public IplTileInfo() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IplTileInfo(Pointer p) { super(p); }
}

public static class IplROI extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IplROI() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public IplROI(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IplROI(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public IplROI position(int position) {
        return (IplROI)super.position(position);
    }

    /** 0 - no COI (all channels are selected), 1 - 0th channel is selected ...*/
    public native int coi(); public native IplROI coi(int coi);
    public native int xOffset(); public native IplROI xOffset(int xOffset);
    public native int yOffset(); public native IplROI yOffset(int yOffset);
    public native int width(); public native IplROI width(int width);
    public native int height(); public native IplROI height(int height);
}

public static class IplConvKernel extends org.bytedeco.javacpp.helper.opencv_imgproc.AbstractIplConvKernel {
    static { Loader.load(); }
    /** Default native constructor. */
    public IplConvKernel() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public IplConvKernel(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IplConvKernel(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public IplConvKernel position(int position) {
        return (IplConvKernel)super.position(position);
    }

    public native int nCols(); public native IplConvKernel nCols(int nCols);
    public native int nRows(); public native IplConvKernel nRows(int nRows);
    public native int anchorX(); public native IplConvKernel anchorX(int anchorX);
    public native int anchorY(); public native IplConvKernel anchorY(int anchorY);
    public native IntPointer values(); public native IplConvKernel values(IntPointer values);
    public native int nShiftR(); public native IplConvKernel nShiftR(int nShiftR);
}

public static class IplConvKernelFP extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IplConvKernelFP() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public IplConvKernelFP(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IplConvKernelFP(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public IplConvKernelFP position(int position) {
        return (IplConvKernelFP)super.position(position);
    }

    public native int nCols(); public native IplConvKernelFP nCols(int nCols);
    public native int nRows(); public native IplConvKernelFP nRows(int nRows);
    public native int anchorX(); public native IplConvKernelFP anchorX(int anchorX);
    public native int anchorY(); public native IplConvKernelFP anchorY(int anchorY);
    public native FloatPointer values(); public native IplConvKernelFP values(FloatPointer values);
}

public static final int IPL_IMAGE_HEADER = 1;
public static final int IPL_IMAGE_DATA =   2;
public static final int IPL_IMAGE_ROI =    4;

// #endif/*HAVE_IPL*/

/** extra border mode */
public static final int IPL_BORDER_REFLECT_101 =    4;
public static final int IPL_BORDER_TRANSPARENT =    5;

public static native @MemberGetter int IPL_IMAGE_MAGIC_VAL();
public static final int IPL_IMAGE_MAGIC_VAL = IPL_IMAGE_MAGIC_VAL();
public static final String CV_TYPE_NAME_IMAGE = "opencv-image";

// #define CV_IS_IMAGE_HDR(img)
//     ((img) != NULL && ((const IplImage*)(img))->nSize == sizeof(IplImage))

// #define CV_IS_IMAGE(img)
//     (CV_IS_IMAGE_HDR(img) && ((IplImage*)img)->imageData != NULL)

/** for storing double-precision
   floating point data in IplImage's */
public static final int IPL_DEPTH_64F =  64;

/** get reference to pixel at (col,row),
   for multi-channel images (col) should be multiplied by number of channels */
// #define CV_IMAGE_ELEM( image, elemtype, row, col )
//     (((elemtype*)((image)->imageData + (image)->widthStep*(row)))[(col)])

/****************************************************************************************\
*                                  Matrix type (CvMat)                                   *
\****************************************************************************************/

public static final int CV_AUTO_STEP =  0x7fffffff;
public static final CvSlice CV_WHOLE_ARR =  cvSlice( 0, 0x3fffffff );

public static final int CV_MAGIC_MASK =       0xFFFF0000;
public static final int CV_MAT_MAGIC_VAL =    0x42420000;
public static final String CV_TYPE_NAME_MAT =    "opencv-matrix";

/** Matrix elements are stored row by row. Element (i, j) (i - 0-based row index, j - 0-based column
index) of a matrix can be retrieved or modified using CV_MAT_ELEM macro:
    <p>
    uchar pixval = CV_MAT_ELEM(grayimg, uchar, i, j)
    CV_MAT_ELEM(cameraMatrix, float, 0, 2) = image.width*0.5f;
<p>
To access multiple-channel matrices, you can use
CV_MAT_ELEM(matrix, type, i, j\*nchannels + channel_idx).
<p>
@deprecated CvMat is now obsolete; consider using Mat instead.
 */
@NoOffset public static class CvMat extends AbstractCvMat {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMat(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvMat(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvMat position(int position) {
        return (CvMat)super.position(position);
    }

    public native int type(); public native CvMat type(int type);
    public native int step(); public native CvMat step(int step);

    /* for internal use only */
    public native IntPointer refcount(); public native CvMat refcount(IntPointer refcount);
    public native int hdr_refcount(); public native CvMat hdr_refcount(int hdr_refcount);

        @Name("data.ptr") public native @Cast("uchar*") BytePointer data_ptr(); public native CvMat data_ptr(BytePointer data_ptr);
        @Name("data.s") public native ShortPointer data_s(); public native CvMat data_s(ShortPointer data_s);
        @Name("data.i") public native IntPointer data_i(); public native CvMat data_i(IntPointer data_i);
        @Name("data.fl") public native FloatPointer data_fl(); public native CvMat data_fl(FloatPointer data_fl);
        @Name("data.db") public native DoublePointer data_db(); public native CvMat data_db(DoublePointer data_db);

// #ifdef __cplusplus
        public native int rows(); public native CvMat rows(int rows);
        public native int height(); public native CvMat height(int height);
        public native int cols(); public native CvMat cols(int cols);
        public native int width(); public native CvMat width(int width);
// #else
// #endif


// #ifdef __cplusplus
    public CvMat() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CvMat(@Const @ByRef CvMat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef CvMat m);
    public CvMat(@Const @ByRef Mat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef Mat m);
// #endif

}


// #define CV_IS_MAT_HDR(mat)
//     ((mat) != NULL &&
//     (((const CvMat*)(mat))->type & CV_MAGIC_MASK) == CV_MAT_MAGIC_VAL &&
//     ((const CvMat*)(mat))->cols > 0 && ((const CvMat*)(mat))->rows > 0)

// #define CV_IS_MAT_HDR_Z(mat)
//     ((mat) != NULL &&
//     (((const CvMat*)(mat))->type & CV_MAGIC_MASK) == CV_MAT_MAGIC_VAL &&
//     ((const CvMat*)(mat))->cols >= 0 && ((const CvMat*)(mat))->rows >= 0)

// #define CV_IS_MAT(mat)
//     (CV_IS_MAT_HDR(mat) && ((const CvMat*)(mat))->data.ptr != NULL)

// #define CV_IS_MASK_ARR(mat)
//     (((mat)->type & (CV_MAT_TYPE_MASK & ~CV_8SC1)) == 0)

// #define CV_ARE_TYPES_EQ(mat1, mat2)
//     ((((mat1)->type ^ (mat2)->type) & CV_MAT_TYPE_MASK) == 0)

// #define CV_ARE_CNS_EQ(mat1, mat2)
//     ((((mat1)->type ^ (mat2)->type) & CV_MAT_CN_MASK) == 0)

// #define CV_ARE_DEPTHS_EQ(mat1, mat2)
//     ((((mat1)->type ^ (mat2)->type) & CV_MAT_DEPTH_MASK) == 0)

// #define CV_ARE_SIZES_EQ(mat1, mat2)
//     ((mat1)->rows == (mat2)->rows && (mat1)->cols == (mat2)->cols)

// #define CV_IS_MAT_CONST(mat)
//     (((mat)->rows|(mat)->cols) == 1)

// #define IPL2CV_DEPTH(depth)
//     ((((CV_8U)+(CV_16U<<4)+(CV_32F<<8)+(CV_64F<<16)+(CV_8S<<20)+
//     (CV_16S<<24)+(CV_32S<<28)) >> ((((depth) & 0xF0) >> 2) +
//     (((depth) & IPL_DEPTH_SIGN) ? 20 : 0))) & 15)

/** Inline constructor. No data is allocated internally!!!
 * (Use together with cvCreateData, or use cvCreateMat instead to
 * get a matrix with allocated data):
 */
public static native @ByVal CvMat cvMat( int rows, int cols, int type, Pointer data/*=NULL*/);
public static native @ByVal CvMat cvMat( int rows, int cols, int type);

// #ifdef __cplusplus

// #endif


// #define CV_MAT_ELEM_PTR_FAST( mat, row, col, pix_size )
//     (assert( (unsigned)(row) < (unsigned)(mat).rows &&
//              (unsigned)(col) < (unsigned)(mat).cols ),
//      (mat).data.ptr + (size_t)(mat).step*(row) + (pix_size)*(col))

// #define CV_MAT_ELEM_PTR( mat, row, col )
//     CV_MAT_ELEM_PTR_FAST( mat, row, col, CV_ELEM_SIZE((mat).type) )

// #define CV_MAT_ELEM( mat, elemtype, row, col )
//     (*(elemtype*)CV_MAT_ELEM_PTR_FAST( mat, row, col, sizeof(elemtype)))

/** \brief Returns the particular element of single-channel floating-point matrix.
<p>
The function is a fast replacement for cvGetReal2D in the case of single-channel floating-point
matrices. It is faster because it is inline, it does fewer checks for array type and array element
type, and it checks for the row and column ranges only in debug mode.
@param mat Input matrix
@param row The zero-based index of row
@param col The zero-based index of column
 */
public static native double cvmGet( @Const CvMat mat, int row, int col );

/** \brief Sets a specific element of a single-channel floating-point matrix.
<p>
The function is a fast replacement for cvSetReal2D in the case of single-channel floating-point
matrices. It is faster because it is inline, it does fewer checks for array type and array element
type, and it checks for the row and column ranges only in debug mode.
@param mat The matrix
@param row The zero-based index of row
@param col The zero-based index of column
@param value The new value of the matrix element
 */
public static native void cvmSet( CvMat mat, int row, int col, double value );


public static native int cvIplDepth( int type );


/****************************************************************************************\
*                       Multi-dimensional dense array (CvMatND)                          *
\****************************************************************************************/

public static final int CV_MATND_MAGIC_VAL =    0x42430000;
public static final String CV_TYPE_NAME_MATND =    "opencv-nd-matrix";

public static final int CV_MAX_DIM =            32;
public static final int CV_MAX_DIM_HEAP =       1024;

/**
  @deprecated consider using cv::Mat instead
  */
@NoOffset public static class CvMatND extends AbstractCvMatND {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMatND(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvMatND(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvMatND position(int position) {
        return (CvMatND)super.position(position);
    }

    public native int type(); public native CvMatND type(int type);
    public native int dims(); public native CvMatND dims(int dims);

    public native IntPointer refcount(); public native CvMatND refcount(IntPointer refcount);
    public native int hdr_refcount(); public native CvMatND hdr_refcount(int hdr_refcount);

        @Name("data.ptr") public native @Cast("uchar*") BytePointer data_ptr(); public native CvMatND data_ptr(BytePointer data_ptr);
        @Name("data.fl") public native FloatPointer data_fl(); public native CvMatND data_fl(FloatPointer data_fl);
        @Name("data.db") public native DoublePointer data_db(); public native CvMatND data_db(DoublePointer data_db);
        @Name("data.i") public native IntPointer data_i(); public native CvMatND data_i(IntPointer data_i);
        @Name("data.s") public native ShortPointer data_s(); public native CvMatND data_s(ShortPointer data_s);

        @Name({"dim", ".size"}) public native int dim_size(int i); public native CvMatND dim_size(int i, int dim_size);
        @Name({"dim", ".step"}) public native int dim_step(int i); public native CvMatND dim_step(int i, int dim_step);

// #ifdef __cplusplus
    public CvMatND() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CvMatND(@Const @ByRef Mat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef Mat m);
// #endif
}

// #define CV_IS_MATND_HDR(mat)
//     ((mat) != NULL && (((const CvMatND*)(mat))->type & CV_MAGIC_MASK) == CV_MATND_MAGIC_VAL)

// #define CV_IS_MATND(mat)
//     (CV_IS_MATND_HDR(mat) && ((const CvMatND*)(mat))->data.ptr != NULL)


/****************************************************************************************\
*                      Multi-dimensional sparse array (CvSparseMat)                      *
\****************************************************************************************/

public static final int CV_SPARSE_MAT_MAGIC_VAL =    0x42440000;
public static final String CV_TYPE_NAME_SPARSE_MAT =    "opencv-sparse-matrix";

public static class CvSparseMat extends AbstractCvSparseMat {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSparseMat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvSparseMat(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSparseMat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvSparseMat position(int position) {
        return (CvSparseMat)super.position(position);
    }

    public native int type(); public native CvSparseMat type(int type);
    public native int dims(); public native CvSparseMat dims(int dims);
    public native IntPointer refcount(); public native CvSparseMat refcount(IntPointer refcount);
    public native int hdr_refcount(); public native CvSparseMat hdr_refcount(int hdr_refcount);

    public native CvSet heap(); public native CvSparseMat heap(CvSet heap);
    public native Pointer hashtable(int i); public native CvSparseMat hashtable(int i, Pointer hashtable);
    @MemberGetter public native @Cast("void**") PointerPointer hashtable();
    public native int hashsize(); public native CvSparseMat hashsize(int hashsize);
    public native int valoffset(); public native CvSparseMat valoffset(int valoffset);
    public native int idxoffset(); public native CvSparseMat idxoffset(int idxoffset);
    public native int size(int i); public native CvSparseMat size(int i, int size);
    @MemberGetter public native IntPointer size();

// #ifdef __cplusplus
    public native void copyToSparseMat(@ByRef SparseMat m);
// #endif
}

// #ifdef __cplusplus
    public static native CvSparseMat cvCreateSparseMat(@Const @ByRef SparseMat m);
// #endif

// #define CV_IS_SPARSE_MAT_HDR(mat)
//     ((mat) != NULL &&
//     (((const CvSparseMat*)(mat))->type & CV_MAGIC_MASK) == CV_SPARSE_MAT_MAGIC_VAL)

// #define CV_IS_SPARSE_MAT(mat)
//     CV_IS_SPARSE_MAT_HDR(mat)

/**************** iteration through a sparse array *****************/

public static class CvSparseNode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSparseNode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvSparseNode(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSparseNode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvSparseNode position(int position) {
        return (CvSparseNode)super.position(position);
    }

    public native @Cast("unsigned") int hashval(); public native CvSparseNode hashval(int hashval);
    public native CvSparseNode next(); public native CvSparseNode next(CvSparseNode next);
}

public static class CvSparseMatIterator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSparseMatIterator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvSparseMatIterator(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSparseMatIterator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvSparseMatIterator position(int position) {
        return (CvSparseMatIterator)super.position(position);
    }

    public native CvSparseMat mat(); public native CvSparseMatIterator mat(CvSparseMat mat);
    public native CvSparseNode node(); public native CvSparseMatIterator node(CvSparseNode node);
    public native int curidx(); public native CvSparseMatIterator curidx(int curidx);
}

// #define CV_NODE_VAL(mat,node)   ((void*)((uchar*)(node) + (mat)->valoffset))
// #define CV_NODE_IDX(mat,node)   ((int*)((uchar*)(node) + (mat)->idxoffset))

/****************************************************************************************\
*                                         Histogram                                      *
\****************************************************************************************/

public static final int CV_HIST_MAGIC_VAL =     0x42450000;
public static final int CV_HIST_UNIFORM_FLAG =  (1 << 10);

/** indicates whether bin ranges are set already or not */
public static final int CV_HIST_RANGES_FLAG =   (1 << 11);

public static final int CV_HIST_ARRAY =         0;
public static final int CV_HIST_SPARSE =        1;
public static final int CV_HIST_TREE =          CV_HIST_SPARSE;

/** should be used as a parameter only,
   it turns to CV_HIST_UNIFORM_FLAG of hist->type */
public static final int CV_HIST_UNIFORM =       1;

public static class CvHistogram extends org.bytedeco.javacpp.helper.opencv_imgproc.AbstractCvHistogram {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvHistogram() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvHistogram(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvHistogram(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvHistogram position(int position) {
        return (CvHistogram)super.position(position);
    }

    public native int type(); public native CvHistogram type(int type);
    public native CvArr bins(); public native CvHistogram bins(CvArr bins);
    /** For uniform histograms.                      */
    public native float thresh(int i, int j); public native CvHistogram thresh(int i, int j, float thresh);
    @MemberGetter public native @Cast("float(*)[2]") FloatPointer thresh();
    /** For non-uniform histograms.                  */
    public native FloatPointer thresh2(int i); public native CvHistogram thresh2(int i, FloatPointer thresh2);
    @MemberGetter public native @Cast("float**") PointerPointer thresh2();
    /** Embedded matrix header for array histograms. */
    public native @ByRef CvMatND mat(); public native CvHistogram mat(CvMatND mat);
}

// #define CV_IS_HIST( hist )
//     ((hist) != NULL  &&
//      (((CvHistogram*)(hist))->type & CV_MAGIC_MASK) == CV_HIST_MAGIC_VAL &&
//      (hist)->bins != NULL)

// #define CV_IS_UNIFORM_HIST( hist )
//     (((hist)->type & CV_HIST_UNIFORM_FLAG) != 0)

// #define CV_IS_SPARSE_HIST( hist )
//     CV_IS_SPARSE_MAT((hist)->bins)

// #define CV_HIST_HAS_RANGES( hist )
//     (((hist)->type & CV_HIST_RANGES_FLAG) != 0)

/****************************************************************************************\
*                      Other supplementary data type definitions                         *
\****************************************************************************************/

/*************************************** CvRect *****************************************/
/** \sa Rect_ */
@NoOffset public static class CvRect extends AbstractCvRect {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvRect(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvRect(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvRect position(int position) {
        return (CvRect)super.position(position);
    }

    public native int x(); public native CvRect x(int x);
    public native int y(); public native CvRect y(int y);
    public native int width(); public native CvRect width(int width);
    public native int height(); public native CvRect height(int height);

// #ifdef __cplusplus
    public CvRect(int _x/*=0*/, int _y/*=0*/, int w/*=0*/, int h/*=0*/) { super((Pointer)null); allocate(_x, _y, w, h); }
    private native void allocate(int _x/*=0*/, int _y/*=0*/, int w/*=0*/, int h/*=0*/);
    public CvRect() { super((Pointer)null); allocate(); }
    private native void allocate();
// #endif
}

/** constructs CvRect structure. */
public static native @ByVal CvRect cvRect( int x, int y, int width, int height );


public static native @ByVal IplROI cvRectToROI( @ByVal CvRect rect, int coi );


public static native @ByVal CvRect cvROIToRect( @ByVal IplROI roi );

/*********************************** CvTermCriteria *************************************/

public static final int CV_TERMCRIT_ITER =    1;
public static final int CV_TERMCRIT_NUMBER =  CV_TERMCRIT_ITER;
public static final int CV_TERMCRIT_EPS =     2;

/** \sa TermCriteria
 */
@NoOffset public static class CvTermCriteria extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvTermCriteria(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvTermCriteria(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvTermCriteria position(int position) {
        return (CvTermCriteria)super.position(position);
    }

    /** may be combination of
                         CV_TERMCRIT_ITER
                         CV_TERMCRIT_EPS */
    public native int type(); public native CvTermCriteria type(int type);
    public native int max_iter(); public native CvTermCriteria max_iter(int max_iter);
    public native double epsilon(); public native CvTermCriteria epsilon(double epsilon);

// #ifdef __cplusplus
    public CvTermCriteria(int _type/*=0*/, int _iter/*=0*/, double _eps/*=0*/) { super((Pointer)null); allocate(_type, _iter, _eps); }
    private native void allocate(int _type/*=0*/, int _iter/*=0*/, double _eps/*=0*/);
    public CvTermCriteria() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CvTermCriteria(@Const @ByRef TermCriteria t) { super((Pointer)null); allocate(t); }
    private native void allocate(@Const @ByRef TermCriteria t);
    public native @ByVal @Name("operator cv::TermCriteria") TermCriteria asTermCriteria();
// #endif

}

public static native @ByVal CvTermCriteria cvTermCriteria( int type, int max_iter, double epsilon );


/******************************* CvPoint and variants ***********************************/

@NoOffset public static class CvPoint extends AbstractCvPoint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvPoint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvPoint(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvPoint position(int position) {
        return (CvPoint)super.position(position);
    }

    public native int x(); public native CvPoint x(int x);
    public native int y(); public native CvPoint y(int y);

// #ifdef __cplusplus
    public CvPoint(int _x/*=0*/, int _y/*=0*/) { super((Pointer)null); allocate(_x, _y); }
    private native void allocate(int _x/*=0*/, int _y/*=0*/);
    public CvPoint() { super((Pointer)null); allocate(); }
    private native void allocate();
// #endif
}

/** constructs CvPoint structure. */
public static native @ByVal CvPoint cvPoint( int x, int y );


@NoOffset public static class CvPoint2D32f extends AbstractCvPoint2D32f {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvPoint2D32f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvPoint2D32f(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvPoint2D32f position(int position) {
        return (CvPoint2D32f)super.position(position);
    }

    public native float x(); public native CvPoint2D32f x(float x);
    public native float y(); public native CvPoint2D32f y(float y);

// #ifdef __cplusplus
    public CvPoint2D32f(float _x/*=0*/, float _y/*=0*/) { super((Pointer)null); allocate(_x, _y); }
    private native void allocate(float _x/*=0*/, float _y/*=0*/);
    public CvPoint2D32f() { super((Pointer)null); allocate(); }
    private native void allocate();
// #endif
}

/** constructs CvPoint2D32f structure. */
public static native @ByVal CvPoint2D32f cvPoint2D32f( double x, double y );

/** converts CvPoint to CvPoint2D32f. */
public static native @ByVal CvPoint2D32f cvPointTo32f( @ByVal CvPoint point );
public static native @ByVal @Cast("CvPoint2D32f*") FloatBuffer cvPointTo32f( @ByVal @Cast("CvPoint*") IntBuffer point );
public static native @ByVal @Cast("CvPoint2D32f*") float[] cvPointTo32f( @ByVal @Cast("CvPoint*") int[] point );

/** converts CvPoint2D32f to CvPoint. */
public static native @ByVal CvPoint cvPointFrom32f( @ByVal CvPoint2D32f point );
public static native @ByVal @Cast("CvPoint*") IntBuffer cvPointFrom32f( @ByVal @Cast("CvPoint2D32f*") FloatBuffer point );
public static native @ByVal @Cast("CvPoint*") int[] cvPointFrom32f( @ByVal @Cast("CvPoint2D32f*") float[] point );


@NoOffset public static class CvPoint3D32f extends AbstractCvPoint3D32f {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvPoint3D32f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvPoint3D32f(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvPoint3D32f position(int position) {
        return (CvPoint3D32f)super.position(position);
    }

    public native float x(); public native CvPoint3D32f x(float x);
    public native float y(); public native CvPoint3D32f y(float y);
    public native float z(); public native CvPoint3D32f z(float z);

// #ifdef __cplusplus
    public CvPoint3D32f(float _x/*=0*/, float _y/*=0*/, float _z/*=0*/) { super((Pointer)null); allocate(_x, _y, _z); }
    private native void allocate(float _x/*=0*/, float _y/*=0*/, float _z/*=0*/);
    public CvPoint3D32f() { super((Pointer)null); allocate(); }
    private native void allocate();
// #endif
}

/** constructs CvPoint3D32f structure. */
public static native @ByVal CvPoint3D32f cvPoint3D32f( double x, double y, double z );


public static class CvPoint2D64f extends AbstractCvPoint2D64f {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvPoint2D64f() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvPoint2D64f(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvPoint2D64f(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvPoint2D64f position(int position) {
        return (CvPoint2D64f)super.position(position);
    }

    public native double x(); public native CvPoint2D64f x(double x);
    public native double y(); public native CvPoint2D64f y(double y);
}

/** constructs CvPoint2D64f structure.*/
public static native @ByVal CvPoint2D64f cvPoint2D64f( double x, double y );


public static class CvPoint3D64f extends AbstractCvPoint3D64f {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvPoint3D64f() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvPoint3D64f(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvPoint3D64f(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvPoint3D64f position(int position) {
        return (CvPoint3D64f)super.position(position);
    }

    public native double x(); public native CvPoint3D64f x(double x);
    public native double y(); public native CvPoint3D64f y(double y);
    public native double z(); public native CvPoint3D64f z(double z);
}

/** constructs CvPoint3D64f structure. */
public static native @ByVal CvPoint3D64f cvPoint3D64f( double x, double y, double z );


/******************************** CvSize's & CvBox **************************************/

@NoOffset public static class CvSize extends AbstractCvSize {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSize(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvSize(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvSize position(int position) {
        return (CvSize)super.position(position);
    }

    public native int width(); public native CvSize width(int width);
    public native int height(); public native CvSize height(int height);

// #ifdef __cplusplus
    public CvSize(int w/*=0*/, int h/*=0*/) { super((Pointer)null); allocate(w, h); }
    private native void allocate(int w/*=0*/, int h/*=0*/);
    public CvSize() { super((Pointer)null); allocate(); }
    private native void allocate();
// #endif
}

/** constructs CvSize structure. */
public static native @ByVal CvSize cvSize( int width, int height );

@NoOffset public static class CvSize2D32f extends AbstractCvSize2D32f {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSize2D32f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvSize2D32f(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvSize2D32f position(int position) {
        return (CvSize2D32f)super.position(position);
    }

    public native float width(); public native CvSize2D32f width(float width);
    public native float height(); public native CvSize2D32f height(float height);

// #ifdef __cplusplus
    public CvSize2D32f(float w/*=0*/, float h/*=0*/) { super((Pointer)null); allocate(w, h); }
    private native void allocate(float w/*=0*/, float h/*=0*/);
    public CvSize2D32f() { super((Pointer)null); allocate(); }
    private native void allocate();
// #endif
}

/** constructs CvSize2D32f structure. */
public static native @ByVal CvSize2D32f cvSize2D32f( double width, double height );

/** \sa RotatedRect
 */
@NoOffset public static class CvBox2D extends AbstractCvBox2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvBox2D(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvBox2D(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvBox2D position(int position) {
        return (CvBox2D)super.position(position);
    }

    /** Center of the box.                          */
    public native @ByRef CvPoint2D32f center(); public native CvBox2D center(CvPoint2D32f center);
    /** Box width and length.                       */
    public native @ByRef CvSize2D32f size(); public native CvBox2D size(CvSize2D32f size);
    /** Angle between the horizontal axis           */
    /** and the first side (i.e. length) in degrees */
    public native float angle(); public native CvBox2D angle(float angle);

// #ifdef __cplusplus
    public CvBox2D(@ByVal(nullValue = "CvPoint2D32f()") CvPoint2D32f c/*=CvPoint2D32f()*/, @ByVal(nullValue = "CvSize2D32f()") CvSize2D32f s/*=CvSize2D32f()*/, float a/*=0*/) { super((Pointer)null); allocate(c, s, a); }
    private native void allocate(@ByVal(nullValue = "CvPoint2D32f()") CvPoint2D32f c/*=CvPoint2D32f()*/, @ByVal(nullValue = "CvSize2D32f()") CvSize2D32f s/*=CvSize2D32f()*/, float a/*=0*/);
    public CvBox2D() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CvBox2D(@ByVal(nullValue = "CvPoint2D32f()") @Cast("CvPoint2D32f*") FloatBuffer c/*=CvPoint2D32f()*/, @ByVal(nullValue = "CvSize2D32f()") CvSize2D32f s/*=CvSize2D32f()*/, float a/*=0*/) { super((Pointer)null); allocate(c, s, a); }
    private native void allocate(@ByVal(nullValue = "CvPoint2D32f()") @Cast("CvPoint2D32f*") FloatBuffer c/*=CvPoint2D32f()*/, @ByVal(nullValue = "CvSize2D32f()") CvSize2D32f s/*=CvSize2D32f()*/, float a/*=0*/);
    public CvBox2D(@ByVal(nullValue = "CvPoint2D32f()") @Cast("CvPoint2D32f*") float[] c/*=CvPoint2D32f()*/, @ByVal(nullValue = "CvSize2D32f()") CvSize2D32f s/*=CvSize2D32f()*/, float a/*=0*/) { super((Pointer)null); allocate(c, s, a); }
    private native void allocate(@ByVal(nullValue = "CvPoint2D32f()") @Cast("CvPoint2D32f*") float[] c/*=CvPoint2D32f()*/, @ByVal(nullValue = "CvSize2D32f()") CvSize2D32f s/*=CvSize2D32f()*/, float a/*=0*/);
    public CvBox2D(@Const @ByRef RotatedRect rr) { super((Pointer)null); allocate(rr); }
    private native void allocate(@Const @ByRef RotatedRect rr);
    public native @ByVal @Name("operator cv::RotatedRect") RotatedRect asRotatedRect();
// #endif
}


/** Line iterator state: */
public static class CvLineIterator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvLineIterator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvLineIterator(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvLineIterator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvLineIterator position(int position) {
        return (CvLineIterator)super.position(position);
    }

    /** Pointer to the current point: */
    public native @Cast("uchar*") BytePointer ptr(); public native CvLineIterator ptr(BytePointer ptr);

    /* Bresenham algorithm state: */
    public native int err(); public native CvLineIterator err(int err);
    public native int plus_delta(); public native CvLineIterator plus_delta(int plus_delta);
    public native int minus_delta(); public native CvLineIterator minus_delta(int minus_delta);
    public native int plus_step(); public native CvLineIterator plus_step(int plus_step);
    public native int minus_step(); public native CvLineIterator minus_step(int minus_step);
}



/************************************* CvSlice ******************************************/
public static final int CV_WHOLE_SEQ_END_INDEX = 0x3fffffff;
public static final CvSlice CV_WHOLE_SEQ =  cvSlice(0, CV_WHOLE_SEQ_END_INDEX);

@NoOffset public static class CvSlice extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSlice(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvSlice(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvSlice position(int position) {
        return (CvSlice)super.position(position);
    }

    public native int start_index(); public native CvSlice start_index(int start_index);
    public native int end_index(); public native CvSlice end_index(int end_index);

// #if defined(__cplusplus) && !defined(__CUDACC__)
    public CvSlice(int start/*=0*/, int end/*=0*/) { super((Pointer)null); allocate(start, end); }
    private native void allocate(int start/*=0*/, int end/*=0*/);
    public CvSlice() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CvSlice(@Const @ByRef Range r) { super((Pointer)null); allocate(r); }
    private native void allocate(@Const @ByRef Range r);
    public native @ByVal @Name("operator cv::Range") Range asRange();
// #endif
}

public static native @ByVal CvSlice cvSlice( int start, int end );



/************************************* CvScalar *****************************************/
/** \sa Scalar_
 */
@NoOffset public static class CvScalar extends AbstractCvScalar {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvScalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvScalar(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvScalar position(int position) {
        return (CvScalar)super.position(position);
    }

    public native double val(int i); public native CvScalar val(int i, double val);
    @MemberGetter public native DoublePointer val();

// #ifdef __cplusplus
    public CvScalar() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CvScalar(double d0, double d1/*=0*/, double d2/*=0*/, double d3/*=0*/) { super((Pointer)null); allocate(d0, d1, d2, d3); }
    private native void allocate(double d0, double d1/*=0*/, double d2/*=0*/, double d3/*=0*/);
    public CvScalar(double d0) { super((Pointer)null); allocate(d0); }
    private native void allocate(double d0);
// #endif
}

public static native @ByVal CvScalar cvScalar( double val0, double val1/*=0*/,
                               double val2/*=0*/, double val3/*=0*/);
public static native @ByVal CvScalar cvScalar( double val0);


public static native @ByVal CvScalar cvRealScalar( double val0 );

public static native @ByVal CvScalar cvScalarAll( double val0123 );

/****************************************************************************************\
*                                   Dynamic Data structures                              *
\****************************************************************************************/

/******************************** Memory storage ****************************************/

public static class CvMemBlock extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvMemBlock() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvMemBlock(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMemBlock(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvMemBlock position(int position) {
        return (CvMemBlock)super.position(position);
    }

    public native CvMemBlock prev(); public native CvMemBlock prev(CvMemBlock prev);
    public native CvMemBlock next(); public native CvMemBlock next(CvMemBlock next);
}

public static final int CV_STORAGE_MAGIC_VAL =    0x42890000;

public static class CvMemStorage extends AbstractCvMemStorage {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvMemStorage() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvMemStorage(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMemStorage(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvMemStorage position(int position) {
        return (CvMemStorage)super.position(position);
    }

    public native int signature(); public native CvMemStorage signature(int signature);
    /** First allocated block.                   */
    public native CvMemBlock bottom(); public native CvMemStorage bottom(CvMemBlock bottom);
    /** Current memory block - top of the stack. */
    public native CvMemBlock top(); public native CvMemStorage top(CvMemBlock top);
    /** We get new blocks from parent as needed. */
    public native CvMemStorage parent(); public native CvMemStorage parent(CvMemStorage parent);
    /** Block size.                              */
    public native int block_size(); public native CvMemStorage block_size(int block_size);
    /** Remaining free space in current block.   */
    public native int free_space(); public native CvMemStorage free_space(int free_space);
}

// #define CV_IS_STORAGE(storage)
//     ((storage) != NULL &&
//     (((CvMemStorage*)(storage))->signature & CV_MAGIC_MASK) == CV_STORAGE_MAGIC_VAL)


public static class CvMemStoragePos extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvMemStoragePos() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvMemStoragePos(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMemStoragePos(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvMemStoragePos position(int position) {
        return (CvMemStoragePos)super.position(position);
    }

    public native CvMemBlock top(); public native CvMemStoragePos top(CvMemBlock top);
    public native int free_space(); public native CvMemStoragePos free_space(int free_space);
}


/*********************************** Sequence *******************************************/

public static class CvSeqBlock extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSeqBlock() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvSeqBlock(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSeqBlock(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvSeqBlock position(int position) {
        return (CvSeqBlock)super.position(position);
    }

    /** Previous sequence block.                   */
    public native CvSeqBlock prev(); public native CvSeqBlock prev(CvSeqBlock prev);
    /** Next sequence block.                       */
    public native CvSeqBlock next(); public native CvSeqBlock next(CvSeqBlock next);
  /** Index of the first element in the block +  */
  /** sequence->first->start_index.              */
  public native int start_index(); public native CvSeqBlock start_index(int start_index);
    /** Number of elements in the block.           */
    public native int count(); public native CvSeqBlock count(int count);
    /** Pointer to the first element of the block. */
    public native @Cast("schar*") BytePointer data(); public native CvSeqBlock data(BytePointer data);
}


/** 2nd next sequence.       */
// #define CV_TREE_NODE_FIELDS(node_type)
//     int       flags;             /**< Miscellaneous flags.     */
//     int       header_size;       /**< Size of sequence header. */
//     struct    node_type* h_prev; /**< Previous sequence.       */
//     struct    node_type* h_next; /**< Next sequence.           */
//     struct    node_type* v_prev; /**< 2nd previous sequence.   */
//     struct    node_type* v_next

/**
   Read/Write sequence.
   Elements can be dynamically inserted to or deleted from the sequence.
*/
/** Pointer to the first sequence block. */
// #define CV_SEQUENCE_FIELDS()
//     CV_TREE_NODE_FIELDS(CvSeq);
//     int       total;          /**< Total number of elements.            */
//     int       elem_size;      /**< Size of sequence element in bytes.   */
//     schar*    block_max;      /**< Maximal bound of the last block.     */
//     schar*    ptr;            /**< Current write pointer.               */
//     int       delta_elems;    /**< Grow seq this many at a time.        */
//     CvMemStorage* storage;    /**< Where the seq is stored.             */
//     CvSeqBlock* free_blocks;  /**< Free blocks list.                    */
//     CvSeqBlock* first;

public static class CvSeq extends AbstractCvSeq {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSeq() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvSeq(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSeq(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvSeq position(int position) {
        return (CvSeq)super.position(position);
    }

    /** Miscellaneous flags.     */
    public native int flags(); public native CvSeq flags(int flags);
    /** Size of sequence header. */
    public native int header_size(); public native CvSeq header_size(int header_size);
    /** Previous sequence.       */
    public native CvSeq h_prev(); public native CvSeq h_prev(CvSeq h_prev);
    /** Next sequence.           */
    public native CvSeq h_next(); public native CvSeq h_next(CvSeq h_next);
    /** 2nd previous sequence.   */
    public native CvSeq v_prev(); public native CvSeq v_prev(CvSeq v_prev);
    public native CvSeq v_next(); public native CvSeq v_next(CvSeq v_next);
    /** Total number of elements.            */
    public native int total(); public native CvSeq total(int total);
    /** Size of sequence element in bytes.   */
    public native int elem_size(); public native CvSeq elem_size(int elem_size);
    /** Maximal bound of the last block.     */
    public native @Cast("schar*") BytePointer block_max(); public native CvSeq block_max(BytePointer block_max);
    /** Current write pointer.               */
    public native @Cast("schar*") BytePointer ptr(); public native CvSeq ptr(BytePointer ptr);
    /** Grow seq this many at a time.        */
    public native int delta_elems(); public native CvSeq delta_elems(int delta_elems);
    /** Where the seq is stored.             */
    public native CvMemStorage storage(); public native CvSeq storage(CvMemStorage storage);
    /** Free blocks list.                    */
    public native CvSeqBlock free_blocks(); public native CvSeq free_blocks(CvSeqBlock free_blocks);
    /** Pointer to the first sequence block. */
    public native CvSeqBlock first(); public native CvSeq first(CvSeqBlock first);
}

public static final String CV_TYPE_NAME_SEQ =             "opencv-sequence";
public static final String CV_TYPE_NAME_SEQ_TREE =        "opencv-sequence-tree";

/*************************************** Set ********************************************/
/** \brief Set
  Order is not preserved. There can be gaps between sequence elements.
  After the element has been inserted it stays in the same place all the time.
  The MSB(most-significant or sign bit) of the first field (flags) is 0 iff the element exists.
*/
// #define CV_SET_ELEM_FIELDS(elem_type)
//     int  flags;
//     struct elem_type* next_free;

public static class CvSetElem extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSetElem() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvSetElem(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSetElem(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvSetElem position(int position) {
        return (CvSetElem)super.position(position);
    }

    public native int flags(); public native CvSetElem flags(int flags);
    public native CvSetElem next_free(); public native CvSetElem next_free(CvSetElem next_free);
}

// #define CV_SET_FIELDS()
//     CV_SEQUENCE_FIELDS()
//     CvSetElem* free_elems;
//     int active_count;

public static class CvSet extends AbstractCvSet {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSet() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvSet(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSet(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvSet position(int position) {
        return (CvSet)super.position(position);
    }

    /** Miscellaneous flags.     */
    public native int flags(); public native CvSet flags(int flags);
    /** Size of sequence header. */
    public native int header_size(); public native CvSet header_size(int header_size);
    /** Previous sequence.       */
    public native CvSeq h_prev(); public native CvSet h_prev(CvSeq h_prev);
    /** Next sequence.           */
    public native CvSeq h_next(); public native CvSet h_next(CvSeq h_next);
    /** 2nd previous sequence.   */
    public native CvSeq v_prev(); public native CvSet v_prev(CvSeq v_prev);
    public native CvSeq v_next(); public native CvSet v_next(CvSeq v_next);
    /** Total number of elements.            */
    public native int total(); public native CvSet total(int total);
    /** Size of sequence element in bytes.   */
    public native int elem_size(); public native CvSet elem_size(int elem_size);
    /** Maximal bound of the last block.     */
    public native @Cast("schar*") BytePointer block_max(); public native CvSet block_max(BytePointer block_max);
    /** Current write pointer.               */
    public native @Cast("schar*") BytePointer ptr(); public native CvSet ptr(BytePointer ptr);
    /** Grow seq this many at a time.        */
    public native int delta_elems(); public native CvSet delta_elems(int delta_elems);
    /** Where the seq is stored.             */
    public native CvMemStorage storage(); public native CvSet storage(CvMemStorage storage);
    /** Free blocks list.                    */
    public native CvSeqBlock free_blocks(); public native CvSet free_blocks(CvSeqBlock free_blocks);
    /** Pointer to the first sequence block. */
    public native CvSeqBlock first(); public native CvSet first(CvSeqBlock first);
    public native CvSetElem free_elems(); public native CvSet free_elems(CvSetElem free_elems);
    public native int active_count(); public native CvSet active_count(int active_count);
}


public static final int CV_SET_ELEM_IDX_MASK =   ((1 << 26) - 1);
public static native @MemberGetter int CV_SET_ELEM_FREE_FLAG();
public static final int CV_SET_ELEM_FREE_FLAG = CV_SET_ELEM_FREE_FLAG();

/** Checks whether the element pointed by ptr belongs to a set or not */
// #define CV_IS_SET_ELEM( ptr )  (((CvSetElem*)(ptr))->flags >= 0)

/************************************* Graph ********************************************/

/** \name Graph
<p>
We represent a graph as a set of vertices. Vertices contain their adjacency lists (more exactly,
pointers to first incoming or outcoming edge (or 0 if isolated vertex)). Edges are stored in
another set. There is a singly-linked list of incoming/outcoming edges for each vertex.
<p>
Each edge consists of:
<p>
- Two pointers to the starting and ending vertices (vtx[0] and vtx[1] respectively).
    <p>
    A graph may be oriented or not. In the latter case, edges between vertex i to vertex j are not
distinguished during search operations.
<p>
- Two pointers to next edges for the starting and ending vertices, where next[0] points to the
next edge in the vtx[0] adjacency list and next[1] points to the next edge in the vtx[1]
adjacency list.
<p>
@see CvGraphEdge, CvGraphVtx, CvGraphVtx2D, CvGraph
\{
*/
// #define CV_GRAPH_EDGE_FIELDS()
//     int flags;
//     float weight;
//     struct CvGraphEdge* next[2];
//     struct CvGraphVtx* vtx[2];


// #define CV_GRAPH_VERTEX_FIELDS()
//     int flags;
//     struct CvGraphEdge* first;


public static class CvGraphEdge extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvGraphEdge() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvGraphEdge(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvGraphEdge(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvGraphEdge position(int position) {
        return (CvGraphEdge)super.position(position);
    }

    public native int flags(); public native CvGraphEdge flags(int flags);
    public native float weight(); public native CvGraphEdge weight(float weight);
    public native CvGraphEdge next(int i); public native CvGraphEdge next(int i, CvGraphEdge next);
    @MemberGetter public native @Cast("CvGraphEdge**") PointerPointer next();
    public native CvGraphVtx vtx(int i); public native CvGraphEdge vtx(int i, CvGraphVtx vtx);
    @MemberGetter public native @Cast("CvGraphVtx**") PointerPointer vtx();
}

public static class CvGraphVtx extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvGraphVtx() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvGraphVtx(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvGraphVtx(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvGraphVtx position(int position) {
        return (CvGraphVtx)super.position(position);
    }

    public native int flags(); public native CvGraphVtx flags(int flags);
    public native CvGraphEdge first(); public native CvGraphVtx first(CvGraphEdge first);
}

public static class CvGraphVtx2D extends CvGraphVtx {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvGraphVtx2D() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvGraphVtx2D(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvGraphVtx2D(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvGraphVtx2D position(int position) {
        return (CvGraphVtx2D)super.position(position);
    }

    public native int flags(); public native CvGraphVtx2D flags(int flags);
    public native CvGraphEdge first(); public native CvGraphVtx2D first(CvGraphEdge first);
    public native CvPoint2D32f ptr(); public native CvGraphVtx2D ptr(CvPoint2D32f ptr);
}

/**
   Graph is "derived" from the set (this is set a of vertices)
   and includes another set (edges)
*/
// #define  CV_GRAPH_FIELDS()
//     CV_SET_FIELDS()
//     CvSet* edges;

public static class CvGraph extends AbstractCvGraph {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvGraph() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvGraph(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvGraph(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvGraph position(int position) {
        return (CvGraph)super.position(position);
    }

    /** Miscellaneous flags.     */
    public native int flags(); public native CvGraph flags(int flags);
    /** Size of sequence header. */
    public native int header_size(); public native CvGraph header_size(int header_size);
    /** Previous sequence.       */
    public native CvSeq h_prev(); public native CvGraph h_prev(CvSeq h_prev);
    /** Next sequence.           */
    public native CvSeq h_next(); public native CvGraph h_next(CvSeq h_next);
    /** 2nd previous sequence.   */
    public native CvSeq v_prev(); public native CvGraph v_prev(CvSeq v_prev);
    public native CvSeq v_next(); public native CvGraph v_next(CvSeq v_next);
    /** Total number of elements.            */
    public native int total(); public native CvGraph total(int total);
    /** Size of sequence element in bytes.   */
    public native int elem_size(); public native CvGraph elem_size(int elem_size);
    /** Maximal bound of the last block.     */
    public native @Cast("schar*") BytePointer block_max(); public native CvGraph block_max(BytePointer block_max);
    /** Current write pointer.               */
    public native @Cast("schar*") BytePointer ptr(); public native CvGraph ptr(BytePointer ptr);
    /** Grow seq this many at a time.        */
    public native int delta_elems(); public native CvGraph delta_elems(int delta_elems);
    /** Where the seq is stored.             */
    public native CvMemStorage storage(); public native CvGraph storage(CvMemStorage storage);
    /** Free blocks list.                    */
    public native CvSeqBlock free_blocks(); public native CvGraph free_blocks(CvSeqBlock free_blocks);
    /** Pointer to the first sequence block. */
    public native CvSeqBlock first(); public native CvGraph first(CvSeqBlock first);
    public native CvSetElem free_elems(); public native CvGraph free_elems(CvSetElem free_elems);
    public native int active_count(); public native CvGraph active_count(int active_count);
    public native CvSet edges(); public native CvGraph edges(CvSet edges);
}

public static final String CV_TYPE_NAME_GRAPH = "opencv-graph";

/** \} */

/*********************************** Chain/Countour *************************************/

public static class CvChain extends CvSeq {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvChain() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvChain(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvChain(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvChain position(int position) {
        return (CvChain)super.position(position);
    }

    /** Miscellaneous flags.     */
    public native int flags(); public native CvChain flags(int flags);
    /** Size of sequence header. */
    public native int header_size(); public native CvChain header_size(int header_size);
    /** Previous sequence.       */
    public native CvSeq h_prev(); public native CvChain h_prev(CvSeq h_prev);
    /** Next sequence.           */
    public native CvSeq h_next(); public native CvChain h_next(CvSeq h_next);
    /** 2nd previous sequence.   */
    public native CvSeq v_prev(); public native CvChain v_prev(CvSeq v_prev);
    public native CvSeq v_next(); public native CvChain v_next(CvSeq v_next);
    /** Total number of elements.            */
    public native int total(); public native CvChain total(int total);
    /** Size of sequence element in bytes.   */
    public native int elem_size(); public native CvChain elem_size(int elem_size);
    /** Maximal bound of the last block.     */
    public native @Cast("schar*") BytePointer block_max(); public native CvChain block_max(BytePointer block_max);
    /** Current write pointer.               */
    public native @Cast("schar*") BytePointer ptr(); public native CvChain ptr(BytePointer ptr);
    /** Grow seq this many at a time.        */
    public native int delta_elems(); public native CvChain delta_elems(int delta_elems);
    /** Where the seq is stored.             */
    public native CvMemStorage storage(); public native CvChain storage(CvMemStorage storage);
    /** Free blocks list.                    */
    public native CvSeqBlock free_blocks(); public native CvChain free_blocks(CvSeqBlock free_blocks);
    /** Pointer to the first sequence block. */
    public native CvSeqBlock first(); public native CvChain first(CvSeqBlock first);
    public native @ByRef CvPoint origin(); public native CvChain origin(CvPoint origin);
}

// #define CV_CONTOUR_FIELDS()
//     CV_SEQUENCE_FIELDS()
//     CvRect rect;
//     int color;
//     int reserved[3];

public static class CvContour extends CvSeq {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvContour() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvContour(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvContour(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvContour position(int position) {
        return (CvContour)super.position(position);
    }

    /** Miscellaneous flags.     */
    public native int flags(); public native CvContour flags(int flags);
    /** Size of sequence header. */
    public native int header_size(); public native CvContour header_size(int header_size);
    /** Previous sequence.       */
    public native CvSeq h_prev(); public native CvContour h_prev(CvSeq h_prev);
    /** Next sequence.           */
    public native CvSeq h_next(); public native CvContour h_next(CvSeq h_next);
    /** 2nd previous sequence.   */
    public native CvSeq v_prev(); public native CvContour v_prev(CvSeq v_prev);
    public native CvSeq v_next(); public native CvContour v_next(CvSeq v_next);
    /** Total number of elements.            */
    public native int total(); public native CvContour total(int total);
    /** Size of sequence element in bytes.   */
    public native int elem_size(); public native CvContour elem_size(int elem_size);
    /** Maximal bound of the last block.     */
    public native @Cast("schar*") BytePointer block_max(); public native CvContour block_max(BytePointer block_max);
    /** Current write pointer.               */
    public native @Cast("schar*") BytePointer ptr(); public native CvContour ptr(BytePointer ptr);
    /** Grow seq this many at a time.        */
    public native int delta_elems(); public native CvContour delta_elems(int delta_elems);
    /** Where the seq is stored.             */
    public native CvMemStorage storage(); public native CvContour storage(CvMemStorage storage);
    /** Free blocks list.                    */
    public native CvSeqBlock free_blocks(); public native CvContour free_blocks(CvSeqBlock free_blocks);
    /** Pointer to the first sequence block. */
    public native CvSeqBlock first(); public native CvContour first(CvSeqBlock first);
    public native @ByRef CvRect rect(); public native CvContour rect(CvRect rect);
    public native int color(); public native CvContour color(int color);
    public native int reserved(int i); public native CvContour reserved(int i, int reserved);
    @MemberGetter public native IntPointer reserved();
}

/****************************************************************************************\
*                                    Sequence types                                      *
\****************************************************************************************/

public static final int CV_SEQ_MAGIC_VAL =             0x42990000;

// #define CV_IS_SEQ(seq)
//     ((seq) != NULL && (((CvSeq*)(seq))->flags & CV_MAGIC_MASK) == CV_SEQ_MAGIC_VAL)

public static final int CV_SET_MAGIC_VAL =             0x42980000;
// #define CV_IS_SET(set)
//     ((set) != NULL && (((CvSeq*)(set))->flags & CV_MAGIC_MASK) == CV_SET_MAGIC_VAL)

public static final int CV_SEQ_ELTYPE_BITS =           12;
public static final int CV_SEQ_ELTYPE_MASK =           ((1 << CV_SEQ_ELTYPE_BITS) - 1);

/** (x,y) */
public static final int CV_SEQ_ELTYPE_POINT =          CV_32SC2;
/** freeman code: 0..7 */
public static final int CV_SEQ_ELTYPE_CODE =           CV_8UC1;
public static final int CV_SEQ_ELTYPE_GENERIC =        0;
public static final int CV_SEQ_ELTYPE_PTR =            CV_USRTYPE1;
/** &(x,y) */
public static final int CV_SEQ_ELTYPE_PPOINT =         CV_SEQ_ELTYPE_PTR;
/** #(x,y) */
public static final int CV_SEQ_ELTYPE_INDEX =          CV_32SC1;
/** &next_o, &next_d, &vtx_o, &vtx_d */
public static final int CV_SEQ_ELTYPE_GRAPH_EDGE =     0;
/** first_edge, &(x,y) */
public static final int CV_SEQ_ELTYPE_GRAPH_VERTEX =   0;
/** vertex of the binary tree   */
public static final int CV_SEQ_ELTYPE_TRIAN_ATR =      0;
/** connected component  */
public static final int CV_SEQ_ELTYPE_CONNECTED_COMP = 0;
/** (x,y,z)  */
public static final int CV_SEQ_ELTYPE_POINT3D =        CV_32FC3;

public static final int CV_SEQ_KIND_BITS =        2;
public static final int CV_SEQ_KIND_MASK =        (((1 << CV_SEQ_KIND_BITS) - 1)<<CV_SEQ_ELTYPE_BITS);

/** types of sequences */
public static final int CV_SEQ_KIND_GENERIC =     (0 << CV_SEQ_ELTYPE_BITS);
public static final int CV_SEQ_KIND_CURVE =       (1 << CV_SEQ_ELTYPE_BITS);
public static final int CV_SEQ_KIND_BIN_TREE =    (2 << CV_SEQ_ELTYPE_BITS);

/** types of sparse sequences (sets) */
public static final int CV_SEQ_KIND_GRAPH =       (1 << CV_SEQ_ELTYPE_BITS);
public static final int CV_SEQ_KIND_SUBDIV2D =    (2 << CV_SEQ_ELTYPE_BITS);

public static final int CV_SEQ_FLAG_SHIFT =       (CV_SEQ_KIND_BITS + CV_SEQ_ELTYPE_BITS);

/** flags for curves */
public static final int CV_SEQ_FLAG_CLOSED =     (1 << CV_SEQ_FLAG_SHIFT);
public static final int CV_SEQ_FLAG_SIMPLE =     (0 << CV_SEQ_FLAG_SHIFT);
public static final int CV_SEQ_FLAG_CONVEX =     (0 << CV_SEQ_FLAG_SHIFT);
public static final int CV_SEQ_FLAG_HOLE =       (2 << CV_SEQ_FLAG_SHIFT);

/** flags for graphs */
public static final int CV_GRAPH_FLAG_ORIENTED = (1 << CV_SEQ_FLAG_SHIFT);

public static final int CV_GRAPH =               CV_SEQ_KIND_GRAPH;
public static final int CV_ORIENTED_GRAPH =      (CV_SEQ_KIND_GRAPH|CV_GRAPH_FLAG_ORIENTED);

/** point sets */
public static final int CV_SEQ_POINT_SET =       (CV_SEQ_KIND_GENERIC| CV_SEQ_ELTYPE_POINT);
public static final int CV_SEQ_POINT3D_SET =     (CV_SEQ_KIND_GENERIC| CV_SEQ_ELTYPE_POINT3D);
public static final int CV_SEQ_POLYLINE =        (CV_SEQ_KIND_CURVE  | CV_SEQ_ELTYPE_POINT);
public static final int CV_SEQ_POLYGON =         (CV_SEQ_FLAG_CLOSED | CV_SEQ_POLYLINE );
public static final int CV_SEQ_CONTOUR =         CV_SEQ_POLYGON;
public static final int CV_SEQ_SIMPLE_POLYGON =  (CV_SEQ_FLAG_SIMPLE | CV_SEQ_POLYGON  );

/** chain-coded curves */
public static final int CV_SEQ_CHAIN =           (CV_SEQ_KIND_CURVE  | CV_SEQ_ELTYPE_CODE);
public static final int CV_SEQ_CHAIN_CONTOUR =   (CV_SEQ_FLAG_CLOSED | CV_SEQ_CHAIN);

/** binary tree for the contour */
public static final int CV_SEQ_POLYGON_TREE =    (CV_SEQ_KIND_BIN_TREE  | CV_SEQ_ELTYPE_TRIAN_ATR);

/** sequence of the connected components */
public static final int CV_SEQ_CONNECTED_COMP =  (CV_SEQ_KIND_GENERIC  | CV_SEQ_ELTYPE_CONNECTED_COMP);

/** sequence of the integer numbers */
public static final int CV_SEQ_INDEX =           (CV_SEQ_KIND_GENERIC  | CV_SEQ_ELTYPE_INDEX);

// #define CV_SEQ_ELTYPE( seq )   ((seq)->flags & CV_SEQ_ELTYPE_MASK)
// #define CV_SEQ_KIND( seq )     ((seq)->flags & CV_SEQ_KIND_MASK )

/** flag checking */
// #define CV_IS_SEQ_INDEX( seq )      ((CV_SEQ_ELTYPE(seq) == CV_SEQ_ELTYPE_INDEX) &&
//                                      (CV_SEQ_KIND(seq) == CV_SEQ_KIND_GENERIC))

// #define CV_IS_SEQ_CURVE( seq )      (CV_SEQ_KIND(seq) == CV_SEQ_KIND_CURVE)
// #define CV_IS_SEQ_CLOSED( seq )     (((seq)->flags & CV_SEQ_FLAG_CLOSED) != 0)
// #define CV_IS_SEQ_CONVEX( seq )     0
// #define CV_IS_SEQ_HOLE( seq )       (((seq)->flags & CV_SEQ_FLAG_HOLE) != 0)
// #define CV_IS_SEQ_SIMPLE( seq )     1

/** type checking macros */
// #define CV_IS_SEQ_POINT_SET( seq )
//     ((CV_SEQ_ELTYPE(seq) == CV_32SC2 || CV_SEQ_ELTYPE(seq) == CV_32FC2))

// #define CV_IS_SEQ_POINT_SUBSET( seq )
//     (CV_IS_SEQ_INDEX( seq ) || CV_SEQ_ELTYPE(seq) == CV_SEQ_ELTYPE_PPOINT)

// #define CV_IS_SEQ_POLYLINE( seq )
//     (CV_SEQ_KIND(seq) == CV_SEQ_KIND_CURVE && CV_IS_SEQ_POINT_SET(seq))

// #define CV_IS_SEQ_POLYGON( seq )
//     (CV_IS_SEQ_POLYLINE(seq) && CV_IS_SEQ_CLOSED(seq))

// #define CV_IS_SEQ_CHAIN( seq )
//     (CV_SEQ_KIND(seq) == CV_SEQ_KIND_CURVE && (seq)->elem_size == 1)

// #define CV_IS_SEQ_CONTOUR( seq )
//     (CV_IS_SEQ_CLOSED(seq) && (CV_IS_SEQ_POLYLINE(seq) || CV_IS_SEQ_CHAIN(seq)))

// #define CV_IS_SEQ_CHAIN_CONTOUR( seq )
//     (CV_IS_SEQ_CHAIN( seq ) && CV_IS_SEQ_CLOSED( seq ))

// #define CV_IS_SEQ_POLYGON_TREE( seq )
//     (CV_SEQ_ELTYPE (seq) ==  CV_SEQ_ELTYPE_TRIAN_ATR &&
//     CV_SEQ_KIND( seq ) ==  CV_SEQ_KIND_BIN_TREE )

// #define CV_IS_GRAPH( seq )
//     (CV_IS_SET(seq) && CV_SEQ_KIND((CvSet*)(seq)) == CV_SEQ_KIND_GRAPH)

// #define CV_IS_GRAPH_ORIENTED( seq )
//     (((seq)->flags & CV_GRAPH_FLAG_ORIENTED) != 0)

// #define CV_IS_SUBDIV2D( seq )
//     (CV_IS_SET(seq) && CV_SEQ_KIND((CvSet*)(seq)) == CV_SEQ_KIND_SUBDIV2D)

/****************************************************************************************/
/*                            Sequence writer & reader                                  */
/****************************************************************************************/

/** pointer to the end of block */
// #define CV_SEQ_WRITER_FIELDS()
//     int          header_size;
//     CvSeq*       seq;        /**< the sequence written */
//     CvSeqBlock*  block;      /**< current block */
//     schar*       ptr;        /**< pointer to free space */
//     schar*       block_min;  /**< pointer to the beginning of block*/
//     schar*       block_max;

public static class CvSeqWriter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSeqWriter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvSeqWriter(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSeqWriter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvSeqWriter position(int position) {
        return (CvSeqWriter)super.position(position);
    }

    public native int header_size(); public native CvSeqWriter header_size(int header_size);
    /** the sequence written */
    public native CvSeq seq(); public native CvSeqWriter seq(CvSeq seq);
    /** current block */
    public native CvSeqBlock block(); public native CvSeqWriter block(CvSeqBlock block);
    /** pointer to free space */
    public native @Cast("schar*") BytePointer ptr(); public native CvSeqWriter ptr(BytePointer ptr);
    /** pointer to the beginning of block*/
    public native @Cast("schar*") BytePointer block_min(); public native CvSeqWriter block_min(BytePointer block_min);
    /** pointer to the end of block */
    public native @Cast("schar*") BytePointer block_max(); public native CvSeqWriter block_max(BytePointer block_max);
}


/** pointer to previous element */
// #define CV_SEQ_READER_FIELDS()
//     int          header_size;
//     CvSeq*       seq;        /**< sequence, beign read */
//     CvSeqBlock*  block;      /**< current block */
//     schar*       ptr;        /**< pointer to element be read next */
//     schar*       block_min;  /**< pointer to the beginning of block */
//     schar*       block_max;  /**< pointer to the end of block */
//     int          delta_index;/**< = seq->first->start_index   */
//     schar*       prev_elem;

public static class CvSeqReader extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSeqReader() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvSeqReader(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSeqReader(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvSeqReader position(int position) {
        return (CvSeqReader)super.position(position);
    }

    public native int header_size(); public native CvSeqReader header_size(int header_size);
    /** sequence, beign read */
    public native CvSeq seq(); public native CvSeqReader seq(CvSeq seq);
    /** current block */
    public native CvSeqBlock block(); public native CvSeqReader block(CvSeqBlock block);
    /** pointer to element be read next */
    public native @Cast("schar*") BytePointer ptr(); public native CvSeqReader ptr(BytePointer ptr);
    /** pointer to the beginning of block */
    public native @Cast("schar*") BytePointer block_min(); public native CvSeqReader block_min(BytePointer block_min);
    /** pointer to the end of block */
    public native @Cast("schar*") BytePointer block_max(); public native CvSeqReader block_max(BytePointer block_max);
    /** = seq->first->start_index   */
    public native int delta_index(); public native CvSeqReader delta_index(int delta_index);
    /** pointer to previous element */
    public native @Cast("schar*") BytePointer prev_elem(); public native CvSeqReader prev_elem(BytePointer prev_elem);
}

/****************************************************************************************/
/*                                Operations on sequences                               */
/****************************************************************************************/

// #define  CV_SEQ_ELEM( seq, elem_type, index )
// /** assert gives some guarantee that <seq> parameter is valid */
// (   assert(sizeof((seq)->first[0]) == sizeof(CvSeqBlock) &&
//     (seq)->elem_size == sizeof(elem_type)),
//     (elem_type*)((seq)->first && (unsigned)index <
//     (unsigned)((seq)->first->count) ?
//     (seq)->first->data + (index) * sizeof(elem_type) :
//     cvGetSeqElem( (CvSeq*)(seq), (index) )))
// #define CV_GET_SEQ_ELEM( elem_type, seq, index ) CV_SEQ_ELEM( (seq), elem_type, (index) )

/** Add element to sequence: */
// #define CV_WRITE_SEQ_ELEM_VAR( elem_ptr, writer )
// {
//     if( (writer).ptr >= (writer).bock_max )
//     {
//         cvCreateSeqBlock( &writer);
//     }
//     memcpy((writer).ptr, elem_ptr, (writer).seq->elem_size);
//     (writer).ptr += (writer).seq->elem_size;
// }

// #define CV_WRITE_SEQ_ELEM( elem, writer )
// {
//     assert( (writer).seq->elem_size == sizeof(elem));
//     if( (writer).ptr >= (writer).bock_max )
//     {
//         cvCreateSeqBlock( &writer);
//     }
//     assert( (writer).ptr <= (writer).bock_max - sizeof(elem));
//     memcpy((writer).ptr, &(elem), sizeof(elem));
//     (writer).ptr += sizeof(elem);
// }


/** Move reader position forward: */
// #define CV_NEXT_SEQ_ELEM( elem_size, reader )
// {
//     if( ((reader).ptr += (elem_size)) >= (reader).bock_max )
//     {
//         cvChangeSeqBlock( &(reader), 1 );
//     }
// }


/** Move reader position backward: */
// #define CV_PREV_SEQ_ELEM( elem_size, reader )
// {
//     if( ((reader).ptr -= (elem_size)) < (reader).bock_min )
//     {
//         cvChangeSeqBlock( &(reader), -1 );
//     }
// }

/** Read element and move read position forward: */
// #define CV_READ_SEQ_ELEM( elem, reader )
// {
//     assert( (reader).seq->elem_size == sizeof(elem));
//     memcpy( &(elem), (reader).ptr, sizeof((elem)));
//     CV_NEXT_SEQ_ELEM( sizeof(elem), reader )
// }

/** Read element and move read position backward: */
// #define CV_REV_READ_SEQ_ELEM( elem, reader )
// {
//     assert( (reader).seq->elem_size == sizeof(elem));
//     memcpy(&(elem), (reader).ptr, sizeof((elem)));
//     CV_PREV_SEQ_ELEM( sizeof(elem), reader )
// }


// #define CV_READ_CHAIN_POINT( _pt, reader )
// {
//     (_pt) = (reader).pt;
//     if( (reader).ptr )
//     {
//         CV_READ_SEQ_ELEM( (reader).code, (reader));
//         assert( ((reader).code & ~7) == 0 );
//         (reader).pt.x += (reader).detas[(int)(reader).code][0];
//         (reader).pt.y += (reader).detas[(int)(reader).code][1];
//     }
// }

// #define CV_CURRENT_POINT( reader )  (*((CvPoint*)((reader).ptr)))
// #define CV_PREV_POINT( reader )     (*((CvPoint*)((reader).prev_elem)))

// #define CV_READ_EDGE( pt1, pt2, reader )
// {
//     assert( sizeof(pt1) == sizeof(CvPoint) &&
//             sizeof(pt2) == sizeof(CvPoint) &&
//             reader.seq->elem_size == sizeof(CvPoint));
//     (pt1) = CV_PREV_POINT( reader );
//     (pt2) = CV_CURRENT_POINT( reader );
//     (reader).prev_elem = (reader).ptr;
//     CV_NEXT_SEQ_ELEM( sizeof(CvPoint), (reader));
// }

/************ Graph macros ************/

/** Return next graph edge for given vertex: */
// #define  CV_NEXT_GRAPH_EDGE( edge, vertex )
//      (assert((edge)->vtx[0] == (vertex) || (edge)->vtx[1] == (vertex)),
//       (edge)->next[(edge)->vtx[1] == (vertex)])



/****************************************************************************************\
*             Data structures for persistence (a.k.a serialization) functionality        *
\****************************************************************************************/

/** "black box" file storage */
@Opaque public static class CvFileStorage extends AbstractCvFileStorage {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CvFileStorage() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvFileStorage(Pointer p) { super(p); }
}

/** Storage flags: */
public static final int CV_STORAGE_READ =          0;
public static final int CV_STORAGE_WRITE =         1;
public static final int CV_STORAGE_WRITE_TEXT =    CV_STORAGE_WRITE;
public static final int CV_STORAGE_WRITE_BINARY =  CV_STORAGE_WRITE;
public static final int CV_STORAGE_APPEND =        2;
public static final int CV_STORAGE_MEMORY =        4;
public static final int CV_STORAGE_FORMAT_MASK =   (7<<3);
public static final int CV_STORAGE_FORMAT_AUTO =   0;
public static final int CV_STORAGE_FORMAT_XML =    8;
public static final int CV_STORAGE_FORMAT_YAML =  16;

/** \brief List of attributes. :
<p>
In the current implementation, attributes are used to pass extra parameters when writing user
objects (see cvWrite). XML attributes inside tags are not supported, aside from the object type
specification (type_id attribute).
@see cvAttrList, cvAttrValue
 */
public static class CvAttrList extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvAttrList() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvAttrList(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvAttrList(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvAttrList position(int position) {
        return (CvAttrList)super.position(position);
    }

    /** NULL-terminated array of (attribute_name,attribute_value) pairs. */
    @MemberGetter public native @Cast("const char*") BytePointer attr(int i);
    @MemberGetter public native @Cast("const char**") PointerPointer attr();
    /** Pointer to next chunk of the attributes list.                    */
    public native CvAttrList next(); public native CvAttrList next(CvAttrList next);
}

/** initializes CvAttrList structure */
public static native @ByVal CvAttrList cvAttrList( @Cast("const char**") PointerPointer attr/*=NULL*/,
                                 CvAttrList next/*=NULL*/ );
public static native @ByVal CvAttrList cvAttrList( );
public static native @ByVal CvAttrList cvAttrList( @Cast("const char**") @ByPtrPtr BytePointer attr/*=NULL*/,
                                 CvAttrList next/*=NULL*/ );
public static native @ByVal CvAttrList cvAttrList( @Cast("const char**") @ByPtrPtr ByteBuffer attr/*=NULL*/,
                                 CvAttrList next/*=NULL*/ );
public static native @ByVal CvAttrList cvAttrList( @Cast("const char**") @ByPtrPtr byte[] attr/*=NULL*/,
                                 CvAttrList next/*=NULL*/ );

public static final int CV_NODE_NONE =        0;
public static final int CV_NODE_INT =         1;
public static final int CV_NODE_INTEGER =     CV_NODE_INT;
public static final int CV_NODE_REAL =        2;
public static final int CV_NODE_FLOAT =       CV_NODE_REAL;
public static final int CV_NODE_STR =         3;
public static final int CV_NODE_STRING =      CV_NODE_STR;
/** not used */
public static final int CV_NODE_REF =         4;
public static final int CV_NODE_SEQ =         5;
public static final int CV_NODE_MAP =         6;
public static final int CV_NODE_TYPE_MASK =   7;

// #define CV_NODE_TYPE(flags)  ((flags) & CV_NODE_TYPE_MASK)

/** file node flags */
/**Used only for writing structures in YAML format. */
public static final int CV_NODE_FLOW =        8;
public static final int CV_NODE_USER =        16;
public static final int CV_NODE_EMPTY =       32;
public static final int CV_NODE_NAMED =       64;

// #define CV_NODE_IS_INT(flags)        (CV_NODE_TYPE(flags) == CV_NODE_INT)
// #define CV_NODE_IS_REAL(flags)       (CV_NODE_TYPE(flags) == CV_NODE_REAL)
// #define CV_NODE_IS_STRING(flags)     (CV_NODE_TYPE(flags) == CV_NODE_STRING)
// #define CV_NODE_IS_SEQ(flags)        (CV_NODE_TYPE(flags) == CV_NODE_SEQ)
// #define CV_NODE_IS_MAP(flags)        (CV_NODE_TYPE(flags) == CV_NODE_MAP)
// #define CV_NODE_IS_COLLECTION(flags) (CV_NODE_TYPE(flags) >= CV_NODE_SEQ)
// #define CV_NODE_IS_FLOW(flags)       (((flags) & CV_NODE_FLOW) != 0)
// #define CV_NODE_IS_EMPTY(flags)      (((flags) & CV_NODE_EMPTY) != 0)
// #define CV_NODE_IS_USER(flags)       (((flags) & CV_NODE_USER) != 0)
// #define CV_NODE_HAS_NAME(flags)      (((flags) & CV_NODE_NAMED) != 0)

public static final int CV_NODE_SEQ_SIMPLE = 256;
// #define CV_NODE_SEQ_IS_SIMPLE(seq) (((seq)->flags & CV_NODE_SEQ_SIMPLE) != 0)

public static class CvString extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvString() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvString(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvString(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvString position(int position) {
        return (CvString)super.position(position);
    }

    public native int len(); public native CvString len(int len);
    public native @Cast("char*") BytePointer ptr(); public native CvString ptr(BytePointer ptr);
}

/** All the keys (names) of elements in the readed file storage
   are stored in the hash to speed up the lookup operations: */
public static class CvStringHashNode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvStringHashNode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvStringHashNode(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvStringHashNode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvStringHashNode position(int position) {
        return (CvStringHashNode)super.position(position);
    }

    public native @Cast("unsigned") int hashval(); public native CvStringHashNode hashval(int hashval);
    public native @ByRef CvString str(); public native CvStringHashNode str(CvString str);
    public native CvStringHashNode next(); public native CvStringHashNode next(CvStringHashNode next);
}

@Opaque public static class CvFileNodeHash extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CvFileNodeHash() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvFileNodeHash(Pointer p) { super(p); }
}

/** Basic element of the file storage - scalar or collection: */
public static class CvFileNode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvFileNode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvFileNode(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvFileNode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvFileNode position(int position) {
        return (CvFileNode)super.position(position);
    }

    public native int tag(); public native CvFileNode tag(int tag);
    /** type information
                (only for user-defined object, for others it is 0) */
    public native CvTypeInfo info(); public native CvFileNode info(CvTypeInfo info);
        /** scalar floating-point number */
        @Name("data.f") public native double data_f(); public native CvFileNode data_f(double data_f);
        /** scalar integer number */
        @Name("data.i") public native int data_i(); public native CvFileNode data_i(int data_i);
        /** text string */
        @Name("data.str") public native @ByRef CvString data_str(); public native CvFileNode data_str(CvString data_str);
        /** sequence (ordered collection of file nodes) */
        @Name("data.seq") public native CvSeq data_seq(); public native CvFileNode data_seq(CvSeq data_seq);
        /** map (collection of named file nodes) */
        @Name("data.map") public native CvFileNodeHash data_map(); public native CvFileNode data_map(CvFileNodeHash data_map);
}

// #ifdef __cplusplus
// #endif
@Convention("CV_CDECL") public static class CvIsInstanceFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CvIsInstanceFunc(Pointer p) { super(p); }
    protected CvIsInstanceFunc() { allocate(); }
    private native void allocate();
    public native int call( @Const Pointer struct_ptr );
}
@Convention("CV_CDECL") public static class CvReleaseFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CvReleaseFunc(Pointer p) { super(p); }
    protected CvReleaseFunc() { allocate(); }
    private native void allocate();
    public native void call( @Cast("void**") @ByPtrPtr Pointer struct_dblptr );
}
@Convention("CV_CDECL") public static class CvReadFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CvReadFunc(Pointer p) { super(p); }
    protected CvReadFunc() { allocate(); }
    private native void allocate();
    public native Pointer call( CvFileStorage storage, CvFileNode node );
}
@Convention("CV_CDECL") public static class CvWriteFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CvWriteFunc(Pointer p) { super(p); }
    protected CvWriteFunc() { allocate(); }
    private native void allocate();
    public native void call( CvFileStorage storage, @Cast("const char*") BytePointer name,
                                      @Const Pointer struct_ptr, @ByVal CvAttrList attributes );
}
@Convention("CV_CDECL") public static class CvCloneFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CvCloneFunc(Pointer p) { super(p); }
    protected CvCloneFunc() { allocate(); }
    private native void allocate();
    public native Pointer call( @Const Pointer struct_ptr );
}
// #ifdef __cplusplus
// #endif

/** \brief Type information
<p>
The structure contains information about one of the standard or user-defined types. Instances of the
type may or may not contain a pointer to the corresponding CvTypeInfo structure. In any case, there
is a way to find the type info structure for a given object using the cvTypeOf function.
Alternatively, type info can be found by type name using cvFindType, which is used when an object
is read from file storage. The user can register a new type with cvRegisterType that adds the type
information structure into the beginning of the type list. Thus, it is possible to create
specialized types from generic standard types and override the basic methods.
 */
public static class CvTypeInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvTypeInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvTypeInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvTypeInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvTypeInfo position(int position) {
        return (CvTypeInfo)super.position(position);
    }

    /** not used */
    public native int flags(); public native CvTypeInfo flags(int flags);
    /** sizeof(CvTypeInfo) */
    public native int header_size(); public native CvTypeInfo header_size(int header_size);
    /** previous registered type in the list */
    public native CvTypeInfo prev(); public native CvTypeInfo prev(CvTypeInfo prev);
    /** next registered type in the list */
    public native CvTypeInfo next(); public native CvTypeInfo next(CvTypeInfo next);
    /** type name, written to file storage */
    @MemberGetter public native @Cast("const char*") BytePointer type_name();
    /** checks if the passed object belongs to the type */
    public native CvIsInstanceFunc is_instance(); public native CvTypeInfo is_instance(CvIsInstanceFunc is_instance);
    /** releases object (memory etc.) */
    public native CvReleaseFunc release(); public native CvTypeInfo release(CvReleaseFunc release);
    /** reads object from file storage */
    public native CvReadFunc read(); public native CvTypeInfo read(CvReadFunc read);
    /** writes object to file storage */
    public native CvWriteFunc write(); public native CvTypeInfo write(CvWriteFunc write);
    /** creates a copy of the object */
    public native CvCloneFunc clone(); public native CvTypeInfo clone(CvCloneFunc clone);
}


/**** System data types ******/

public static class CvPluginFuncInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvPluginFuncInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvPluginFuncInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvPluginFuncInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvPluginFuncInfo position(int position) {
        return (CvPluginFuncInfo)super.position(position);
    }

    public native Pointer func_addr(int i); public native CvPluginFuncInfo func_addr(int i, Pointer func_addr);
    @MemberGetter public native @Cast("void**") PointerPointer func_addr();
    public native Pointer default_func_addr(); public native CvPluginFuncInfo default_func_addr(Pointer default_func_addr);
    @MemberGetter public native @Cast("const char*") BytePointer func_names();
    public native int search_modules(); public native CvPluginFuncInfo search_modules(int search_modules);
    public native int loaded_from(); public native CvPluginFuncInfo loaded_from(int loaded_from);
}

public static class CvModuleInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvModuleInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvModuleInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvModuleInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvModuleInfo position(int position) {
        return (CvModuleInfo)super.position(position);
    }

    public native CvModuleInfo next(); public native CvModuleInfo next(CvModuleInfo next);
    @MemberGetter public native @Cast("const char*") BytePointer name();
    @MemberGetter public native @Cast("const char*") BytePointer version();
    public native CvPluginFuncInfo func_tab(); public native CvModuleInfo func_tab(CvPluginFuncInfo func_tab);
}

/** \} */

// #endif /*__OPENCV_CORE_TYPES_H__*/

/* End of file. */


// Parsed from <opencv2/core/core_c.h>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/


// #ifndef __OPENCV_CORE_C_H__
// #define __OPENCV_CORE_C_H__

// #include "opencv2/core/types_c.h"

// #ifdef __cplusplus
// #  ifdef _MSC_VER
/* disable warning C4190: 'function' has C-linkage specified, but returns UDT 'typename'
                          which is incompatible with C

   It is OK to disable it because we only extend few plain structures with
   C++ construrtors for simpler interoperability with C++ API of the library
*/
// #    pragma warning(disable:4190)
// #  elif defined __clang__ && __clang_major__ >= 3
// #    pragma GCC diagnostic ignored "-Wreturn-type-c-linkage"
// #  endif
// #endif

// #ifdef __cplusplus
// #endif

/** \addtogroup core_c
    \{
*/

/****************************************************************************************\
*          Array allocation, deallocation, initialization and access to elements         *
\****************************************************************************************/

/** {@code malloc} wrapper.
   If there is no enough memory, the function
   (as well as other OpenCV functions that call cvAlloc)
   raises an error. */
public static native Pointer cvAlloc( @Cast("size_t") long size );

/** {@code free} wrapper.
   Here and further all the memory releasing functions
   (that all call cvFree) take double pointer in order to
   to clear pointer to the data after releasing it.
   Passing pointer to NULL pointer is Ok: nothing happens in this case
*/
public static native void cvFree_( Pointer ptr );
// #define cvFree(ptr) (cvFree_(*(ptr)), *(ptr)=0)

/** \brief Creates an image header but does not allocate the image data.
<p>
@param size Image width and height
@param depth Image depth (see cvCreateImage )
@param channels Number of channels (see cvCreateImage )
 */
public static native IplImage cvCreateImageHeader( @ByVal CvSize size, int depth, int channels );

/** \brief Initializes an image header that was previously allocated.
<p>
The returned IplImage\* points to the initialized header.
@param image Image header to initialize
@param size Image width and height
@param depth Image depth (see cvCreateImage )
@param channels Number of channels (see cvCreateImage )
@param origin Top-left IPL_ORIGIN_TL or bottom-left IPL_ORIGIN_BL
@param align Alignment for image rows, typically 4 or 8 bytes
 */
public static native IplImage cvInitImageHeader( IplImage image, @ByVal CvSize size, int depth,
                                   int channels, int origin/*=0*/,
                                   int align/*=4*/);
public static native IplImage cvInitImageHeader( IplImage image, @ByVal CvSize size, int depth,
                                   int channels);

/** \brief Creates an image header and allocates the image data.
<p>
This function call is equivalent to the following code:
<pre>{@code
    header = cvCreateImageHeader(size, depth, channels);
    cvCreateData(header);
}</pre>
@param size Image width and height
@param depth Bit depth of image elements. See IplImage for valid depths.
@param channels Number of channels per pixel. See IplImage for details. This function only creates
images with interleaved channels.
 */
public static native IplImage cvCreateImage( @ByVal CvSize size, int depth, int channels );

/** \brief Deallocates an image header.
<p>
This call is an analogue of :
<pre>{@code
    if(image )
    {
        iplDeallocate(*image, IPL_IMAGE_HEADER | IPL_IMAGE_ROI);
        *image = 0;
    }
}</pre>
but it does not use IPL functions by default (see the CV_TURN_ON_IPL_COMPATIBILITY macro).
@param image Double pointer to the image header
 */
public static native void cvReleaseImageHeader( @Cast("IplImage**") PointerPointer image );
public static native void cvReleaseImageHeader( @ByPtrPtr IplImage image );

/** \brief Deallocates the image header and the image data.
<p>
This call is a shortened form of :
<pre>{@code
    if(*image )
    {
        cvReleaseData(*image);
        cvReleaseImageHeader(image);
    }
}</pre>
@param image Double pointer to the image header
*/
public static native void cvReleaseImage( @Cast("IplImage**") PointerPointer image );
public static native void cvReleaseImage( @ByPtrPtr IplImage image );

/** Creates a copy of IPL image (widthStep may differ) */
public static native IplImage cvCloneImage( @Const IplImage image );

/** \brief Sets the channel of interest in an IplImage.
<p>
If the ROI is set to NULL and the coi is *not* 0, the ROI is allocated. Most OpenCV functions do
*not* support the COI setting, so to process an individual image/matrix channel one may copy (via
cvCopy or cvSplit) the channel to a separate image/matrix, process it and then copy the result
back (via cvCopy or cvMerge) if needed.
@param image A pointer to the image header
@param coi The channel of interest. 0 - all channels are selected, 1 - first channel is selected,
etc. Note that the channel indices become 1-based.
 */
public static native void cvSetImageCOI( IplImage image, int coi );

/** \brief Returns the index of the channel of interest.
<p>
Returns the channel of interest of in an IplImage. Returned values correspond to the coi in
cvSetImageCOI.
@param image A pointer to the image header
 */
public static native int cvGetImageCOI( @Const IplImage image );

/** \brief Sets an image Region Of Interest (ROI) for a given rectangle.
<p>
If the original image ROI was NULL and the rect is not the whole image, the ROI structure is
allocated.
<p>
Most OpenCV functions support the use of ROI and treat the image rectangle as a separate image. For
example, all of the pixel coordinates are counted from the top-left (or bottom-left) corner of the
ROI, not the original image.
@param image A pointer to the image header
@param rect The ROI rectangle
 */
public static native void cvSetImageROI( IplImage image, @ByVal CvRect rect );

/** \brief Resets the image ROI to include the entire image and releases the ROI structure.
<p>
This produces a similar result to the following, but in addition it releases the ROI structure. :
<pre>{@code
    cvSetImageROI(image, cvRect(0, 0, image->width, image->height ));
    cvSetImageCOI(image, 0);
}</pre>
@param image A pointer to the image header
 */
public static native void cvResetImageROI( IplImage image );

/** \brief Returns the image ROI.
<p>
If there is no ROI set, cvRect(0,0,image-\>width,image-\>height) is returned.
@param image A pointer to the image header
 */
public static native @ByVal CvRect cvGetImageROI( @Const IplImage image );

/** \brief Creates a matrix header but does not allocate the matrix data.
<p>
The function allocates a new matrix header and returns a pointer to it. The matrix data can then be
allocated using cvCreateData or set explicitly to user-allocated data via cvSetData.
@param rows Number of rows in the matrix
@param cols Number of columns in the matrix
@param type Type of the matrix elements, see cvCreateMat
 */
public static native CvMat cvCreateMatHeader( int rows, int cols, int type );

public static final int CV_AUTOSTEP =  0x7fffffff;

/** \brief Initializes a pre-allocated matrix header.
<p>
This function is often used to process raw data with OpenCV matrix functions. For example, the
following code computes the matrix product of two matrices, stored as ordinary arrays:
<pre>{@code
    double a[] = { 1, 2, 3, 4,
                   5, 6, 7, 8,
                   9, 10, 11, 12 };

    double b[] = { 1, 5, 9,
                   2, 6, 10,
                   3, 7, 11,
                   4, 8, 12 };

    double c[9];
    CvMat Ma, Mb, Mc ;

    cvInitMatHeader(&Ma, 3, 4, CV_64FC1, a);
    cvInitMatHeader(&Mb, 4, 3, CV_64FC1, b);
    cvInitMatHeader(&Mc, 3, 3, CV_64FC1, c);

    cvMatMulAdd(&Ma, &Mb, 0, &Mc);
    // the c array now contains the product of a (3x4) and b (4x3)
}</pre>
@param mat A pointer to the matrix header to be initialized
@param rows Number of rows in the matrix
@param cols Number of columns in the matrix
@param type Type of the matrix elements, see cvCreateMat .
@param data Optional: data pointer assigned to the matrix header
@param step Optional: full row width in bytes of the assigned data. By default, the minimal
possible step is used which assumes there are no gaps between subsequent rows of the matrix.
 */
public static native CvMat cvInitMatHeader( CvMat mat, int rows, int cols,
                              int type, Pointer data/*=NULL*/,
                              int step/*=CV_AUTOSTEP*/ );
public static native CvMat cvInitMatHeader( CvMat mat, int rows, int cols,
                              int type );

/** \brief Creates a matrix header and allocates the matrix data.
<p>
The function call is equivalent to the following code:
<pre>{@code
    CvMat* mat = cvCreateMatHeader(rows, cols, type);
    cvCreateData(mat);
}</pre>
@param rows Number of rows in the matrix
@param cols Number of columns in the matrix
@param type The type of the matrix elements in the form
CV_\<bit depth\>\<S|U|F\>C\<number of channels\> , where S=signed, U=unsigned, F=float. For
example, CV _ 8UC1 means the elements are 8-bit unsigned and the there is 1 channel, and CV _
32SC2 means the elements are 32-bit signed and there are 2 channels.
 */
public static native CvMat cvCreateMat( int rows, int cols, int type );

/** \brief Deallocates a matrix.
<p>
The function decrements the matrix data reference counter and deallocates matrix header. If the data
reference counter is 0, it also deallocates the data. :
<pre>{@code
    if(*mat )
        cvDecRefData(*mat);
    cvFree((void**)mat);
}</pre>
@param mat Double pointer to the matrix
 */
public static native void cvReleaseMat( @Cast("CvMat**") PointerPointer mat );
public static native void cvReleaseMat( @ByPtrPtr CvMat mat );

/** \brief Decrements an array data reference counter.
<p>
The function decrements the data reference counter in a CvMat or CvMatND if the reference counter
<p>
pointer is not NULL. If the counter reaches zero, the data is deallocated. In the current
implementation the reference counter is not NULL only if the data was allocated using the
cvCreateData function. The counter will be NULL in other cases such as: external data was assigned
to the header using cvSetData, header is part of a larger matrix or image, or the header was
converted from an image or n-dimensional matrix header.
@param arr Pointer to an array header
 */
public static native void cvDecRefData( CvArr arr );

/** \brief Increments array data reference counter.
<p>
The function increments CvMat or CvMatND data reference counter and returns the new counter value if
the reference counter pointer is not NULL, otherwise it returns zero.
@param arr Array header
 */
public static native int cvIncRefData( CvArr arr );


/** Creates an exact copy of the input matrix (except, may be, step value) */
public static native CvMat cvCloneMat( @Const CvMat mat );


/** \brief Returns matrix header corresponding to the rectangular sub-array of input image or matrix.
<p>
The function returns header, corresponding to a specified rectangle of the input array. In other
<p>
words, it allows the user to treat a rectangular part of input array as a stand-alone array. ROI is
taken into account by the function so the sub-array of ROI is actually extracted.
@param arr Input array
@param submat Pointer to the resultant sub-array header
@param rect Zero-based coordinates of the rectangle of interest
 */
public static native CvMat cvGetSubRect( @Const CvArr arr, CvMat submat, @ByVal CvRect rect );
public static native CvMat cvGetSubArr(CvArr arg1, CvMat arg2, @ByVal CvRect arg3);

/** \brief Returns array row or row span.
<p>
The functions return the header, corresponding to a specified row/row span of the input array.
cvGetRow(arr, submat, row) is a shortcut for cvGetRows(arr, submat, row, row+1).
@param arr Input array
@param submat Pointer to the resulting sub-array header
@param start_row Zero-based index of the starting row (inclusive) of the span
@param end_row Zero-based index of the ending row (exclusive) of the span
@param delta_row Index step in the row span. That is, the function extracts every delta_row -th
row from start_row and up to (but not including) end_row .
 */
public static native CvMat cvGetRows( @Const CvArr arr, CvMat submat,
                        int start_row, int end_row,
                        int delta_row/*=1*/);
public static native CvMat cvGetRows( @Const CvArr arr, CvMat submat,
                        int start_row, int end_row);

/** \overload
@param arr Input array
@param submat Pointer to the resulting sub-array header
@param row Zero-based index of the selected row
*/
public static native CvMat cvGetRow( @Const CvArr arr, CvMat submat, int row );


/** \brief Returns one of more array columns.
<p>
The functions return the header, corresponding to a specified column span of the input array. That
<p>
is, no data is copied. Therefore, any modifications of the submatrix will affect the original array.
If you need to copy the columns, use cvCloneMat. cvGetCol(arr, submat, col) is a shortcut for
cvGetCols(arr, submat, col, col+1).
@param arr Input array
@param submat Pointer to the resulting sub-array header
@param start_col Zero-based index of the starting column (inclusive) of the span
@param end_col Zero-based index of the ending column (exclusive) of the span
 */
public static native CvMat cvGetCols( @Const CvArr arr, CvMat submat,
                        int start_col, int end_col );

/** \overload
@param arr Input array
@param submat Pointer to the resulting sub-array header
@param col Zero-based index of the selected column
*/
public static native CvMat cvGetCol( @Const CvArr arr, CvMat submat, int col );

/** \brief Returns one of array diagonals.
<p>
The function returns the header, corresponding to a specified diagonal of the input array.
@param arr Input array
@param submat Pointer to the resulting sub-array header
@param diag Index of the array diagonal. Zero value corresponds to the main diagonal, -1
corresponds to the diagonal above the main, 1 corresponds to the diagonal below the main, and so
forth.
 */
public static native CvMat cvGetDiag( @Const CvArr arr, CvMat submat,
                            int diag/*=0*/);
public static native CvMat cvGetDiag( @Const CvArr arr, CvMat submat);

/** low-level scalar <-> raw data conversion functions */
public static native void cvScalarToRawData( @Const CvScalar scalar, Pointer data, int type,
                              int extend_to_12/*=0*/ );
public static native void cvScalarToRawData( @Const CvScalar scalar, Pointer data, int type );

public static native void cvRawDataToScalar( @Const Pointer data, int type, CvScalar scalar );

/** \brief Creates a new matrix header but does not allocate the matrix data.
<p>
The function allocates a header for a multi-dimensional dense array. The array data can further be
allocated using cvCreateData or set explicitly to user-allocated data via cvSetData.
@param dims Number of array dimensions
@param sizes Array of dimension sizes
@param type Type of array elements, see cvCreateMat
 */
public static native CvMatND cvCreateMatNDHeader( int dims, @Const IntPointer sizes, int type );
public static native CvMatND cvCreateMatNDHeader( int dims, @Const IntBuffer sizes, int type );
public static native CvMatND cvCreateMatNDHeader( int dims, @Const int[] sizes, int type );

/** \brief Creates the header and allocates the data for a multi-dimensional dense array.
<p>
This function call is equivalent to the following code:
<pre>{@code
    CvMatND* mat = cvCreateMatNDHeader(dims, sizes, type);
    cvCreateData(mat);
}</pre>
@param dims Number of array dimensions. This must not exceed CV_MAX_DIM (32 by default, but can be
changed at build time).
@param sizes Array of dimension sizes.
@param type Type of array elements, see cvCreateMat .
 */
public static native CvMatND cvCreateMatND( int dims, @Const IntPointer sizes, int type );
public static native CvMatND cvCreateMatND( int dims, @Const IntBuffer sizes, int type );
public static native CvMatND cvCreateMatND( int dims, @Const int[] sizes, int type );

/** \brief Initializes a pre-allocated multi-dimensional array header.
<p>
@param mat A pointer to the array header to be initialized
@param dims The number of array dimensions
@param sizes An array of dimension sizes
@param type Type of array elements, see cvCreateMat
@param data Optional data pointer assigned to the matrix header
 */
public static native CvMatND cvInitMatNDHeader( CvMatND mat, int dims, @Const IntPointer sizes,
                                    int type, Pointer data/*=NULL*/ );
public static native CvMatND cvInitMatNDHeader( CvMatND mat, int dims, @Const IntPointer sizes,
                                    int type );
public static native CvMatND cvInitMatNDHeader( CvMatND mat, int dims, @Const IntBuffer sizes,
                                    int type, Pointer data/*=NULL*/ );
public static native CvMatND cvInitMatNDHeader( CvMatND mat, int dims, @Const IntBuffer sizes,
                                    int type );
public static native CvMatND cvInitMatNDHeader( CvMatND mat, int dims, @Const int[] sizes,
                                    int type, Pointer data/*=NULL*/ );
public static native CvMatND cvInitMatNDHeader( CvMatND mat, int dims, @Const int[] sizes,
                                    int type );

/** \brief Deallocates a multi-dimensional array.
<p>
The function decrements the array data reference counter and releases the array header. If the
reference counter reaches 0, it also deallocates the data. :
<pre>{@code
    if(*mat )
        cvDecRefData(*mat);
    cvFree((void**)mat);
}</pre>
@param mat Double pointer to the array
 */
public static native void cvReleaseMatND( @Cast("CvMatND**") PointerPointer mat );
public static native void cvReleaseMatND( @ByPtrPtr CvMatND mat );

/** Creates a copy of CvMatND (except, may be, steps) */
public static native CvMatND cvCloneMatND( @Const CvMatND mat );

/** \brief Creates sparse array.
<p>
The function allocates a multi-dimensional sparse array. Initially the array contain no elements,
that is PtrND and other related functions will return 0 for every index.
@param dims Number of array dimensions. In contrast to the dense matrix, the number of dimensions is
practically unlimited (up to \f$2^{16}\f$ ).
@param sizes Array of dimension sizes
@param type Type of array elements. The same as for CvMat
 */
public static native CvSparseMat cvCreateSparseMat( int dims, @Const IntPointer sizes, int type );
public static native CvSparseMat cvCreateSparseMat( int dims, @Const IntBuffer sizes, int type );
public static native CvSparseMat cvCreateSparseMat( int dims, @Const int[] sizes, int type );

/** \brief Deallocates sparse array.
<p>
The function releases the sparse array and clears the array pointer upon exit.
@param mat Double pointer to the array
 */
public static native void cvReleaseSparseMat( @Cast("CvSparseMat**") PointerPointer mat );
public static native void cvReleaseSparseMat( @ByPtrPtr CvSparseMat mat );

/** Creates a copy of CvSparseMat (except, may be, zero items) */
public static native CvSparseMat cvCloneSparseMat( @Const CvSparseMat mat );

/** \brief Initializes sparse array elements iterator.
<p>
The function initializes iterator of sparse array elements and returns pointer to the first element,
or NULL if the array is empty.
@param mat Input array
@param mat_iterator Initialized iterator
 */
public static native CvSparseNode cvInitSparseMatIterator( @Const CvSparseMat mat,
                                              CvSparseMatIterator mat_iterator );

/** \brief Returns the next sparse matrix element
<p>
The function moves iterator to the next sparse matrix element and returns pointer to it. In the
current version there is no any particular order of the elements, because they are stored in the
hash table. The sample below demonstrates how to iterate through the sparse matrix:
<pre>{@code
    // print all the non-zero sparse matrix elements and compute their sum
    double sum = 0;
    int i, dims = cvGetDims(sparsemat);
    CvSparseMatIterator it;
    CvSparseNode* node = cvInitSparseMatIterator(sparsemat, &it);

    for(; node != 0; node = cvGetNextSparseNode(&it))
    {
        int* idx = CV_NODE_IDX(array, node);
        float val = *(float*)CV_NODE_VAL(array, node);
        printf("M");
        for(i = 0; i < dims; i++ )
            printf("[%d]", idx[i]);
        printf("=%g\n", val);

        sum += val;
    }

    printf("nTotal sum = %g\n", sum);
}</pre>
@param mat_iterator Sparse array iterator
 */
public static native CvSparseNode cvGetNextSparseNode( CvSparseMatIterator mat_iterator );


public static final int CV_MAX_ARR = 10;

/** matrix iterator: used for n-ary operations on dense arrays */
public static class CvNArrayIterator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvNArrayIterator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvNArrayIterator(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvNArrayIterator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvNArrayIterator position(int position) {
        return (CvNArrayIterator)super.position(position);
    }

    /** number of arrays */
    public native int count(); public native CvNArrayIterator count(int count);
    /** number of dimensions to iterate */
    public native int dims(); public native CvNArrayIterator dims(int dims);
    /** maximal common linear size: { width = size, height = 1 } */
    public native @ByRef CvSize size(); public native CvNArrayIterator size(CvSize size);
    /** pointers to the array slices */
    public native @Cast("uchar*") BytePointer ptr(int i); public native CvNArrayIterator ptr(int i, BytePointer ptr);
    @MemberGetter public native @Cast("uchar**") PointerPointer ptr();
    /** for internal use */
    public native int stack(int i); public native CvNArrayIterator stack(int i, int stack);
    @MemberGetter public native IntPointer stack();
    /** pointers to the headers of the
                                     matrices that are processed */
    public native CvMatND hdr(int i); public native CvNArrayIterator hdr(int i, CvMatND hdr);
    @MemberGetter public native @Cast("CvMatND**") PointerPointer hdr();
}

public static final int CV_NO_DEPTH_CHECK =     1;
public static final int CV_NO_CN_CHECK =        2;
public static final int CV_NO_SIZE_CHECK =      4;

/** initializes iterator that traverses through several arrays simulteneously
   (the function together with cvNextArraySlice is used for
    N-ari element-wise operations) */
public static native int cvInitNArrayIterator( int count, @Cast("CvArr**") PointerPointer arrs,
                                 @Const CvArr mask, CvMatND stubs,
                                 CvNArrayIterator array_iterator,
                                 int flags/*=0*/ );
public static native int cvInitNArrayIterator( int count, @ByPtrPtr CvArr arrs,
                                 @Const CvArr mask, CvMatND stubs,
                                 CvNArrayIterator array_iterator );
public static native int cvInitNArrayIterator( int count, @ByPtrPtr CvArr arrs,
                                 @Const CvArr mask, CvMatND stubs,
                                 CvNArrayIterator array_iterator,
                                 int flags/*=0*/ );

/** returns zero value if iteration is finished, non-zero (slice length) otherwise */
public static native int cvNextNArraySlice( CvNArrayIterator array_iterator );


/** \brief Returns type of array elements.
<p>
The function returns type of the array elements. In the case of IplImage the type is converted to
CvMat-like representation. For example, if the image has been created as:
<pre>{@code
    IplImage* img = cvCreateImage(cvSize(640, 480), IPL_DEPTH_8U, 3);
}</pre>
The code cvGetElemType(img) will return CV_8UC3.
@param arr Input array
 */
public static native int cvGetElemType( @Const CvArr arr );

/** \brief Return number of array dimensions
<p>
The function returns the array dimensionality and the array of dimension sizes. In the case of
IplImage or CvMat it always returns 2 regardless of number of image/matrix rows. For example, the
following code calculates total number of array elements:
<pre>{@code
    int sizes[CV_MAX_DIM];
    int i, total = 1;
    int dims = cvGetDims(arr, size);
    for(i = 0; i < dims; i++ )
        total *= sizes[i];
}</pre>
@param arr Input array
@param sizes Optional output vector of the array dimension sizes. For 2d arrays the number of rows
(height) goes first, number of columns (width) next.
 */
public static native int cvGetDims( @Const CvArr arr, IntPointer sizes/*=NULL*/ );
public static native int cvGetDims( @Const CvArr arr );
public static native int cvGetDims( @Const CvArr arr, IntBuffer sizes/*=NULL*/ );
public static native int cvGetDims( @Const CvArr arr, int[] sizes/*=NULL*/ );


/** \brief Returns array size along the specified dimension.
<p>
@param arr Input array
@param index Zero-based dimension index (for matrices 0 means number of rows, 1 means number of
columns; for images 0 means height, 1 means width)
 */
public static native int cvGetDimSize( @Const CvArr arr, int index );


/** \brief Return pointer to a particular array element.
<p>
The functions return a pointer to a specific array element. Number of array dimension should match
to the number of indices passed to the function except for cvPtr1D function that can be used for
sequential access to 1D, 2D or nD dense arrays.
<p>
The functions can be used for sparse arrays as well - if the requested node does not exist they
create it and set it to zero.
<p>
All these as well as other functions accessing array elements ( cvGetND , cvGetRealND , cvSet
, cvSetND , cvSetRealND ) raise an error in case if the element index is out of range.
@param arr Input array
@param idx0 The first zero-based component of the element index
@param type Optional output parameter: type of matrix elements
 */
public static native @Cast("uchar*") BytePointer cvPtr1D( @Const CvArr arr, int idx0, IntPointer type/*=NULL*/);
public static native @Cast("uchar*") BytePointer cvPtr1D( @Const CvArr arr, int idx0);
public static native @Cast("uchar*") ByteBuffer cvPtr1D( @Const CvArr arr, int idx0, IntBuffer type/*=NULL*/);
public static native @Cast("uchar*") byte[] cvPtr1D( @Const CvArr arr, int idx0, int[] type/*=NULL*/);
/** \overload */
public static native @Cast("uchar*") BytePointer cvPtr2D( @Const CvArr arr, int idx0, int idx1, IntPointer type/*=NULL*/ );
public static native @Cast("uchar*") BytePointer cvPtr2D( @Const CvArr arr, int idx0, int idx1 );
public static native @Cast("uchar*") ByteBuffer cvPtr2D( @Const CvArr arr, int idx0, int idx1, IntBuffer type/*=NULL*/ );
public static native @Cast("uchar*") byte[] cvPtr2D( @Const CvArr arr, int idx0, int idx1, int[] type/*=NULL*/ );
/** \overload */
public static native @Cast("uchar*") BytePointer cvPtr3D( @Const CvArr arr, int idx0, int idx1, int idx2,
                      IntPointer type/*=NULL*/);
public static native @Cast("uchar*") BytePointer cvPtr3D( @Const CvArr arr, int idx0, int idx1, int idx2);
public static native @Cast("uchar*") ByteBuffer cvPtr3D( @Const CvArr arr, int idx0, int idx1, int idx2,
                      IntBuffer type/*=NULL*/);
public static native @Cast("uchar*") byte[] cvPtr3D( @Const CvArr arr, int idx0, int idx1, int idx2,
                      int[] type/*=NULL*/);
/** \overload
@param arr Input array
@param idx Array of the element indices
@param type Optional output parameter: type of matrix elements
@param create_node Optional input parameter for sparse matrices. Non-zero value of the parameter
means that the requested element is created if it does not exist already.
@param precalc_hashval Optional input parameter for sparse matrices. If the pointer is not NULL,
the function does not recalculate the node hash value, but takes it from the specified location.
It is useful for speeding up pair-wise operations (TODO: provide an example)
*/
public static native @Cast("uchar*") BytePointer cvPtrND( @Const CvArr arr, @Const IntPointer idx, IntPointer type/*=NULL*/,
                      int create_node/*=1*/,
                      @Cast("unsigned*") IntPointer precalc_hashval/*=NULL*/);
public static native @Cast("uchar*") BytePointer cvPtrND( @Const CvArr arr, @Const IntPointer idx);
public static native @Cast("uchar*") ByteBuffer cvPtrND( @Const CvArr arr, @Const IntBuffer idx, IntBuffer type/*=NULL*/,
                      int create_node/*=1*/,
                      @Cast("unsigned*") IntBuffer precalc_hashval/*=NULL*/);
public static native @Cast("uchar*") ByteBuffer cvPtrND( @Const CvArr arr, @Const IntBuffer idx);
public static native @Cast("uchar*") byte[] cvPtrND( @Const CvArr arr, @Const int[] idx, int[] type/*=NULL*/,
                      int create_node/*=1*/,
                      @Cast("unsigned*") int[] precalc_hashval/*=NULL*/);
public static native @Cast("uchar*") byte[] cvPtrND( @Const CvArr arr, @Const int[] idx);

/** \brief Return a specific array element.
<p>
The functions return a specific array element. In the case of a sparse array the functions return 0
if the requested node does not exist (no new node is created by the functions).
@param arr Input array
@param idx0 The first zero-based component of the element index
 */
public static native @ByVal CvScalar cvGet1D( @Const CvArr arr, int idx0 );
/** \overload */
public static native @ByVal CvScalar cvGet2D( @Const CvArr arr, int idx0, int idx1 );
/** \overload */
public static native @ByVal CvScalar cvGet3D( @Const CvArr arr, int idx0, int idx1, int idx2 );
/** \overload
@param arr Input array
@param idx Array of the element indices
*/
public static native @ByVal CvScalar cvGetND( @Const CvArr arr, @Const IntPointer idx );
public static native @ByVal CvScalar cvGetND( @Const CvArr arr, @Const IntBuffer idx );
public static native @ByVal CvScalar cvGetND( @Const CvArr arr, @Const int[] idx );

/** \brief Return a specific element of single-channel 1D, 2D, 3D or nD array.
<p>
Returns a specific element of a single-channel array. If the array has multiple channels, a runtime
error is raised. Note that Get?D functions can be used safely for both single-channel and
multiple-channel arrays though they are a bit slower.
<p>
In the case of a sparse array the functions return 0 if the requested node does not exist (no new
node is created by the functions).
@param arr Input array. Must have a single channel.
@param idx0 The first zero-based component of the element index
 */
public static native double cvGetReal1D( @Const CvArr arr, int idx0 );
/** \overload */
public static native double cvGetReal2D( @Const CvArr arr, int idx0, int idx1 );
/** \overload */
public static native double cvGetReal3D( @Const CvArr arr, int idx0, int idx1, int idx2 );
/** \overload
@param arr Input array. Must have a single channel.
@param idx Array of the element indices
*/
public static native double cvGetRealND( @Const CvArr arr, @Const IntPointer idx );
public static native double cvGetRealND( @Const CvArr arr, @Const IntBuffer idx );
public static native double cvGetRealND( @Const CvArr arr, @Const int[] idx );

/** \brief Change the particular array element.
<p>
The functions assign the new value to a particular array element. In the case of a sparse array the
functions create the node if it does not exist yet.
@param arr Input array
@param idx0 The first zero-based component of the element index
@param value The assigned value
 */
public static native void cvSet1D( CvArr arr, int idx0, @ByVal CvScalar value );
/** \overload */
public static native void cvSet2D( CvArr arr, int idx0, int idx1, @ByVal CvScalar value );
/** \overload */
public static native void cvSet3D( CvArr arr, int idx0, int idx1, int idx2, @ByVal CvScalar value );
/** \overload
@param arr Input array
@param idx Array of the element indices
@param value The assigned value
*/
public static native void cvSetND( CvArr arr, @Const IntPointer idx, @ByVal CvScalar value );
public static native void cvSetND( CvArr arr, @Const IntBuffer idx, @ByVal CvScalar value );
public static native void cvSetND( CvArr arr, @Const int[] idx, @ByVal CvScalar value );

/** \brief Change a specific array element.
<p>
The functions assign a new value to a specific element of a single-channel array. If the array has
multiple channels, a runtime error is raised. Note that the Set\*D function can be used safely for
both single-channel and multiple-channel arrays, though they are a bit slower.
<p>
In the case of a sparse array the functions create the node if it does not yet exist.
@param arr Input array
@param idx0 The first zero-based component of the element index
@param value The assigned value
 */
public static native void cvSetReal1D( CvArr arr, int idx0, double value );
/** \overload */
public static native void cvSetReal2D( CvArr arr, int idx0, int idx1, double value );
/** \overload */
public static native void cvSetReal3D( CvArr arr, int idx0,
                        int idx1, int idx2, double value );
/** \overload
@param arr Input array
@param idx Array of the element indices
@param value The assigned value
*/
public static native void cvSetRealND( CvArr arr, @Const IntPointer idx, double value );
public static native void cvSetRealND( CvArr arr, @Const IntBuffer idx, double value );
public static native void cvSetRealND( CvArr arr, @Const int[] idx, double value );

/** clears element of ND dense array,
   in case of sparse arrays it deletes the specified node */
public static native void cvClearND( CvArr arr, @Const IntPointer idx );
public static native void cvClearND( CvArr arr, @Const IntBuffer idx );
public static native void cvClearND( CvArr arr, @Const int[] idx );

/** \brief Returns matrix header for arbitrary array.
<p>
The function returns a matrix header for the input array that can be a matrix - CvMat, an image -
IplImage, or a multi-dimensional dense array - CvMatND (the third option is allowed only if
allowND != 0) . In the case of matrix the function simply returns the input pointer. In the case of
IplImage\* or CvMatND it initializes the header structure with parameters of the current image ROI
and returns &header. Because COI is not supported by CvMat, it is returned separately.
<p>
The function provides an easy way to handle both types of arrays - IplImage and CvMat using the same
code. Input array must have non-zero data pointer, otherwise the function will report an error.
<p>
\note If the input array is IplImage with planar data layout and COI set, the function returns the
pointer to the selected plane and COI == 0. This feature allows user to process IplImage structures
with planar data layout, even though OpenCV does not support such images.
@param arr Input array
@param header Pointer to CvMat structure used as a temporary buffer
@param coi Optional output parameter for storing COI
@param allowND If non-zero, the function accepts multi-dimensional dense arrays (CvMatND\*) and
returns 2D matrix (if CvMatND has two dimensions) or 1D matrix (when CvMatND has 1 dimension or
more than 2 dimensions). The CvMatND array must be continuous.
\sa cvGetImage, cvarrToMat.
 */
public static native CvMat cvGetMat( @Const CvArr arr, CvMat header,
                       IntPointer coi/*=NULL*/,
                       int allowND/*=0*/);
public static native CvMat cvGetMat( @Const CvArr arr, CvMat header);
public static native CvMat cvGetMat( @Const CvArr arr, CvMat header,
                       IntBuffer coi/*=NULL*/,
                       int allowND/*=0*/);
public static native CvMat cvGetMat( @Const CvArr arr, CvMat header,
                       int[] coi/*=NULL*/,
                       int allowND/*=0*/);

/** \brief Returns image header for arbitrary array.
<p>
The function returns the image header for the input array that can be a matrix (CvMat) or image
(IplImage). In the case of an image the function simply returns the input pointer. In the case of
CvMat it initializes an image_header structure with the parameters of the input matrix. Note that
if we transform IplImage to CvMat using cvGetMat and then transform CvMat back to IplImage using
this function, we will get different headers if the ROI is set in the original image.
@param arr Input array
@param image_header Pointer to IplImage structure used as a temporary buffer
 */
public static native IplImage cvGetImage( @Const CvArr arr, IplImage image_header );


/** \brief Changes the shape of a multi-dimensional array without copying the data.
<p>
The function is an advanced version of cvReshape that can work with multi-dimensional arrays as
well (though it can work with ordinary images and matrices) and change the number of dimensions.
<p>
Below are the two samples from the cvReshape description rewritten using cvReshapeMatND:
<pre>{@code
    IplImage* color_img = cvCreateImage(cvSize(320,240), IPL_DEPTH_8U, 3);
    IplImage gray_img_hdr, *gray_img;
    gray_img = (IplImage*)cvReshapeMatND(color_img, sizeof(gray_img_hdr), &gray_img_hdr, 1, 0, 0);
    ...
    int size[] = { 2, 2, 2 };
    CvMatND* mat = cvCreateMatND(3, size, CV_32F);
    CvMat row_header, *row;
    row = (CvMat*)cvReshapeMatND(mat, sizeof(row_header), &row_header, 0, 1, 0);
}</pre>
In C, the header file for this function includes a convenient macro cvReshapeND that does away with
the sizeof_header parameter. So, the lines containing the call to cvReshapeMatND in the examples
may be replaced as follow:
<pre>{@code
    gray_img = (IplImage*)cvReshapeND(color_img, &gray_img_hdr, 1, 0, 0);
    ...
    row = (CvMat*)cvReshapeND(mat, &row_header, 0, 1, 0);
}</pre>
@param arr Input array
@param sizeof_header Size of output header to distinguish between IplImage, CvMat and CvMatND
output headers
@param header Output header to be filled
@param new_cn New number of channels. new_cn = 0 means that the number of channels remains
unchanged.
@param new_dims New number of dimensions. new_dims = 0 means that the number of dimensions
remains the same.
@param new_sizes Array of new dimension sizes. Only new_dims-1 values are used, because the
total number of elements must remain the same. Thus, if new_dims = 1, new_sizes array is not
used.
 */
public static native CvArr cvReshapeMatND( @Const CvArr arr,
                             int sizeof_header, CvArr header,
                             int new_cn, int new_dims, IntPointer new_sizes );
public static native CvArr cvReshapeMatND( @Const CvArr arr,
                             int sizeof_header, CvArr header,
                             int new_cn, int new_dims, IntBuffer new_sizes );
public static native CvArr cvReshapeMatND( @Const CvArr arr,
                             int sizeof_header, CvArr header,
                             int new_cn, int new_dims, int[] new_sizes );

// #define cvReshapeND( arr, header, new_cn, new_dims, new_sizes )
//       cvReshapeMatND( (arr), sizeof(*(header)), (header),
//                       (new_cn), (new_dims), (new_sizes))

/** \brief Changes shape of matrix/image without copying data.
<p>
The function initializes the CvMat header so that it points to the same data as the original array
but has a different shape - different number of channels, different number of rows, or both.
<p>
The following example code creates one image buffer and two image headers, the first is for a
320x240x3 image and the second is for a 960x240x1 image:
<pre>{@code
    IplImage* color_img = cvCreateImage(cvSize(320,240), IPL_DEPTH_8U, 3);
    CvMat gray_mat_hdr;
    IplImage gray_img_hdr, *gray_img;
    cvReshape(color_img, &gray_mat_hdr, 1);
    gray_img = cvGetImage(&gray_mat_hdr, &gray_img_hdr);
}</pre>
And the next example converts a 3x3 matrix to a single 1x9 vector:
<pre>{@code
    CvMat* mat = cvCreateMat(3, 3, CV_32F);
    CvMat row_header, *row;
    row = cvReshape(mat, &row_header, 0, 1);
}</pre>
@param arr Input array
@param header Output header to be filled
@param new_cn New number of channels. 'new_cn = 0' means that the number of channels remains
unchanged.
@param new_rows New number of rows. 'new_rows = 0' means that the number of rows remains
unchanged unless it needs to be changed according to new_cn value.
*/
public static native CvMat cvReshape( @Const CvArr arr, CvMat header,
                        int new_cn, int new_rows/*=0*/ );
public static native CvMat cvReshape( @Const CvArr arr, CvMat header,
                        int new_cn );

/** Repeats source 2d array several times in both horizontal and
   vertical direction to fill destination array */
public static native void cvRepeat( @Const CvArr src, CvArr dst );

/** \brief Allocates array data
<p>
The function allocates image, matrix or multi-dimensional dense array data. Note that in the case of
matrix types OpenCV allocation functions are used. In the case of IplImage they are used unless
CV_TURN_ON_IPL_COMPATIBILITY() has been called before. In the latter case IPL functions are used
to allocate the data.
@param arr Array header
 */
public static native void cvCreateData( CvArr arr );

/** \brief Releases array data.
<p>
The function releases the array data. In the case of CvMat or CvMatND it simply calls
cvDecRefData(), that is the function can not deallocate external data. See also the note to
cvCreateData .
@param arr Array header
 */
public static native void cvReleaseData( CvArr arr );

/** \brief Assigns user data to the array header.
<p>
The function assigns user data to the array header. Header should be initialized before using
cvCreateMatHeader, cvCreateImageHeader, cvCreateMatNDHeader, cvInitMatHeader,
cvInitImageHeader or cvInitMatNDHeader.
@param arr Array header
@param data User data
@param step Full row length in bytes
 */
public static native void cvSetData( CvArr arr, Pointer data, int step );

/** \brief Retrieves low-level information about the array.
<p>
The function fills output variables with low-level information about the array data. All output
<p>
parameters are optional, so some of the pointers may be set to NULL. If the array is IplImage with
ROI set, the parameters of ROI are returned.
<p>
The following example shows how to get access to array elements. It computes absolute values of the
array elements :
<pre>{@code
    float* data;
    int step;
    CvSize size;

    cvGetRawData(array, (uchar**)&data, &step, &size);
    step /= sizeof(data[0]);

    for(int y = 0; y < size.height; y++, data += step )
        for(int x = 0; x < size.width; x++ )
            data[x] = (float)fabs(data[x]);
}</pre>
@param arr Array header
@param data Output pointer to the whole image origin or ROI origin if ROI is set
@param step Output full row length in bytes
@param roi_size Output ROI size
 */
public static native void cvGetRawData( @Const CvArr arr, @Cast("uchar**") PointerPointer data,
                         IntPointer step/*=NULL*/,
                         CvSize roi_size/*=NULL*/);
public static native void cvGetRawData( @Const CvArr arr, @Cast("uchar**") @ByPtrPtr BytePointer data);
public static native void cvGetRawData( @Const CvArr arr, @Cast("uchar**") @ByPtrPtr BytePointer data,
                         IntPointer step/*=NULL*/,
                         CvSize roi_size/*=NULL*/);
public static native void cvGetRawData( @Const CvArr arr, @Cast("uchar**") @ByPtrPtr ByteBuffer data,
                         IntBuffer step/*=NULL*/,
                         CvSize roi_size/*=NULL*/);
public static native void cvGetRawData( @Const CvArr arr, @Cast("uchar**") @ByPtrPtr ByteBuffer data);
public static native void cvGetRawData( @Const CvArr arr, @Cast("uchar**") @ByPtrPtr byte[] data,
                         int[] step/*=NULL*/,
                         CvSize roi_size/*=NULL*/);
public static native void cvGetRawData( @Const CvArr arr, @Cast("uchar**") @ByPtrPtr byte[] data);

/** \brief Returns size of matrix or image ROI.
<p>
The function returns number of rows (CvSize::height) and number of columns (CvSize::width) of the
input matrix or image. In the case of image the size of ROI is returned.
@param arr array header
 */
public static native @ByVal CvSize cvGetSize( @Const CvArr arr );

/** \brief Copies one array to another.
<p>
The function copies selected elements from an input array to an output array:
<p>
\f[\texttt{dst} (I)= \texttt{src} (I)  \quad \text{if} \quad \texttt{mask} (I)  \ne 0.\f]
<p>
If any of the passed arrays is of IplImage type, then its ROI and COI fields are used. Both arrays
must have the same type, the same number of dimensions, and the same size. The function can also
copy sparse arrays (mask is not supported in this case).
@param src The source array
@param dst The destination array
@param mask Operation mask, 8-bit single channel array; specifies elements of the destination array
to be changed
 */
public static native void cvCopy( @Const CvArr src, CvArr dst,
                     @Const CvArr mask/*=NULL*/ );
public static native void cvCopy( @Const CvArr src, CvArr dst );

/** \brief Sets every element of an array to a given value.
<p>
The function copies the scalar value to every selected element of the destination array:
\f[\texttt{arr} (I)= \texttt{value} \quad \text{if} \quad \texttt{mask} (I)  \ne 0\f]
If array arr is of IplImage type, then is ROI used, but COI must not be set.
@param arr The destination array
@param value Fill value
@param mask Operation mask, 8-bit single channel array; specifies elements of the destination
array to be changed
 */
public static native void cvSet( CvArr arr, @ByVal CvScalar value,
                    @Const CvArr mask/*=NULL*/ );
public static native void cvSet( CvArr arr, @ByVal CvScalar value );

/** \brief Clears the array.
<p>
The function clears the array. In the case of dense arrays (CvMat, CvMatND or IplImage),
cvZero(array) is equivalent to cvSet(array,cvScalarAll(0),0). In the case of sparse arrays all the
elements are removed.
@param arr Array to be cleared
 */
public static native void cvSetZero( CvArr arr );
public static native void cvZero(CvArr arg1);


/** Splits a multi-channel array into the set of single-channel arrays or
   extracts particular [color] plane */
public static native void cvSplit( @Const CvArr src, CvArr dst0, CvArr dst1,
                      CvArr dst2, CvArr dst3 );

/** Merges a set of single-channel arrays into the single multi-channel array
   or inserts one particular [color] plane to the array */
public static native void cvMerge( @Const CvArr src0, @Const CvArr src1,
                      @Const CvArr src2, @Const CvArr src3,
                      CvArr dst );

/** Copies several channels from input arrays to
   certain channels of output arrays */
public static native void cvMixChannels( @Cast("const CvArr**") PointerPointer src, int src_count,
                            @Cast("CvArr**") PointerPointer dst, int dst_count,
                            @Const IntPointer from_to, int pair_count );
public static native void cvMixChannels( @Const @ByPtrPtr CvArr src, int src_count,
                            @ByPtrPtr CvArr dst, int dst_count,
                            @Const IntPointer from_to, int pair_count );
public static native void cvMixChannels( @Const @ByPtrPtr CvArr src, int src_count,
                            @ByPtrPtr CvArr dst, int dst_count,
                            @Const IntBuffer from_to, int pair_count );
public static native void cvMixChannels( @Const @ByPtrPtr CvArr src, int src_count,
                            @ByPtrPtr CvArr dst, int dst_count,
                            @Const int[] from_to, int pair_count );

/** \brief Converts one array to another with optional linear transformation.
<p>
The function has several different purposes, and thus has several different names. It copies one
array to another with optional scaling, which is performed first, and/or optional type conversion,
performed after:
<p>
\f[\texttt{dst} (I) =  \texttt{scale} \texttt{src} (I) + ( \texttt{shift} _0, \texttt{shift} _1,...)\f]
<p>
All the channels of multi-channel arrays are processed independently.
<p>
The type of conversion is done with rounding and saturation, that is if the result of scaling +
conversion can not be represented exactly by a value of the destination array element type, it is
set to the nearest representable value on the real axis.
@param src Source array
@param dst Destination array
@param scale Scale factor
@param shift Value added to the scaled source array elements
 */
public static native void cvConvertScale( @Const CvArr src, CvArr dst,
                             double scale/*=1*/,
                             double shift/*=0*/ );
public static native void cvConvertScale( @Const CvArr src, CvArr dst );
public static native void cvCvtScale(CvArr arg1, CvArr arg2, double arg3, double arg4);
public static native void cvScale(CvArr arg1, CvArr arg2, double arg3, double arg4);
public static native void cvConvert(CvArr src, CvArr dst);


/** Performs linear transformation on every source array element,
   stores absolute value of the result:
   dst(x,y,c) = abs(scale*src(x,y,c)+shift).
   destination array must have 8u type.
   In other cases one may use cvConvertScale + cvAbsDiffS */
public static native void cvConvertScaleAbs( @Const CvArr src, CvArr dst,
                                double scale/*=1*/,
                                double shift/*=0*/ );
public static native void cvConvertScaleAbs( @Const CvArr src, CvArr dst );
public static native void cvCvtScaleAbs(CvArr arg1, CvArr arg2, double arg3, double arg4);


/** checks termination criteria validity and
   sets eps to default_eps (if it is not set),
   max_iter to default_max_iters (if it is not set)
*/
public static native @ByVal CvTermCriteria cvCheckTermCriteria( @ByVal CvTermCriteria criteria,
                                           double default_eps,
                                           int default_max_iters );

/****************************************************************************************\
*                   Arithmetic, logic and comparison operations                          *
\****************************************************************************************/

/** dst(mask) = src1(mask) + src2(mask) */
public static native void cvAdd( @Const CvArr src1, @Const CvArr src2, CvArr dst,
                    @Const CvArr mask/*=NULL*/);
public static native void cvAdd( @Const CvArr src1, @Const CvArr src2, CvArr dst);

/** dst(mask) = src(mask) + value */
public static native void cvAddS( @Const CvArr src, @ByVal CvScalar value, CvArr dst,
                     @Const CvArr mask/*=NULL*/);
public static native void cvAddS( @Const CvArr src, @ByVal CvScalar value, CvArr dst);

/** dst(mask) = src1(mask) - src2(mask) */
public static native void cvSub( @Const CvArr src1, @Const CvArr src2, CvArr dst,
                    @Const CvArr mask/*=NULL*/);
public static native void cvSub( @Const CvArr src1, @Const CvArr src2, CvArr dst);

/** dst(mask) = src(mask) - value = src(mask) + (-value) */
public static native void cvSubS( @Const CvArr src, @ByVal CvScalar value, CvArr dst,
                         @Const CvArr mask/*=NULL*/);
public static native void cvSubS( @Const CvArr src, @ByVal CvScalar value, CvArr dst);

/** dst(mask) = value - src(mask) */
public static native void cvSubRS( @Const CvArr src, @ByVal CvScalar value, CvArr dst,
                      @Const CvArr mask/*=NULL*/);
public static native void cvSubRS( @Const CvArr src, @ByVal CvScalar value, CvArr dst);

/** dst(idx) = src1(idx) * src2(idx) * scale
   (scaled element-wise multiplication of 2 arrays) */
public static native void cvMul( @Const CvArr src1, @Const CvArr src2,
                    CvArr dst, double scale/*=1*/ );
public static native void cvMul( @Const CvArr src1, @Const CvArr src2,
                    CvArr dst );

/** element-wise division/inversion with scaling:
    dst(idx) = src1(idx) * scale / src2(idx)
    or dst(idx) = scale / src2(idx) if src1 == 0 */
public static native void cvDiv( @Const CvArr src1, @Const CvArr src2,
                    CvArr dst, double scale/*=1*/);
public static native void cvDiv( @Const CvArr src1, @Const CvArr src2,
                    CvArr dst);

/** dst = src1 * scale + src2 */
public static native void cvScaleAdd( @Const CvArr src1, @ByVal CvScalar scale,
                         @Const CvArr src2, CvArr dst );
// #define cvAXPY( A, real_scalar, B, C ) cvScaleAdd(A, cvRealScalar(real_scalar), B, C)

/** dst = src1 * alpha + src2 * beta + gamma */
public static native void cvAddWeighted( @Const CvArr src1, double alpha,
                            @Const CvArr src2, double beta,
                            double gamma, CvArr dst );

/** \brief Calculates the dot product of two arrays in Euclidean metrics.
<p>
The function calculates and returns the Euclidean dot product of two arrays.
<p>
\f[src1  \bullet src2 =  \sum _I ( \texttt{src1} (I)  \texttt{src2} (I))\f]
<p>
In the case of multiple channel arrays, the results for all channels are accumulated. In particular,
cvDotProduct(a,a) where a is a complex vector, will return \f$||\texttt{a}||^2\f$. The function can
process multi-dimensional arrays, row by row, layer by layer, and so on.
@param src1 The first source array
@param src2 The second source array
 */
public static native double cvDotProduct( @Const CvArr src1, @Const CvArr src2 );

/** dst(idx) = src1(idx) & src2(idx) */
public static native void cvAnd( @Const CvArr src1, @Const CvArr src2,
                  CvArr dst, @Const CvArr mask/*=NULL*/);
public static native void cvAnd( @Const CvArr src1, @Const CvArr src2,
                  CvArr dst);

/** dst(idx) = src(idx) & value */
public static native void cvAndS( @Const CvArr src, @ByVal CvScalar value,
                   CvArr dst, @Const CvArr mask/*=NULL*/);
public static native void cvAndS( @Const CvArr src, @ByVal CvScalar value,
                   CvArr dst);

/** dst(idx) = src1(idx) | src2(idx) */
public static native void cvOr( @Const CvArr src1, @Const CvArr src2,
                 CvArr dst, @Const CvArr mask/*=NULL*/);
public static native void cvOr( @Const CvArr src1, @Const CvArr src2,
                 CvArr dst);

/** dst(idx) = src(idx) | value */
public static native void cvOrS( @Const CvArr src, @ByVal CvScalar value,
                  CvArr dst, @Const CvArr mask/*=NULL*/);
public static native void cvOrS( @Const CvArr src, @ByVal CvScalar value,
                  CvArr dst);

/** dst(idx) = src1(idx) ^ src2(idx) */
public static native void cvXor( @Const CvArr src1, @Const CvArr src2,
                  CvArr dst, @Const CvArr mask/*=NULL*/);
public static native void cvXor( @Const CvArr src1, @Const CvArr src2,
                  CvArr dst);

/** dst(idx) = src(idx) ^ value */
public static native void cvXorS( @Const CvArr src, @ByVal CvScalar value,
                   CvArr dst, @Const CvArr mask/*=NULL*/);
public static native void cvXorS( @Const CvArr src, @ByVal CvScalar value,
                   CvArr dst);

/** dst(idx) = ~src(idx) */
public static native void cvNot( @Const CvArr src, CvArr dst );

/** dst(idx) = lower(idx) <= src(idx) < upper(idx) */
public static native void cvInRange( @Const CvArr src, @Const CvArr lower,
                      @Const CvArr upper, CvArr dst );

/** dst(idx) = lower <= src(idx) < upper */
public static native void cvInRangeS( @Const CvArr src, @ByVal CvScalar lower,
                       @ByVal CvScalar upper, CvArr dst );

public static final int CV_CMP_EQ =   0;
public static final int CV_CMP_GT =   1;
public static final int CV_CMP_GE =   2;
public static final int CV_CMP_LT =   3;
public static final int CV_CMP_LE =   4;
public static final int CV_CMP_NE =   5;

/** The comparison operation support single-channel arrays only.
   Destination image should be 8uC1 or 8sC1 */

/** dst(idx) = src1(idx) _cmp_op_ src2(idx) */
public static native void cvCmp( @Const CvArr src1, @Const CvArr src2, CvArr dst, int cmp_op );

/** dst(idx) = src1(idx) _cmp_op_ value */
public static native void cvCmpS( @Const CvArr src, double value, CvArr dst, int cmp_op );

/** dst(idx) = min(src1(idx),src2(idx)) */
public static native void cvMin( @Const CvArr src1, @Const CvArr src2, CvArr dst );

/** dst(idx) = max(src1(idx),src2(idx)) */
public static native void cvMax( @Const CvArr src1, @Const CvArr src2, CvArr dst );

/** dst(idx) = min(src(idx),value) */
public static native void cvMinS( @Const CvArr src, double value, CvArr dst );

/** dst(idx) = max(src(idx),value) */
public static native void cvMaxS( @Const CvArr src, double value, CvArr dst );

/** dst(x,y,c) = abs(src1(x,y,c) - src2(x,y,c)) */
public static native void cvAbsDiff( @Const CvArr src1, @Const CvArr src2, CvArr dst );

/** dst(x,y,c) = abs(src(x,y,c) - value(c)) */
public static native void cvAbsDiffS( @Const CvArr src, CvArr dst, @ByVal CvScalar value );
// #define cvAbs( src, dst ) cvAbsDiffS( (src), (dst), cvScalarAll(0))

/****************************************************************************************\
*                                Math operations                                         *
\****************************************************************************************/

/** Does cartesian->polar coordinates conversion.
   Either of output components (magnitude or angle) is optional */
public static native void cvCartToPolar( @Const CvArr x, @Const CvArr y,
                            CvArr magnitude, CvArr angle/*=NULL*/,
                            int angle_in_degrees/*=0*/);
public static native void cvCartToPolar( @Const CvArr x, @Const CvArr y,
                            CvArr magnitude);

/** Does polar->cartesian coordinates conversion.
   Either of output components (magnitude or angle) is optional.
   If magnitude is missing it is assumed to be all 1's */
public static native void cvPolarToCart( @Const CvArr magnitude, @Const CvArr angle,
                            CvArr x, CvArr y,
                            int angle_in_degrees/*=0*/);
public static native void cvPolarToCart( @Const CvArr magnitude, @Const CvArr angle,
                            CvArr x, CvArr y);

/** Does powering: dst(idx) = src(idx)^power */
public static native void cvPow( @Const CvArr src, CvArr dst, double power );

/** Does exponention: dst(idx) = exp(src(idx)).
   Overflow is not handled yet. Underflow is handled.
   Maximal relative error is ~7e-6 for single-precision input */
public static native void cvExp( @Const CvArr src, CvArr dst );

/** Calculates natural logarithms: dst(idx) = log(abs(src(idx))).
   Logarithm of 0 gives large negative number(~-700)
   Maximal relative error is ~3e-7 for single-precision output
*/
public static native void cvLog( @Const CvArr src, CvArr dst );

/** Fast arctangent calculation */
public static native float cvFastArctan( float y, float x );

/** Fast cubic root calculation */
public static native float cvCbrt( float value );

public static final int CV_CHECK_RANGE =    1;
public static final int CV_CHECK_QUIET =    2;
/** Checks array values for NaNs, Infs or simply for too large numbers
   (if CV_CHECK_RANGE is set). If CV_CHECK_QUIET is set,
   no runtime errors is raised (function returns zero value in case of "bad" values).
   Otherwise cvError is called */
public static native int cvCheckArr( @Const CvArr arr, int flags/*=0*/,
                        double min_val/*=0*/, double max_val/*=0*/);
public static native int cvCheckArr( @Const CvArr arr);
public static native int cvCheckArray(CvArr arg1, int arg2, double arg3, double arg4);

public static final int CV_RAND_UNI =      0;
public static final int CV_RAND_NORMAL =   1;

/** \brief Fills an array with random numbers and updates the RNG state.
<p>
The function fills the destination array with uniformly or normally distributed random numbers.
@param rng CvRNG state initialized by cvRNG
@param arr The destination array
@param dist_type Distribution type
> -   **CV_RAND_UNI** uniform distribution
> -   **CV_RAND_NORMAL** normal or Gaussian distribution
@param param1 The first parameter of the distribution. In the case of a uniform distribution it is
the inclusive lower boundary of the random numbers range. In the case of a normal distribution it
is the mean value of the random numbers.
@param param2 The second parameter of the distribution. In the case of a uniform distribution it
is the exclusive upper boundary of the random numbers range. In the case of a normal distribution
it is the standard deviation of the random numbers.
\sa randu, randn, RNG::fill.
 */
public static native void cvRandArr( @Cast("CvRNG*") LongPointer rng, CvArr arr, int dist_type,
                      @ByVal CvScalar param1, @ByVal CvScalar param2 );
public static native void cvRandArr( @Cast("CvRNG*") LongBuffer rng, CvArr arr, int dist_type,
                      @ByVal CvScalar param1, @ByVal CvScalar param2 );
public static native void cvRandArr( @Cast("CvRNG*") long[] rng, CvArr arr, int dist_type,
                      @ByVal CvScalar param1, @ByVal CvScalar param2 );

public static native void cvRandShuffle( CvArr mat, @Cast("CvRNG*") LongPointer rng,
                           double iter_factor/*=1.*/);
public static native void cvRandShuffle( CvArr mat, @Cast("CvRNG*") LongPointer rng);
public static native void cvRandShuffle( CvArr mat, @Cast("CvRNG*") LongBuffer rng,
                           double iter_factor/*=1.*/);
public static native void cvRandShuffle( CvArr mat, @Cast("CvRNG*") LongBuffer rng);
public static native void cvRandShuffle( CvArr mat, @Cast("CvRNG*") long[] rng,
                           double iter_factor/*=1.*/);
public static native void cvRandShuffle( CvArr mat, @Cast("CvRNG*") long[] rng);

public static final int CV_SORT_EVERY_ROW = 0;
public static final int CV_SORT_EVERY_COLUMN = 1;
public static final int CV_SORT_ASCENDING = 0;
public static final int CV_SORT_DESCENDING = 16;

public static native void cvSort( @Const CvArr src, CvArr dst/*=NULL*/,
                    CvArr idxmat/*=NULL*/,
                    int flags/*=0*/);
public static native void cvSort( @Const CvArr src);

/** Finds real roots of a cubic equation */
public static native int cvSolveCubic( @Const CvMat coeffs, CvMat roots );

/** Finds all real and complex roots of a polynomial equation */
public static native void cvSolvePoly(@Const CvMat coeffs, CvMat roots2,
      int maxiter/*=20*/, int fig/*=100*/);
public static native void cvSolvePoly(@Const CvMat coeffs, CvMat roots2);

/****************************************************************************************\
*                                Matrix operations                                       *
\****************************************************************************************/

/** \brief Calculates the cross product of two 3D vectors.
<p>
The function calculates the cross product of two 3D vectors:
\f[\texttt{dst} =  \texttt{src1} \times \texttt{src2}\f]
or:
\f[\begin{array}{l} \texttt{dst} _1 =  \texttt{src1} _2  \texttt{src2} _3 -  \texttt{src1} _3  \texttt{src2} _2 \\ \texttt{dst} _2 =  \texttt{src1} _3  \texttt{src2} _1 -  \texttt{src1} _1  \texttt{src2} _3 \\ \texttt{dst} _3 =  \texttt{src1} _1  \texttt{src2} _2 -  \texttt{src1} _2  \texttt{src2} _1 \end{array}\f]
@param src1 The first source vector
@param src2 The second source vector
@param dst The destination vector
 */
public static native void cvCrossProduct( @Const CvArr src1, @Const CvArr src2, CvArr dst );

/** Matrix transform: dst = A*B + C, C is optional */
public static native void cvMatMulAdd(CvArr src1, CvArr src2, CvArr src3, CvArr dst);
public static native void cvMatMul(CvArr src1, CvArr src2, CvArr dst);

public static final int CV_GEMM_A_T = 1;
public static final int CV_GEMM_B_T = 2;
public static final int CV_GEMM_C_T = 4;
/** Extended matrix transform:
   dst = alpha*op(A)*op(B) + beta*op(C), where op(X) is X or X^T */
public static native void cvGEMM( @Const CvArr src1, @Const CvArr src2, double alpha,
                     @Const CvArr src3, double beta, CvArr dst,
                     int tABC/*=0*/);
public static native void cvGEMM( @Const CvArr src1, @Const CvArr src2, double alpha,
                     @Const CvArr src3, double beta, CvArr dst);
public static native void cvMatMulAddEx(CvArr arg1, CvArr arg2, double arg3, CvArr arg4, double arg5, CvArr arg6, int arg7);

/** Transforms each element of source array and stores
   resultant vectors in destination array */
public static native void cvTransform( @Const CvArr src, CvArr dst,
                          @Const CvMat transmat,
                          @Const CvMat shiftvec/*=NULL*/);
public static native void cvTransform( @Const CvArr src, CvArr dst,
                          @Const CvMat transmat);
public static native void cvMatMulAddS(CvArr arg1, CvArr arg2, CvMat arg3, CvMat arg4);

/** Does perspective transform on every element of input array */
public static native void cvPerspectiveTransform( @Const CvArr src, CvArr dst,
                                     @Const CvMat mat );

/** Calculates (A-delta)*(A-delta)^T (order=0) or (A-delta)^T*(A-delta) (order=1) */
public static native void cvMulTransposed( @Const CvArr src, CvArr dst, int order,
                             @Const CvArr delta/*=NULL*/,
                             double scale/*=1.*/ );
public static native void cvMulTransposed( @Const CvArr src, CvArr dst, int order );

/** Tranposes matrix. Square matrices can be transposed in-place */
public static native void cvTranspose( @Const CvArr src, CvArr dst );
public static native void cvT(CvArr arg1, CvArr arg2);

/** Completes the symmetric matrix from the lower (LtoR=0) or from the upper (LtoR!=0) part */
public static native void cvCompleteSymm( CvMat matrix, int LtoR/*=0*/ );
public static native void cvCompleteSymm( CvMat matrix );

/** Mirror array data around horizontal (flip=0),
   vertical (flip=1) or both(flip=-1) axises:
   cvFlip(src) flips images vertically and sequences horizontally (inplace) */
public static native void cvFlip( @Const CvArr src, CvArr dst/*=NULL*/,
                     int flip_mode/*=0*/);
public static native void cvFlip( @Const CvArr src);
public static native void cvMirror(CvArr arg1, CvArr arg2, int arg3);


public static final int CV_SVD_MODIFY_A =   1;
public static final int CV_SVD_U_T =        2;
public static final int CV_SVD_V_T =        4;

/** Performs Singular Value Decomposition of a matrix */
public static native void cvSVD( CvArr A, CvArr W, CvArr U/*=NULL*/,
                     CvArr V/*=NULL*/, int flags/*=0*/);
public static native void cvSVD( CvArr A, CvArr W);

/** Performs Singular Value Back Substitution (solves A*X = B):
   flags must be the same as in cvSVD */
public static native void cvSVBkSb( @Const CvArr W, @Const CvArr U,
                        @Const CvArr V, @Const CvArr B,
                        CvArr X, int flags );

public static final int CV_LU =  0;
public static final int CV_SVD = 1;
public static final int CV_SVD_SYM = 2;
public static final int CV_CHOLESKY = 3;
public static final int CV_QR =  4;
public static final int CV_NORMAL = 16;

/** Inverts matrix */
public static native double cvInvert( @Const CvArr src, CvArr dst,
                         int method/*=CV_LU*/);
public static native double cvInvert( @Const CvArr src, CvArr dst);
public static native void cvInv(CvArr arg1, CvArr arg2, int arg3);

/** Solves linear system (src1)*(dst) = (src2)
   (returns 0 if src1 is a singular and CV_LU method is used) */
public static native int cvSolve( @Const CvArr src1, @Const CvArr src2, CvArr dst,
                     int method/*=CV_LU*/);
public static native int cvSolve( @Const CvArr src1, @Const CvArr src2, CvArr dst);

/** Calculates determinant of input matrix */
public static native double cvDet( @Const CvArr mat );

/** Calculates trace of the matrix (sum of elements on the main diagonal) */
public static native @ByVal CvScalar cvTrace( @Const CvArr mat );

/** Finds eigen values and vectors of a symmetric matrix */
public static native void cvEigenVV( CvArr mat, CvArr evects, CvArr evals,
                        double eps/*=0*/,
                        int lowindex/*=-1*/,
                        int highindex/*=-1*/);
public static native void cvEigenVV( CvArr mat, CvArr evects, CvArr evals);

///* Finds selected eigen values and vectors of a symmetric matrix */
//CVAPI(void)  cvSelectedEigenVV( CvArr* mat, CvArr* evects, CvArr* evals,
//                                int lowindex, int highindex );

/** Makes an identity matrix (mat_ij = i == j) */
public static native void cvSetIdentity( CvArr mat, @ByVal(nullValue = "cvRealScalar(1)") CvScalar value/*=cvRealScalar(1)*/ );
public static native void cvSetIdentity( CvArr mat );

/** Fills matrix with given range of numbers */
public static native CvArr cvRange( CvArr mat, double start, double end );

/**   \anchor core_c_CovarFlags
\name Flags for cvCalcCovarMatrix
@see cvCalcCovarMatrix
  \{
*/

/** flag for cvCalcCovarMatrix, transpose([v1-avg, v2-avg,...]) * [v1-avg,v2-avg,...] */
public static final int CV_COVAR_SCRAMBLED = 0;

/** flag for cvCalcCovarMatrix, [v1-avg, v2-avg,...] * transpose([v1-avg,v2-avg,...]) */
public static final int CV_COVAR_NORMAL =    1;

/** flag for cvCalcCovarMatrix, do not calc average (i.e. mean vector) - use the input vector instead
   (useful for calculating covariance matrix by parts) */
public static final int CV_COVAR_USE_AVG =   2;

/** flag for cvCalcCovarMatrix, scale the covariance matrix coefficients by number of the vectors */
public static final int CV_COVAR_SCALE =     4;

/** flag for cvCalcCovarMatrix, all the input vectors are stored in a single matrix, as its rows */
public static final int CV_COVAR_ROWS =      8;

/** flag for cvCalcCovarMatrix, all the input vectors are stored in a single matrix, as its columns */
public static final int CV_COVAR_COLS =     16;

/** \} */

/** Calculates covariation matrix for a set of vectors
@see \ref core_c_CovarFlags "flags"
*/
public static native void cvCalcCovarMatrix( @Cast("const CvArr**") PointerPointer vects, int count,
                                CvArr cov_mat, CvArr avg, int flags );
public static native void cvCalcCovarMatrix( @Const @ByPtrPtr CvArr vects, int count,
                                CvArr cov_mat, CvArr avg, int flags );

public static final int CV_PCA_DATA_AS_ROW = 0;
public static final int CV_PCA_DATA_AS_COL = 1;
public static final int CV_PCA_USE_AVG = 2;
public static native void cvCalcPCA( @Const CvArr data, CvArr mean,
                        CvArr eigenvals, CvArr eigenvects, int flags );

public static native void cvProjectPCA( @Const CvArr data, @Const CvArr mean,
                           @Const CvArr eigenvects, CvArr result );

public static native void cvBackProjectPCA( @Const CvArr proj, @Const CvArr mean,
                               @Const CvArr eigenvects, CvArr result );

/** Calculates Mahalanobis(weighted) distance */
public static native double cvMahalanobis( @Const CvArr vec1, @Const CvArr vec2, @Const CvArr mat );
public static native double cvMahalonobis(CvArr arg1, CvArr arg2, CvArr arg3);

/****************************************************************************************\
*                                    Array Statistics                                    *
\****************************************************************************************/

/** Finds sum of array elements */
public static native @ByVal CvScalar cvSum( @Const CvArr arr );

/** Calculates number of non-zero pixels */
public static native int cvCountNonZero( @Const CvArr arr );

/** Calculates mean value of array elements */
public static native @ByVal CvScalar cvAvg( @Const CvArr arr, @Const CvArr mask/*=NULL*/ );
public static native @ByVal CvScalar cvAvg( @Const CvArr arr );

/** Calculates mean and standard deviation of pixel values */
public static native void cvAvgSdv( @Const CvArr arr, CvScalar mean, CvScalar std_dev,
                       @Const CvArr mask/*=NULL*/ );
public static native void cvAvgSdv( @Const CvArr arr, CvScalar mean, CvScalar std_dev );

/** Finds global minimum, maximum and their positions */
public static native void cvMinMaxLoc( @Const CvArr arr, DoublePointer min_val, DoublePointer max_val,
                          CvPoint min_loc/*=NULL*/,
                          CvPoint max_loc/*=NULL*/,
                          @Const CvArr mask/*=NULL*/ );
public static native void cvMinMaxLoc( @Const CvArr arr, DoublePointer min_val, DoublePointer max_val );
public static native void cvMinMaxLoc( @Const CvArr arr, DoubleBuffer min_val, DoubleBuffer max_val,
                          @Cast("CvPoint*") IntBuffer min_loc/*=NULL*/,
                          @Cast("CvPoint*") IntBuffer max_loc/*=NULL*/,
                          @Const CvArr mask/*=NULL*/ );
public static native void cvMinMaxLoc( @Const CvArr arr, DoubleBuffer min_val, DoubleBuffer max_val );
public static native void cvMinMaxLoc( @Const CvArr arr, double[] min_val, double[] max_val,
                          @Cast("CvPoint*") int[] min_loc/*=NULL*/,
                          @Cast("CvPoint*") int[] max_loc/*=NULL*/,
                          @Const CvArr mask/*=NULL*/ );
public static native void cvMinMaxLoc( @Const CvArr arr, double[] min_val, double[] max_val );

/** \anchor core_c_NormFlags
  \name Flags for cvNorm and cvNormalize
  \{
*/
public static final int CV_C =            1;
public static final int CV_L1 =           2;
public static final int CV_L2 =           4;
public static final int CV_NORM_MASK =    7;
public static final int CV_RELATIVE =     8;
public static final int CV_DIFF =         16;
public static final int CV_MINMAX =       32;

public static final int CV_DIFF_C =       (CV_DIFF | CV_C);
public static final int CV_DIFF_L1 =      (CV_DIFF | CV_L1);
public static final int CV_DIFF_L2 =      (CV_DIFF | CV_L2);
public static final int CV_RELATIVE_C =   (CV_RELATIVE | CV_C);
public static final int CV_RELATIVE_L1 =  (CV_RELATIVE | CV_L1);
public static final int CV_RELATIVE_L2 =  (CV_RELATIVE | CV_L2);
/** \} */

/** Finds norm, difference norm or relative difference norm for an array (or two arrays)
@see ref core_c_NormFlags "flags"
*/
public static native double cvNorm( @Const CvArr arr1, @Const CvArr arr2/*=NULL*/,
                       int norm_type/*=CV_L2*/,
                       @Const CvArr mask/*=NULL*/ );
public static native double cvNorm( @Const CvArr arr1 );

/** @see ref core_c_NormFlags "flags" */
public static native void cvNormalize( @Const CvArr src, CvArr dst,
                          double a/*=1.*/, double b/*=0.*/,
                          int norm_type/*=CV_L2*/,
                          @Const CvArr mask/*=NULL*/ );
public static native void cvNormalize( @Const CvArr src, CvArr dst );

/** \anchor core_c_ReduceFlags
  \name Flags for cvReduce
  \{
*/
public static final int CV_REDUCE_SUM = 0;
public static final int CV_REDUCE_AVG = 1;
public static final int CV_REDUCE_MAX = 2;
public static final int CV_REDUCE_MIN = 3;
/** \} */

/** @see \ref core_c_ReduceFlags "flags" */
public static native void cvReduce( @Const CvArr src, CvArr dst, int dim/*=-1*/,
                       int op/*=CV_REDUCE_SUM*/ );
public static native void cvReduce( @Const CvArr src, CvArr dst );

/****************************************************************************************\
*                      Discrete Linear Transforms and Related Functions                  *
\****************************************************************************************/

/** \anchor core_c_DftFlags
  \name Flags for cvDFT, cvDCT and cvMulSpectrums
  \{
  */
public static final int CV_DXT_FORWARD =  0;
public static final int CV_DXT_INVERSE =  1;
/** divide result by size of array */
public static final int CV_DXT_SCALE =    2;
public static final int CV_DXT_INV_SCALE = (CV_DXT_INVERSE + CV_DXT_SCALE);
public static final int CV_DXT_INVERSE_SCALE = CV_DXT_INV_SCALE;
/** transform each row individually */
public static final int CV_DXT_ROWS =     4;
/** conjugate the second argument of cvMulSpectrums */
public static final int CV_DXT_MUL_CONJ = 8;
/** \} */

/** Discrete Fourier Transform:
    complex->complex,
    real->ccs (forward),
    ccs->real (inverse)
@see core_c_DftFlags "flags"
*/
public static native void cvDFT( @Const CvArr src, CvArr dst, int flags,
                    int nonzero_rows/*=0*/ );
public static native void cvDFT( @Const CvArr src, CvArr dst, int flags );
public static native void cvFFT(CvArr arg1, CvArr arg2, int arg3, int arg4);

/** Multiply results of DFTs: DFT(X)*DFT(Y) or DFT(X)*conj(DFT(Y))
@see core_c_DftFlags "flags"
*/
public static native void cvMulSpectrums( @Const CvArr src1, @Const CvArr src2,
                             CvArr dst, int flags );

/** Finds optimal DFT vector size >= size0 */
public static native int cvGetOptimalDFTSize( int size0 );

/** Discrete Cosine Transform
@see core_c_DftFlags "flags"
*/
public static native void cvDCT( @Const CvArr src, CvArr dst, int flags );

/****************************************************************************************\
*                              Dynamic data structures                                   *
\****************************************************************************************/

/** Calculates length of sequence slice (with support of negative indices). */
public static native int cvSliceLength( @ByVal CvSlice slice, @Const CvSeq seq );


/** Creates new memory storage.
   block_size == 0 means that default,
   somewhat optimal size, is used (currently, it is 64K) */
public static native CvMemStorage cvCreateMemStorage( int block_size/*=0*/);
public static native CvMemStorage cvCreateMemStorage();


/** Creates a memory storage that will borrow memory blocks from parent storage */
public static native CvMemStorage cvCreateChildMemStorage( CvMemStorage parent );


/** Releases memory storage. All the children of a parent must be released before
   the parent. A child storage returns all the blocks to parent when it is released */
public static native void cvReleaseMemStorage( @Cast("CvMemStorage**") PointerPointer storage );
public static native void cvReleaseMemStorage( @ByPtrPtr CvMemStorage storage );


/** Clears memory storage. This is the only way(!!!) (besides cvRestoreMemStoragePos)
   to reuse memory allocated for the storage - cvClearSeq,cvClearSet ...
   do not free any memory.
   A child storage returns all the blocks to the parent when it is cleared */
public static native void cvClearMemStorage( CvMemStorage storage );

/** Remember a storage "free memory" position */
public static native void cvSaveMemStoragePos( @Const CvMemStorage storage, CvMemStoragePos pos );

/** Restore a storage "free memory" position */
public static native void cvRestoreMemStoragePos( CvMemStorage storage, CvMemStoragePos pos );

/** Allocates continuous buffer of the specified size in the storage */
public static native Pointer cvMemStorageAlloc( CvMemStorage storage, @Cast("size_t") long size );

/** Allocates string in memory storage */
public static native @ByVal CvString cvMemStorageAllocString( CvMemStorage storage, @Cast("const char*") BytePointer ptr,
                                         int len/*=-1*/ );
public static native @ByVal CvString cvMemStorageAllocString( CvMemStorage storage, @Cast("const char*") BytePointer ptr );
public static native @ByVal CvString cvMemStorageAllocString( CvMemStorage storage, String ptr,
                                         int len/*=-1*/ );
public static native @ByVal CvString cvMemStorageAllocString( CvMemStorage storage, String ptr );

/** Creates new empty sequence that will reside in the specified storage */
public static native CvSeq cvCreateSeq( int seq_flags, @Cast("size_t") long header_size,
                            @Cast("size_t") long elem_size, CvMemStorage storage );

/** Changes default size (granularity) of sequence blocks.
   The default size is ~1Kbyte */
public static native void cvSetSeqBlockSize( CvSeq seq, int delta_elems );


/** Adds new element to the end of sequence. Returns pointer to the element */
public static native @Cast("schar*") BytePointer cvSeqPush( CvSeq seq, @Const Pointer element/*=NULL*/);
public static native @Cast("schar*") BytePointer cvSeqPush( CvSeq seq);


/** Adds new element to the beginning of sequence. Returns pointer to it */
public static native @Cast("schar*") BytePointer cvSeqPushFront( CvSeq seq, @Const Pointer element/*=NULL*/);
public static native @Cast("schar*") BytePointer cvSeqPushFront( CvSeq seq);


/** Removes the last element from sequence and optionally saves it */
public static native void cvSeqPop( CvSeq seq, Pointer element/*=NULL*/);
public static native void cvSeqPop( CvSeq seq);


/** Removes the first element from sequence and optioanally saves it */
public static native void cvSeqPopFront( CvSeq seq, Pointer element/*=NULL*/);
public static native void cvSeqPopFront( CvSeq seq);


public static final int CV_FRONT = 1;
public static final int CV_BACK = 0;
/** Adds several new elements to the end of sequence */
public static native void cvSeqPushMulti( CvSeq seq, @Const Pointer elements,
                             int count, int in_front/*=0*/ );
public static native void cvSeqPushMulti( CvSeq seq, @Const Pointer elements,
                             int count );

/** Removes several elements from the end of sequence and optionally saves them */
public static native void cvSeqPopMulti( CvSeq seq, Pointer elements,
                            int count, int in_front/*=0*/ );
public static native void cvSeqPopMulti( CvSeq seq, Pointer elements,
                            int count );

/** Inserts a new element in the middle of sequence.
   cvSeqInsert(seq,0,elem) == cvSeqPushFront(seq,elem) */
public static native @Cast("schar*") BytePointer cvSeqInsert( CvSeq seq, int before_index,
                            @Const Pointer element/*=NULL*/);
public static native @Cast("schar*") BytePointer cvSeqInsert( CvSeq seq, int before_index);

/** Removes specified sequence element */
public static native void cvSeqRemove( CvSeq seq, int index );


/** Removes all the elements from the sequence. The freed memory
   can be reused later only by the same sequence unless cvClearMemStorage
   or cvRestoreMemStoragePos is called */
public static native void cvClearSeq( CvSeq seq );


/** Retrieves pointer to specified sequence element.
   Negative indices are supported and mean counting from the end
   (e.g -1 means the last sequence element) */
public static native @Cast("schar*") BytePointer cvGetSeqElem( @Const CvSeq seq, int index );

/** Calculates index of the specified sequence element.
   Returns -1 if element does not belong to the sequence */
public static native int cvSeqElemIdx( @Const CvSeq seq, @Const Pointer element,
                         @Cast("CvSeqBlock**") PointerPointer block/*=NULL*/ );
public static native int cvSeqElemIdx( @Const CvSeq seq, @Const Pointer element );
public static native int cvSeqElemIdx( @Const CvSeq seq, @Const Pointer element,
                         @ByPtrPtr CvSeqBlock block/*=NULL*/ );

/** Initializes sequence writer. The new elements will be added to the end of sequence */
public static native void cvStartAppendToSeq( CvSeq seq, CvSeqWriter writer );


/** Combination of cvCreateSeq and cvStartAppendToSeq */
public static native void cvStartWriteSeq( int seq_flags, int header_size,
                              int elem_size, CvMemStorage storage,
                              CvSeqWriter writer );

/** Closes sequence writer, updates sequence header and returns pointer
   to the resultant sequence
   (which may be useful if the sequence was created using cvStartWriteSeq))
*/
public static native CvSeq cvEndWriteSeq( CvSeqWriter writer );


/** Updates sequence header. May be useful to get access to some of previously
   written elements via cvGetSeqElem or sequence reader */
public static native void cvFlushSeqWriter( CvSeqWriter writer );


/** Initializes sequence reader.
   The sequence can be read in forward or backward direction */
public static native void cvStartReadSeq( @Const CvSeq seq, CvSeqReader reader,
                           int reverse/*=0*/ );
public static native void cvStartReadSeq( @Const CvSeq seq, CvSeqReader reader );


/** Returns current sequence reader position (currently observed sequence element) */
public static native int cvGetSeqReaderPos( CvSeqReader reader );


/** Changes sequence reader position. It may seek to an absolute or
   to relative to the current position */
public static native void cvSetSeqReaderPos( CvSeqReader reader, int index,
                                 int is_relative/*=0*/);
public static native void cvSetSeqReaderPos( CvSeqReader reader, int index);

/** Copies sequence content to a continuous piece of memory */
public static native Pointer cvCvtSeqToArray( @Const CvSeq seq, Pointer elements,
                               @ByVal(nullValue = "CV_WHOLE_SEQ") CvSlice slice/*=CV_WHOLE_SEQ*/ );
public static native Pointer cvCvtSeqToArray( @Const CvSeq seq, Pointer elements );

/** Creates sequence header for array.
   After that all the operations on sequences that do not alter the content
   can be applied to the resultant sequence */
public static native CvSeq cvMakeSeqHeaderForArray( int seq_type, int header_size,
                                       int elem_size, Pointer elements, int total,
                                       CvSeq seq, CvSeqBlock block );

/** Extracts sequence slice (with or without copying sequence elements) */
public static native CvSeq cvSeqSlice( @Const CvSeq seq, @ByVal CvSlice slice,
                         CvMemStorage storage/*=NULL*/,
                         int copy_data/*=0*/);
public static native CvSeq cvSeqSlice( @Const CvSeq seq, @ByVal CvSlice slice);

public static native CvSeq cvCloneSeq( @Const CvSeq seq, CvMemStorage storage/*=NULL*/);
public static native CvSeq cvCloneSeq( @Const CvSeq seq);

/** Removes sequence slice */
public static native void cvSeqRemoveSlice( CvSeq seq, @ByVal CvSlice slice );

/** Inserts a sequence or array into another sequence */
public static native void cvSeqInsertSlice( CvSeq seq, int before_index, @Const CvArr from_arr );

/** a < b ? -1 : a > b ? 1 : 0 */
@Convention("CV_CDECL") public static class CvCmpFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CvCmpFunc(Pointer p) { super(p); }
    protected CvCmpFunc() { allocate(); }
    private native void allocate();
    public native int call(@Const Pointer a, @Const Pointer b, Pointer userdata );
}

/** Sorts sequence in-place given element comparison function */
public static native void cvSeqSort( CvSeq seq, CvCmpFunc func, Pointer userdata/*=NULL*/ );
public static native void cvSeqSort( CvSeq seq, CvCmpFunc func );

/** Finds element in a [sorted] sequence */
public static native @Cast("schar*") BytePointer cvSeqSearch( CvSeq seq, @Const Pointer elem, CvCmpFunc func,
                           int is_sorted, IntPointer elem_idx,
                           Pointer userdata/*=NULL*/ );
public static native @Cast("schar*") BytePointer cvSeqSearch( CvSeq seq, @Const Pointer elem, CvCmpFunc func,
                           int is_sorted, IntPointer elem_idx );
public static native @Cast("schar*") ByteBuffer cvSeqSearch( CvSeq seq, @Const Pointer elem, CvCmpFunc func,
                           int is_sorted, IntBuffer elem_idx,
                           Pointer userdata/*=NULL*/ );
public static native @Cast("schar*") ByteBuffer cvSeqSearch( CvSeq seq, @Const Pointer elem, CvCmpFunc func,
                           int is_sorted, IntBuffer elem_idx );
public static native @Cast("schar*") byte[] cvSeqSearch( CvSeq seq, @Const Pointer elem, CvCmpFunc func,
                           int is_sorted, int[] elem_idx,
                           Pointer userdata/*=NULL*/ );
public static native @Cast("schar*") byte[] cvSeqSearch( CvSeq seq, @Const Pointer elem, CvCmpFunc func,
                           int is_sorted, int[] elem_idx );

/** Reverses order of sequence elements in-place */
public static native void cvSeqInvert( CvSeq seq );

/** Splits sequence into one or more equivalence classes using the specified criteria */
public static native int cvSeqPartition( @Const CvSeq seq, CvMemStorage storage,
                            @Cast("CvSeq**") PointerPointer labels, CvCmpFunc is_equal, Pointer userdata );
public static native int cvSeqPartition( @Const CvSeq seq, CvMemStorage storage,
                            @ByPtrPtr CvSeq labels, CvCmpFunc is_equal, Pointer userdata );

/************ Internal sequence functions ************/
public static native void cvChangeSeqBlock( Pointer reader, int direction );
public static native void cvCreateSeqBlock( CvSeqWriter writer );


/** Creates a new set */
public static native CvSet cvCreateSet( int set_flags, int header_size,
                            int elem_size, CvMemStorage storage );

/** Adds new element to the set and returns pointer to it */
public static native int cvSetAdd( CvSet set_header, CvSetElem elem/*=NULL*/,
                      @Cast("CvSetElem**") PointerPointer inserted_elem/*=NULL*/ );
public static native int cvSetAdd( CvSet set_header );
public static native int cvSetAdd( CvSet set_header, CvSetElem elem/*=NULL*/,
                      @ByPtrPtr CvSetElem inserted_elem/*=NULL*/ );

/** Fast variant of cvSetAdd */
public static native CvSetElem cvSetNew( CvSet set_header );

/** Removes set element given its pointer */
public static native void cvSetRemoveByPtr( CvSet set_header, Pointer elem );

/** Removes element from the set by its index  */
public static native void cvSetRemove( CvSet set_header, int index );

/** Returns a set element by index. If the element doesn't belong to the set,
   NULL is returned */
public static native CvSetElem cvGetSetElem( @Const CvSet set_header, int idx );

/** Removes all the elements from the set */
public static native void cvClearSet( CvSet set_header );

/** Creates new graph */
public static native CvGraph cvCreateGraph( int graph_flags, int header_size,
                                int vtx_size, int edge_size,
                                CvMemStorage storage );

/** Adds new vertex to the graph */
public static native int cvGraphAddVtx( CvGraph graph, @Const CvGraphVtx vtx/*=NULL*/,
                           @Cast("CvGraphVtx**") PointerPointer inserted_vtx/*=NULL*/ );
public static native int cvGraphAddVtx( CvGraph graph );
public static native int cvGraphAddVtx( CvGraph graph, @Const CvGraphVtx vtx/*=NULL*/,
                           @ByPtrPtr CvGraphVtx inserted_vtx/*=NULL*/ );


/** Removes vertex from the graph together with all incident edges */
public static native int cvGraphRemoveVtx( CvGraph graph, int index );
public static native int cvGraphRemoveVtxByPtr( CvGraph graph, CvGraphVtx vtx );


/** Link two vertices specifed by indices or pointers if they
   are not connected or return pointer to already existing edge
   connecting the vertices.
   Functions return 1 if a new edge was created, 0 otherwise */
public static native int cvGraphAddEdge( CvGraph graph,
                            int start_idx, int end_idx,
                            @Const CvGraphEdge edge/*=NULL*/,
                            @Cast("CvGraphEdge**") PointerPointer inserted_edge/*=NULL*/ );
public static native int cvGraphAddEdge( CvGraph graph,
                            int start_idx, int end_idx );
public static native int cvGraphAddEdge( CvGraph graph,
                            int start_idx, int end_idx,
                            @Const CvGraphEdge edge/*=NULL*/,
                            @ByPtrPtr CvGraphEdge inserted_edge/*=NULL*/ );

public static native int cvGraphAddEdgeByPtr( CvGraph graph,
                               CvGraphVtx start_vtx, CvGraphVtx end_vtx,
                               @Const CvGraphEdge edge/*=NULL*/,
                               @Cast("CvGraphEdge**") PointerPointer inserted_edge/*=NULL*/ );
public static native int cvGraphAddEdgeByPtr( CvGraph graph,
                               CvGraphVtx start_vtx, CvGraphVtx end_vtx );
public static native int cvGraphAddEdgeByPtr( CvGraph graph,
                               CvGraphVtx start_vtx, CvGraphVtx end_vtx,
                               @Const CvGraphEdge edge/*=NULL*/,
                               @ByPtrPtr CvGraphEdge inserted_edge/*=NULL*/ );

/** Remove edge connecting two vertices */
public static native void cvGraphRemoveEdge( CvGraph graph, int start_idx, int end_idx );
public static native void cvGraphRemoveEdgeByPtr( CvGraph graph, CvGraphVtx start_vtx,
                                     CvGraphVtx end_vtx );

/** Find edge connecting two vertices */
public static native CvGraphEdge cvFindGraphEdge( @Const CvGraph graph, int start_idx, int end_idx );
public static native CvGraphEdge cvFindGraphEdgeByPtr( @Const CvGraph graph,
                                           @Const CvGraphVtx start_vtx,
                                           @Const CvGraphVtx end_vtx );
public static native CvGraphEdge cvGraphFindEdge(CvGraph arg1, int arg2, int arg3);
public static native CvGraphEdge cvGraphFindEdgeByPtr(CvGraph arg1, CvGraphVtx arg2, CvGraphVtx arg3);

/** Remove all vertices and edges from the graph */
public static native void cvClearGraph( CvGraph graph );


/** Count number of edges incident to the vertex */
public static native int cvGraphVtxDegree( @Const CvGraph graph, int vtx_idx );
public static native int cvGraphVtxDegreeByPtr( @Const CvGraph graph, @Const CvGraphVtx vtx );


/** Retrieves graph vertex by given index */
// #define cvGetGraphVtx( graph, idx ) (CvGraphVtx*)cvGetSetElem((CvSet*)(graph), (idx))

/** Retrieves index of a graph vertex given its pointer */
// #define cvGraphVtxIdx( graph, vtx ) ((vtx)->flags & CV_SET_ELEM_IDX_MASK)

/** Retrieves index of a graph edge given its pointer */
// #define cvGraphEdgeIdx( graph, edge ) ((edge)->flags & CV_SET_ELEM_IDX_MASK)

// #define cvGraphGetVtxCount( graph ) ((graph)->active_count)
// #define cvGraphGetEdgeCount( graph ) ((graph)->edges->active_count)

public static final int CV_GRAPH_VERTEX =        1;
public static final int CV_GRAPH_TREE_EDGE =     2;
public static final int CV_GRAPH_BACK_EDGE =     4;
public static final int CV_GRAPH_FORWARD_EDGE =  8;
public static final int CV_GRAPH_CROSS_EDGE =    16;
public static final int CV_GRAPH_ANY_EDGE =      30;
public static final int CV_GRAPH_NEW_TREE =      32;
public static final int CV_GRAPH_BACKTRACKING =  64;
public static final int CV_GRAPH_OVER =          -1;

public static final int CV_GRAPH_ALL_ITEMS =    -1;

/** flags for graph vertices and edges */
public static final int CV_GRAPH_ITEM_VISITED_FLAG =  (1 << 30);
// #define  CV_IS_GRAPH_VERTEX_VISITED(vtx)
//     (((CvGraphVtx*)(vtx))->flags & CV_GRAPH_ITEM_VISITED_FLAG)
// #define  CV_IS_GRAPH_EDGE_VISITED(edge)
//     (((CvGraphEdge*)(edge))->flags & CV_GRAPH_ITEM_VISITED_FLAG)
public static final int CV_GRAPH_SEARCH_TREE_NODE_FLAG =   (1 << 29);
public static final int CV_GRAPH_FORWARD_EDGE_FLAG =       (1 << 28);

public static class CvGraphScanner extends AbstractCvGraphScanner {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvGraphScanner() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvGraphScanner(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvGraphScanner(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvGraphScanner position(int position) {
        return (CvGraphScanner)super.position(position);
    }

    public native CvGraphVtx vtx(); public native CvGraphScanner vtx(CvGraphVtx vtx);       /* current graph vertex (or current edge origin) */
    public native CvGraphVtx dst(); public native CvGraphScanner dst(CvGraphVtx dst);       /* current graph edge destination vertex */
    public native CvGraphEdge edge(); public native CvGraphScanner edge(CvGraphEdge edge);     /* current edge */

    public native CvGraph graph(); public native CvGraphScanner graph(CvGraph graph);        /* the graph */
    public native CvSeq stack(); public native CvGraphScanner stack(CvSeq stack);        /* the graph vertex stack */
    public native int index(); public native CvGraphScanner index(int index);        /* the lower bound of certainly visited vertices */
    public native int mask(); public native CvGraphScanner mask(int mask);         /* event mask */
}

/** Creates new graph scanner. */
public static native CvGraphScanner cvCreateGraphScanner( CvGraph graph,
                                             CvGraphVtx vtx/*=NULL*/,
                                             int mask/*=CV_GRAPH_ALL_ITEMS*/);
public static native CvGraphScanner cvCreateGraphScanner( CvGraph graph);

/** Releases graph scanner. */
public static native void cvReleaseGraphScanner( @Cast("CvGraphScanner**") PointerPointer scanner );
public static native void cvReleaseGraphScanner( @ByPtrPtr CvGraphScanner scanner );

/** Get next graph element */
public static native int cvNextGraphItem( CvGraphScanner scanner );

/** Creates a copy of graph */
public static native CvGraph cvCloneGraph( @Const CvGraph graph, CvMemStorage storage );


/** Does look-up transformation. Elements of the source array
   (that should be 8uC1 or 8sC1) are used as indexes in lutarr 256-element table */
public static native void cvLUT( @Const CvArr src, CvArr dst, @Const CvArr lut );


/******************* Iteration through the sequence tree *****************/
public static class CvTreeNodeIterator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvTreeNodeIterator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvTreeNodeIterator(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvTreeNodeIterator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvTreeNodeIterator position(int position) {
        return (CvTreeNodeIterator)super.position(position);
    }

    @MemberGetter public native @Const Pointer node();
    public native int level(); public native CvTreeNodeIterator level(int level);
    public native int max_level(); public native CvTreeNodeIterator max_level(int max_level);
}

public static native void cvInitTreeNodeIterator( CvTreeNodeIterator tree_iterator,
                                   @Const Pointer first, int max_level );
public static native Pointer cvNextTreeNode( CvTreeNodeIterator tree_iterator );
public static native Pointer cvPrevTreeNode( CvTreeNodeIterator tree_iterator );

/** Inserts sequence into tree with specified "parent" sequence.
   If parent is equal to frame (e.g. the most external contour),
   then added contour will have null pointer to parent. */
public static native void cvInsertNodeIntoTree( Pointer node, Pointer parent, Pointer frame );

/** Removes contour from tree (together with the contour children). */
public static native void cvRemoveNodeFromTree( Pointer node, Pointer frame );

/** Gathers pointers to all the sequences,
   accessible from the {@code first}, to the single sequence */
public static native CvSeq cvTreeToNodeSeq( @Const Pointer first, int header_size,
                              CvMemStorage storage );

/** The function implements the K-means algorithm for clustering an array of sample
   vectors in a specified number of classes */
public static final int CV_KMEANS_USE_INITIAL_LABELS =    1;
public static native int cvKMeans2( @Const CvArr samples, int cluster_count, CvArr labels,
                      @ByVal CvTermCriteria termcrit, int attempts/*=1*/,
                      @Cast("CvRNG*") LongPointer rng/*=0*/, int flags/*=0*/,
                      CvArr _centers/*=0*/, DoublePointer compactness/*=0*/ );
public static native int cvKMeans2( @Const CvArr samples, int cluster_count, CvArr labels,
                      @ByVal CvTermCriteria termcrit );
public static native int cvKMeans2( @Const CvArr samples, int cluster_count, CvArr labels,
                      @ByVal CvTermCriteria termcrit, int attempts/*=1*/,
                      @Cast("CvRNG*") LongBuffer rng/*=0*/, int flags/*=0*/,
                      CvArr _centers/*=0*/, DoubleBuffer compactness/*=0*/ );
public static native int cvKMeans2( @Const CvArr samples, int cluster_count, CvArr labels,
                      @ByVal CvTermCriteria termcrit, int attempts/*=1*/,
                      @Cast("CvRNG*") long[] rng/*=0*/, int flags/*=0*/,
                      CvArr _centers/*=0*/, double[] compactness/*=0*/ );

/****************************************************************************************\
*                                    System functions                                    *
\****************************************************************************************/

/** Loads optimized functions from IPP, MKL etc. or switches back to pure C code */
public static native int cvUseOptimized( int on_off );

@Convention("CV_STDCALL") public static class Cv_iplCreateImageHeader extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Cv_iplCreateImageHeader(Pointer p) { super(p); }
    protected Cv_iplCreateImageHeader() { allocate(); }
    private native void allocate();
    public native IplImage call(int arg0,int arg1,int arg2,@Cast("char*") BytePointer arg3,@Cast("char*") BytePointer arg4,int arg5,int arg6,int arg7,int arg8,int arg9,
                            IplROI arg10,IplImage arg11,Pointer arg12,IplTileInfo arg13);
}
@Convention("CV_STDCALL") public static class Cv_iplAllocateImageData extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Cv_iplAllocateImageData(Pointer p) { super(p); }
    protected Cv_iplAllocateImageData() { allocate(); }
    private native void allocate();
    public native void call(IplImage arg0,int arg1,int arg2);
}
@Convention("CV_STDCALL") public static class Cv_iplDeallocate extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Cv_iplDeallocate(Pointer p) { super(p); }
    protected Cv_iplDeallocate() { allocate(); }
    private native void allocate();
    public native void call(IplImage arg0,int arg1);
}
@Convention("CV_STDCALL") public static class Cv_iplCreateROI extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Cv_iplCreateROI(Pointer p) { super(p); }
    protected Cv_iplCreateROI() { allocate(); }
    private native void allocate();
    public native IplROI call(int arg0,int arg1,int arg2,int arg3,int arg4);
}
@Convention("CV_STDCALL") public static class Cv_iplCloneImage extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Cv_iplCloneImage(Pointer p) { super(p); }
    protected Cv_iplCloneImage() { allocate(); }
    private native void allocate();
    public native IplImage call(@Const IplImage arg0);
}

/** \brief Makes OpenCV use IPL functions for allocating IplImage and IplROI structures.
<p>
Normally, the function is not called directly. Instead, a simple macro
CV_TURN_ON_IPL_COMPATIBILITY() is used that calls cvSetIPLAllocators and passes there pointers
to IPL allocation functions. :
<pre>{@code
    ...
    CV_TURN_ON_IPL_COMPATIBILITY()
    ...
}</pre>
@param create_header pointer to a function, creating IPL image header.
@param allocate_data pointer to a function, allocating IPL image data.
@param deallocate pointer to a function, deallocating IPL image.
@param create_roi pointer to a function, creating IPL image ROI (i.e. Region of Interest).
@param clone_image pointer to a function, cloning an IPL image.
 */
public static native void cvSetIPLAllocators( Cv_iplCreateImageHeader create_header,
                               Cv_iplAllocateImageData allocate_data,
                               Cv_iplDeallocate deallocate,
                               Cv_iplCreateROI create_roi,
                               Cv_iplCloneImage clone_image );

// #define CV_TURN_ON_IPL_COMPATIBILITY()
//     cvSetIPLAllocators( iplCreateImageHeader, iplAllocateImage,
//                         iplDeallocate, iplCreateROI, iplCloneImage )

/****************************************************************************************\
*                                    Data Persistence                                    *
\****************************************************************************************/

/********************************** High-level functions ********************************/

/** \brief Opens file storage for reading or writing data.
<p>
The function opens file storage for reading or writing data. In the latter case, a new file is
created or an existing file is rewritten. The type of the read or written file is determined by the
filename extension: .xml for XML and .yml or .yaml for YAML. The function returns a pointer to the
CvFileStorage structure. If the file cannot be opened then the function returns NULL.
@param filename Name of the file associated with the storage
@param memstorage Memory storage used for temporary data and for
:   storing dynamic structures, such as CvSeq or CvGraph . If it is NULL, a temporary memory
    storage is created and used.
@param flags Can be one of the following:
> -   **CV_STORAGE_READ** the storage is open for reading
> -   **CV_STORAGE_WRITE** the storage is open for writing
@param encoding
 */
public static native CvFileStorage cvOpenFileStorage( @Cast("const char*") BytePointer filename, CvMemStorage memstorage,
                                          int flags, @Cast("const char*") BytePointer encoding/*=NULL*/ );
public static native CvFileStorage cvOpenFileStorage( @Cast("const char*") BytePointer filename, CvMemStorage memstorage,
                                          int flags );
public static native CvFileStorage cvOpenFileStorage( String filename, CvMemStorage memstorage,
                                          int flags, String encoding/*=NULL*/ );
public static native CvFileStorage cvOpenFileStorage( String filename, CvMemStorage memstorage,
                                          int flags );

/** \brief Releases file storage.
<p>
The function closes the file associated with the storage and releases all the temporary structures.
It must be called after all I/O operations with the storage are finished.
@param fs Double pointer to the released file storage
 */
public static native void cvReleaseFileStorage( @Cast("CvFileStorage**") PointerPointer fs );
public static native void cvReleaseFileStorage( @ByPtrPtr CvFileStorage fs );

/** returns attribute value or 0 (NULL) if there is no such attribute */
public static native @Cast("const char*") BytePointer cvAttrValue( @Const CvAttrList attr, @Cast("const char*") BytePointer attr_name );
public static native String cvAttrValue( @Const CvAttrList attr, String attr_name );

/** \brief Starts writing a new structure.
<p>
The function starts writing a compound structure (collection) that can be a sequence or a map. After
all the structure fields, which can be scalars or structures, are written, cvEndWriteStruct should
be called. The function can be used to group some objects or to implement the write function for a
some user object (see CvTypeInfo).
@param fs File storage
@param name Name of the written structure. The structure can be accessed by this name when the
storage is read.
@param struct_flags A combination one of the following values:
-   **CV_NODE_SEQ** the written structure is a sequence (see discussion of CvFileStorage ),
    that is, its elements do not have a name.
-   **CV_NODE_MAP** the written structure is a map (see discussion of CvFileStorage ), that
    is, all its elements have names.
One and only one of the two above flags must be specified
-   **CV_NODE_FLOW** the optional flag that makes sense only for YAML streams. It means that
     the structure is written as a flow (not as a block), which is more compact. It is
     recommended to use this flag for structures or arrays whose elements are all scalars.
@param type_name Optional parameter - the object type name. In
    case of XML it is written as a type_id attribute of the structure opening tag. In the case of
    YAML it is written after a colon following the structure name (see the example in
    CvFileStorage description). Mainly it is used with user objects. When the storage is read, the
    encoded type name is used to determine the object type (see CvTypeInfo and cvFindType ).
@param attributes This parameter is not used in the current implementation
 */
public static native void cvStartWriteStruct( CvFileStorage fs, @Cast("const char*") BytePointer name,
                                int struct_flags, @Cast("const char*") BytePointer type_name/*=NULL*/,
                                @ByVal(nullValue = "cvAttrList()") CvAttrList attributes/*=cvAttrList()*/);
public static native void cvStartWriteStruct( CvFileStorage fs, @Cast("const char*") BytePointer name,
                                int struct_flags);
public static native void cvStartWriteStruct( CvFileStorage fs, String name,
                                int struct_flags, String type_name/*=NULL*/,
                                @ByVal(nullValue = "cvAttrList()") CvAttrList attributes/*=cvAttrList()*/);
public static native void cvStartWriteStruct( CvFileStorage fs, String name,
                                int struct_flags);

/** \brief Finishes writing to a file node collection.
@param fs File storage
\sa cvStartWriteStruct.
 */
public static native void cvEndWriteStruct( CvFileStorage fs );

/** \brief Writes an integer value.
<p>
The function writes a single integer value (with or without a name) to the file storage.
@param fs File storage
@param name Name of the written value. Should be NULL if and only if the parent structure is a
sequence.
@param value The written value
 */
public static native void cvWriteInt( CvFileStorage fs, @Cast("const char*") BytePointer name, int value );
public static native void cvWriteInt( CvFileStorage fs, String name, int value );

/** \brief Writes a floating-point value.
<p>
The function writes a single floating-point value (with or without a name) to file storage. Special
values are encoded as follows: NaN (Not A Number) as .NaN, infinity as +.Inf or -.Inf.
<p>
The following example shows how to use the low-level writing functions to store custom structures,
such as termination criteria, without registering a new type. :
<pre>{@code
    void write_termcriteria( CvFileStorage* fs, const char* struct_name,
                             CvTermCriteria* termcrit )
    {
        cvStartWriteStruct( fs, struct_name, CV_NODE_MAP, NULL, cvAttrList(0,0));
        cvWriteComment( fs, "termination criteria", 1 ); // just a description
        if( termcrit->type & CV_TERMCRIT_ITER )
            cvWriteInteger( fs, "max_iterations", termcrit->max_iter );
        if( termcrit->type & CV_TERMCRIT_EPS )
            cvWriteReal( fs, "accuracy", termcrit->epsilon );
        cvEndWriteStruct( fs );
    }
}</pre>
@param fs File storage
@param name Name of the written value. Should be NULL if and only if the parent structure is a
sequence.
@param value The written value
*/
public static native void cvWriteReal( CvFileStorage fs, @Cast("const char*") BytePointer name, double value );
public static native void cvWriteReal( CvFileStorage fs, String name, double value );

/** \brief Writes a text string.
<p>
The function writes a text string to file storage.
@param fs File storage
@param name Name of the written string . Should be NULL if and only if the parent structure is a
sequence.
@param str The written text string
@param quote If non-zero, the written string is put in quotes, regardless of whether they are
required. Otherwise, if the flag is zero, quotes are used only when they are required (e.g. when
the string starts with a digit or contains spaces).
 */
public static native void cvWriteString( CvFileStorage fs, @Cast("const char*") BytePointer name,
                           @Cast("const char*") BytePointer str, int quote/*=0*/ );
public static native void cvWriteString( CvFileStorage fs, @Cast("const char*") BytePointer name,
                           @Cast("const char*") BytePointer str );
public static native void cvWriteString( CvFileStorage fs, String name,
                           String str, int quote/*=0*/ );
public static native void cvWriteString( CvFileStorage fs, String name,
                           String str );

/** \brief Writes a comment.
<p>
The function writes a comment into file storage. The comments are skipped when the storage is read.
@param fs File storage
@param comment The written comment, single-line or multi-line
@param eol_comment If non-zero, the function tries to put the comment at the end of current line.
If the flag is zero, if the comment is multi-line, or if it does not fit at the end of the current
line, the comment starts a new line.
 */
public static native void cvWriteComment( CvFileStorage fs, @Cast("const char*") BytePointer comment,
                            int eol_comment );
public static native void cvWriteComment( CvFileStorage fs, String comment,
                            int eol_comment );

/** \brief Writes an object to file storage.
<p>
The function writes an object to file storage. First, the appropriate type info is found using
cvTypeOf. Then, the write method associated with the type info is called.
<p>
Attributes are used to customize the writing procedure. The standard types support the following
attributes (all the dt attributes have the same format as in cvWriteRawData):
<p>
-# CvSeq
    -   **header_dt** description of user fields of the sequence header that follow CvSeq, or
        CvChain (if the sequence is a Freeman chain) or CvContour (if the sequence is a contour or
        point sequence)
    -   **dt** description of the sequence elements.
    -   **recursive** if the attribute is present and is not equal to "0" or "false", the whole
        tree of sequences (contours) is stored.
-# CvGraph
    -   **header_dt** description of user fields of the graph header that follows CvGraph;
    -   **vertex_dt** description of user fields of graph vertices
    -   **edge_dt** description of user fields of graph edges (note that the edge weight is
        always written, so there is no need to specify it explicitly)
<p>
Below is the code that creates the YAML file shown in the CvFileStorage description:
<pre>{@code
    #include "cxcore.h"

    int main( int argc, char** argv )
    {
        CvMat* mat = cvCreateMat( 3, 3, CV_32F );
        CvFileStorage* fs = cvOpenFileStorage( "example.yml", 0, CV_STORAGE_WRITE );

        cvSetIdentity( mat );
        cvWrite( fs, "A", mat, cvAttrList(0,0) );

        cvReleaseFileStorage( &fs );
        cvReleaseMat( &mat );
        return 0;
    }
}</pre>
@param fs File storage
@param name Name of the written object. Should be NULL if and only if the parent structure is a
sequence.
@param ptr Pointer to the object
@param attributes The attributes of the object. They are specific for each particular type (see
the discussion below).
 */
public static native void cvWrite( CvFileStorage fs, @Cast("const char*") BytePointer name, @Const Pointer ptr,
                         @ByVal(nullValue = "cvAttrList()") CvAttrList attributes/*=cvAttrList()*/);
public static native void cvWrite( CvFileStorage fs, @Cast("const char*") BytePointer name, @Const Pointer ptr);
public static native void cvWrite( CvFileStorage fs, String name, @Const Pointer ptr,
                         @ByVal(nullValue = "cvAttrList()") CvAttrList attributes/*=cvAttrList()*/);
public static native void cvWrite( CvFileStorage fs, String name, @Const Pointer ptr);

/** \brief Starts the next stream.
<p>
The function finishes the currently written stream and starts the next stream. In the case of XML
the file with multiple streams looks like this:
<pre>{@code {.xml}
    <opencv_storage>
    <!-- stream #1 data -->
    </opencv_storage>
    <opencv_storage>
    <!-- stream #2 data -->
    </opencv_storage>
    ...
}</pre>
The YAML file will look like this:
<pre>{@code {.yaml}
    %YAML:1.0
    # stream #1 data
    ...
    ---
    # stream #2 data
}</pre>
This is useful for concatenating files or for resuming the writing process.
@param fs File storage
 */
public static native void cvStartNextStream( CvFileStorage fs );

/** \brief Writes multiple numbers.
<p>
The function writes an array, whose elements consist of single or multiple numbers. The function
call can be replaced with a loop containing a few cvWriteInt and cvWriteReal calls, but a single
call is more efficient. Note that because none of the elements have a name, they should be written
to a sequence rather than a map.
@param fs File storage
@param src Pointer to the written array
@param len Number of the array elements to write
@param dt Specification of each array element, see \ref format_spec "format specification"
 */
public static native void cvWriteRawData( CvFileStorage fs, @Const Pointer src,
                                int len, @Cast("const char*") BytePointer dt );
public static native void cvWriteRawData( CvFileStorage fs, @Const Pointer src,
                                int len, String dt );

/** \brief Returns a unique pointer for a given name.
<p>
The function returns a unique pointer for each particular file node name. This pointer can be then
passed to the cvGetFileNode function that is faster than cvGetFileNodeByName because it compares
text strings by comparing pointers rather than the strings' content.
<p>
Consider the following example where an array of points is encoded as a sequence of 2-entry maps:
<pre>{@code
    points:
      - { x: 10, y: 10 }
      - { x: 20, y: 20 }
      - { x: 30, y: 30 }
      # ...
}</pre>
Then, it is possible to get hashed "x" and "y" pointers to speed up decoding of the points. :
<pre>{@code
    #include "cxcore.h"

    int main( int argc, char** argv )
    {
        CvFileStorage* fs = cvOpenFileStorage( "points.yml", 0, CV_STORAGE_READ );
        CvStringHashNode* x_key = cvGetHashedNode( fs, "x", -1, 1 );
        CvStringHashNode* y_key = cvGetHashedNode( fs, "y", -1, 1 );
        CvFileNode* points = cvGetFileNodeByName( fs, 0, "points" );

        if( CV_NODE_IS_SEQ(points->tag) )
        {
            CvSeq* seq = points->data.seq;
            int i, total = seq->total;
            CvSeqReader reader;
            cvStartReadSeq( seq, &reader, 0 );
            for( i = 0; i < total; i++ )
            {
                CvFileNode* pt = (CvFileNode*)reader.ptr;
    #if 1 // faster variant
                CvFileNode* xnode = cvGetFileNode( fs, pt, x_key, 0 );
                CvFileNode* ynode = cvGetFileNode( fs, pt, y_key, 0 );
                assert( xnode && CV_NODE_IS_INT(xnode->tag) &&
                        ynode && CV_NODE_IS_INT(ynode->tag));
                int x = xnode->data.i; // or x = cvReadInt( xnode, 0 );
                int y = ynode->data.i; // or y = cvReadInt( ynode, 0 );
    #elif 1 // slower variant; does not use x_key & y_key
                CvFileNode* xnode = cvGetFileNodeByName( fs, pt, "x" );
                CvFileNode* ynode = cvGetFileNodeByName( fs, pt, "y" );
                assert( xnode && CV_NODE_IS_INT(xnode->tag) &&
                        ynode && CV_NODE_IS_INT(ynode->tag));
                int x = xnode->data.i; // or x = cvReadInt( xnode, 0 );
                int y = ynode->data.i; // or y = cvReadInt( ynode, 0 );
    #else // the slowest yet the easiest to use variant
                int x = cvReadIntByName( fs, pt, "x", 0 );
                int y = cvReadIntByName( fs, pt, "y", 0 );
    #endif
                CV_NEXT_SEQ_ELEM( seq->elem_size, reader );
                printf("
            }
        }
        cvReleaseFileStorage( &fs );
        return 0;
    }
}</pre>
Please note that whatever method of accessing a map you are using, it is still much slower than
using plain sequences; for example, in the above example, it is more efficient to encode the points
as pairs of integers in a single numeric sequence.
@param fs File storage
@param name Literal node name
@param len Length of the name (if it is known apriori), or -1 if it needs to be calculated
@param create_missing Flag that specifies, whether an absent key should be added into the hash table
*/
public static native CvStringHashNode cvGetHashedKey( CvFileStorage fs, @Cast("const char*") BytePointer name,
                                        int len/*=-1*/,
                                        int create_missing/*=0*/);
public static native CvStringHashNode cvGetHashedKey( CvFileStorage fs, @Cast("const char*") BytePointer name);
public static native CvStringHashNode cvGetHashedKey( CvFileStorage fs, String name,
                                        int len/*=-1*/,
                                        int create_missing/*=0*/);
public static native CvStringHashNode cvGetHashedKey( CvFileStorage fs, String name);

/** \brief Retrieves one of the top-level nodes of the file storage.
<p>
The function returns one of the top-level file nodes. The top-level nodes do not have a name, they
correspond to the streams that are stored one after another in the file storage. If the index is out
of range, the function returns a NULL pointer, so all the top-level nodes can be iterated by
subsequent calls to the function with stream_index=0,1,..., until the NULL pointer is returned.
This function can be used as a base for recursive traversal of the file storage.
@param fs File storage
@param stream_index Zero-based index of the stream. See cvStartNextStream . In most cases,
there is only one stream in the file; however, there can be several.
 */
public static native CvFileNode cvGetRootFileNode( @Const CvFileStorage fs,
                                     int stream_index/*=0*/ );
public static native CvFileNode cvGetRootFileNode( @Const CvFileStorage fs );

/** \brief Finds a node in a map or file storage.
<p>
The function finds a file node. It is a faster version of cvGetFileNodeByName (see
cvGetHashedKey discussion). Also, the function can insert a new node, if it is not in the map yet.
@param fs File storage
@param map The parent map. If it is NULL, the function searches a top-level node. If both map and
key are NULLs, the function returns the root file node - a map that contains top-level nodes.
@param key Unique pointer to the node name, retrieved with cvGetHashedKey
@param create_missing Flag that specifies whether an absent node should be added to the map
 */
public static native CvFileNode cvGetFileNode( CvFileStorage fs, CvFileNode map,
                                 @Const CvStringHashNode key,
                                 int create_missing/*=0*/ );
public static native CvFileNode cvGetFileNode( CvFileStorage fs, CvFileNode map,
                                 @Const CvStringHashNode key );

/** \brief Finds a node in a map or file storage.
<p>
The function finds a file node by name. The node is searched either in map or, if the pointer is
NULL, among the top-level file storage nodes. Using this function for maps and cvGetSeqElem (or
sequence reader) for sequences, it is possible to navigate through the file storage. To speed up
multiple queries for a certain key (e.g., in the case of an array of structures) one may use a
combination of cvGetHashedKey and cvGetFileNode.
@param fs File storage
@param map The parent map. If it is NULL, the function searches in all the top-level nodes
(streams), starting with the first one.
@param name The file node name
 */
public static native CvFileNode cvGetFileNodeByName( @Const CvFileStorage fs,
                                       @Const CvFileNode map,
                                       @Cast("const char*") BytePointer name );
public static native CvFileNode cvGetFileNodeByName( @Const CvFileStorage fs,
                                       @Const CvFileNode map,
                                       String name );

/** \brief Retrieves an integer value from a file node.
<p>
The function returns an integer that is represented by the file node. If the file node is NULL, the
default_value is returned (thus, it is convenient to call the function right after cvGetFileNode
without checking for a NULL pointer). If the file node has type CV_NODE_INT, then node-\>data.i is
returned. If the file node has type CV_NODE_REAL, then node-\>data.f is converted to an integer
and returned. Otherwise the error is reported.
@param node File node
@param default_value The value that is returned if node is NULL
 */
public static native int cvReadInt( @Const CvFileNode node, int default_value/*=0*/ );
public static native int cvReadInt( @Const CvFileNode node );

/** \brief Finds a file node and returns its value.
<p>
The function is a simple superposition of cvGetFileNodeByName and cvReadInt.
@param fs File storage
@param map The parent map. If it is NULL, the function searches a top-level node.
@param name The node name
@param default_value The value that is returned if the file node is not found
 */
public static native int cvReadIntByName( @Const CvFileStorage fs, @Const CvFileNode map,
                         @Cast("const char*") BytePointer name, int default_value/*=0*/ );
public static native int cvReadIntByName( @Const CvFileStorage fs, @Const CvFileNode map,
                         @Cast("const char*") BytePointer name );
public static native int cvReadIntByName( @Const CvFileStorage fs, @Const CvFileNode map,
                         String name, int default_value/*=0*/ );
public static native int cvReadIntByName( @Const CvFileStorage fs, @Const CvFileNode map,
                         String name );

/** \brief Retrieves a floating-point value from a file node.
<p>
The function returns a floating-point value that is represented by the file node. If the file node
is NULL, the default_value is returned (thus, it is convenient to call the function right after
cvGetFileNode without checking for a NULL pointer). If the file node has type CV_NODE_REAL ,
then node-\>data.f is returned. If the file node has type CV_NODE_INT , then node-:math:\>data.f
is converted to floating-point and returned. Otherwise the result is not determined.
@param node File node
@param default_value The value that is returned if node is NULL
 */
public static native double cvReadReal( @Const CvFileNode node, double default_value/*=0.*/ );
public static native double cvReadReal( @Const CvFileNode node );

/** \brief Finds a file node and returns its value.
<p>
The function is a simple superposition of cvGetFileNodeByName and cvReadReal .
@param fs File storage
@param map The parent map. If it is NULL, the function searches a top-level node.
@param name The node name
@param default_value The value that is returned if the file node is not found
 */
public static native double cvReadRealByName( @Const CvFileStorage fs, @Const CvFileNode map,
                        @Cast("const char*") BytePointer name, double default_value/*=0.*/ );
public static native double cvReadRealByName( @Const CvFileStorage fs, @Const CvFileNode map,
                        @Cast("const char*") BytePointer name );
public static native double cvReadRealByName( @Const CvFileStorage fs, @Const CvFileNode map,
                        String name, double default_value/*=0.*/ );
public static native double cvReadRealByName( @Const CvFileStorage fs, @Const CvFileNode map,
                        String name );

/** \brief Retrieves a text string from a file node.
<p>
The function returns a text string that is represented by the file node. If the file node is NULL,
the default_value is returned (thus, it is convenient to call the function right after
cvGetFileNode without checking for a NULL pointer). If the file node has type CV_NODE_STR , then
node-:math:\>data.str.ptr is returned. Otherwise the result is not determined.
@param node File node
@param default_value The value that is returned if node is NULL
 */
public static native @Cast("const char*") BytePointer cvReadString( @Const CvFileNode node,
                        @Cast("const char*") BytePointer default_value/*=NULL*/ );
public static native @Cast("const char*") BytePointer cvReadString( @Const CvFileNode node );
public static native String cvReadString( @Const CvFileNode node,
                        String default_value/*=NULL*/ );

/** \brief Finds a file node by its name and returns its value.
<p>
The function is a simple superposition of cvGetFileNodeByName and cvReadString .
@param fs File storage
@param map The parent map. If it is NULL, the function searches a top-level node.
@param name The node name
@param default_value The value that is returned if the file node is not found
 */
public static native @Cast("const char*") BytePointer cvReadStringByName( @Const CvFileStorage fs, @Const CvFileNode map,
                        @Cast("const char*") BytePointer name, @Cast("const char*") BytePointer default_value/*=NULL*/ );
public static native @Cast("const char*") BytePointer cvReadStringByName( @Const CvFileStorage fs, @Const CvFileNode map,
                        @Cast("const char*") BytePointer name );
public static native String cvReadStringByName( @Const CvFileStorage fs, @Const CvFileNode map,
                        String name, String default_value/*=NULL*/ );
public static native String cvReadStringByName( @Const CvFileStorage fs, @Const CvFileNode map,
                        String name );


/** \brief Decodes an object and returns a pointer to it.
<p>
The function decodes a user object (creates an object in a native representation from the file
storage subtree) and returns it. The object to be decoded must be an instance of a registered type
that supports the read method (see CvTypeInfo). The type of the object is determined by the type
name that is encoded in the file. If the object is a dynamic structure, it is created either in
memory storage and passed to cvOpenFileStorage or, if a NULL pointer was passed, in temporary
memory storage, which is released when cvReleaseFileStorage is called. Otherwise, if the object is
not a dynamic structure, it is created in a heap and should be released with a specialized function
or by using the generic cvRelease.
@param fs File storage
@param node The root object node
@param attributes Unused parameter
 */
public static native Pointer cvRead( CvFileStorage fs, CvFileNode node,
                        CvAttrList attributes/*=NULL*/);
public static native Pointer cvRead( CvFileStorage fs, CvFileNode node);

/** \brief Finds an object by name and decodes it.
<p>
The function is a simple superposition of cvGetFileNodeByName and cvRead.
@param fs File storage
@param map The parent map. If it is NULL, the function searches a top-level node.
@param name The node name
@param attributes Unused parameter
 */
public static native Pointer cvReadByName( CvFileStorage fs, @Const CvFileNode map,
                              @Cast("const char*") BytePointer name, CvAttrList attributes/*=NULL*/ );
public static native Pointer cvReadByName( CvFileStorage fs, @Const CvFileNode map,
                              @Cast("const char*") BytePointer name );
public static native Pointer cvReadByName( CvFileStorage fs, @Const CvFileNode map,
                              String name, CvAttrList attributes/*=NULL*/ );
public static native Pointer cvReadByName( CvFileStorage fs, @Const CvFileNode map,
                              String name );


/** \brief Initializes the file node sequence reader.
<p>
The function initializes the sequence reader to read data from a file node. The initialized reader
can be then passed to cvReadRawDataSlice.
@param fs File storage
@param src The file node (a sequence) to read numbers from
@param reader Pointer to the sequence reader
 */
public static native void cvStartReadRawData( @Const CvFileStorage fs, @Const CvFileNode src,
                               CvSeqReader reader );

/** \brief Initializes file node sequence reader.
<p>
The function reads one or more elements from the file node, representing a sequence, to a
user-specified array. The total number of read sequence elements is a product of total and the
number of components in each array element. For example, if dt=2if, the function will read total\*3
sequence elements. As with any sequence, some parts of the file node sequence can be skipped or read
repeatedly by repositioning the reader using cvSetSeqReaderPos.
@param fs File storage
@param reader The sequence reader. Initialize it with cvStartReadRawData .
@param count The number of elements to read
@param dst Pointer to the destination array
@param dt Specification of each array element. It has the same format as in cvWriteRawData .
 */
public static native void cvReadRawDataSlice( @Const CvFileStorage fs, CvSeqReader reader,
                               int count, Pointer dst, @Cast("const char*") BytePointer dt );
public static native void cvReadRawDataSlice( @Const CvFileStorage fs, CvSeqReader reader,
                               int count, Pointer dst, String dt );

/** \brief Reads multiple numbers.
<p>
The function reads elements from a file node that represents a sequence of scalars.
@param fs File storage
@param src The file node (a sequence) to read numbers from
@param dst Pointer to the destination array
@param dt Specification of each array element. It has the same format as in cvWriteRawData .
 */
public static native void cvReadRawData( @Const CvFileStorage fs, @Const CvFileNode src,
                          Pointer dst, @Cast("const char*") BytePointer dt );
public static native void cvReadRawData( @Const CvFileStorage fs, @Const CvFileNode src,
                          Pointer dst, String dt );

/** \brief Writes a file node to another file storage.
<p>
The function writes a copy of a file node to file storage. Possible applications of the function are
merging several file storages into one and conversion between XML and YAML formats.
@param fs Destination file storage
@param new_node_name New name of the file node in the destination file storage. To keep the
existing name, use cvcvGetFileNodeName
@param node The written node
@param embed If the written node is a collection and this parameter is not zero, no extra level of
hierarchy is created. Instead, all the elements of node are written into the currently written
structure. Of course, map elements can only be embedded into another map, and sequence elements
can only be embedded into another sequence.
 */
public static native void cvWriteFileNode( CvFileStorage fs, @Cast("const char*") BytePointer new_node_name,
                            @Const CvFileNode node, int embed );
public static native void cvWriteFileNode( CvFileStorage fs, String new_node_name,
                            @Const CvFileNode node, int embed );

/** \brief Returns the name of a file node.
<p>
The function returns the name of a file node or NULL, if the file node does not have a name or if
node is NULL.
@param node File node
 */
public static native @Cast("const char*") BytePointer cvGetFileNodeName( @Const CvFileNode node );

/*********************************** Adding own types ***********************************/

/** \brief Registers a new type.
<p>
The function registers a new type, which is described by info . The function creates a copy of the
structure, so the user should delete it after calling the function.
@param info Type info structure
 */
public static native void cvRegisterType( @Const CvTypeInfo info );

/** \brief Unregisters the type.
<p>
The function unregisters a type with a specified name. If the name is unknown, it is possible to
locate the type info by an instance of the type using cvTypeOf or by iterating the type list,
starting from cvFirstType, and then calling cvUnregisterType(info-\>typeName).
@param type_name Name of an unregistered type
 */
public static native void cvUnregisterType( @Cast("const char*") BytePointer type_name );
public static native void cvUnregisterType( String type_name );

/** \brief Returns the beginning of a type list.
<p>
The function returns the first type in the list of registered types. Navigation through the list can
be done via the prev and next fields of the CvTypeInfo structure.
 */
public static native CvTypeInfo cvFirstType();

/** \brief Finds a type by its name.
<p>
The function finds a registered type by its name. It returns NULL if there is no type with the
specified name.
@param type_name Type name
 */
public static native CvTypeInfo cvFindType( @Cast("const char*") BytePointer type_name );
public static native CvTypeInfo cvFindType( String type_name );

/** \brief Returns the type of an object.
<p>
The function finds the type of a given object. It iterates through the list of registered types and
calls the is_instance function/method for every type info structure with that object until one of
them returns non-zero or until the whole list has been traversed. In the latter case, the function
returns NULL.
@param struct_ptr The object pointer
 */
public static native CvTypeInfo cvTypeOf( @Const Pointer struct_ptr );

/** \brief Releases an object.
<p>
The function finds the type of a given object and calls release with the double pointer.
@param struct_ptr Double pointer to the object
 */
public static native void cvRelease( @Cast("void**") PointerPointer struct_ptr );
public static native void cvRelease( @Cast("void**") @ByPtrPtr Pointer struct_ptr );

/** \brief Makes a clone of an object.
<p>
The function finds the type of a given object and calls clone with the passed object. Of course, if
you know the object type, for example, struct_ptr is CvMat\*, it is faster to call the specific
function, like cvCloneMat.
@param struct_ptr The object to clone
 */
public static native Pointer cvClone( @Const Pointer struct_ptr );

/** \brief Saves an object to a file.
<p>
The function saves an object to a file. It provides a simple interface to cvWrite .
@param filename File name
@param struct_ptr Object to save
@param name Optional object name. If it is NULL, the name will be formed from filename .
@param comment Optional comment to put in the beginning of the file
@param attributes Optional attributes passed to cvWrite
 */
public static native void cvSave( @Cast("const char*") BytePointer filename, @Const Pointer struct_ptr,
                    @Cast("const char*") BytePointer name/*=NULL*/,
                    @Cast("const char*") BytePointer comment/*=NULL*/,
                    @ByVal(nullValue = "cvAttrList()") CvAttrList attributes/*=cvAttrList()*/);
public static native void cvSave( @Cast("const char*") BytePointer filename, @Const Pointer struct_ptr);
public static native void cvSave( String filename, @Const Pointer struct_ptr,
                    String name/*=NULL*/,
                    String comment/*=NULL*/,
                    @ByVal(nullValue = "cvAttrList()") CvAttrList attributes/*=cvAttrList()*/);
public static native void cvSave( String filename, @Const Pointer struct_ptr);

/** \brief Loads an object from a file.
<p>
The function loads an object from a file. It basically reads the specified file, find the first
top-level node and calls cvRead for that node. If the file node does not have type information or
the type information can not be found by the type name, the function returns NULL. After the object
is loaded, the file storage is closed and all the temporary buffers are deleted. Thus, to load a
dynamic structure, such as a sequence, contour, or graph, one should pass a valid memory storage
destination to the function.
@param filename File name
@param memstorage Memory storage for dynamic structures, such as CvSeq or CvGraph . It is not used
for matrices or images.
@param name Optional object name. If it is NULL, the first top-level object in the storage will be
loaded.
@param real_name Optional output parameter that will contain the name of the loaded object
(useful if name=NULL )
 */
public static native Pointer cvLoad( @Cast("const char*") BytePointer filename,
                     CvMemStorage memstorage/*=NULL*/,
                     @Cast("const char*") BytePointer name/*=NULL*/,
                     @Cast("const char**") PointerPointer real_name/*=NULL*/ );
public static native Pointer cvLoad( @Cast("const char*") BytePointer filename );
public static native Pointer cvLoad( @Cast("const char*") BytePointer filename,
                     CvMemStorage memstorage/*=NULL*/,
                     @Cast("const char*") BytePointer name/*=NULL*/,
                     @Cast("const char**") @ByPtrPtr BytePointer real_name/*=NULL*/ );
public static native Pointer cvLoad( String filename,
                     CvMemStorage memstorage/*=NULL*/,
                     String name/*=NULL*/,
                     @Cast("const char**") @ByPtrPtr ByteBuffer real_name/*=NULL*/ );
public static native Pointer cvLoad( String filename );
public static native Pointer cvLoad( @Cast("const char*") BytePointer filename,
                     CvMemStorage memstorage/*=NULL*/,
                     @Cast("const char*") BytePointer name/*=NULL*/,
                     @Cast("const char**") @ByPtrPtr byte[] real_name/*=NULL*/ );
public static native Pointer cvLoad( String filename,
                     CvMemStorage memstorage/*=NULL*/,
                     String name/*=NULL*/,
                     @Cast("const char**") @ByPtrPtr BytePointer real_name/*=NULL*/ );
public static native Pointer cvLoad( @Cast("const char*") BytePointer filename,
                     CvMemStorage memstorage/*=NULL*/,
                     @Cast("const char*") BytePointer name/*=NULL*/,
                     @Cast("const char**") @ByPtrPtr ByteBuffer real_name/*=NULL*/ );
public static native Pointer cvLoad( String filename,
                     CvMemStorage memstorage/*=NULL*/,
                     String name/*=NULL*/,
                     @Cast("const char**") @ByPtrPtr byte[] real_name/*=NULL*/ );

/*********************************** Measuring Execution Time ***************************/

/** helper functions for RNG initialization and accurate time measurement:
   uses internal clock counter on x86 */
public static native @Cast("int64") long cvGetTickCount( );
public static native double cvGetTickFrequency( );

/*********************************** CPU capabilities ***********************************/

public static native int cvCheckHardwareSupport(int feature);

/*********************************** Multi-Threading ************************************/

/** retrieve/set the number of threads used in OpenMP implementations */
public static native int cvGetNumThreads( );
public static native void cvSetNumThreads( int threads/*=0*/ );
public static native void cvSetNumThreads( );
/** get index of the thread being executed */
public static native int cvGetThreadNum( );


/********************************** Error Handling **************************************/

/** Get current OpenCV error status */
public static native int cvGetErrStatus( );

/** Sets error status silently */
public static native void cvSetErrStatus( int status );

public static final int CV_ErrModeLeaf =     0;   /* Print error and exit program */
public static final int CV_ErrModeParent =   1;   /* Print error and continue */
public static final int CV_ErrModeSilent =   2;   /* Don't print and continue */

/** Retrives current error processing mode */
public static native int cvGetErrMode( );

/** Sets error processing mode, returns previously used mode */
public static native int cvSetErrMode( int mode );

/** Sets error status and performs some additonal actions (displaying message box,
 writing message to stderr, terminating application etc.)
 depending on the current error mode */
public static native void cvError( int status, @Cast("const char*") BytePointer func_name,
                    @Cast("const char*") BytePointer err_msg, @Cast("const char*") BytePointer file_name, int line );
public static native void cvError( int status, String func_name,
                    String err_msg, String file_name, int line );

/** Retrieves textual description of the error given its code */
public static native @Cast("const char*") BytePointer cvErrorStr( int status );

/** Retrieves detailed information about the last error occured */
public static native int cvGetErrInfo( @Cast("const char**") PointerPointer errcode_desc, @Cast("const char**") PointerPointer description,
                        @Cast("const char**") PointerPointer filename, IntPointer line );
public static native int cvGetErrInfo( @Cast("const char**") @ByPtrPtr BytePointer errcode_desc, @Cast("const char**") @ByPtrPtr BytePointer description,
                        @Cast("const char**") @ByPtrPtr BytePointer filename, IntPointer line );
public static native int cvGetErrInfo( @Cast("const char**") @ByPtrPtr ByteBuffer errcode_desc, @Cast("const char**") @ByPtrPtr ByteBuffer description,
                        @Cast("const char**") @ByPtrPtr ByteBuffer filename, IntBuffer line );
public static native int cvGetErrInfo( @Cast("const char**") @ByPtrPtr byte[] errcode_desc, @Cast("const char**") @ByPtrPtr byte[] description,
                        @Cast("const char**") @ByPtrPtr byte[] filename, int[] line );

/** Maps IPP error codes to the counterparts from OpenCV */
public static native int cvErrorFromIppStatus( int ipp_status );

@Convention("CV_CDECL") public static class CvErrorCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CvErrorCallback(Pointer p) { super(p); }
    protected CvErrorCallback() { allocate(); }
    private native void allocate();
    public native int call( int status, @Cast("const char*") BytePointer func_name,
                                        @Cast("const char*") BytePointer err_msg, @Cast("const char*") BytePointer file_name, int line, Pointer userdata );
}

/** Assigns a new error-handling function */
public static native CvErrorCallback cvRedirectError( CvErrorCallback error_handler,
                                       Pointer userdata/*=NULL*/,
                                       @Cast("void**") PointerPointer prev_userdata/*=NULL*/ );
public static native CvErrorCallback cvRedirectError( CvErrorCallback error_handler );
public static native CvErrorCallback cvRedirectError( CvErrorCallback error_handler,
                                       Pointer userdata/*=NULL*/,
                                       @Cast("void**") @ByPtrPtr Pointer prev_userdata/*=NULL*/ );

/** Output nothing */
public static native int cvNulDevReport( int status, @Cast("const char*") BytePointer func_name, @Cast("const char*") BytePointer err_msg,
                          @Cast("const char*") BytePointer file_name, int line, Pointer userdata );
public static native int cvNulDevReport( int status, String func_name, String err_msg,
                          String file_name, int line, Pointer userdata );

/** Output to console(fprintf(stderr,...)) */
public static native int cvStdErrReport( int status, @Cast("const char*") BytePointer func_name, @Cast("const char*") BytePointer err_msg,
                          @Cast("const char*") BytePointer file_name, int line, Pointer userdata );
public static native int cvStdErrReport( int status, String func_name, String err_msg,
                          String file_name, int line, Pointer userdata );

/** Output to MessageBox(WIN32) */
public static native int cvGuiBoxReport( int status, @Cast("const char*") BytePointer func_name, @Cast("const char*") BytePointer err_msg,
                          @Cast("const char*") BytePointer file_name, int line, Pointer userdata );
public static native int cvGuiBoxReport( int status, String func_name, String err_msg,
                          String file_name, int line, Pointer userdata );

// #define OPENCV_ERROR(status,func,context)
// cvError((status),(func),(context),__FILE__,__LINE__)

// #define OPENCV_ASSERT(expr,func,context)
// {if (! (expr))
// {OPENCV_ERROR(CV_StsInternal,(func),(context));}}

// #define OPENCV_CALL( Func )
// {
// Func;
// }


/** CV_FUNCNAME macro defines icvFuncName constant which is used by CV_ERROR macro */
// #ifdef CV_NO_FUNC_NAMES
// #define CV_FUNCNAME( Name )
public static final String cvFuncName = "";
// #else
// #define CV_FUNCNAME( Name )
// static char cvFuncName[] = Name
// #endif


/**
 CV_ERROR macro unconditionally raises error with passed code and message.
 After raising error, control will be transferred to the exit label.
 */
// #define CV_ERROR( Code, Msg )
// {
//     cvError( (Code), cvFuncName, Msg, __FILE__, __LINE__ );
//     __CV_EXIT__;
// }

/**
 CV_CHECK macro checks error status after CV (or IPL)
 function call. If error detected, control will be transferred to the exit
 label.
 */
// #define CV_CHECK()
// {
//     if( cvGetErrStatus() < 0 )
//         CV_ERROR( CV_StsBackTrace, "Inner function failed." );
// }


/**
 CV_CALL macro calls CV (or IPL) function, checks error status and
 signals a error if the function failed. Useful in "parent node"
 error procesing mode
 */
// #define CV_CALL( Func )
// {
//     Func;
//     CV_CHECK();
// }


/** Runtime assertion macro */
// #define CV_ASSERT( Condition )
// {
//     if( !(Condition) )
//         CV_ERROR( CV_StsInternal, "Assertion: " #Condition " failed" );
// }

// #define __CV_BEGIN__       {
// #define __CV_END__         goto exit; exit: ; }
// #define __CV_EXIT__        goto exit

/** \} core_c */

// #ifdef __cplusplus // extern "C"
// #endif

// #ifdef __cplusplus

/** \addtogroup core_c_glue
 *  \{
 <p>
 *  class for automatic module/RTTI data registration/unregistration */
@NoOffset public static class CvType extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvType(Pointer p) { super(p); }

    public CvType( @Cast("const char*") BytePointer type_name,
                CvIsInstanceFunc is_instance, CvReleaseFunc release/*=0*/,
                CvReadFunc read/*=0*/, CvWriteFunc write/*=0*/, CvCloneFunc clone/*=0*/ ) { super((Pointer)null); allocate(type_name, is_instance, release, read, write, clone); }
    private native void allocate( @Cast("const char*") BytePointer type_name,
                CvIsInstanceFunc is_instance, CvReleaseFunc release/*=0*/,
                CvReadFunc read/*=0*/, CvWriteFunc write/*=0*/, CvCloneFunc clone/*=0*/ );
    public CvType( @Cast("const char*") BytePointer type_name,
                CvIsInstanceFunc is_instance ) { super((Pointer)null); allocate(type_name, is_instance); }
    private native void allocate( @Cast("const char*") BytePointer type_name,
                CvIsInstanceFunc is_instance );
    public CvType( String type_name,
                CvIsInstanceFunc is_instance, CvReleaseFunc release/*=0*/,
                CvReadFunc read/*=0*/, CvWriteFunc write/*=0*/, CvCloneFunc clone/*=0*/ ) { super((Pointer)null); allocate(type_name, is_instance, release, read, write, clone); }
    private native void allocate( String type_name,
                CvIsInstanceFunc is_instance, CvReleaseFunc release/*=0*/,
                CvReadFunc read/*=0*/, CvWriteFunc write/*=0*/, CvCloneFunc clone/*=0*/ );
    public CvType( String type_name,
                CvIsInstanceFunc is_instance ) { super((Pointer)null); allocate(type_name, is_instance); }
    private native void allocate( String type_name,
                CvIsInstanceFunc is_instance );
    public native CvTypeInfo info(); public native CvType info(CvTypeInfo info);

    
    
}

/** \} */

// #include "opencv2/core/utility.hpp"

/** \addtogroup core_c_glue
 *  \{
<p>
/////////////////////////////////////////// glue ///////////////////////////////////////////
 <p>
 *  converts array (CvMat or IplImage) to cv::Mat */
@Namespace("cv") public static native @ByVal Mat cvarrToMat(@Const CvArr arr, @Cast("bool") boolean copyData/*=false*/,
                          @Cast("bool") boolean allowND/*=true*/, int coiMode/*=0*/,
                          @Cast("cv::AutoBuffer<double>*") Pointer buf/*=0*/);
@Namespace("cv") public static native @ByVal Mat cvarrToMat(@Const CvArr arr);

@Namespace("cv") public static native @ByVal Mat cvarrToMatND(@Const CvArr arr, @Cast("bool") boolean copyData/*=false*/, int coiMode/*=0*/);
@Namespace("cv") public static native @ByVal Mat cvarrToMatND(@Const CvArr arr);


/** extracts Channel of Interest from CvMat or IplImage and makes cv::Mat out of it. */
@Namespace("cv") public static native void extractImageCOI(@Const CvArr arr, @ByVal Mat coiimg, int coi/*=-1*/);
@Namespace("cv") public static native void extractImageCOI(@Const CvArr arr, @ByVal Mat coiimg);
/** inserts single-channel cv::Mat into a multi-channel CvMat or IplImage */
@Namespace("cv") public static native void insertImageCOI(@ByVal Mat coiimg, CvArr arr, int coi/*=-1*/);
@Namespace("cv") public static native void insertImageCOI(@ByVal Mat coiimg, CvArr arr);



////// specialized implementations of DefaultDeleter::operator() for classic OpenCV types //////







////////////// convenient wrappers for operating old-style dynamic structures //////////////

/**
 Template Sequence Class derived from CvSeq
 <p>
 The class provides more convenient access to sequence elements,
 STL-style operations and iterators.
 <p>
 \note The class is targeted for simple data types,
    i.e. no constructors or destructors
    are called for the sequence elements.
*/


/**
 STL-style Sequence Iterator inherited from the CvSeqReader structure
*/



// bridge C++ => C Seq API
@Namespace("cv") public static native @Cast("schar*") BytePointer seqPush( CvSeq seq, @Const Pointer element/*=0*/);
@Namespace("cv") public static native @Cast("schar*") BytePointer seqPush( CvSeq seq);
@Namespace("cv") public static native @Cast("schar*") BytePointer seqPushFront( CvSeq seq, @Const Pointer element/*=0*/);
@Namespace("cv") public static native @Cast("schar*") BytePointer seqPushFront( CvSeq seq);
@Namespace("cv") public static native void seqPop( CvSeq seq, Pointer element/*=0*/);
@Namespace("cv") public static native void seqPop( CvSeq seq);
@Namespace("cv") public static native void seqPopFront( CvSeq seq, Pointer element/*=0*/);
@Namespace("cv") public static native void seqPopFront( CvSeq seq);

@Namespace("cv") public static native void seqRemove( CvSeq seq, int index );
@Namespace("cv") public static native void clearSeq( CvSeq seq );
@Namespace("cv") public static native @Cast("schar*") BytePointer getSeqElem( @Const CvSeq seq, int index );
@Namespace("cv") public static native void seqRemoveSlice( CvSeq seq, @ByVal CvSlice slice );
@Namespace("cv") public static native void seqInsertSlice( CvSeq seq, int before_index, @Const CvArr from_arr );


























































































/** \} */

 // cv

// #endif

// #endif


// Parsed from <opencv2/core/types.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_CORE_TYPES_HPP__
// #define __OPENCV_CORE_TYPES_HPP__

// #ifndef __cplusplus
// #endif

// #include <climits>
// #include <cfloat>
// #include <vector>

// #include "opencv2/core/cvdef.h"
// #include "opencv2/core/cvstd.hpp"
// #include "opencv2/core/matx.hpp"

/** \addtogroup core_basic
 *  \{
<p>
//////////////////////////////// Complex //////////////////////////////
<p>
/** \brief  A complex number class.
  <p>
  The template class is similar and compatible with std::complex, however it provides slightly
  more convenient access to the real and imaginary parts using through the simple field access, as opposite
  to std::complex::real() and std::complex::imag().
*/



//////////////////////////////// Point_ ////////////////////////////////

/** \brief Template class for 2D points specified by its coordinates {@code x} and {@code y}.
<p>
An instance of the class is interchangeable with C structures, CvPoint and CvPoint2D32f . There is
also a cast operator to convert point coordinates to the specified type. The conversion from
floating-point coordinates to integer coordinates is done by rounding. Commonly, the conversion
uses this operation for each of the coordinates. Besides the class members listed in the
declaration above, the following operations on points are implemented:
<pre>{@code
    pt1 = pt2 + pt3;
    pt1 = pt2 - pt3;
    pt1 = pt2 * a;
    pt1 = a * pt2;
    pt1 = pt2 / a;
    pt1 += pt2;
    pt1 -= pt2;
    pt1 *= a;
    pt1 /= a;
    double value = norm(pt); // L2 norm
    pt1 == pt2;
    pt1 != pt2;
}</pre>
For your convenience, the following type aliases are defined:
<pre>{@code
    typedef Point_<int> Point2i;
    typedef Point2i Point;
    typedef Point_<float> Point2f;
    typedef Point_<double> Point2d;
}</pre>
Example:
<pre>{@code
    Point2f a(0.3f, 0.f), b(0.f, 0.4f);
    Point pt = (a + b)*10.f;
    cout << pt.x << ", " << pt.y << endl;
}</pre>
*/
@Name("cv::Point_<int>") @NoOffset public static class Point extends IntPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Point(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Point position(int position) {
        return (Point)super.position(position);
    }


    // various constructors
    public Point() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point(int _x, int _y) { super((Pointer)null); allocate(_x, _y); }
    private native void allocate(int _x, int _y);
    public Point(@Const @ByRef Point pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point pt);
    public Point(@Const @ByRef Size sz) { super((Pointer)null); allocate(sz); }
    private native void allocate(@Const @ByRef Size sz);

    public native @ByRef @Name("operator =") Point put(@Const @ByRef Point pt);
    /** conversion to another data type */

    /** conversion to the old-style C structures */

    /** dot product */
    public native int dot(@Const @ByRef Point pt);
    /** dot product computed in double-precision arithmetics */
    public native double ddot(@Const @ByRef Point pt);
    /** cross-product */
    public native double cross(@Const @ByRef Point pt);
    /** checks whether the point is inside the specified rectangle */
    public native @Cast("bool") boolean inside(@Const @ByRef Rect r);

    public native int x(); public native Point x(int x);
    public native int y(); public native Point y(int y); //< the point coordinates
}
@Name("cv::Point_<float>") @NoOffset public static class Point2f extends FloatPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point2f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Point2f(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Point2f position(int position) {
        return (Point2f)super.position(position);
    }


    // various constructors
    public Point2f() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point2f(float _x, float _y) { super((Pointer)null); allocate(_x, _y); }
    private native void allocate(float _x, float _y);
    public Point2f(@Const @ByRef Point2f pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point2f pt);
    public Point2f(@Const @ByRef Size2f sz) { super((Pointer)null); allocate(sz); }
    private native void allocate(@Const @ByRef Size2f sz);

    public native @ByRef @Name("operator =") Point2f put(@Const @ByRef Point2f pt);
    /** conversion to another data type */

    /** conversion to the old-style C structures */

    /** dot product */
    public native float dot(@Const @ByRef Point2f pt);
    /** dot product computed in double-precision arithmetics */
    public native double ddot(@Const @ByRef Point2f pt);
    /** cross-product */
    public native double cross(@Const @ByRef Point2f pt);
    /** checks whether the point is inside the specified rectangle */
    public native @Cast("bool") boolean inside(@Const @ByRef Rectf r);

    public native float x(); public native Point2f x(float x);
    public native float y(); public native Point2f y(float y); //< the point coordinates
}
@Name("cv::Point_<double>") @NoOffset public static class Point2d extends DoublePointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point2d(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Point2d(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Point2d position(int position) {
        return (Point2d)super.position(position);
    }


    // various constructors
    public Point2d() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point2d(double _x, double _y) { super((Pointer)null); allocate(_x, _y); }
    private native void allocate(double _x, double _y);
    public Point2d(@Const @ByRef Point2d pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point2d pt);
    public Point2d(@Const @ByRef Size2d sz) { super((Pointer)null); allocate(sz); }
    private native void allocate(@Const @ByRef Size2d sz);

    public native @ByRef @Name("operator =") Point2d put(@Const @ByRef Point2d pt);
    /** conversion to another data type */

    /** conversion to the old-style C structures */

    /** dot product */
    public native double dot(@Const @ByRef Point2d pt);
    /** dot product computed in double-precision arithmetics */
    public native double ddot(@Const @ByRef Point2d pt);
    /** cross-product */
    public native double cross(@Const @ByRef Point2d pt);
    /** checks whether the point is inside the specified rectangle */
    public native @Cast("bool") boolean inside(@Const @ByRef Rectd r);

    public native double x(); public native Point2d x(double x);
    public native double y(); public native Point2d y(double y); //< the point coordinates
}



//////////////////////////////// Point3_ ////////////////////////////////

/** \brief Template class for 3D points specified by its coordinates {@code x}, {@code y} and {@code z}.
<p>
An instance of the class is interchangeable with the C structure CvPoint2D32f . Similarly to
Point_ , the coordinates of 3D points can be converted to another type. The vector arithmetic and
comparison operations are also supported.
<p>
The following Point3_\<\> aliases are available:
<pre>{@code
    typedef Point3_<int> Point3i;
    typedef Point3_<float> Point3f;
    typedef Point3_<double> Point3d;
}</pre>
@see cv::Point3i, cv::Point3f and cv::Point3d
*/
@Name("cv::Point3_<int>") @NoOffset public static class Point3i extends IntPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point3i(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Point3i(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Point3i position(int position) {
        return (Point3i)super.position(position);
    }


    // various constructors
    public Point3i() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point3i(int _x, int _y, int _z) { super((Pointer)null); allocate(_x, _y, _z); }
    private native void allocate(int _x, int _y, int _z);
    public Point3i(@Const @ByRef Point3i pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point3i pt);
    public Point3i(@Const @ByRef Point pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point pt);

    public native @ByRef @Name("operator =") Point3i put(@Const @ByRef Point3i pt);
    /** conversion to another data type */
    /** conversion to cv::Vec<> */

    /** dot product */
    public native int dot(@Const @ByRef Point3i pt);
    /** dot product computed in double-precision arithmetics */
    public native double ddot(@Const @ByRef Point3i pt);
    /** cross product of the 2 3D points */
    public native @ByVal Point3i cross(@Const @ByRef Point3i pt);

    public native int x(); public native Point3i x(int x);
    public native int y(); public native Point3i y(int y);
    public native int z(); public native Point3i z(int z); //< the point coordinates
}
@Name("cv::Point3_<float>") @NoOffset public static class Point3f extends FloatPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point3f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Point3f(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Point3f position(int position) {
        return (Point3f)super.position(position);
    }


    // various constructors
    public Point3f() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point3f(float _x, float _y, float _z) { super((Pointer)null); allocate(_x, _y, _z); }
    private native void allocate(float _x, float _y, float _z);
    public Point3f(@Const @ByRef Point3f pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point3f pt);
    public Point3f(@Const @ByRef Point2f pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point2f pt);

    public native @ByRef @Name("operator =") Point3f put(@Const @ByRef Point3f pt);
    /** conversion to another data type */
    /** conversion to cv::Vec<> */

    /** dot product */
    public native float dot(@Const @ByRef Point3f pt);
    /** dot product computed in double-precision arithmetics */
    public native double ddot(@Const @ByRef Point3f pt);
    /** cross product of the 2 3D points */
    public native @ByVal Point3f cross(@Const @ByRef Point3f pt);

    public native float x(); public native Point3f x(float x);
    public native float y(); public native Point3f y(float y);
    public native float z(); public native Point3f z(float z); //< the point coordinates
}
@Name("cv::Point3_<double>") @NoOffset public static class Point3d extends DoublePointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point3d(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Point3d(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Point3d position(int position) {
        return (Point3d)super.position(position);
    }


    // various constructors
    public Point3d() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point3d(double _x, double _y, double _z) { super((Pointer)null); allocate(_x, _y, _z); }
    private native void allocate(double _x, double _y, double _z);
    public Point3d(@Const @ByRef Point3d pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point3d pt);
    public Point3d(@Const @ByRef Point2d pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point2d pt);

    public native @ByRef @Name("operator =") Point3d put(@Const @ByRef Point3d pt);
    /** conversion to another data type */
    /** conversion to cv::Vec<> */

    /** dot product */
    public native double dot(@Const @ByRef Point3d pt);
    /** dot product computed in double-precision arithmetics */
    public native double ddot(@Const @ByRef Point3d pt);
    /** cross product of the 2 3D points */
    public native @ByVal Point3d cross(@Const @ByRef Point3d pt);

    public native double x(); public native Point3d x(double x);
    public native double y(); public native Point3d y(double y);
    public native double z(); public native Point3d z(double z); //< the point coordinates
}



//////////////////////////////// Size_ ////////////////////////////////

/** \brief Template class for specifying the size of an image or rectangle.
<p>
The class includes two members called width and height. The structure can be converted to and from
the old OpenCV structures CvSize and CvSize2D32f . The same set of arithmetic and comparison
operations as for Point_ is available.
<p>
OpenCV defines the following Size_\<\> aliases:
<pre>{@code
    typedef Size_<int> Size2i;
    typedef Size2i Size;
    typedef Size_<float> Size2f;
}</pre>
*/
@Name("cv::Size_<int>") @NoOffset public static class Size extends IntPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Size(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Size(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Size position(int position) {
        return (Size)super.position(position);
    }


    /** various constructors */
    public Size() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Size(int _width, int _height) { super((Pointer)null); allocate(_width, _height); }
    private native void allocate(int _width, int _height);
    public Size(@Const @ByRef Size sz) { super((Pointer)null); allocate(sz); }
    private native void allocate(@Const @ByRef Size sz);
    public Size(@Const @ByRef Point pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point pt);

    public native @ByRef @Name("operator =") Size put(@Const @ByRef Size sz);
    /** the area (width*height) */
    public native int area();

    /** conversion of another data type. */

    public native int width(); public native Size width(int width);
    public native int height(); public native Size height(int height); // the width and the height
}
@Name("cv::Size_<float>") @NoOffset public static class Size2f extends FloatPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Size2f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Size2f(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Size2f position(int position) {
        return (Size2f)super.position(position);
    }


    /** various constructors */
    public Size2f() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Size2f(float _width, float _height) { super((Pointer)null); allocate(_width, _height); }
    private native void allocate(float _width, float _height);
    public Size2f(@Const @ByRef Size2f sz) { super((Pointer)null); allocate(sz); }
    private native void allocate(@Const @ByRef Size2f sz);
    public Size2f(@Const @ByRef Point2f pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point2f pt);

    public native @ByRef @Name("operator =") Size2f put(@Const @ByRef Size2f sz);
    /** the area (width*height) */
    public native float area();

    /** conversion of another data type. */

    public native float width(); public native Size2f width(float width);
    public native float height(); public native Size2f height(float height); // the width and the height
}
@Name("cv::Size_<double>") @NoOffset public static class Size2d extends DoublePointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Size2d(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Size2d(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Size2d position(int position) {
        return (Size2d)super.position(position);
    }


    /** various constructors */
    public Size2d() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Size2d(double _width, double _height) { super((Pointer)null); allocate(_width, _height); }
    private native void allocate(double _width, double _height);
    public Size2d(@Const @ByRef Size2d sz) { super((Pointer)null); allocate(sz); }
    private native void allocate(@Const @ByRef Size2d sz);
    public Size2d(@Const @ByRef Point2d pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point2d pt);

    public native @ByRef @Name("operator =") Size2d put(@Const @ByRef Size2d sz);
    /** the area (width*height) */
    public native double area();

    /** conversion of another data type. */

    public native double width(); public native Size2d width(double width);
    public native double height(); public native Size2d height(double height); // the width and the height
}



//////////////////////////////// Rect_ ////////////////////////////////

/** \brief Template class for 2D rectangles
<p>
described by the following parameters:
-   Coordinates of the top-left corner. This is a default interpretation of Rect_::x and Rect_::y
    in OpenCV. Though, in your algorithms you may count x and y from the bottom-left corner.
-   Rectangle width and height.
<p>
OpenCV typically assumes that the top and left boundary of the rectangle are inclusive, while the
right and bottom boundaries are not. For example, the method Rect_::contains returns true if
<p>
\f[x  \leq pt.x < x+width,
      y  \leq pt.y < y+height\f]
<p>
Virtually every loop over an image ROI in OpenCV (where ROI is specified by Rect_\<int\> ) is
implemented as:
<pre>{@code
    for(int y = roi.y; y < roi.y + roi.height; y++)
        for(int x = roi.x; x < roi.x + roi.width; x++)
        {
            // ...
        }
}</pre>
In addition to the class members, the following operations on rectangles are implemented:
-   \f$\texttt{rect} = \texttt{rect} \pm \texttt{point}\f$ (shifting a rectangle by a certain offset)
-   \f$\texttt{rect} = \texttt{rect} \pm \texttt{size}\f$ (expanding or shrinking a rectangle by a
    certain amount)
-   rect += point, rect -= point, rect += size, rect -= size (augmenting operations)
-   rect = rect1 & rect2 (rectangle intersection)
-   rect = rect1 | rect2 (minimum area rectangle containing rect1 and rect2 )
-   rect &= rect1, rect |= rect1 (and the corresponding augmenting operations)
-   rect == rect1, rect != rect1 (rectangle comparison)
<p>
This is an example how the partial ordering on rectangles can be established (rect1 \f$\subseteq\f$
rect2):
<pre>{@code
    template<typename _Tp> inline bool
    operator <= (const Rect_<_Tp>& r1, const Rect_<_Tp>& r2)
    {
        return (r1 & r2) == r1;
    }
}</pre>
For your convenience, the Rect_\<\> alias is available: cv::Rect
*/
@Name("cv::Rect_<int>") @NoOffset public static class Rect extends IntPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Rect(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Rect(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Rect position(int position) {
        return (Rect)super.position(position);
    }


    /** various constructors */
    public Rect() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Rect(int _x, int _y, int _width, int _height) { super((Pointer)null); allocate(_x, _y, _width, _height); }
    private native void allocate(int _x, int _y, int _width, int _height);
    public Rect(@Const @ByRef Rect r) { super((Pointer)null); allocate(r); }
    private native void allocate(@Const @ByRef Rect r);
    public Rect(@Const @ByRef Point org, @Const @ByRef Size sz) { super((Pointer)null); allocate(org, sz); }
    private native void allocate(@Const @ByRef Point org, @Const @ByRef Size sz);
    public Rect(@Const @ByRef Point pt1, @Const @ByRef Point pt2) { super((Pointer)null); allocate(pt1, pt2); }
    private native void allocate(@Const @ByRef Point pt1, @Const @ByRef Point pt2);

    public native @ByRef @Name("operator =") Rect put( @Const @ByRef Rect r );
    /** the top-left corner */
    public native @ByVal Point tl();
    /** the bottom-right corner */
    public native @ByVal Point br();

    /** size (width, height) of the rectangle */
    public native @ByVal Size size();
    /** area (width*height) of the rectangle */
    public native int area();

    /** conversion to another data type */

    /** checks whether the rectangle contains the point */
    public native @Cast("bool") boolean contains(@Const @ByRef Point pt);

    public native int x(); public native Rect x(int x);
    public native int y(); public native Rect y(int y);
    public native int width(); public native Rect width(int width);
    public native int height(); public native Rect height(int height); //< the top-left corner, as well as width and height of the rectangle
}
@Name("cv::Rect_<float>") @NoOffset public static class Rectf extends FloatPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Rectf(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Rectf(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Rectf position(int position) {
        return (Rectf)super.position(position);
    }


    /** various constructors */
    public Rectf() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Rectf(float _x, float _y, float _width, float _height) { super((Pointer)null); allocate(_x, _y, _width, _height); }
    private native void allocate(float _x, float _y, float _width, float _height);
    public Rectf(@Const @ByRef Rectf r) { super((Pointer)null); allocate(r); }
    private native void allocate(@Const @ByRef Rectf r);
    public Rectf(@Const @ByRef Point2f org, @Const @ByRef Size2f sz) { super((Pointer)null); allocate(org, sz); }
    private native void allocate(@Const @ByRef Point2f org, @Const @ByRef Size2f sz);
    public Rectf(@Const @ByRef Point2f pt1, @Const @ByRef Point2f pt2) { super((Pointer)null); allocate(pt1, pt2); }
    private native void allocate(@Const @ByRef Point2f pt1, @Const @ByRef Point2f pt2);

    public native @ByRef @Name("operator =") Rectf put( @Const @ByRef Rectf r );
    /** the top-left corner */
    public native @ByVal Point2f tl();
    /** the bottom-right corner */
    public native @ByVal Point2f br();

    /** size (width, height) of the rectangle */
    public native @ByVal Size2f size();
    /** area (width*height) of the rectangle */
    public native float area();

    /** conversion to another data type */

    /** checks whether the rectangle contains the point */
    public native @Cast("bool") boolean contains(@Const @ByRef Point2f pt);

    public native float x(); public native Rectf x(float x);
    public native float y(); public native Rectf y(float y);
    public native float width(); public native Rectf width(float width);
    public native float height(); public native Rectf height(float height); //< the top-left corner, as well as width and height of the rectangle
}
@Name("cv::Rect_<double>") @NoOffset public static class Rectd extends DoublePointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Rectd(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Rectd(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Rectd position(int position) {
        return (Rectd)super.position(position);
    }


    /** various constructors */
    public Rectd() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Rectd(double _x, double _y, double _width, double _height) { super((Pointer)null); allocate(_x, _y, _width, _height); }
    private native void allocate(double _x, double _y, double _width, double _height);
    public Rectd(@Const @ByRef Rectd r) { super((Pointer)null); allocate(r); }
    private native void allocate(@Const @ByRef Rectd r);
    public Rectd(@Const @ByRef Point2d org, @Const @ByRef Size2d sz) { super((Pointer)null); allocate(org, sz); }
    private native void allocate(@Const @ByRef Point2d org, @Const @ByRef Size2d sz);
    public Rectd(@Const @ByRef Point2d pt1, @Const @ByRef Point2d pt2) { super((Pointer)null); allocate(pt1, pt2); }
    private native void allocate(@Const @ByRef Point2d pt1, @Const @ByRef Point2d pt2);

    public native @ByRef @Name("operator =") Rectd put( @Const @ByRef Rectd r );
    /** the top-left corner */
    public native @ByVal Point2d tl();
    /** the bottom-right corner */
    public native @ByVal Point2d br();

    /** size (width, height) of the rectangle */
    public native @ByVal Size2d size();
    /** area (width*height) of the rectangle */
    public native double area();

    /** conversion to another data type */

    /** checks whether the rectangle contains the point */
    public native @Cast("bool") boolean contains(@Const @ByRef Point2d pt);

    public native double x(); public native Rectd x(double x);
    public native double y(); public native Rectd y(double y);
    public native double width(); public native Rectd width(double width);
    public native double height(); public native Rectd height(double height); //< the top-left corner, as well as width and height of the rectangle
}



///////////////////////////// RotatedRect /////////////////////////////

/** \brief The class represents rotated (i.e. not up-right) rectangles on a plane.
<p>
Each rectangle is specified by the center point (mass center), length of each side (represented by
cv::Size2f structure) and the rotation angle in degrees.
<p>
The sample below demonstrates how to use RotatedRect:
<pre>{@code
    Mat image(200, 200, CV_8UC3, Scalar(0));
    RotatedRect rRect = RotatedRect(Point2f(100,100), Size2f(100,50), 30);

    Point2f vertices[4];
    rRect.points(vertices);
    for (int i = 0; i < 4; i++)
        line(image, vertices[i], vertices[(i+1)%4], Scalar(0,255,0));

    Rect brect = rRect.boundingRect();
    rectangle(image, brect, Scalar(255,0,0));

    imshow("rectangles", image);
    waitKey(0);
}</pre>
![image](pics/rotatedrect.png)
<p>
\sa CamShift, fitEllipse, minAreaRect, CvBox2D
*/
@Namespace("cv") @NoOffset public static class RotatedRect extends FloatPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RotatedRect(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public RotatedRect(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public RotatedRect position(int position) {
        return (RotatedRect)super.position(position);
    }

    /** various constructors */
    public RotatedRect() { super((Pointer)null); allocate(); }
    private native void allocate();
    /**
    @param center The rectangle mass center.
    @param size Width and height of the rectangle.
    @param angle The rotation angle in a clockwise direction. When the angle is 0, 90, 180, 270 etc.,
    the rectangle becomes an up-right rectangle.
    */
    public RotatedRect(@Const @ByRef Point2f center, @Const @ByRef Size2f size, float angle) { super((Pointer)null); allocate(center, size, angle); }
    private native void allocate(@Const @ByRef Point2f center, @Const @ByRef Size2f size, float angle);
    /**
    Any 3 end points of the RotatedRect. They must be given in order (either clockwise or
    anticlockwise).
     */
    public RotatedRect(@Const @ByRef Point2f point1, @Const @ByRef Point2f point2, @Const @ByRef Point2f point3) { super((Pointer)null); allocate(point1, point2, point3); }
    private native void allocate(@Const @ByRef Point2f point1, @Const @ByRef Point2f point2, @Const @ByRef Point2f point3);

    /** returns 4 vertices of the rectangle
    @param pts The points array for storing rectangle vertices.
    */
    public native void points(Point2f pts);
    /** returns the minimal up-right rectangle containing the rotated rectangle */
    public native @ByVal Rect boundingRect();

    public native @ByRef Point2f center(); public native RotatedRect center(Point2f center); //< the rectangle mass center
    public native @ByRef Size2f size(); public native RotatedRect size(Size2f size);    //< width and height of the rectangle
    public native float angle(); public native RotatedRect angle(float angle);    //< the rotation angle. When the angle is 0, 90, 180, 270 etc., the rectangle becomes an up-right rectangle.
}



//////////////////////////////// Range /////////////////////////////////

/** \brief Template class specifying a continuous subsequence (slice) of a sequence.
<p>
The class is used to specify a row or a column span in a matrix ( Mat ) and for many other purposes.
Range(a,b) is basically the same as a:b in Matlab or a..b in Python. As in Python, start is an
inclusive left boundary of the range and end is an exclusive right boundary of the range. Such a
half-opened interval is usually denoted as \f$[start,end)\f$ .
<p>
The static method Range::all() returns a special variable that means "the whole sequence" or "the
whole range", just like " : " in Matlab or " ... " in Python. All the methods and functions in
OpenCV that take Range support this special Range::all() value. But, of course, in case of your own
custom processing, you will probably have to check and handle it explicitly:
<pre>{@code
    void my_function(..., const Range& r, ....)
    {
        if(r == Range::all()) {
            // process all the data
        }
        else {
            // process [r.start, r.end)
        }
    }
}</pre>
*/
@Namespace("cv") @NoOffset public static class Range extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Range(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Range(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Range position(int position) {
        return (Range)super.position(position);
    }

    public Range() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Range(int _start, int _end) { super((Pointer)null); allocate(_start, _end); }
    private native void allocate(int _start, int _end);
    public native int size();
    public native @Cast("bool") boolean empty();
    public static native @ByVal Range all();

    public native int start(); public native Range start(int start);
    public native int end(); public native Range end(int end);
}



//////////////////////////////// Scalar_ ///////////////////////////////

/** \brief Template class for a 4-element vector derived from Vec.
<p>
Being derived from Vec\<_Tp, 4\> , Scalar_ and Scalar can be used just as typical 4-element
vectors. In addition, they can be converted to/from CvScalar . The type Scalar is widely used in
OpenCV to pass pixel values.
*/
@Name("cv::Scalar_<double>") public static class Scalar extends AbstractScalar {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Scalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Scalar(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Scalar position(int position) {
        return (Scalar)super.position(position);
    }

    /** various constructors */
    public Scalar() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Scalar(double v0, double v1, double v2/*=0*/, double v3/*=0*/) { super((Pointer)null); allocate(v0, v1, v2, v3); }
    private native void allocate(double v0, double v1, double v2/*=0*/, double v3/*=0*/);
    public Scalar(double v0, double v1) { super((Pointer)null); allocate(v0, v1); }
    private native void allocate(double v0, double v1);
    public Scalar(double v0) { super((Pointer)null); allocate(v0); }
    private native void allocate(double v0);

    /** returns a scalar with all elements set to v0 */
    public static native @ByVal Scalar all(double v0);

    /** conversion to another data type */

    /** per-element product */
    public native @ByVal Scalar mul(@Const @ByRef Scalar a, double scale/*=1*/ );
    public native @ByVal Scalar mul(@Const @ByRef Scalar a );

    // returns (v0, -v1, -v2, -v3)
    public native @ByVal Scalar conj();

    // returns true iff v1 == v2 == v3 == 0
    public native @Cast("bool") boolean isReal();
}
@Name("cv::Scalar_<int>") public static class Scalar4i extends IntPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Scalar4i(Pointer p) { super(p); }

    /** various constructors */
    public Scalar4i() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Scalar4i(int v0, int v1, int v2/*=0*/, int v3/*=0*/) { super((Pointer)null); allocate(v0, v1, v2, v3); }
    private native void allocate(int v0, int v1, int v2/*=0*/, int v3/*=0*/);
    public Scalar4i(int v0, int v1) { super((Pointer)null); allocate(v0, v1); }
    private native void allocate(int v0, int v1);
    public Scalar4i(int v0) { super((Pointer)null); allocate(v0); }
    private native void allocate(int v0);

    /** returns a scalar with all elements set to v0 */
    public static native @ByVal Scalar4i all(int v0);

    /** conversion to another data type */

    /** per-element product */
    public native @ByVal Scalar4i mul(@Const @ByRef Scalar4i a, double scale/*=1*/ );
    public native @ByVal Scalar4i mul(@Const @ByRef Scalar4i a );

    // returns (v0, -v1, -v2, -v3)
    public native @ByVal Scalar4i conj();

    // returns true iff v1 == v2 == v3 == 0
    public native @Cast("bool") boolean isReal();
}



/////////////////////////////// KeyPoint ////////////////////////////////

/** \brief Data structure for salient point detectors.
<p>
The class instance stores a keypoint, i.e. a point feature found by one of many available keypoint
detectors, such as Harris corner detector, cv::FAST, cv::StarDetector, cv::SURF, cv::SIFT,
cv::LDetector etc.
<p>
The keypoint is characterized by the 2D position, scale (proportional to the diameter of the
neighborhood that needs to be taken into account), orientation and some other parameters. The
keypoint neighborhood is then analyzed by another algorithm that builds a descriptor (usually
represented as a feature vector). The keypoints representing the same object in different images
can then be matched using cv::KDTree or another method.
*/
@Namespace("cv") @NoOffset public static class KeyPoint extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KeyPoint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public KeyPoint(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public KeyPoint position(int position) {
        return (KeyPoint)super.position(position);
    }

    /** the default constructor */
    public KeyPoint() { super((Pointer)null); allocate(); }
    private native void allocate();
    /**
    @param _pt x & y coordinates of the keypoint
    @param _size keypoint diameter
    @param _angle keypoint orientation
    @param _response keypoint detector response on the keypoint (that is, strength of the keypoint)
    @param _octave pyramid octave in which the keypoint has been detected
    @param _class_id object id
     */
    public KeyPoint(@ByVal Point2f _pt, float _size, float _angle/*=-1*/, float _response/*=0*/, int _octave/*=0*/, int _class_id/*=-1*/) { super((Pointer)null); allocate(_pt, _size, _angle, _response, _octave, _class_id); }
    private native void allocate(@ByVal Point2f _pt, float _size, float _angle/*=-1*/, float _response/*=0*/, int _octave/*=0*/, int _class_id/*=-1*/);
    public KeyPoint(@ByVal Point2f _pt, float _size) { super((Pointer)null); allocate(_pt, _size); }
    private native void allocate(@ByVal Point2f _pt, float _size);
    /**
    @param x x-coordinate of the keypoint
    @param y y-coordinate of the keypoint
    @param _size keypoint diameter
    @param _angle keypoint orientation
    @param _response keypoint detector response on the keypoint (that is, strength of the keypoint)
    @param _octave pyramid octave in which the keypoint has been detected
    @param _class_id object id
     */
    public KeyPoint(float x, float y, float _size, float _angle/*=-1*/, float _response/*=0*/, int _octave/*=0*/, int _class_id/*=-1*/) { super((Pointer)null); allocate(x, y, _size, _angle, _response, _octave, _class_id); }
    private native void allocate(float x, float y, float _size, float _angle/*=-1*/, float _response/*=0*/, int _octave/*=0*/, int _class_id/*=-1*/);
    public KeyPoint(float x, float y, float _size) { super((Pointer)null); allocate(x, y, _size); }
    private native void allocate(float x, float y, float _size);

    public native @Cast("size_t") long hash();

    /**
    This method converts vector of keypoints to vector of points or the reverse, where each keypoint is
    assigned the same size and the same orientation.
    <p>
    @param keypoints Keypoints obtained from any feature detection algorithm like SIFT/SURF/ORB
    @param points2f Array of (x,y) coordinates of each keypoint
    @param keypointIndexes Array of indexes of keypoints to be converted to points. (Acts like a mask to
    convert only specified keypoints)
    */
    public static native void convert(@Const @ByRef KeyPointVector keypoints,
                                    @ByRef Point2fVector points2f,
                                    @StdVector IntPointer keypointIndexes/*=std::vector<int>()*/);
    public static native void convert(@Const @ByRef KeyPointVector keypoints,
                                    @ByRef Point2fVector points2f);
    public static native void convert(@Const @ByRef KeyPointVector keypoints,
                                    @ByRef Point2fVector points2f,
                                    @StdVector IntBuffer keypointIndexes/*=std::vector<int>()*/);
    public static native void convert(@Const @ByRef KeyPointVector keypoints,
                                    @ByRef Point2fVector points2f,
                                    @StdVector int[] keypointIndexes/*=std::vector<int>()*/);
    /** \overload
    @param points2f Array of (x,y) coordinates of each keypoint
    @param keypoints Keypoints obtained from any feature detection algorithm like SIFT/SURF/ORB
    @param size keypoint diameter
    @param response keypoint detector response on the keypoint (that is, strength of the keypoint)
    @param octave pyramid octave in which the keypoint has been detected
    @param class_id object id
    */
    public static native void convert(@Const @ByRef Point2fVector points2f,
                                    @ByRef KeyPointVector keypoints,
                                    float size/*=1*/, float response/*=1*/, int octave/*=0*/, int class_id/*=-1*/);
    public static native void convert(@Const @ByRef Point2fVector points2f,
                                    @ByRef KeyPointVector keypoints);

    /**
    This method computes overlap for pair of keypoints. Overlap is the ratio between area of keypoint
    regions' intersection and area of keypoint regions' union (considering keypoint region as circle).
    If they don't overlap, we get zero. If they coincide at same location with same size, we get 1.
    @param kp1 First keypoint
    @param kp2 Second keypoint
    */
    public static native float overlap(@Const @ByRef KeyPoint kp1, @Const @ByRef KeyPoint kp2);

    /** coordinates of the keypoints */
    public native @ByRef Point2f pt(); public native KeyPoint pt(Point2f pt);
    /** diameter of the meaningful keypoint neighborhood */
    public native float size(); public native KeyPoint size(float size);
    /** computed orientation of the keypoint (-1 if not applicable);
     *  it's in [0,360) degrees and measured relative to
     *  image coordinate system, ie in clockwise. */
    public native float angle(); public native KeyPoint angle(float angle);
    /** the response by which the most strong keypoints have been selected. Can be used for the further sorting or subsampling */
    public native float response(); public native KeyPoint response(float response);
    /** octave (pyramid layer) from which the keypoint has been extracted */
    public native int octave(); public native KeyPoint octave(int octave);
    /** object class (if the keypoints need to be clustered by an object they belong to) */
    public native int class_id(); public native KeyPoint class_id(int class_id);
}



//////////////////////////////// DMatch /////////////////////////////////

/** \brief Class for matching keypoint descriptors
<p>
query descriptor index, train descriptor index, train image index, and distance between
descriptors.
*/
@Namespace("cv") @NoOffset public static class DMatch extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DMatch(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public DMatch(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public DMatch position(int position) {
        return (DMatch)super.position(position);
    }

    public DMatch() { super((Pointer)null); allocate(); }
    private native void allocate();
    public DMatch(int _queryIdx, int _trainIdx, float _distance) { super((Pointer)null); allocate(_queryIdx, _trainIdx, _distance); }
    private native void allocate(int _queryIdx, int _trainIdx, float _distance);
    public DMatch(int _queryIdx, int _trainIdx, int _imgIdx, float _distance) { super((Pointer)null); allocate(_queryIdx, _trainIdx, _imgIdx, _distance); }
    private native void allocate(int _queryIdx, int _trainIdx, int _imgIdx, float _distance);

    public native int queryIdx(); public native DMatch queryIdx(int queryIdx); // query descriptor index
    public native int trainIdx(); public native DMatch trainIdx(int trainIdx); // train descriptor index
    public native int imgIdx(); public native DMatch imgIdx(int imgIdx);   // train image index

    public native float distance(); public native DMatch distance(float distance);

    // less is better
    public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef DMatch m);
}



///////////////////////////// TermCriteria //////////////////////////////

/** \brief The class defining termination criteria for iterative algorithms.
<p>
You can initialize it by default constructor and then override any parameters, or the structure may
be fully initialized using the advanced variant of the constructor.
*/
@Namespace("cv") @NoOffset public static class TermCriteria extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TermCriteria(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public TermCriteria(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public TermCriteria position(int position) {
        return (TermCriteria)super.position(position);
    }

    /**
      Criteria type, can be one of: COUNT, EPS or COUNT + EPS
    */
    /** enum cv::TermCriteria::Type */
    public static final int
        /** the maximum number of iterations or elements to compute */
        COUNT= 1,
        /** ditto */
        MAX_ITER= COUNT,
        /** the desired accuracy or change in parameters at which the iterative algorithm stops */
        EPS= 2;

    /** default constructor */
    public TermCriteria() { super((Pointer)null); allocate(); }
    private native void allocate();
    /**
    @param type The type of termination criteria, one of TermCriteria::Type
    @param maxCount The maximum number of iterations or elements to compute.
    @param epsilon The desired accuracy or change in parameters at which the iterative algorithm stops.
    */
    public TermCriteria(int type, int maxCount, double epsilon) { super((Pointer)null); allocate(type, maxCount, epsilon); }
    private native void allocate(int type, int maxCount, double epsilon);

    /** the type of termination criteria: COUNT, EPS or COUNT + EPS */
    public native int type(); public native TermCriteria type(int type);
    public native int maxCount(); public native TermCriteria maxCount(int maxCount); // the maximum number of iterations/elements
    public native double epsilon(); public native TermCriteria epsilon(double epsilon); // the desired accuracy
}


/** \} core_basic
<p>
///////////////////////// raster image moments //////////////////////////
 <p>
 *  \addtogroup imgproc_shape
 *  \{
<p>
/** \brief struct returned by cv::moments
<p>
The spatial moments \f$\texttt{Moments::m}_{ji}\f$ are computed as:
<p>
\f[\texttt{m} _{ji}= \sum _{x,y}  \left ( \texttt{array} (x,y)  \cdot x^j  \cdot y^i \right )\f]
<p>
The central moments \f$\texttt{Moments::mu}_{ji}\f$ are computed as:
<p>
\f[\texttt{mu} _{ji}= \sum _{x,y}  \left ( \texttt{array} (x,y)  \cdot (x -  \bar{x} )^j  \cdot (y -  \bar{y} )^i \right )\f]
<p>
where \f$(\bar{x}, \bar{y})\f$ is the mass center:
<p>
\f[\bar{x} = \frac{\texttt{m}_{10}}{\texttt{m}_{00}} , \; \bar{y} = \frac{\texttt{m}_{01}}{\texttt{m}_{00}}\f]
<p>
The normalized central moments \f$\texttt{Moments::nu}_{ij}\f$ are computed as:
<p>
\f[\texttt{nu} _{ji}= \frac{\texttt{mu}_{ji}}{\texttt{m}_{00}^{(i+j)/2+1}} .\f]
<p>
\note
\f$\texttt{mu}_{00}=\texttt{m}_{00}\f$, \f$\texttt{nu}_{00}=1\f$
\f$\texttt{nu}_{10}=\texttt{mu}_{10}=\texttt{mu}_{01}=\texttt{mu}_{10}=0\f$ , hence the values are not
stored.
<p>
The moments of a contour are defined in the same way but computed using the Green's formula (see
<http://en.wikipedia.org/wiki/Green_theorem>). So, due to a limited raster resolution, the moments
computed for a contour are slightly different from the moments computed for the same rasterized
contour.
<p>
\note
Since the contour moments are computed using Green formula, you may get seemingly odd results for
contours with self-intersections, e.g. a zero area (m00) for butterfly-shaped contours.
 */
@Namespace("cv") @NoOffset public static class Moments extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Moments(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Moments(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Moments position(int position) {
        return (Moments)super.position(position);
    }

    /** the default constructor */
    public Moments() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** the full constructor */
    public Moments(double m00, double m10, double m01, double m20, double m11,
                double m02, double m30, double m21, double m12, double m03 ) { super((Pointer)null); allocate(m00, m10, m01, m20, m11, m02, m30, m21, m12, m03); }
    private native void allocate(double m00, double m10, double m01, double m20, double m11,
                double m02, double m30, double m21, double m12, double m03 );
    ////! the conversion from CvMoments
    //Moments( const CvMoments& moments );
    ////! the conversion to CvMoments
    //operator CvMoments() const;

    /** \name spatial moments
     *  \{ */
    public native double m00(); public native Moments m00(double m00);
    public native double m10(); public native Moments m10(double m10);
    public native double m01(); public native Moments m01(double m01);
    public native double m20(); public native Moments m20(double m20);
    public native double m11(); public native Moments m11(double m11);
    public native double m02(); public native Moments m02(double m02);
    public native double m30(); public native Moments m30(double m30);
    public native double m21(); public native Moments m21(double m21);
    public native double m12(); public native Moments m12(double m12);
    public native double m03(); public native Moments m03(double m03);
    /** \}
     <p>
     *  \name central moments
     *  \{ */
    public native double mu20(); public native Moments mu20(double mu20);
    public native double mu11(); public native Moments mu11(double mu11);
    public native double mu02(); public native Moments mu02(double mu02);
    public native double mu30(); public native Moments mu30(double mu30);
    public native double mu21(); public native Moments mu21(double mu21);
    public native double mu12(); public native Moments mu12(double mu12);
    public native double mu03(); public native Moments mu03(double mu03);
    /** \}
     <p>
     *  \name central normalized moments
     *  \{ */
    public native double nu20(); public native Moments nu20(double nu20);
    public native double nu11(); public native Moments nu11(double nu11);
    public native double nu02(); public native Moments nu02(double nu02);
    public native double nu30(); public native Moments nu30(double nu30);
    public native double nu21(); public native Moments nu21(double nu21);
    public native double nu12(); public native Moments nu12(double nu12);
    public native double nu03(); public native Moments nu03(double nu03);
    /** \} */
}

/** \} imgproc_shape
 <p>
 *  \cond IGNORED
<p>
/////////////////////////////////////////////////////////////////////////
///////////////////////////// Implementation ////////////////////////////
/////////////////////////////////////////////////////////////////////////
<p>
//////////////////////////////// Complex //////////////////////////////// */











//////////////////////////////// 2D Point ///////////////////////////////



























//////////////////////////////// 3D Point ///////////////////////////////

























////////////////////////////////// Size /////////////////////////////////

















////////////////////////////////// Rect /////////////////////////////////



























////////////////////////////// RotatedRect //////////////////////////////







///////////////////////////////// Range /////////////////////////////////












@Namespace("cv") public static native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Range r1, @Const @ByRef Range r2);

@Namespace("cv") public static native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef Range r1, @Const @ByRef Range r2);

@Namespace("cv") public static native @Cast("bool") @Name("operator !") boolean not(@Const @ByRef Range r);

@Namespace("cv") public static native @ByVal @Name("operator &") Range and(@Const @ByRef Range r1, @Const @ByRef Range r2);

@Namespace("cv") public static native @ByRef @Name("operator &=") Range andPut(@ByRef Range r1, @Const @ByRef Range r2);

@Namespace("cv") public static native @ByVal @Name("operator +") Range add(@Const @ByRef Range r1, int delta);

@Namespace("cv") public static native @ByVal @Name("operator +") Range add(int delta, @Const @ByRef Range r1);

@Namespace("cv") public static native @ByVal @Name("operator -") Range subtract(@Const @ByRef Range r1, int delta);



///////////////////////////////// Scalar ////////////////////////////////























//////////////////////////////// KeyPoint ///////////////////////////////









///////////////////////////////// DMatch ////////////////////////////////











////////////////////////////// TermCriteria /////////////////////////////





/** \endcond */

 // cv

// #endif //__OPENCV_CORE_TYPES_HPP__


// Parsed from <opencv2/core.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2015, Intel Corporation, all rights reserved.
// Copyright (C) 2009-2011, Willow Garage Inc., all rights reserved.
// Copyright (C) 2015, OpenCV Foundation, all rights reserved.
// Copyright (C) 2015, Itseez Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_CORE_HPP__
// #define __OPENCV_CORE_HPP__

// #ifndef __cplusplus
// #endif

// #include "opencv2/core/cvdef.h"
// #include "opencv2/core/version.hpp"
// #include "opencv2/core/base.hpp"
// #include "opencv2/core/cvstd.hpp"
// #include "opencv2/core/traits.hpp"
// #include "opencv2/core/matx.hpp"
// #include "opencv2/core/types.hpp"
// #include "opencv2/core/mat.hpp"
// #include "opencv2/core/persistence.hpp"

/**
\defgroup core Core functionality
\{
    \defgroup core_basic Basic structures
    \defgroup core_c C structures and operations
    \{
        \defgroup core_c_glue Connections with C++
    \}
    \defgroup core_array Operations on arrays
    \defgroup core_xml XML/YAML Persistence
    \defgroup core_cluster Clustering
    \defgroup core_utils Utility and system functions and macros
    \{
        \defgroup core_utils_sse SSE utilities
        \defgroup core_utils_neon NEON utilities
    \}
    \defgroup core_opengl OpenGL interoperability
    \defgroup core_ipp Intel IPP Asynchronous C/C++ Converters
    \defgroup core_optim Optimization Algorithms
    \defgroup core_directx DirectX interoperability
    \defgroup core_eigen Eigen support
    \defgroup core_opencl OpenCL support
    \defgroup core_va_intel Intel VA-API/OpenCL (CL-VA) interoperability
    \defgroup core_hal Hardware Acceleration Layer
    \{
        \defgroup core_hal_functions Functions
        \defgroup core_hal_interface Interface
        \defgroup core_hal_intrin Universal intrinsics
        \{
            \defgroup core_hal_intrin_impl Private implementation helpers
        \}
    \}
\}
 */

/** \addtogroup core_utils
 *  \{
<p>
/** \brief Class passed to an error.
<p>
This class encapsulates all or almost all necessary
information about the error happened in the program. The exception is
usually constructed and thrown implicitly via CV_Error and CV_Error_ macros.
@see error
 */

/** \brief Signals an error and raises the exception.
<p>
By default the function prints information about the error to stderr,
then it either stops if cv::setBreakOnError() had been called before or raises the exception.
It is possible to alternate error processing by using cv::redirectError().
@param exc the exception raisen.
@deprecated drop this version
 */

/** enum cv::SortFlags */
public static final int /** each matrix row is sorted independently */
 SORT_EVERY_ROW    = 0,
                 /** each matrix column is sorted
 *  independently; this flag and the previous one are
 *  mutually exclusive. */
                 SORT_EVERY_COLUMN = 1,
                 /** each matrix row is sorted in the ascending
 *  order. */
                 SORT_ASCENDING    = 0,
                 /** each matrix row is sorted in the
 *  descending order; this flag and the previous one are also
 *  mutually exclusive. */
                 SORT_DESCENDING   = 16;

/** \} core_utils
 <p>
 *  \addtogroup core
 *  \{
 <p>
 *  Covariation flags */
/** enum cv::CovarFlags */
public static final int
    /** The output covariance matrix is calculated as:
       \f[\texttt{scale}   \cdot  [  \texttt{vects}  [0]-  \texttt{mean}  , \texttt{vects}  [1]-  \texttt{mean}  ,...]^T  \cdot  [ \texttt{vects}  [0]- \texttt{mean}  , \texttt{vects}  [1]- \texttt{mean}  ,...],\f]
       The covariance matrix will be nsamples x nsamples. Such an unusual covariance matrix is used
       for fast PCA of a set of very large vectors (see, for example, the EigenFaces technique for
       face recognition). Eigenvalues of this "scrambled" matrix match the eigenvalues of the true
       covariance matrix. The "true" eigenvectors can be easily calculated from the eigenvectors of
       the "scrambled" covariance matrix. */
    COVAR_SCRAMBLED = 0,
    /**The output covariance matrix is calculated as:
        \f[\texttt{scale}   \cdot  [  \texttt{vects}  [0]-  \texttt{mean}  , \texttt{vects}  [1]-  \texttt{mean}  ,...]  \cdot  [ \texttt{vects}  [0]- \texttt{mean}  , \texttt{vects}  [1]- \texttt{mean}  ,...]^T,\f]
        covar will be a square matrix of the same size as the total number of elements in each input
        vector. One and only one of COVAR_SCRAMBLED and COVAR_NORMAL must be specified.*/
    COVAR_NORMAL    = 1,
    /** If the flag is specified, the function does not calculate mean from
        the input vectors but, instead, uses the passed mean vector. This is useful if mean has been
        pre-calculated or known in advance, or if the covariance matrix is calculated by parts. In
        this case, mean is not a mean vector of the input sub-set of vectors but rather the mean
        vector of the whole set.*/
    COVAR_USE_AVG   = 2,
    /** If the flag is specified, the covariance matrix is scaled. In the
        "normal" mode, scale is 1./nsamples . In the "scrambled" mode, scale is the reciprocal of the
        total number of elements in each input vector. By default (if the flag is not specified), the
        covariance matrix is not scaled ( scale=1 ).*/
    COVAR_SCALE     = 4,
    /** If the flag is
        specified, all the input vectors are stored as rows of the samples matrix. mean should be a
        single-row vector in this case.*/
    COVAR_ROWS      = 8,
    /** If the flag is
        specified, all the input vectors are stored as columns of the samples matrix. mean should be a
        single-column vector in this case.*/
    COVAR_COLS      = 16;

/** k-Means flags */
/** enum cv::KmeansFlags */
public static final int
    /** Select random initial centers in each attempt.*/
    KMEANS_RANDOM_CENTERS     = 0,
    /** Use kmeans++ center initialization by Arthur and Vassilvitskii [Arthur2007].*/
    KMEANS_PP_CENTERS         = 2,
    /** During the first (and possibly the only) attempt, use the
        user-supplied labels instead of computing them from the initial centers. For the second and
        further attempts, use the random or semi-random centers. Use one of KMEANS_\*_CENTERS flag
        to specify the exact method.*/
    KMEANS_USE_INITIAL_LABELS = 1;

/** type of line */
/** enum cv::LineTypes */
public static final int
    FILLED  = -1,
    /** 4-connected line */
    LINE_4  = 4,
    /** 8-connected line */
    LINE_8  = 8,
    /** antialiased line */
    LINE_AA = 16;

/** Only a subset of Hershey fonts
 *  <http://sources.isc.org/utils/misc/hershey-font.txt> are supported */
/** enum cv::HersheyFonts */
public static final int
    /** normal size sans-serif font */
    FONT_HERSHEY_SIMPLEX        = 0,
    /** small size sans-serif font */
    FONT_HERSHEY_PLAIN          = 1,
    /** normal size sans-serif font (more complex than FONT_HERSHEY_SIMPLEX) */
    FONT_HERSHEY_DUPLEX         = 2,
    /** normal size serif font */
    FONT_HERSHEY_COMPLEX        = 3,
    /** normal size serif font (more complex than FONT_HERSHEY_COMPLEX) */
    FONT_HERSHEY_TRIPLEX        = 4,
    /** smaller version of FONT_HERSHEY_COMPLEX */
    FONT_HERSHEY_COMPLEX_SMALL  = 5,
    /** hand-writing style font */
    FONT_HERSHEY_SCRIPT_SIMPLEX = 6,
    /** more complex variant of FONT_HERSHEY_SCRIPT_SIMPLEX */
    FONT_HERSHEY_SCRIPT_COMPLEX = 7,
    /** flag for italic font */
    FONT_ITALIC                 = 16;

/** enum cv::ReduceTypes */
public static final int /** the output is the sum of all rows/columns of the matrix. */
 REDUCE_SUM = 0,
                   /** the output is the mean vector of all rows/columns of the matrix. */
                   REDUCE_AVG = 1,
                   /** the output is the maximum (column/row-wise) of all rows/columns of the matrix. */
                   REDUCE_MAX = 2,
                   /** the output is the minimum (column/row-wise) of all rows/columns of the matrix. */
                   REDUCE_MIN = 3;


/** \brief Swaps two matrices
*/
@Namespace("cv") public static native void swap(@ByRef Mat a, @ByRef Mat b);
/** \overload */
@Namespace("cv") public static native void swap( @ByRef UMat a, @ByRef UMat b );

/** \} core
 <p>
 *  \addtogroup core_array
 *  \{
<p>
/** \brief Computes the source location of an extrapolated pixel.
<p>
The function computes and returns the coordinate of a donor pixel corresponding to the specified
extrapolated pixel when using the specified extrapolation border mode. For example, if you use
cv::BORDER_WRAP mode in the horizontal direction, cv::BORDER_REFLECT_101 in the vertical direction and
want to compute value of the "virtual" pixel Point(-5, 100) in a floating-point image img , it
looks like:
<pre>{@code {.cpp}
    float val = img.at<float>(borderInterpolate(100, img.rows, cv::BORDER_REFLECT_101),
                              borderInterpolate(-5, img.cols, cv::BORDER_WRAP));
}</pre>
Normally, the function is not called directly. It is used inside filtering functions and also in
copyMakeBorder.
@param p 0-based coordinate of the extrapolated pixel along one of the axes, likely \<0 or \>= len
@param len Length of the array along the corresponding axis.
@param borderType Border type, one of the cv::BorderTypes, except for cv::BORDER_TRANSPARENT and
cv::BORDER_ISOLATED . When borderType==cv::BORDER_CONSTANT , the function always returns -1, regardless
of p and len.
<p>
\sa copyMakeBorder
*/
@Namespace("cv") public static native int borderInterpolate(int p, int len, int borderType);

/** \brief Forms a border around an image.
<p>
The function copies the source image into the middle of the destination image. The areas to the
left, to the right, above and below the copied source image will be filled with extrapolated
pixels. This is not what filtering functions based on it do (they extrapolate pixels on-fly), but
what other more complex functions, including your own, may do to simplify image boundary handling.
<p>
The function supports the mode when src is already in the middle of dst . In this case, the
function does not copy src itself but simply constructs the border, for example:
<p>
<pre>{@code {.cpp}
    // let border be the same in all directions
    int border=2;
    // constructs a larger image to fit both the image and the border
    Mat gray_buf(rgb.rows + border*2, rgb.cols + border*2, rgb.depth());
    // select the middle part of it w/o copying data
    Mat gray(gray_canvas, Rect(border, border, rgb.cols, rgb.rows));
    // convert image from RGB to grayscale
    cvtColor(rgb, gray, COLOR_RGB2GRAY);
    // form a border in-place
    copyMakeBorder(gray, gray_buf, border, border,
                   border, border, BORDER_REPLICATE);
    // now do some custom filtering ...
    ...
}</pre>
\note When the source image is a part (ROI) of a bigger image, the function will try to use the
pixels outside of the ROI to form a border. To disable this feature and always do extrapolation, as
if src was not a ROI, use borderType | BORDER_ISOLATED.
<p>
@param src Source image.
@param dst Destination image of the same type as src and the size Size(src.cols+left+right,
src.rows+top+bottom) .
@param top
@param bottom
@param left
@param right Parameter specifying how many pixels in each direction from the source image rectangle
to extrapolate. For example, top=1, bottom=1, left=1, right=1 mean that 1 pixel-wide border needs
to be built.
@param borderType Border type. See borderInterpolate for details.
@param value Border value if borderType==BORDER_CONSTANT .
<p>
\sa  borderInterpolate
*/
@Namespace("cv") public static native void copyMakeBorder(@ByVal Mat src, @ByVal Mat dst,
                                 int top, int bottom, int left, int right,
                                 int borderType, @Const @ByRef(nullValue = "cv::Scalar()") Scalar value/*=cv::Scalar()*/ );
@Namespace("cv") public static native void copyMakeBorder(@ByVal Mat src, @ByVal Mat dst,
                                 int top, int bottom, int left, int right,
                                 int borderType );

/** \brief Calculates the per-element sum of two arrays or an array and a scalar.
<p>
The function add calculates:
- Sum of two arrays when both input arrays have the same size and the same number of channels:
\f[\texttt{dst}(I) =  \texttt{saturate} ( \texttt{src1}(I) +  \texttt{src2}(I)) \quad \texttt{if mask}(I) \ne0\f]
- Sum of an array and a scalar when src2 is constructed from Scalar or has the same number of
elements as {@code src1.channels()}:
\f[\texttt{dst}(I) =  \texttt{saturate} ( \texttt{src1}(I) +  \texttt{src2} ) \quad \texttt{if mask}(I) \ne0\f]
- Sum of a scalar and an array when src1 is constructed from Scalar or has the same number of
elements as {@code src2.channels()}:
\f[\texttt{dst}(I) =  \texttt{saturate} ( \texttt{src1} +  \texttt{src2}(I) ) \quad \texttt{if mask}(I) \ne0\f]
where {@code I} is a multi-dimensional index of array elements. In case of multi-channel arrays, each
channel is processed independently.
<p>
The first function in the list above can be replaced with matrix expressions:
<pre>{@code {.cpp}
    dst = src1 + src2;
    dst += src1; // equivalent to add(dst, src1, dst);
}</pre>
The input arrays and the output array can all have the same or different depths. For example, you
can add a 16-bit unsigned array to a 8-bit signed array and store the sum as a 32-bit
floating-point array. Depth of the output array is determined by the dtype parameter. In the second
and third cases above, as well as in the first case, when src1.depth() == src2.depth(), dtype can
be set to the default -1. In this case, the output array will have the same depth as the input
array, be it src1, src2 or both.
\note Saturation is not applied when the output array has the depth CV_32S. You may even get
result of an incorrect sign in the case of overflow.
@param src1 first input array or a scalar.
@param src2 second input array or a scalar.
@param dst output array that has the same size and number of channels as the input array(s); the
depth is defined by dtype or src1/src2.
@param mask optional operation mask - 8-bit single channel array, that specifies elements of the
output array to be changed.
@param dtype optional depth of the output array (see the discussion below).
\sa subtract, addWeighted, scaleAdd, Mat::convertTo
*/
@Namespace("cv") public static native void add(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat dst,
                      @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/, int dtype/*=-1*/);
@Namespace("cv") public static native void add(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat dst);

/** \brief Calculates the per-element difference between two arrays or array and a scalar.
<p>
The function subtract calculates:
- Difference between two arrays, when both input arrays have the same size and the same number of
channels:
    \f[\texttt{dst}(I) =  \texttt{saturate} ( \texttt{src1}(I) -  \texttt{src2}(I)) \quad \texttt{if mask}(I) \ne0\f]
- Difference between an array and a scalar, when src2 is constructed from Scalar or has the same
number of elements as {@code src1.channels()}:
    \f[\texttt{dst}(I) =  \texttt{saturate} ( \texttt{src1}(I) -  \texttt{src2} ) \quad \texttt{if mask}(I) \ne0\f]
- Difference between a scalar and an array, when src1 is constructed from Scalar or has the same
number of elements as {@code src2.channels()}:
    \f[\texttt{dst}(I) =  \texttt{saturate} ( \texttt{src1} -  \texttt{src2}(I) ) \quad \texttt{if mask}(I) \ne0\f]
- The reverse difference between a scalar and an array in the case of {@code SubRS}:
    \f[\texttt{dst}(I) =  \texttt{saturate} ( \texttt{src2} -  \texttt{src1}(I) ) \quad \texttt{if mask}(I) \ne0\f]
where I is a multi-dimensional index of array elements. In case of multi-channel arrays, each
channel is processed independently.
<p>
The first function in the list above can be replaced with matrix expressions:
<pre>{@code {.cpp}
    dst = src1 - src2;
    dst -= src1; // equivalent to subtract(dst, src1, dst);
}</pre>
The input arrays and the output array can all have the same or different depths. For example, you
can subtract to 8-bit unsigned arrays and store the difference in a 16-bit signed array. Depth of
the output array is determined by dtype parameter. In the second and third cases above, as well as
in the first case, when src1.depth() == src2.depth(), dtype can be set to the default -1. In this
case the output array will have the same depth as the input array, be it src1, src2 or both.
\note Saturation is not applied when the output array has the depth CV_32S. You may even get
result of an incorrect sign in the case of overflow.
@param src1 first input array or a scalar.
@param src2 second input array or a scalar.
@param dst output array of the same size and the same number of channels as the input array.
@param mask optional operation mask; this is an 8-bit single channel array that specifies elements
of the output array to be changed.
@param dtype optional depth of the output array
\sa  add, addWeighted, scaleAdd, Mat::convertTo
  */
@Namespace("cv") public static native void subtract(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat dst,
                           @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/, int dtype/*=-1*/);
@Namespace("cv") public static native void subtract(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat dst);


/** \brief Calculates the per-element scaled product of two arrays.
<p>
The function multiply calculates the per-element product of two arrays:
<p>
\f[\texttt{dst} (I)= \texttt{saturate} ( \texttt{scale} \cdot \texttt{src1} (I)  \cdot \texttt{src2} (I))\f]
<p>
There is also a \ref MatrixExpressions -friendly variant of the first function. See Mat::mul .
<p>
For a not-per-element matrix product, see gemm .
<p>
\note Saturation is not applied when the output array has the depth
CV_32S. You may even get result of an incorrect sign in the case of
overflow.
@param src1 first input array.
@param src2 second input array of the same size and the same type as src1.
@param dst output array of the same size and type as src1.
@param scale optional scale factor.
@param dtype optional depth of the output array
\sa add, subtract, divide, scaleAdd, addWeighted, accumulate, accumulateProduct, accumulateSquare,
Mat::convertTo
*/
@Namespace("cv") public static native void multiply(@ByVal Mat src1, @ByVal Mat src2,
                           @ByVal Mat dst, double scale/*=1*/, int dtype/*=-1*/);
@Namespace("cv") public static native void multiply(@ByVal Mat src1, @ByVal Mat src2,
                           @ByVal Mat dst);

/** \brief Performs per-element division of two arrays or a scalar by an array.
<p>
The functions divide divide one array by another:
\f[\texttt{dst(I) = saturate(src1(I)*scale/src2(I))}\f]
or a scalar by an array when there is no src1 :
\f[\texttt{dst(I) = saturate(scale/src2(I))}\f]
<p>
When src2(I) is zero, dst(I) will also be zero. Different channels of
multi-channel arrays are processed independently.
<p>
\note Saturation is not applied when the output array has the depth CV_32S. You may even get
result of an incorrect sign in the case of overflow.
@param src1 first input array.
@param src2 second input array of the same size and type as src1.
@param scale scalar factor.
@param dst output array of the same size and type as src2.
@param dtype optional depth of the output array; if -1, dst will have depth src2.depth(), but in
case of an array-by-array division, you can only pass -1 when src1.depth()==src2.depth().
\sa  multiply, add, subtract
*/
@Namespace("cv") public static native void divide(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat dst,
                         double scale/*=1*/, int dtype/*=-1*/);
@Namespace("cv") public static native void divide(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat dst);

/** \overload */
@Namespace("cv") public static native void divide(double scale, @ByVal Mat src2,
                         @ByVal Mat dst, int dtype/*=-1*/);
@Namespace("cv") public static native void divide(double scale, @ByVal Mat src2,
                         @ByVal Mat dst);

/** \brief Calculates the sum of a scaled array and another array.
<p>
The function scaleAdd is one of the classical primitive linear algebra operations, known as DAXPY
or SAXPY in [BLAS](http://en.wikipedia.org/wiki/Basic_Linear_Algebra_Subprograms). It calculates
the sum of a scaled array and another array:
\f[\texttt{dst} (I)= \texttt{scale} \cdot \texttt{src1} (I) +  \texttt{src2} (I)\f]
The function can also be emulated with a matrix expression, for example:
<pre>{@code {.cpp}
    Mat A(3, 3, CV_64F);
    ...
    A.row(0) = A.row(1)*2 + A.row(2);
}</pre>
@param src1 first input array.
@param alpha scale factor for the first array.
@param src2 second input array of the same size and type as src1.
@param dst output array of the same size and type as src1.
\sa add, addWeighted, subtract, Mat::dot, Mat::convertTo
*/
@Namespace("cv") public static native void scaleAdd(@ByVal Mat src1, double alpha, @ByVal Mat src2, @ByVal Mat dst);

/** \brief Calculates the weighted sum of two arrays.
<p>
The function addWeighted calculates the weighted sum of two arrays as follows:
\f[\texttt{dst} (I)= \texttt{saturate} ( \texttt{src1} (I)* \texttt{alpha} +  \texttt{src2} (I)* \texttt{beta} +  \texttt{gamma} )\f]
where I is a multi-dimensional index of array elements. In case of multi-channel arrays, each
channel is processed independently.
The function can be replaced with a matrix expression:
<pre>{@code {.cpp}
    dst = src1*alpha + src2*beta + gamma;
}</pre>
\note Saturation is not applied when the output array has the depth CV_32S. You may even get
result of an incorrect sign in the case of overflow.
@param src1 first input array.
@param alpha weight of the first array elements.
@param src2 second input array of the same size and channel number as src1.
@param beta weight of the second array elements.
@param gamma scalar added to each sum.
@param dst output array that has the same size and number of channels as the input arrays.
@param dtype optional depth of the output array; when both input arrays have the same depth, dtype
can be set to -1, which will be equivalent to src1.depth().
\sa  add, subtract, scaleAdd, Mat::convertTo
*/
@Namespace("cv") public static native void addWeighted(@ByVal Mat src1, double alpha, @ByVal Mat src2,
                              double beta, double gamma, @ByVal Mat dst, int dtype/*=-1*/);
@Namespace("cv") public static native void addWeighted(@ByVal Mat src1, double alpha, @ByVal Mat src2,
                              double beta, double gamma, @ByVal Mat dst);

/** \brief Scales, calculates absolute values, and converts the result to 8-bit.
<p>
On each element of the input array, the function convertScaleAbs
performs three operations sequentially: scaling, taking an absolute
value, conversion to an unsigned 8-bit type:
\f[\texttt{dst} (I)= \texttt{saturate\_cast<uchar>} (| \texttt{src} (I)* \texttt{alpha} +  \texttt{beta} |)\f]
In case of multi-channel arrays, the function processes each channel
independently. When the output is not 8-bit, the operation can be
emulated by calling the Mat::convertTo method (or by using matrix
expressions) and then by calculating an absolute value of the result.
For example:
<pre>{@code {.cpp}
    Mat_<float> A(30,30);
    randu(A, Scalar(-100), Scalar(100));
    Mat_<float> B = A*5 + 3;
    B = abs(B);
    // Mat_<float> B = abs(A*5+3) will also do the job,
    // but it will allocate a temporary matrix
}</pre>
@param src input array.
@param dst output array.
@param alpha optional scale factor.
@param beta optional delta added to the scaled values.
\sa  Mat::convertTo, cv::abs(const Mat&)
*/
@Namespace("cv") public static native void convertScaleAbs(@ByVal Mat src, @ByVal Mat dst,
                                  double alpha/*=1*/, double beta/*=0*/);
@Namespace("cv") public static native void convertScaleAbs(@ByVal Mat src, @ByVal Mat dst);

/** \brief Performs a look-up table transform of an array.
<p>
The function LUT fills the output array with values from the look-up table. Indices of the entries
are taken from the input array. That is, the function processes each element of src as follows:
\f[\texttt{dst} (I)  \leftarrow \texttt{lut(src(I) + d)}\f]
where
\f[d =  \fork{0}{if \(\texttt{src}\) has depth \(\texttt{CV_8U}\)}{128}{if \(\texttt{src}\) has depth \(\texttt{CV_8S}\)}\f]
@param src input array of 8-bit elements.
@param lut look-up table of 256 elements; in case of multi-channel input array, the table should
either have a single channel (in this case the same table is used for all channels) or the same
number of channels as in the input array.
@param dst output array of the same size and number of channels as src, and the same depth as lut.
\sa  convertScaleAbs, Mat::convertTo
*/
@Namespace("cv") public static native void LUT(@ByVal Mat src, @ByVal Mat lut, @ByVal Mat dst);

/** \brief Calculates the sum of array elements.
<p>
The functions sum calculate and return the sum of array elements,
independently for each channel.
@param src input array that must have from 1 to 4 channels.
\sa  countNonZero, mean, meanStdDev, norm, minMaxLoc, reduce
*/
@Namespace("cv") public static native @ByVal @Name("sum") Scalar sumElems(@ByVal Mat src);

/** \brief Counts non-zero array elements.
<p>
The function returns the number of non-zero elements in src :
\f[\sum _{I: \; \texttt{src} (I) \ne0 } 1\f]
@param src single-channel array.
\sa  mean, meanStdDev, norm, minMaxLoc, calcCovarMatrix
*/
@Namespace("cv") public static native int countNonZero( @ByVal Mat src );

/** \brief Returns the list of locations of non-zero pixels
<p>
Given a binary matrix (likely returned from an operation such
as threshold(), compare(), >, ==, etc, return all of
the non-zero indices as a cv::Mat or std::vector<cv::Point> (x,y)
For example:
<pre>{@code {.cpp}
    cv::Mat binaryImage; // input, binary image
    cv::Mat locations;   // output, locations of non-zero pixels
    cv::findNonZero(binaryImage, locations);

    // access pixel coordinates
    Point pnt = locations.at<Point>(i);
}</pre>
or
<pre>{@code {.cpp}
    cv::Mat binaryImage; // input, binary image
    vector<Point> locations;   // output, locations of non-zero pixels
    cv::findNonZero(binaryImage, locations);

    // access pixel coordinates
    Point pnt = locations[i];
}</pre>
@param src single-channel array (type CV_8UC1)
@param idx the output array, type of cv::Mat or std::vector<Point>, corresponding to non-zero indices in the input
*/
@Namespace("cv") public static native void findNonZero( @ByVal Mat src, @ByVal Mat idx );

/** \brief Calculates an average (mean) of array elements.
<p>
The function mean calculates the mean value M of array elements,
independently for each channel, and return it:
\f[\begin{array}{l} N =  \sum _{I: \; \texttt{mask} (I) \ne 0} 1 \\ M_c =  \left ( \sum _{I: \; \texttt{mask} (I) \ne 0}{ \texttt{mtx} (I)_c} \right )/N \end{array}\f]
When all the mask elements are 0's, the functions return Scalar::all(0)
@param src input array that should have from 1 to 4 channels so that the result can be stored in
Scalar_ .
@param mask optional operation mask.
\sa  countNonZero, meanStdDev, norm, minMaxLoc
*/
@Namespace("cv") public static native @ByVal Scalar mean(@ByVal Mat src, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native @ByVal Scalar mean(@ByVal Mat src);

/** Calculates a mean and standard deviation of array elements.
<p>
The function meanStdDev calculates the mean and the standard deviation M
of array elements independently for each channel and returns it via the
output parameters:
\f[\begin{array}{l} N =  \sum _{I, \texttt{mask} (I)  \ne 0} 1 \\ \texttt{mean} _c =  \frac{\sum_{ I: \; \texttt{mask}(I) \ne 0} \texttt{src} (I)_c}{N} \\ \texttt{stddev} _c =  \sqrt{\frac{\sum_{ I: \; \texttt{mask}(I) \ne 0} \left ( \texttt{src} (I)_c -  \texttt{mean} _c \right )^2}{N}} \end{array}\f]
When all the mask elements are 0's, the functions return
mean=stddev=Scalar::all(0).
\note The calculated standard deviation is only the diagonal of the
complete normalized covariance matrix. If the full matrix is needed, you
can reshape the multi-channel array M x N to the single-channel array
M\*N x mtx.channels() (only possible when the matrix is continuous) and
then pass the matrix to calcCovarMatrix .
@param src input array that should have from 1 to 4 channels so that the results can be stored in
Scalar_ 's.
@param mean output parameter: calculated mean value.
@param stddev output parameter: calculateded standard deviation.
@param mask optional operation mask.
\sa  countNonZero, mean, norm, minMaxLoc, calcCovarMatrix
*/
@Namespace("cv") public static native void meanStdDev(@ByVal Mat src, @ByVal Mat mean, @ByVal Mat stddev,
                             @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native void meanStdDev(@ByVal Mat src, @ByVal Mat mean, @ByVal Mat stddev);

/** \brief Calculates an absolute array norm, an absolute difference norm, or a
relative difference norm.
<p>
The functions norm calculate an absolute norm of src1 (when there is no
src2 ):
<p>
\f[norm =  \forkthree{\|\texttt{src1}\|_{L_{\infty}} =  \max _I | \texttt{src1} (I)|}{if  \(\texttt{normType} = \texttt{NORM_INF}\) }
{ \| \texttt{src1} \| _{L_1} =  \sum _I | \texttt{src1} (I)|}{if  \(\texttt{normType} = \texttt{NORM_L1}\) }
{ \| \texttt{src1} \| _{L_2} =  \sqrt{\sum_I \texttt{src1}(I)^2} }{if  \(\texttt{normType} = \texttt{NORM_L2}\) }\f]
<p>
or an absolute or relative difference norm if src2 is there:
<p>
\f[norm =  \forkthree{\|\texttt{src1}-\texttt{src2}\|_{L_{\infty}} =  \max _I | \texttt{src1} (I) -  \texttt{src2} (I)|}{if  \(\texttt{normType} = \texttt{NORM_INF}\) }
{ \| \texttt{src1} - \texttt{src2} \| _{L_1} =  \sum _I | \texttt{src1} (I) -  \texttt{src2} (I)|}{if  \(\texttt{normType} = \texttt{NORM_L1}\) }
{ \| \texttt{src1} - \texttt{src2} \| _{L_2} =  \sqrt{\sum_I (\texttt{src1}(I) - \texttt{src2}(I))^2} }{if  \(\texttt{normType} = \texttt{NORM_L2}\) }\f]
<p>
or
<p>
\f[norm =  \forkthree{\frac{\|\texttt{src1}-\texttt{src2}\|_{L_{\infty}}    }{\|\texttt{src2}\|_{L_{\infty}} }}{if  \(\texttt{normType} = \texttt{NORM_RELATIVE_INF}\) }
{ \frac{\|\texttt{src1}-\texttt{src2}\|_{L_1} }{\|\texttt{src2}\|_{L_1}} }{if  \(\texttt{normType} = \texttt{NORM_RELATIVE_L1}\) }
{ \frac{\|\texttt{src1}-\texttt{src2}\|_{L_2} }{\|\texttt{src2}\|_{L_2}} }{if  \(\texttt{normType} = \texttt{NORM_RELATIVE_L2}\) }\f]
<p>
The functions norm return the calculated norm.
<p>
When the mask parameter is specified and it is not empty, the norm is
calculated only over the region specified by the mask.
<p>
A multi-channel input arrays are treated as a single-channel, that is,
the results for all channels are combined.
<p>
@param src1 first input array.
@param normType type of the norm (see cv::NormTypes).
@param mask optional operation mask; it must have the same size as src1 and CV_8UC1 type.
*/
@Namespace("cv") public static native double norm(@ByVal Mat src1, int normType/*=cv::NORM_L2*/, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native double norm(@ByVal Mat src1);

/** \overload
@param src1 first input array.
@param src2 second input array of the same size and the same type as src1.
@param normType type of the norm (cv::NormTypes).
@param mask optional operation mask; it must have the same size as src1 and CV_8UC1 type.
*/
@Namespace("cv") public static native double norm(@ByVal Mat src1, @ByVal Mat src2,
                         int normType/*=cv::NORM_L2*/, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native double norm(@ByVal Mat src1, @ByVal Mat src2);
/** \overload
@param src first input array.
@param normType type of the norm (see cv::NormTypes).
*/
@Namespace("cv") public static native double norm( @Const @ByRef SparseMat src, int normType );

/** \brief computes PSNR image/video quality metric
<p>
see http://en.wikipedia.org/wiki/Peak_signal-to-noise_ratio for details
\todo document
  */
@Namespace("cv") public static native double PSNR(@ByVal Mat src1, @ByVal Mat src2);

/** \brief naive nearest neighbor finder
<p>
see http://en.wikipedia.org/wiki/Nearest_neighbor_search
\todo document
  */
@Namespace("cv") public static native void batchDistance(@ByVal Mat src1, @ByVal Mat src2,
                                @ByVal Mat dist, int dtype, @ByVal Mat nidx,
                                int normType/*=cv::NORM_L2*/, int K/*=0*/,
                                @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/, int update/*=0*/,
                                @Cast("bool") boolean crosscheck/*=false*/);
@Namespace("cv") public static native void batchDistance(@ByVal Mat src1, @ByVal Mat src2,
                                @ByVal Mat dist, int dtype, @ByVal Mat nidx);

/** \brief Normalizes the norm or value range of an array.
<p>
The functions normalize scale and shift the input array elements so that
\f[\| \texttt{dst} \| _{L_p}= \texttt{alpha}\f]
(where p=Inf, 1 or 2) when normType=NORM_INF, NORM_L1, or NORM_L2, respectively; or so that
\f[\min _I  \texttt{dst} (I)= \texttt{alpha} , \, \, \max _I  \texttt{dst} (I)= \texttt{beta}\f]
<p>
when normType=NORM_MINMAX (for dense arrays only). The optional mask specifies a sub-array to be
normalized. This means that the norm or min-n-max are calculated over the sub-array, and then this
sub-array is modified to be normalized. If you want to only use the mask to calculate the norm or
min-max but modify the whole array, you can use norm and Mat::convertTo.
<p>
In case of sparse matrices, only the non-zero values are analyzed and transformed. Because of this,
the range transformation for sparse matrices is not allowed since it can shift the zero level.
<p>
Possible usage with some positive example data:
<pre>{@code {.cpp}
    vector<double> positiveData = { 2.0, 8.0, 10.0 };
    vector<double> normalizedData_l1, normalizedData_l2, normalizedData_inf, normalizedData_minmax;

    // Norm to probability (total count)
    // sum(numbers) = 20.0
    // 2.0      0.1     (2.0/20.0)
    // 8.0      0.4     (8.0/20.0)
    // 10.0     0.5     (10.0/20.0)
    normalize(positiveData, normalizedData_l1, 1.0, 0.0, NORM_L1);

    // Norm to unit vector: ||positiveData|| = 1.0
    // 2.0      0.15
    // 8.0      0.62
    // 10.0     0.77
    normalize(positiveData, normalizedData_l2, 1.0, 0.0, NORM_L2);

    // Norm to max element
    // 2.0      0.2     (2.0/10.0)
    // 8.0      0.8     (8.0/10.0)
    // 10.0     1.0     (10.0/10.0)
    normalize(positiveData, normalizedData_inf, 1.0, 0.0, NORM_INF);

    // Norm to range [0.0;1.0]
    // 2.0      0.0     (shift to left border)
    // 8.0      0.75    (6.0/8.0)
    // 10.0     1.0     (shift to right border)
    normalize(positiveData, normalizedData_minmax, 1.0, 0.0, NORM_MINMAX);
}</pre>
<p>
@param src input array.
@param dst output array of the same size as src .
@param alpha norm value to normalize to or the lower range boundary in case of the range
normalization.
@param beta upper range boundary in case of the range normalization; it is not used for the norm
normalization.
@param norm_type normalization type (see cv::NormTypes).
@param dtype when negative, the output array has the same type as src; otherwise, it has the same
number of channels as src and the depth =CV_MAT_DEPTH(dtype).
@param mask optional operation mask.
\sa norm, Mat::convertTo, SparseMat::convertTo
*/
@Namespace("cv") public static native void normalize( @ByVal Mat src, @ByVal Mat dst, double alpha/*=1*/, double beta/*=0*/,
                             int norm_type/*=cv::NORM_L2*/, int dtype/*=-1*/, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native void normalize( @ByVal Mat src, @ByVal Mat dst);

/** \overload
@param src input array.
@param dst output array of the same size as src .
@param alpha norm value to normalize to or the lower range boundary in case of the range
normalization.
@param normType normalization type (see cv::NormTypes).
*/
@Namespace("cv") public static native void normalize( @Const @ByRef SparseMat src, @ByRef SparseMat dst, double alpha, int normType );

/** \brief Finds the global minimum and maximum in an array.
<p>
The functions minMaxLoc find the minimum and maximum element values and their positions. The
extremums are searched across the whole array or, if mask is not an empty array, in the specified
array region.
<p>
The functions do not work with multi-channel arrays. If you need to find minimum or maximum
elements across all the channels, use Mat::reshape first to reinterpret the array as
single-channel. Or you may extract the particular channel using either extractImageCOI , or
mixChannels , or split .
@param src input single-channel array.
@param minVal pointer to the returned minimum value; NULL is used if not required.
@param maxVal pointer to the returned maximum value; NULL is used if not required.
@param minLoc pointer to the returned minimum location (in 2D case); NULL is used if not required.
@param maxLoc pointer to the returned maximum location (in 2D case); NULL is used if not required.
@param mask optional mask used to select a sub-array.
\sa max, min, compare, inRange, extractImageCOI, mixChannels, split, Mat::reshape
*/
@Namespace("cv") public static native void minMaxLoc(@ByVal Mat src, DoublePointer minVal,
                            DoublePointer maxVal/*=0*/, Point minLoc/*=0*/,
                            Point maxLoc/*=0*/, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native void minMaxLoc(@ByVal Mat src, DoublePointer minVal);
@Namespace("cv") public static native void minMaxLoc(@ByVal Mat src, DoubleBuffer minVal,
                            DoubleBuffer maxVal/*=0*/, Point minLoc/*=0*/,
                            Point maxLoc/*=0*/, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native void minMaxLoc(@ByVal Mat src, DoubleBuffer minVal);
@Namespace("cv") public static native void minMaxLoc(@ByVal Mat src, double[] minVal,
                            double[] maxVal/*=0*/, Point minLoc/*=0*/,
                            Point maxLoc/*=0*/, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native void minMaxLoc(@ByVal Mat src, double[] minVal);


/** \brief Finds the global minimum and maximum in an array
<p>
The function minMaxIdx finds the minimum and maximum element values and their positions. The
extremums are searched across the whole array or, if mask is not an empty array, in the specified
array region. The function does not work with multi-channel arrays. If you need to find minimum or
maximum elements across all the channels, use Mat::reshape first to reinterpret the array as
single-channel. Or you may extract the particular channel using either extractImageCOI , or
mixChannels , or split . In case of a sparse matrix, the minimum is found among non-zero elements
only.
\note When minIdx is not NULL, it must have at least 2 elements (as well as maxIdx), even if src is
a single-row or single-column matrix. In OpenCV (following MATLAB) each array has at least 2
dimensions, i.e. single-column matrix is Mx1 matrix (and therefore minIdx/maxIdx will be
(i1,0)/(i2,0)) and single-row matrix is 1xN matrix (and therefore minIdx/maxIdx will be
(0,j1)/(0,j2)).
@param src input single-channel array.
@param minVal pointer to the returned minimum value; NULL is used if not required.
@param maxVal pointer to the returned maximum value; NULL is used if not required.
@param minIdx pointer to the returned minimum location (in nD case); NULL is used if not required;
Otherwise, it must point to an array of src.dims elements, the coordinates of the minimum element
in each dimension are stored there sequentially.
@param maxIdx pointer to the returned maximum location (in nD case). NULL is used if not required.
@param mask specified array region
*/
@Namespace("cv") public static native void minMaxIdx(@ByVal Mat src, DoublePointer minVal, DoublePointer maxVal/*=0*/,
                          IntPointer minIdx/*=0*/, IntPointer maxIdx/*=0*/, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native void minMaxIdx(@ByVal Mat src, DoublePointer minVal);
@Namespace("cv") public static native void minMaxIdx(@ByVal Mat src, DoubleBuffer minVal, DoubleBuffer maxVal/*=0*/,
                          IntBuffer minIdx/*=0*/, IntBuffer maxIdx/*=0*/, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native void minMaxIdx(@ByVal Mat src, DoubleBuffer minVal);
@Namespace("cv") public static native void minMaxIdx(@ByVal Mat src, double[] minVal, double[] maxVal/*=0*/,
                          int[] minIdx/*=0*/, int[] maxIdx/*=0*/, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native void minMaxIdx(@ByVal Mat src, double[] minVal);

/** \overload
@param a input single-channel array.
@param minVal pointer to the returned minimum value; NULL is used if not required.
@param maxVal pointer to the returned maximum value; NULL is used if not required.
@param minIdx pointer to the returned minimum location (in nD case); NULL is used if not required;
Otherwise, it must point to an array of src.dims elements, the coordinates of the minimum element
in each dimension are stored there sequentially.
@param maxIdx pointer to the returned maximum location (in nD case). NULL is used if not required.
*/
@Namespace("cv") public static native void minMaxLoc(@Const @ByRef SparseMat a, DoublePointer minVal,
                          DoublePointer maxVal, IntPointer minIdx/*=0*/, IntPointer maxIdx/*=0*/);
@Namespace("cv") public static native void minMaxLoc(@Const @ByRef SparseMat a, DoublePointer minVal,
                          DoublePointer maxVal);
@Namespace("cv") public static native void minMaxLoc(@Const @ByRef SparseMat a, DoubleBuffer minVal,
                          DoubleBuffer maxVal, IntBuffer minIdx/*=0*/, IntBuffer maxIdx/*=0*/);
@Namespace("cv") public static native void minMaxLoc(@Const @ByRef SparseMat a, DoubleBuffer minVal,
                          DoubleBuffer maxVal);
@Namespace("cv") public static native void minMaxLoc(@Const @ByRef SparseMat a, double[] minVal,
                          double[] maxVal, int[] minIdx/*=0*/, int[] maxIdx/*=0*/);
@Namespace("cv") public static native void minMaxLoc(@Const @ByRef SparseMat a, double[] minVal,
                          double[] maxVal);

/** \brief Reduces a matrix to a vector.
<p>
The function reduce reduces the matrix to a vector by treating the matrix rows/columns as a set of
1D vectors and performing the specified operation on the vectors until a single row/column is
obtained. For example, the function can be used to compute horizontal and vertical projections of a
raster image. In case of REDUCE_SUM and REDUCE_AVG , the output may have a larger element
bit-depth to preserve accuracy. And multi-channel arrays are also supported in these two reduction
modes.
@param src input 2D matrix.
@param dst output vector. Its size and type is defined by dim and dtype parameters.
@param dim dimension index along which the matrix is reduced. 0 means that the matrix is reduced to
a single row. 1 means that the matrix is reduced to a single column.
@param rtype reduction operation that could be one of cv::ReduceTypes
@param dtype when negative, the output vector will have the same type as the input matrix,
otherwise, its type will be CV_MAKE_TYPE(CV_MAT_DEPTH(dtype), src.channels()).
\sa repeat
*/
@Namespace("cv") public static native void reduce(@ByVal Mat src, @ByVal Mat dst, int dim, int rtype, int dtype/*=-1*/);
@Namespace("cv") public static native void reduce(@ByVal Mat src, @ByVal Mat dst, int dim, int rtype);

/** \brief Creates one multi-channel array out of several single-channel ones.
<p>
The function merge merges several arrays to make a single multi-channel array. That is, each
element of the output array will be a concatenation of the elements of the input arrays, where
elements of i-th input array are treated as mv[i].channels()-element vectors.
<p>
The function cv::split does the reverse operation. If you need to shuffle channels in some other
advanced way, use cv::mixChannels.
@param mv input array of matrices to be merged; all the matrices in mv must have the same
size and the same depth.
@param count number of input matrices when mv is a plain C array; it must be greater than zero.
@param dst output array of the same size and the same depth as mv[0]; The number of channels will
be equal to the parameter count.
\sa  mixChannels, split, Mat::reshape
*/
@Namespace("cv") public static native void merge(@Const Mat mv, @Cast("size_t") long count, @ByVal Mat dst);

/** \overload
@param mv input vector of matrices to be merged; all the matrices in mv must have the same
size and the same depth.
@param dst output array of the same size and the same depth as mv[0]; The number of channels will
be the total number of channels in the matrix array.
  */
@Namespace("cv") public static native void merge(@ByVal MatVector mv, @ByVal Mat dst);

/** \brief Divides a multi-channel array into several single-channel arrays.
<p>
The functions split split a multi-channel array into separate single-channel arrays:
\f[\texttt{mv} [c](I) =  \texttt{src} (I)_c\f]
If you need to extract a single channel or do some other sophisticated channel permutation, use
mixChannels .
@param src input multi-channel array.
@param mvbegin output array; the number of arrays must match src.channels(); the arrays themselves are
reallocated, if needed.
\sa merge, mixChannels, cvtColor
*/
@Namespace("cv") public static native void split(@Const @ByRef Mat src, Mat mvbegin);

/** \overload
@param m input multi-channel array.
@param mv output vector of arrays; the arrays themselves are reallocated, if needed.
*/
@Namespace("cv") public static native void split(@ByVal Mat m, @ByVal MatVector mv);

/** \brief Copies specified channels from input arrays to the specified channels of
output arrays.
<p>
The function cv::mixChannels provides an advanced mechanism for shuffling image channels.
<p>
cv::split and cv::merge and some forms of cv::cvtColor are partial cases of cv::mixChannels .
<p>
In the example below, the code splits a 4-channel BGRA image into a 3-channel BGR (with B and R
channels swapped) and a separate alpha-channel image:
<pre>{@code {.cpp}
    Mat bgra( 100, 100, CV_8UC4, Scalar(255,0,0,255) );
    Mat bgr( bgra.rows, bgra.cols, CV_8UC3 );
    Mat alpha( bgra.rows, bgra.cols, CV_8UC1 );

    // forming an array of matrices is a quite efficient operation,
    // because the matrix data is not copied, only the headers
    Mat out[] = { bgr, alpha };
    // bgra[0] -> bgr[2], bgra[1] -> bgr[1],
    // bgra[2] -> bgr[0], bgra[3] -> alpha[0]
    int from_to[] = { 0,2, 1,1, 2,0, 3,3 };
    mixChannels( &bgra, 1, out, 2, from_to, 4 );
}</pre>
\note Unlike many other new-style C++ functions in OpenCV (see the introduction section and
Mat::create ), cv::mixChannels requires the output arrays to be pre-allocated before calling the
function.
@param src input array or vector of matrices; all of the matrices must have the same size and the
same depth.
@param nsrcs number of matrices in {@code src}.
@param dst output array or vector of matrices; all the matrices **must be allocated**; their size and
depth must be the same as in {@code src[0]}.
@param ndsts number of matrices in {@code dst}.
@param fromTo array of index pairs specifying which channels are copied and where; fromTo[k\*2] is
a 0-based index of the input channel in src, fromTo[k\*2+1] is an index of the output channel in
dst; the continuous channel numbering is used: the first input image channels are indexed from 0 to
src[0].channels()-1, the second input image channels are indexed from src[0].channels() to
src[0].channels() + src[1].channels()-1, and so on, the same scheme is used for the output image
channels; as a special case, when fromTo[k\*2] is negative, the corresponding output channel is
filled with zero .
@param npairs number of index pairs in {@code fromTo}.
\sa cv::split, cv::merge, cv::cvtColor
*/
@Namespace("cv") public static native void mixChannels(@Const Mat src, @Cast("size_t") long nsrcs, Mat dst, @Cast("size_t") long ndsts,
                            @Const IntPointer fromTo, @Cast("size_t") long npairs);
@Namespace("cv") public static native void mixChannels(@Const Mat src, @Cast("size_t") long nsrcs, Mat dst, @Cast("size_t") long ndsts,
                            @Const IntBuffer fromTo, @Cast("size_t") long npairs);
@Namespace("cv") public static native void mixChannels(@Const Mat src, @Cast("size_t") long nsrcs, Mat dst, @Cast("size_t") long ndsts,
                            @Const int[] fromTo, @Cast("size_t") long npairs);

/** \overload
@param src input array or vector of matrices; all of the matrices must have the same size and the
same depth.
@param dst output array or vector of matrices; all the matrices **must be allocated**; their size and
depth must be the same as in src[0].
@param fromTo array of index pairs specifying which channels are copied and where; fromTo[k\*2] is
a 0-based index of the input channel in src, fromTo[k\*2+1] is an index of the output channel in
dst; the continuous channel numbering is used: the first input image channels are indexed from 0 to
src[0].channels()-1, the second input image channels are indexed from src[0].channels() to
src[0].channels() + src[1].channels()-1, and so on, the same scheme is used for the output image
channels; as a special case, when fromTo[k\*2] is negative, the corresponding output channel is
filled with zero .
@param npairs number of index pairs in fromTo.
*/
@Namespace("cv") public static native void mixChannels(@ByVal MatVector src, @ByVal MatVector dst,
                            @Const IntPointer fromTo, @Cast("size_t") long npairs);
@Namespace("cv") public static native void mixChannels(@ByVal MatVector src, @ByVal MatVector dst,
                            @Const IntBuffer fromTo, @Cast("size_t") long npairs);
@Namespace("cv") public static native void mixChannels(@ByVal MatVector src, @ByVal MatVector dst,
                            @Const int[] fromTo, @Cast("size_t") long npairs);

/** \overload
@param src input array or vector of matrices; all of the matrices must have the same size and the
same depth.
@param dst output array or vector of matrices; all the matrices **must be allocated**; their size and
depth must be the same as in src[0].
@param fromTo array of index pairs specifying which channels are copied and where; fromTo[k\*2] is
a 0-based index of the input channel in src, fromTo[k\*2+1] is an index of the output channel in
dst; the continuous channel numbering is used: the first input image channels are indexed from 0 to
src[0].channels()-1, the second input image channels are indexed from src[0].channels() to
src[0].channels() + src[1].channels()-1, and so on, the same scheme is used for the output image
channels; as a special case, when fromTo[k\*2] is negative, the corresponding output channel is
filled with zero .
*/
@Namespace("cv") public static native void mixChannels(@ByVal MatVector src, @ByVal MatVector dst,
                              @StdVector IntPointer fromTo);
@Namespace("cv") public static native void mixChannels(@ByVal MatVector src, @ByVal MatVector dst,
                              @StdVector IntBuffer fromTo);
@Namespace("cv") public static native void mixChannels(@ByVal MatVector src, @ByVal MatVector dst,
                              @StdVector int[] fromTo);

/** \brief extracts a single channel from src (coi is 0-based index)
\todo document
*/
@Namespace("cv") public static native void extractChannel(@ByVal Mat src, @ByVal Mat dst, int coi);

/** \brief inserts a single channel to dst (coi is 0-based index)
\todo document
*/
@Namespace("cv") public static native void insertChannel(@ByVal Mat src, @ByVal Mat dst, int coi);

/** \brief Flips a 2D array around vertical, horizontal, or both axes.
<p>
The function flip flips the array in one of three different ways (row
and column indices are 0-based):
\f[\texttt{dst} _{ij} =
\left\{
\begin{array}{l l}
\texttt{src} _{\texttt{src.rows}-i-1,j} & if\;  \texttt{flipCode} = 0 \\
\texttt{src} _{i, \texttt{src.cols} -j-1} & if\;  \texttt{flipCode} > 0 \\
\texttt{src} _{ \texttt{src.rows} -i-1, \texttt{src.cols} -j-1} & if\; \texttt{flipCode} < 0 \\
\end{array}
\right.\f]
The example scenarios of using the function are the following:
*   Vertical flipping of the image (flipCode == 0) to switch between
    top-left and bottom-left image origin. This is a typical operation
    in video processing on Microsoft Windows\* OS.
*   Horizontal flipping of the image with the subsequent horizontal
    shift and absolute difference calculation to check for a
    vertical-axis symmetry (flipCode \> 0).
*   Simultaneous horizontal and vertical flipping of the image with
    the subsequent shift and absolute difference calculation to check
    for a central symmetry (flipCode \< 0).
*   Reversing the order of point arrays (flipCode \> 0 or
    flipCode == 0).
@param src input array.
@param dst output array of the same size and type as src.
@param flipCode a flag to specify how to flip the array; 0 means
flipping around the x-axis and positive value (for example, 1) means
flipping around y-axis. Negative value (for example, -1) means flipping
around both axes.
\sa transpose , repeat , completeSymm
*/
@Namespace("cv") public static native void flip(@ByVal Mat src, @ByVal Mat dst, int flipCode);

/** \brief Fills the output array with repeated copies of the input array.
<p>
The functions repeat duplicate the input array one or more times along each of the two axes:
\f[\texttt{dst} _{ij}= \texttt{src} _{i\mod src.rows, \; j\mod src.cols }\f]
The second variant of the function is more convenient to use with \ref MatrixExpressions.
@param src input array to replicate.
@param dst output array of the same type as src.
@param ny Flag to specify how many times the src is repeated along the
vertical axis.
@param nx Flag to specify how many times the src is repeated along the
horizontal axis.
\sa reduce
*/
@Namespace("cv") public static native void repeat(@ByVal Mat src, int ny, int nx, @ByVal Mat dst);

/** \overload
@param src input array to replicate.
@param ny Flag to specify how many times the src is repeated along the
vertical axis.
@param nx Flag to specify how many times the src is repeated along the
horizontal axis.
  */
@Namespace("cv") public static native @ByVal Mat repeat(@Const @ByRef Mat src, int ny, int nx);

/** \brief Applies horizontal concatenation to given matrices.
<p>
The function horizontally concatenates two or more cv::Mat matrices (with the same number of rows).
<pre>{@code {.cpp}
    cv::Mat matArray[] = { cv::Mat(4, 1, CV_8UC1, cv::Scalar(1)),
                           cv::Mat(4, 1, CV_8UC1, cv::Scalar(2)),
                           cv::Mat(4, 1, CV_8UC1, cv::Scalar(3)),};

    cv::Mat out;
    cv::hconcat( matArray, 3, out );
    //out:
    //[1, 2, 3;
    // 1, 2, 3;
    // 1, 2, 3;
    // 1, 2, 3]
}</pre>
@param src input array or vector of matrices. all of the matrices must have the same number of rows and the same depth.
@param nsrc number of matrices in src.
@param dst output array. It has the same number of rows and depth as the src, and the sum of cols of the src.
\sa cv::vconcat(const Mat*, size_t, OutputArray), \sa cv::vconcat(InputArrayOfArrays, OutputArray) and \sa cv::vconcat(InputArray, InputArray, OutputArray)
*/
@Namespace("cv") public static native void hconcat(@Const Mat src, @Cast("size_t") long nsrc, @ByVal Mat dst);
/** \overload
 <pre>{@code {.cpp}
    cv::Mat_<float> A = (cv::Mat_<float>(3, 2) << 1, 4,
                                                  2, 5,
                                                  3, 6);
    cv::Mat_<float> B = (cv::Mat_<float>(3, 2) << 7, 10,
                                                  8, 11,
                                                  9, 12);

    cv::Mat C;
    cv::hconcat(A, B, C);
    //C:
    //[1, 4, 7, 10;
    // 2, 5, 8, 11;
    // 3, 6, 9, 12]
 }</pre>
 @param src1 first input array to be considered for horizontal concatenation.
 @param src2 second input array to be considered for horizontal concatenation.
 @param dst output array. It has the same number of rows and depth as the src1 and src2, and the sum of cols of the src1 and src2.
 */
@Namespace("cv") public static native void hconcat(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat dst);
/** \overload
 <pre>{@code {.cpp}
    std::vector<cv::Mat> matrices = { cv::Mat(4, 1, CV_8UC1, cv::Scalar(1)),
                                      cv::Mat(4, 1, CV_8UC1, cv::Scalar(2)),
                                      cv::Mat(4, 1, CV_8UC1, cv::Scalar(3)),};

    cv::Mat out;
    cv::hconcat( matrices, out );
    //out:
    //[1, 2, 3;
    // 1, 2, 3;
    // 1, 2, 3;
    // 1, 2, 3]
 }</pre>
 @param src input array or vector of matrices. all of the matrices must have the same number of rows and the same depth.
 @param dst output array. It has the same number of rows and depth as the src, and the sum of cols of the src.
same depth.
 */
@Namespace("cv") public static native void hconcat(@ByVal MatVector src, @ByVal Mat dst);

/** \brief Applies vertical concatenation to given matrices.
<p>
The function vertically concatenates two or more cv::Mat matrices (with the same number of cols).
<pre>{@code {.cpp}
    cv::Mat matArray[] = { cv::Mat(1, 4, CV_8UC1, cv::Scalar(1)),
                           cv::Mat(1, 4, CV_8UC1, cv::Scalar(2)),
                           cv::Mat(1, 4, CV_8UC1, cv::Scalar(3)),};

    cv::Mat out;
    cv::vconcat( matArray, 3, out );
    //out:
    //[1,   1,   1,   1;
    // 2,   2,   2,   2;
    // 3,   3,   3,   3]
}</pre>
@param src input array or vector of matrices. all of the matrices must have the same number of cols and the same depth.
@param nsrc number of matrices in src.
@param dst output array. It has the same number of cols and depth as the src, and the sum of rows of the src.
\sa cv::hconcat(const Mat*, size_t, OutputArray), \sa cv::hconcat(InputArrayOfArrays, OutputArray) and \sa cv::hconcat(InputArray, InputArray, OutputArray)
*/
@Namespace("cv") public static native void vconcat(@Const Mat src, @Cast("size_t") long nsrc, @ByVal Mat dst);
/** \overload
 <pre>{@code {.cpp}
    cv::Mat_<float> A = (cv::Mat_<float>(3, 2) << 1, 7,
                                                  2, 8,
                                                  3, 9);
    cv::Mat_<float> B = (cv::Mat_<float>(3, 2) << 4, 10,
                                                  5, 11,
                                                  6, 12);

    cv::Mat C;
    cv::vconcat(A, B, C);
    //C:
    //[1, 7;
    // 2, 8;
    // 3, 9;
    // 4, 10;
    // 5, 11;
    // 6, 12]
 }</pre>
 @param src1 first input array to be considered for vertical concatenation.
 @param src2 second input array to be considered for vertical concatenation.
 @param dst output array. It has the same number of cols and depth as the src1 and src2, and the sum of rows of the src1 and src2.
 */
@Namespace("cv") public static native void vconcat(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat dst);
/** \overload
 <pre>{@code {.cpp}
    std::vector<cv::Mat> matrices = { cv::Mat(1, 4, CV_8UC1, cv::Scalar(1)),
                                      cv::Mat(1, 4, CV_8UC1, cv::Scalar(2)),
                                      cv::Mat(1, 4, CV_8UC1, cv::Scalar(3)),};

    cv::Mat out;
    cv::vconcat( matrices, out );
    //out:
    //[1,   1,   1,   1;
    // 2,   2,   2,   2;
    // 3,   3,   3,   3]
 }</pre>
 @param src input array or vector of matrices. all of the matrices must have the same number of cols and the same depth
 @param dst output array. It has the same number of cols and depth as the src, and the sum of rows of the src.
same depth.
 */
@Namespace("cv") public static native void vconcat(@ByVal MatVector src, @ByVal Mat dst);

/** \brief computes bitwise conjunction of the two arrays (dst = src1 & src2)
Calculates the per-element bit-wise conjunction of two arrays or an
array and a scalar.
<p>
The function calculates the per-element bit-wise logical conjunction for:
*   Two arrays when src1 and src2 have the same size:
    \f[\texttt{dst} (I) =  \texttt{src1} (I)  \wedge \texttt{src2} (I) \quad \texttt{if mask} (I) \ne0\f]
*   An array and a scalar when src2 is constructed from Scalar or has
    the same number of elements as {@code src1.channels()}:
    \f[\texttt{dst} (I) =  \texttt{src1} (I)  \wedge \texttt{src2} \quad \texttt{if mask} (I) \ne0\f]
*   A scalar and an array when src1 is constructed from Scalar or has
    the same number of elements as {@code src2.channels()}:
    \f[\texttt{dst} (I) =  \texttt{src1}  \wedge \texttt{src2} (I) \quad \texttt{if mask} (I) \ne0\f]
In case of floating-point arrays, their machine-specific bit
representations (usually IEEE754-compliant) are used for the operation.
In case of multi-channel arrays, each channel is processed
independently. In the second and third cases above, the scalar is first
converted to the array type.
@param src1 first input array or a scalar.
@param src2 second input array or a scalar.
@param dst output array that has the same size and type as the input
arrays.
@param mask optional operation mask, 8-bit single channel array, that
specifies elements of the output array to be changed.
*/
@Namespace("cv") public static native void bitwise_and(@ByVal Mat src1, @ByVal Mat src2,
                              @ByVal Mat dst, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native void bitwise_and(@ByVal Mat src1, @ByVal Mat src2,
                              @ByVal Mat dst);

/** \brief Calculates the per-element bit-wise disjunction of two arrays or an
array and a scalar.
<p>
The function calculates the per-element bit-wise logical disjunction for:
*   Two arrays when src1 and src2 have the same size:
    \f[\texttt{dst} (I) =  \texttt{src1} (I)  \vee \texttt{src2} (I) \quad \texttt{if mask} (I) \ne0\f]
*   An array and a scalar when src2 is constructed from Scalar or has
    the same number of elements as {@code src1.channels()}:
    \f[\texttt{dst} (I) =  \texttt{src1} (I)  \vee \texttt{src2} \quad \texttt{if mask} (I) \ne0\f]
*   A scalar and an array when src1 is constructed from Scalar or has
    the same number of elements as {@code src2.channels()}:
    \f[\texttt{dst} (I) =  \texttt{src1}  \vee \texttt{src2} (I) \quad \texttt{if mask} (I) \ne0\f]
In case of floating-point arrays, their machine-specific bit
representations (usually IEEE754-compliant) are used for the operation.
In case of multi-channel arrays, each channel is processed
independently. In the second and third cases above, the scalar is first
converted to the array type.
@param src1 first input array or a scalar.
@param src2 second input array or a scalar.
@param dst output array that has the same size and type as the input
arrays.
@param mask optional operation mask, 8-bit single channel array, that
specifies elements of the output array to be changed.
*/
@Namespace("cv") public static native void bitwise_or(@ByVal Mat src1, @ByVal Mat src2,
                             @ByVal Mat dst, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native void bitwise_or(@ByVal Mat src1, @ByVal Mat src2,
                             @ByVal Mat dst);

/** \brief Calculates the per-element bit-wise "exclusive or" operation on two
arrays or an array and a scalar.
<p>
The function calculates the per-element bit-wise logical "exclusive-or"
operation for:
*   Two arrays when src1 and src2 have the same size:
    \f[\texttt{dst} (I) =  \texttt{src1} (I)  \oplus \texttt{src2} (I) \quad \texttt{if mask} (I) \ne0\f]
*   An array and a scalar when src2 is constructed from Scalar or has
    the same number of elements as {@code src1.channels()}:
    \f[\texttt{dst} (I) =  \texttt{src1} (I)  \oplus \texttt{src2} \quad \texttt{if mask} (I) \ne0\f]
*   A scalar and an array when src1 is constructed from Scalar or has
    the same number of elements as {@code src2.channels()}:
    \f[\texttt{dst} (I) =  \texttt{src1}  \oplus \texttt{src2} (I) \quad \texttt{if mask} (I) \ne0\f]
In case of floating-point arrays, their machine-specific bit
representations (usually IEEE754-compliant) are used for the operation.
In case of multi-channel arrays, each channel is processed
independently. In the 2nd and 3rd cases above, the scalar is first
converted to the array type.
@param src1 first input array or a scalar.
@param src2 second input array or a scalar.
@param dst output array that has the same size and type as the input
arrays.
@param mask optional operation mask, 8-bit single channel array, that
specifies elements of the output array to be changed.
*/
@Namespace("cv") public static native void bitwise_xor(@ByVal Mat src1, @ByVal Mat src2,
                              @ByVal Mat dst, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native void bitwise_xor(@ByVal Mat src1, @ByVal Mat src2,
                              @ByVal Mat dst);

/** \brief  Inverts every bit of an array.
<p>
The function calculates per-element bit-wise inversion of the input
array:
\f[\texttt{dst} (I) =  \neg \texttt{src} (I)\f]
In case of a floating-point input array, its machine-specific bit
representation (usually IEEE754-compliant) is used for the operation. In
case of multi-channel arrays, each channel is processed independently.
@param src input array.
@param dst output array that has the same size and type as the input
array.
@param mask optional operation mask, 8-bit single channel array, that
specifies elements of the output array to be changed.
*/
@Namespace("cv") public static native void bitwise_not(@ByVal Mat src, @ByVal Mat dst,
                              @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
@Namespace("cv") public static native void bitwise_not(@ByVal Mat src, @ByVal Mat dst);

/** \brief Calculates the per-element absolute difference between two arrays or between an array and a scalar.
<p>
The function absdiff calculates:
*   Absolute difference between two arrays when they have the same
    size and type:
    \f[\texttt{dst}(I) =  \texttt{saturate} (| \texttt{src1}(I) -  \texttt{src2}(I)|)\f]
*   Absolute difference between an array and a scalar when the second
    array is constructed from Scalar or has as many elements as the
    number of channels in {@code src1}:
    \f[\texttt{dst}(I) =  \texttt{saturate} (| \texttt{src1}(I) -  \texttt{src2} |)\f]
*   Absolute difference between a scalar and an array when the first
    array is constructed from Scalar or has as many elements as the
    number of channels in {@code src2}:
    \f[\texttt{dst}(I) =  \texttt{saturate} (| \texttt{src1} -  \texttt{src2}(I) |)\f]
    where I is a multi-dimensional index of array elements. In case of
    multi-channel arrays, each channel is processed independently.
\note Saturation is not applied when the arrays have the depth CV_32S.
You may even get a negative value in the case of overflow.
@param src1 first input array or a scalar.
@param src2 second input array or a scalar.
@param dst output array that has the same size and type as input arrays.
\sa cv::abs(const Mat&)
*/
@Namespace("cv") public static native void absdiff(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat dst);

/** \brief  Checks if array elements lie between the elements of two other arrays.
<p>
The function checks the range as follows:
-   For every element of a single-channel input array:
    \f[\texttt{dst} (I)= \texttt{lowerb} (I)_0  \leq \texttt{src} (I)_0 \leq  \texttt{upperb} (I)_0\f]
-   For two-channel arrays:
    \f[\texttt{dst} (I)= \texttt{lowerb} (I)_0  \leq \texttt{src} (I)_0 \leq  \texttt{upperb} (I)_0  \land \texttt{lowerb} (I)_1  \leq \texttt{src} (I)_1 \leq  \texttt{upperb} (I)_1\f]
-   and so forth.
<p>
That is, dst (I) is set to 255 (all 1 -bits) if src (I) is within the
specified 1D, 2D, 3D, ... box and 0 otherwise.
<p>
When the lower and/or upper boundary parameters are scalars, the indexes
(I) at lowerb and upperb in the above formulas should be omitted.
@param src first input array.
@param lowerb inclusive lower boundary array or a scalar.
@param upperb inclusive upper boundary array or a scalar.
@param dst output array of the same size as src and CV_8U type.
*/
@Namespace("cv") public static native void inRange(@ByVal Mat src, @ByVal Mat lowerb,
                          @ByVal Mat upperb, @ByVal Mat dst);

/** \brief Performs the per-element comparison of two arrays or an array and scalar value.
<p>
The function compares:
*   Elements of two arrays when src1 and src2 have the same size:
    \f[\texttt{dst} (I) =  \texttt{src1} (I)  \,\texttt{cmpop}\, \texttt{src2} (I)\f]
*   Elements of src1 with a scalar src2 when src2 is constructed from
    Scalar or has a single element:
    \f[\texttt{dst} (I) =  \texttt{src1}(I) \,\texttt{cmpop}\,  \texttt{src2}\f]
*   src1 with elements of src2 when src1 is constructed from Scalar or
    has a single element:
    \f[\texttt{dst} (I) =  \texttt{src1}  \,\texttt{cmpop}\, \texttt{src2} (I)\f]
When the comparison result is true, the corresponding element of output
array is set to 255. The comparison operations can be replaced with the
equivalent matrix expressions:
<pre>{@code {.cpp}
    Mat dst1 = src1 >= src2;
    Mat dst2 = src1 < 8;
    ...
}</pre>
@param src1 first input array or a scalar; when it is an array, it must have a single channel.
@param src2 second input array or a scalar; when it is an array, it must have a single channel.
@param dst output array of type ref CV_8U that has the same size and the same number of channels as
    the input arrays.
@param cmpop a flag, that specifies correspondence between the arrays (cv::CmpTypes)
\sa checkRange, min, max, threshold
*/
@Namespace("cv") public static native void compare(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat dst, int cmpop);

/** \brief Calculates per-element minimum of two arrays or an array and a scalar.
<p>
The functions min calculate the per-element minimum of two arrays:
\f[\texttt{dst} (I)= \min ( \texttt{src1} (I), \texttt{src2} (I))\f]
or array and a scalar:
\f[\texttt{dst} (I)= \min ( \texttt{src1} (I), \texttt{value} )\f]
@param src1 first input array.
@param src2 second input array of the same size and type as src1.
@param dst output array of the same size and type as src1.
\sa max, compare, inRange, minMaxLoc
*/
@Namespace("cv") public static native void min(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat dst);
/** \overload
needed to avoid conflicts with const _Tp& std::min(const _Tp&, const _Tp&, _Compare)
*/
/** \overload
needed to avoid conflicts with const _Tp& std::min(const _Tp&, const _Tp&, _Compare)
*/
@Namespace("cv") public static native void min(@Const @ByRef UMat src1, @Const @ByRef UMat src2, @ByRef UMat dst);

/** \brief Calculates per-element maximum of two arrays or an array and a scalar.
<p>
The functions max calculate the per-element maximum of two arrays:
\f[\texttt{dst} (I)= \max ( \texttt{src1} (I), \texttt{src2} (I))\f]
or array and a scalar:
\f[\texttt{dst} (I)= \max ( \texttt{src1} (I), \texttt{value} )\f]
@param src1 first input array.
@param src2 second input array of the same size and type as src1 .
@param dst output array of the same size and type as src1.
\sa  min, compare, inRange, minMaxLoc, \ref MatrixExpressions
*/
@Namespace("cv") public static native void max(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat dst);
/** \overload
needed to avoid conflicts with const _Tp& std::min(const _Tp&, const _Tp&, _Compare)
*/
/** \overload
needed to avoid conflicts with const _Tp& std::min(const _Tp&, const _Tp&, _Compare)
*/
@Namespace("cv") public static native void max(@Const @ByRef UMat src1, @Const @ByRef UMat src2, @ByRef UMat dst);

/** \brief Calculates a square root of array elements.
<p>
The functions sqrt calculate a square root of each input array element.
In case of multi-channel arrays, each channel is processed
independently. The accuracy is approximately the same as of the built-in
std::sqrt .
@param src input floating-point array.
@param dst output array of the same size and type as src.
*/
@Namespace("cv") public static native void sqrt(@ByVal Mat src, @ByVal Mat dst);

/** \brief Raises every array element to a power.
<p>
The function pow raises every element of the input array to power :
\f[\texttt{dst} (I) =  \fork{\texttt{src}(I)^{power}}{if \(\texttt{power}\) is integer}{|\texttt{src}(I)|^{power}}{otherwise}\f]
<p>
So, for a non-integer power exponent, the absolute values of input array
elements are used. However, it is possible to get true values for
negative values using some extra operations. In the example below,
computing the 5th root of array src shows:
<pre>{@code {.cpp}
    Mat mask = src < 0;
    pow(src, 1./5, dst);
    subtract(Scalar::all(0), dst, dst, mask);
}</pre>
For some values of power, such as integer values, 0.5 and -0.5,
specialized faster algorithms are used.
<p>
Special values (NaN, Inf) are not handled.
@param src input array.
@param power exponent of power.
@param dst output array of the same size and type as src.
\sa sqrt, exp, log, cartToPolar, polarToCart
*/
@Namespace("cv") public static native void pow(@ByVal Mat src, double power, @ByVal Mat dst);

/** \brief Calculates the exponent of every array element.
<p>
The function exp calculates the exponent of every element of the input
array:
\f[\texttt{dst} [I] = e^{ src(I) }\f]
<p>
The maximum relative error is about 7e-6 for single-precision input and
less than 1e-10 for double-precision input. Currently, the function
converts denormalized values to zeros on output. Special values (NaN,
Inf) are not handled.
@param src input array.
@param dst output array of the same size and type as src.
\sa log , cartToPolar , polarToCart , phase , pow , sqrt , magnitude
*/
@Namespace("cv") public static native void exp(@ByVal Mat src, @ByVal Mat dst);

/** \brief Calculates the natural logarithm of every array element.
<p>
The function log calculates the natural logarithm of the absolute value
of every element of the input array:
\f[\texttt{dst} (I) =  \fork{\log |\texttt{src}(I)|}{if \(\texttt{src}(I) \ne 0\) }{\texttt{C}}{otherwise}\f]
<p>
where C is a large negative number (about -700 in the current
implementation). The maximum relative error is about 7e-6 for
single-precision input and less than 1e-10 for double-precision input.
Special values (NaN, Inf) are not handled.
@param src input array.
@param dst output array of the same size and type as src .
\sa exp, cartToPolar, polarToCart, phase, pow, sqrt, magnitude
*/
@Namespace("cv") public static native void log(@ByVal Mat src, @ByVal Mat dst);

/** \brief Calculates x and y coordinates of 2D vectors from their magnitude and angle.
<p>
The function polarToCart calculates the Cartesian coordinates of each 2D
vector represented by the corresponding elements of magnitude and angle:
\f[\begin{array}{l} \texttt{x} (I) =  \texttt{magnitude} (I) \cos ( \texttt{angle} (I)) \\ \texttt{y} (I) =  \texttt{magnitude} (I) \sin ( \texttt{angle} (I)) \\ \end{array}\f]
<p>
The relative accuracy of the estimated coordinates is about 1e-6.
@param magnitude input floating-point array of magnitudes of 2D vectors;
it can be an empty matrix (=Mat()), in this case, the function assumes
that all the magnitudes are =1; if it is not empty, it must have the
same size and type as angle.
@param angle input floating-point array of angles of 2D vectors.
@param x output array of x-coordinates of 2D vectors; it has the same
size and type as angle.
@param y output array of y-coordinates of 2D vectors; it has the same
size and type as angle.
@param angleInDegrees when true, the input angles are measured in
degrees, otherwise, they are measured in radians.
\sa cartToPolar, magnitude, phase, exp, log, pow, sqrt
*/
@Namespace("cv") public static native void polarToCart(@ByVal Mat magnitude, @ByVal Mat angle,
                              @ByVal Mat x, @ByVal Mat y, @Cast("bool") boolean angleInDegrees/*=false*/);
@Namespace("cv") public static native void polarToCart(@ByVal Mat magnitude, @ByVal Mat angle,
                              @ByVal Mat x, @ByVal Mat y);

/** \brief Calculates the magnitude and angle of 2D vectors.
<p>
The function cartToPolar calculates either the magnitude, angle, or both
for every 2D vector (x(I),y(I)):
\f[\begin{array}{l} \texttt{magnitude} (I)= \sqrt{\texttt{x}(I)^2+\texttt{y}(I)^2} , \\ \texttt{angle} (I)= \texttt{atan2} ( \texttt{y} (I), \texttt{x} (I))[ \cdot180 / \pi ] \end{array}\f]
<p>
The angles are calculated with accuracy about 0.3 degrees. For the point
(0,0), the angle is set to 0.
@param x array of x-coordinates; this must be a single-precision or
double-precision floating-point array.
@param y array of y-coordinates, that must have the same size and same type as x.
@param magnitude output array of magnitudes of the same size and type as x.
@param angle output array of angles that has the same size and type as
x; the angles are measured in radians (from 0 to 2\*Pi) or in degrees (0 to 360 degrees).
@param angleInDegrees a flag, indicating whether the angles are measured
in radians (which is by default), or in degrees.
\sa Sobel, Scharr
*/
@Namespace("cv") public static native void cartToPolar(@ByVal Mat x, @ByVal Mat y,
                              @ByVal Mat magnitude, @ByVal Mat angle,
                              @Cast("bool") boolean angleInDegrees/*=false*/);
@Namespace("cv") public static native void cartToPolar(@ByVal Mat x, @ByVal Mat y,
                              @ByVal Mat magnitude, @ByVal Mat angle);

/** \brief Calculates the rotation angle of 2D vectors.
<p>
The function phase calculates the rotation angle of each 2D vector that
is formed from the corresponding elements of x and y :
\f[\texttt{angle} (I) =  \texttt{atan2} ( \texttt{y} (I), \texttt{x} (I))\f]
<p>
The angle estimation accuracy is about 0.3 degrees. When x(I)=y(I)=0 ,
the corresponding angle(I) is set to 0.
@param x input floating-point array of x-coordinates of 2D vectors.
@param y input array of y-coordinates of 2D vectors; it must have the
same size and the same type as x.
@param angle output array of vector angles; it has the same size and
same type as x .
@param angleInDegrees when true, the function calculates the angle in
degrees, otherwise, they are measured in radians.
*/
@Namespace("cv") public static native void phase(@ByVal Mat x, @ByVal Mat y, @ByVal Mat angle,
                        @Cast("bool") boolean angleInDegrees/*=false*/);
@Namespace("cv") public static native void phase(@ByVal Mat x, @ByVal Mat y, @ByVal Mat angle);

/** \brief Calculates the magnitude of 2D vectors.
<p>
The function magnitude calculates the magnitude of 2D vectors formed
from the corresponding elements of x and y arrays:
\f[\texttt{dst} (I) =  \sqrt{\texttt{x}(I)^2 + \texttt{y}(I)^2}\f]
@param x floating-point array of x-coordinates of the vectors.
@param y floating-point array of y-coordinates of the vectors; it must
have the same size as x.
@param magnitude output array of the same size and type as x.
\sa cartToPolar, polarToCart, phase, sqrt
*/
@Namespace("cv") public static native void magnitude(@ByVal Mat x, @ByVal Mat y, @ByVal Mat magnitude);

/** \brief Checks every element of an input array for invalid values.
<p>
The functions checkRange check that every array element is neither NaN nor infinite. When minVal \>
-DBL_MAX and maxVal \< DBL_MAX, the functions also check that each value is between minVal and
maxVal. In case of multi-channel arrays, each channel is processed independently. If some values
are out of range, position of the first outlier is stored in pos (when pos != NULL). Then, the
functions either return false (when quiet=true) or throw an exception.
@param a input array.
@param quiet a flag, indicating whether the functions quietly return false when the array elements
are out of range or they throw an exception.
@param pos optional output parameter, when not NULL, must be a pointer to array of src.dims
elements.
@param minVal inclusive lower boundary of valid values range.
@param maxVal exclusive upper boundary of valid values range.
*/
@Namespace("cv") public static native @Cast("bool") boolean checkRange(@ByVal Mat a, @Cast("bool") boolean quiet/*=true*/, Point pos/*=0*/,
                            double minVal/*=-DBL_MAX*/, double maxVal/*=DBL_MAX*/);
@Namespace("cv") public static native @Cast("bool") boolean checkRange(@ByVal Mat a);

/** \brief converts NaN's to the given number
*/
@Namespace("cv") public static native void patchNaNs(@ByVal Mat a, double val/*=0*/);
@Namespace("cv") public static native void patchNaNs(@ByVal Mat a);

/** \brief Performs generalized matrix multiplication.
<p>
The function performs generalized matrix multiplication similar to the
gemm functions in BLAS level 3. For example,
{@code gemm(src1, src2, alpha, src3, beta, dst, GEMM_1_T + GEMM_3_T)}
corresponds to
\f[\texttt{dst} =  \texttt{alpha} \cdot \texttt{src1} ^T  \cdot \texttt{src2} +  \texttt{beta} \cdot \texttt{src3} ^T\f]
<p>
In case of complex (two-channel) data, performed a complex matrix
multiplication.
<p>
The function can be replaced with a matrix expression. For example, the
above call can be replaced with:
<pre>{@code {.cpp}
    dst = alpha*src1.t()*src2 + beta*src3.t();
}</pre>
@param src1 first multiplied input matrix that could be real(CV_32FC1,
CV_64FC1) or complex(CV_32FC2, CV_64FC2).
@param src2 second multiplied input matrix of the same type as src1.
@param alpha weight of the matrix product.
@param src3 third optional delta matrix added to the matrix product; it
should have the same type as src1 and src2.
@param beta weight of src3.
@param dst output matrix; it has the proper size and the same type as
input matrices.
@param flags operation flags (cv::GemmFlags)
\sa mulTransposed , transform
*/
@Namespace("cv") public static native void gemm(@ByVal Mat src1, @ByVal Mat src2, double alpha,
                       @ByVal Mat src3, double beta, @ByVal Mat dst, int flags/*=0*/);
@Namespace("cv") public static native void gemm(@ByVal Mat src1, @ByVal Mat src2, double alpha,
                       @ByVal Mat src3, double beta, @ByVal Mat dst);

/** \brief Calculates the product of a matrix and its transposition.
<p>
The function mulTransposed calculates the product of src and its
transposition:
\f[\texttt{dst} = \texttt{scale} ( \texttt{src} - \texttt{delta} )^T ( \texttt{src} - \texttt{delta} )\f]
if aTa=true , and
\f[\texttt{dst} = \texttt{scale} ( \texttt{src} - \texttt{delta} ) ( \texttt{src} - \texttt{delta} )^T\f]
otherwise. The function is used to calculate the covariance matrix. With
zero delta, it can be used as a faster substitute for general matrix
product A\*B when B=A'
@param src input single-channel matrix. Note that unlike gemm, the
function can multiply not only floating-point matrices.
@param dst output square matrix.
@param aTa Flag specifying the multiplication ordering. See the
description below.
@param delta Optional delta matrix subtracted from src before the
multiplication. When the matrix is empty ( delta=noArray() ), it is
assumed to be zero, that is, nothing is subtracted. If it has the same
size as src , it is simply subtracted. Otherwise, it is "repeated" (see
repeat ) to cover the full src and then subtracted. Type of the delta
matrix, when it is not empty, must be the same as the type of created
output matrix. See the dtype parameter description below.
@param scale Optional scale factor for the matrix product.
@param dtype Optional type of the output matrix. When it is negative,
the output matrix will have the same type as src . Otherwise, it will be
type=CV_MAT_DEPTH(dtype) that should be either CV_32F or CV_64F .
\sa calcCovarMatrix, gemm, repeat, reduce
*/
@Namespace("cv") public static native void mulTransposed( @ByVal Mat src, @ByVal Mat dst, @Cast("bool") boolean aTa,
                                 @ByVal(nullValue = "cv::noArray()") Mat delta/*=cv::noArray()*/,
                                 double scale/*=1*/, int dtype/*=-1*/ );
@Namespace("cv") public static native void mulTransposed( @ByVal Mat src, @ByVal Mat dst, @Cast("bool") boolean aTa );

/** \brief Transposes a matrix.
<p>
The function transpose transposes the matrix src :
\f[\texttt{dst} (i,j) =  \texttt{src} (j,i)\f]
\note No complex conjugation is done in case of a complex matrix. It it
should be done separately if needed.
@param src input array.
@param dst output array of the same type as src.
*/
@Namespace("cv") public static native void transpose(@ByVal Mat src, @ByVal Mat dst);

/** \brief Performs the matrix transformation of every array element.
<p>
The function transform performs the matrix transformation of every
element of the array src and stores the results in dst :
\f[\texttt{dst} (I) =  \texttt{m} \cdot \texttt{src} (I)\f]
(when m.cols=src.channels() ), or
\f[\texttt{dst} (I) =  \texttt{m} \cdot [ \texttt{src} (I); 1]\f]
(when m.cols=src.channels()+1 )
<p>
Every element of the N -channel array src is interpreted as N -element
vector that is transformed using the M x N or M x (N+1) matrix m to
M-element vector - the corresponding element of the output array dst .
<p>
The function may be used for geometrical transformation of
N -dimensional points, arbitrary linear color space transformation (such
as various kinds of RGB to YUV transforms), shuffling the image
channels, and so forth.
@param src input array that must have as many channels (1 to 4) as
m.cols or m.cols-1.
@param dst output array of the same size and depth as src; it has as
many channels as m.rows.
@param m transformation 2x2 or 2x3 floating-point matrix.
\sa perspectiveTransform, getAffineTransform, estimateRigidTransform, warpAffine, warpPerspective
*/
@Namespace("cv") public static native void transform(@ByVal Mat src, @ByVal Mat dst, @ByVal Mat m );

/** \brief Performs the perspective matrix transformation of vectors.
<p>
The function perspectiveTransform transforms every element of src by
treating it as a 2D or 3D vector, in the following way:
\f[(x, y, z)  \rightarrow (x'/w, y'/w, z'/w)\f]
where
\f[(x', y', z', w') =  \texttt{mat} \cdot \begin{bmatrix} x & y & z & 1  \end{bmatrix}\f]
and
\f[w =  \fork{w'}{if \(w' \ne 0\)}{\infty}{otherwise}\f]
<p>
Here a 3D vector transformation is shown. In case of a 2D vector
transformation, the z component is omitted.
<p>
\note The function transforms a sparse set of 2D or 3D vectors. If you
want to transform an image using perspective transformation, use
warpPerspective . If you have an inverse problem, that is, you want to
compute the most probable perspective transformation out of several
pairs of corresponding points, you can use getPerspectiveTransform or
findHomography .
@param src input two-channel or three-channel floating-point array; each
element is a 2D/3D vector to be transformed.
@param dst output array of the same size and type as src.
@param m 3x3 or 4x4 floating-point transformation matrix.
\sa  transform, warpPerspective, getPerspectiveTransform, findHomography
*/
@Namespace("cv") public static native void perspectiveTransform(@ByVal Mat src, @ByVal Mat dst, @ByVal Mat m );

/** \brief Copies the lower or the upper half of a square matrix to another half.
<p>
The function completeSymm copies the lower half of a square matrix to
its another half. The matrix diagonal remains unchanged:
*   \f$\texttt{mtx}_{ij}=\texttt{mtx}_{ji}\f$ for \f$i > j\f$ if
    lowerToUpper=false
*   \f$\texttt{mtx}_{ij}=\texttt{mtx}_{ji}\f$ for \f$i < j\f$ if
    lowerToUpper=true
@param mtx input-output floating-point square matrix.
@param lowerToUpper operation flag; if true, the lower half is copied to
the upper half. Otherwise, the upper half is copied to the lower half.
\sa flip, transpose
*/
@Namespace("cv") public static native void completeSymm(@ByVal Mat mtx, @Cast("bool") boolean lowerToUpper/*=false*/);
@Namespace("cv") public static native void completeSymm(@ByVal Mat mtx);

/** \brief Initializes a scaled identity matrix.
<p>
The function setIdentity initializes a scaled identity matrix:
\f[\texttt{mtx} (i,j)= \fork{\texttt{value}}{ if \(i=j\)}{0}{otherwise}\f]
<p>
The function can also be emulated using the matrix initializers and the
matrix expressions:
<pre>{@code
    Mat A = Mat::eye(4, 3, CV_32F)*5;
    // A will be set to [[5, 0, 0], [0, 5, 0], [0, 0, 5], [0, 0, 0]]
}</pre>
@param mtx matrix to initialize (not necessarily square).
@param s value to assign to diagonal elements.
\sa Mat::zeros, Mat::ones, Mat::setTo, Mat::operator=
*/
@Namespace("cv") public static native void setIdentity(@ByVal Mat mtx, @Const @ByRef(nullValue = "cv::Scalar(1)") Scalar s/*=cv::Scalar(1)*/);
@Namespace("cv") public static native void setIdentity(@ByVal Mat mtx);

/** \brief Returns the determinant of a square floating-point matrix.
<p>
The function determinant calculates and returns the determinant of the
specified matrix. For small matrices ( mtx.cols=mtx.rows\<=3 ), the
direct method is used. For larger matrices, the function uses LU
factorization with partial pivoting.
<p>
For symmetric positively-determined matrices, it is also possible to use
eigen decomposition to calculate the determinant.
@param mtx input matrix that must have CV_32FC1 or CV_64FC1 type and
square size.
\sa trace, invert, solve, eigen, \ref MatrixExpressions
*/
@Namespace("cv") public static native double determinant(@ByVal Mat mtx);

/** \brief Returns the trace of a matrix.
<p>
The function trace returns the sum of the diagonal elements of the
matrix mtx .
\f[\mathrm{tr} ( \texttt{mtx} ) =  \sum _i  \texttt{mtx} (i,i)\f]
@param mtx input matrix.
*/
@Namespace("cv") public static native @ByVal Scalar trace(@ByVal Mat mtx);

/** \brief Finds the inverse or pseudo-inverse of a matrix.
<p>
The function invert inverts the matrix src and stores the result in dst
. When the matrix src is singular or non-square, the function calculates
the pseudo-inverse matrix (the dst matrix) so that norm(src\*dst - I) is
minimal, where I is an identity matrix.
<p>
In case of the DECOMP_LU method, the function returns non-zero value if
the inverse has been successfully calculated and 0 if src is singular.
<p>
In case of the DECOMP_SVD method, the function returns the inverse
condition number of src (the ratio of the smallest singular value to the
largest singular value) and 0 if src is singular. The SVD method
calculates a pseudo-inverse matrix if src is singular.
<p>
Similarly to DECOMP_LU, the method DECOMP_CHOLESKY works only with
non-singular square matrices that should also be symmetrical and
positively defined. In this case, the function stores the inverted
matrix in dst and returns non-zero. Otherwise, it returns 0.
<p>
@param src input floating-point M x N matrix.
@param dst output matrix of N x M size and the same type as src.
@param flags inversion method (cv::DecompTypes)
\sa solve, SVD
*/
@Namespace("cv") public static native double invert(@ByVal Mat src, @ByVal Mat dst, int flags/*=cv::DECOMP_LU*/);
@Namespace("cv") public static native double invert(@ByVal Mat src, @ByVal Mat dst);

/** \brief Solves one or more linear systems or least-squares problems.
<p>
The function solve solves a linear system or least-squares problem (the
latter is possible with SVD or QR methods, or by specifying the flag
DECOMP_NORMAL ):
\f[\texttt{dst} =  \arg \min _X \| \texttt{src1} \cdot \texttt{X} -  \texttt{src2} \|\f]
<p>
If DECOMP_LU or DECOMP_CHOLESKY method is used, the function returns 1
if src1 (or \f$\texttt{src1}^T\texttt{src1}\f$ ) is non-singular. Otherwise,
it returns 0. In the latter case, dst is not valid. Other methods find a
pseudo-solution in case of a singular left-hand side part.
<p>
\note If you want to find a unity-norm solution of an under-defined
singular system \f$\texttt{src1}\cdot\texttt{dst}=0\f$ , the function solve
will not do the work. Use SVD::solveZ instead.
<p>
@param src1 input matrix on the left-hand side of the system.
@param src2 input matrix on the right-hand side of the system.
@param dst output solution.
@param flags solution (matrix inversion) method (cv::DecompTypes)
\sa invert, SVD, eigen
*/
@Namespace("cv") public static native @Cast("bool") boolean solve(@ByVal Mat src1, @ByVal Mat src2,
                        @ByVal Mat dst, int flags/*=cv::DECOMP_LU*/);
@Namespace("cv") public static native @Cast("bool") boolean solve(@ByVal Mat src1, @ByVal Mat src2,
                        @ByVal Mat dst);

/** \brief Sorts each row or each column of a matrix.
<p>
The function sort sorts each matrix row or each matrix column in
ascending or descending order. So you should pass two operation flags to
get desired behaviour. If you want to sort matrix rows or columns
lexicographically, you can use STL std::sort generic function with the
proper comparison predicate.
<p>
@param src input single-channel array.
@param dst output array of the same size and type as src.
@param flags operation flags, a combination of cv::SortFlags
\sa sortIdx, randShuffle
*/
@Namespace("cv") public static native void sort(@ByVal Mat src, @ByVal Mat dst, int flags);

/** \brief Sorts each row or each column of a matrix.
<p>
The function sortIdx sorts each matrix row or each matrix column in the
ascending or descending order. So you should pass two operation flags to
get desired behaviour. Instead of reordering the elements themselves, it
stores the indices of sorted elements in the output array. For example:
<pre>{@code
    Mat A = Mat::eye(3,3,CV_32F), B;
    sortIdx(A, B, SORT_EVERY_ROW + SORT_ASCENDING);
    // B will probably contain
    // (because of equal elements in A some permutations are possible):
    // [[1, 2, 0], [0, 2, 1], [0, 1, 2]]
}</pre>
@param src input single-channel array.
@param dst output integer array of the same size as src.
@param flags operation flags that could be a combination of cv::SortFlags
\sa sort, randShuffle
*/
@Namespace("cv") public static native void sortIdx(@ByVal Mat src, @ByVal Mat dst, int flags);

/** \brief Finds the real roots of a cubic equation.
<p>
The function solveCubic finds the real roots of a cubic equation:
-   if coeffs is a 4-element vector:
\f[\texttt{coeffs} [0] x^3 +  \texttt{coeffs} [1] x^2 +  \texttt{coeffs} [2] x +  \texttt{coeffs} [3] = 0\f]
-   if coeffs is a 3-element vector:
\f[x^3 +  \texttt{coeffs} [0] x^2 +  \texttt{coeffs} [1] x +  \texttt{coeffs} [2] = 0\f]
<p>
The roots are stored in the roots array.
@param coeffs equation coefficients, an array of 3 or 4 elements.
@param roots output array of real roots that has 1 or 3 elements.
*/
@Namespace("cv") public static native int solveCubic(@ByVal Mat coeffs, @ByVal Mat roots);

/** \brief Finds the real or complex roots of a polynomial equation.
<p>
The function solvePoly finds real and complex roots of a polynomial equation:
\f[\texttt{coeffs} [n] x^{n} +  \texttt{coeffs} [n-1] x^{n-1} + ... +  \texttt{coeffs} [1] x +  \texttt{coeffs} [0] = 0\f]
@param coeffs array of polynomial coefficients.
@param roots output (complex) array of roots.
@param maxIters maximum number of iterations the algorithm does.
*/
@Namespace("cv") public static native double solvePoly(@ByVal Mat coeffs, @ByVal Mat roots, int maxIters/*=300*/);
@Namespace("cv") public static native double solvePoly(@ByVal Mat coeffs, @ByVal Mat roots);

/** \brief Calculates eigenvalues and eigenvectors of a symmetric matrix.
<p>
The functions eigen calculate just eigenvalues, or eigenvalues and eigenvectors of the symmetric
matrix src:
<pre>{@code
    src*eigenvectors.row(i).t() = eigenvalues.at<srcType>(i)*eigenvectors.row(i).t()
}</pre>
\note in the new and the old interfaces different ordering of eigenvalues and eigenvectors
parameters is used.
@param src input matrix that must have CV_32FC1 or CV_64FC1 type, square size and be symmetrical
(src ^T^ == src).
@param eigenvalues output vector of eigenvalues of the same type as src; the eigenvalues are stored
in the descending order.
@param eigenvectors output matrix of eigenvectors; it has the same size and type as src; the
eigenvectors are stored as subsequent matrix rows, in the same order as the corresponding
eigenvalues.
\sa completeSymm , PCA
*/
@Namespace("cv") public static native @Cast("bool") boolean eigen(@ByVal Mat src, @ByVal Mat eigenvalues,
                        @ByVal(nullValue = "cv::noArray()") Mat eigenvectors/*=cv::noArray()*/);
@Namespace("cv") public static native @Cast("bool") boolean eigen(@ByVal Mat src, @ByVal Mat eigenvalues);

/** \brief Calculates the covariance matrix of a set of vectors.
<p>
The functions calcCovarMatrix calculate the covariance matrix and, optionally, the mean vector of
the set of input vectors.
@param samples samples stored as separate matrices
@param nsamples number of samples
@param covar output covariance matrix of the type ctype and square size.
@param mean input or output (depending on the flags) array as the average value of the input vectors.
@param flags operation flags as a combination of cv::CovarFlags
@param ctype type of the matrixl; it equals 'CV_64F' by default.
\sa PCA, mulTransposed, Mahalanobis
\todo InputArrayOfArrays
*/
@Namespace("cv") public static native void calcCovarMatrix( @Const Mat samples, int nsamples, @ByRef Mat covar, @ByRef Mat mean,
                                 int flags, int ctype/*=CV_64F*/);
@Namespace("cv") public static native void calcCovarMatrix( @Const Mat samples, int nsamples, @ByRef Mat covar, @ByRef Mat mean,
                                 int flags);

/** \overload
\note use cv::COVAR_ROWS or cv::COVAR_COLS flag
@param samples samples stored as rows/columns of a single matrix.
@param covar output covariance matrix of the type ctype and square size.
@param mean input or output (depending on the flags) array as the average value of the input vectors.
@param flags operation flags as a combination of cv::CovarFlags
@param ctype type of the matrixl; it equals 'CV_64F' by default.
*/
@Namespace("cv") public static native void calcCovarMatrix( @ByVal Mat samples, @ByVal Mat covar,
                                   @ByVal Mat mean, int flags, int ctype/*=CV_64F*/);
@Namespace("cv") public static native void calcCovarMatrix( @ByVal Mat samples, @ByVal Mat covar,
                                   @ByVal Mat mean, int flags);

/** wrap PCA::operator() */
@Namespace("cv") public static native void PCACompute(@ByVal Mat data, @ByVal Mat mean,
                             @ByVal Mat eigenvectors, int maxComponents/*=0*/);
@Namespace("cv") public static native void PCACompute(@ByVal Mat data, @ByVal Mat mean,
                             @ByVal Mat eigenvectors);

/** wrap PCA::operator() */
@Namespace("cv") public static native void PCACompute(@ByVal Mat data, @ByVal Mat mean,
                             @ByVal Mat eigenvectors, double retainedVariance);

/** wrap PCA::project */
@Namespace("cv") public static native void PCAProject(@ByVal Mat data, @ByVal Mat mean,
                             @ByVal Mat eigenvectors, @ByVal Mat result);

/** wrap PCA::backProject */
@Namespace("cv") public static native void PCABackProject(@ByVal Mat data, @ByVal Mat mean,
                                 @ByVal Mat eigenvectors, @ByVal Mat result);

/** wrap SVD::compute */
@Namespace("cv") public static native void SVDecomp( @ByVal Mat src, @ByVal Mat w, @ByVal Mat u, @ByVal Mat vt, int flags/*=0*/ );
@Namespace("cv") public static native void SVDecomp( @ByVal Mat src, @ByVal Mat w, @ByVal Mat u, @ByVal Mat vt );

/** wrap SVD::backSubst */
@Namespace("cv") public static native void SVBackSubst( @ByVal Mat w, @ByVal Mat u, @ByVal Mat vt,
                               @ByVal Mat rhs, @ByVal Mat dst );

/** \brief Calculates the Mahalanobis distance between two vectors.
<p>
The function Mahalanobis calculates and returns the weighted distance between two vectors:
\f[d( \texttt{vec1} , \texttt{vec2} )= \sqrt{\sum_{i,j}{\texttt{icovar(i,j)}\cdot(\texttt{vec1}(I)-\texttt{vec2}(I))\cdot(\texttt{vec1(j)}-\texttt{vec2(j)})} }\f]
The covariance matrix may be calculated using the cv::calcCovarMatrix function and then inverted using
the invert function (preferably using the cv::DECOMP_SVD method, as the most accurate).
@param v1 first 1D input vector.
@param v2 second 1D input vector.
@param icovar inverse covariance matrix.
*/
@Namespace("cv") public static native double Mahalanobis(@ByVal Mat v1, @ByVal Mat v2, @ByVal Mat icovar);

/** \brief Performs a forward or inverse Discrete Fourier transform of a 1D or 2D floating-point array.
<p>
The function performs one of the following:
-   Forward the Fourier transform of a 1D vector of N elements:
    \f[Y = F^{(N)}  \cdot X,\f]
    where \f$F^{(N)}_{jk}=\exp(-2\pi i j k/N)\f$ and \f$i=\sqrt{-1}\f$
-   Inverse the Fourier transform of a 1D vector of N elements:
    \f[\begin{array}{l} X'=  \left (F^{(N)} \right )^{-1}  \cdot Y =  \left (F^{(N)} \right )^*  \cdot y  \\ X = (1/N)  \cdot X, \end{array}\f]
    where \f$F^*=\left(\textrm{Re}(F^{(N)})-\textrm{Im}(F^{(N)})\right)^T\f$
-   Forward the 2D Fourier transform of a M x N matrix:
    \f[Y = F^{(M)}  \cdot X  \cdot F^{(N)}\f]
-   Inverse the 2D Fourier transform of a M x N matrix:
    \f[\begin{array}{l} X'=  \left (F^{(M)} \right )^*  \cdot Y  \cdot \left (F^{(N)} \right )^* \\ X =  \frac{1}{M \cdot N} \cdot X' \end{array}\f]
<p>
In case of real (single-channel) data, the output spectrum of the forward Fourier transform or input
spectrum of the inverse Fourier transform can be represented in a packed format called *CCS*
(complex-conjugate-symmetrical). It was borrowed from IPL (Intel\* Image Processing Library). Here
is how 2D *CCS* spectrum looks:
\f[\begin{bmatrix} Re Y_{0,0} & Re Y_{0,1} & Im Y_{0,1} & Re Y_{0,2} & Im Y_{0,2} &  \cdots & Re Y_{0,N/2-1} & Im Y_{0,N/2-1} & Re Y_{0,N/2}  \\ Re Y_{1,0} & Re Y_{1,1} & Im Y_{1,1} & Re Y_{1,2} & Im Y_{1,2} &  \cdots & Re Y_{1,N/2-1} & Im Y_{1,N/2-1} & Re Y_{1,N/2}  \\ Im Y_{1,0} & Re Y_{2,1} & Im Y_{2,1} & Re Y_{2,2} & Im Y_{2,2} &  \cdots & Re Y_{2,N/2-1} & Im Y_{2,N/2-1} & Im Y_{1,N/2}  \\ \hdotsfor{9} \\ Re Y_{M/2-1,0} &  Re Y_{M-3,1}  & Im Y_{M-3,1} &  \hdotsfor{3} & Re Y_{M-3,N/2-1} & Im Y_{M-3,N/2-1}& Re Y_{M/2-1,N/2}  \\ Im Y_{M/2-1,0} &  Re Y_{M-2,1}  & Im Y_{M-2,1} &  \hdotsfor{3} & Re Y_{M-2,N/2-1} & Im Y_{M-2,N/2-1}& Im Y_{M/2-1,N/2}  \\ Re Y_{M/2,0}  &  Re Y_{M-1,1} &  Im Y_{M-1,1} &  \hdotsfor{3} & Re Y_{M-1,N/2-1} & Im Y_{M-1,N/2-1}& Re Y_{M/2,N/2} \end{bmatrix}\f]
<p>
In case of 1D transform of a real vector, the output looks like the first row of the matrix above.
<p>
So, the function chooses an operation mode depending on the flags and size of the input array:
-   If DFT_ROWS is set or the input array has a single row or single column, the function
    performs a 1D forward or inverse transform of each row of a matrix when DFT_ROWS is set.
    Otherwise, it performs a 2D transform.
-   If the input array is real and DFT_INVERSE is not set, the function performs a forward 1D or
    2D transform:
    -   When DFT_COMPLEX_OUTPUT is set, the output is a complex matrix of the same size as
        input.
    -   When DFT_COMPLEX_OUTPUT is not set, the output is a real matrix of the same size as
        input. In case of 2D transform, it uses the packed format as shown above. In case of a
        single 1D transform, it looks like the first row of the matrix above. In case of
        multiple 1D transforms (when using the DFT_ROWS flag), each row of the output matrix
        looks like the first row of the matrix above.
-   If the input array is complex and either DFT_INVERSE or DFT_REAL_OUTPUT are not set, the
    output is a complex array of the same size as input. The function performs a forward or
    inverse 1D or 2D transform of the whole input array or each row of the input array
    independently, depending on the flags DFT_INVERSE and DFT_ROWS.
-   When DFT_INVERSE is set and the input array is real, or it is complex but DFT_REAL_OUTPUT
    is set, the output is a real array of the same size as input. The function performs a 1D or 2D
    inverse transformation of the whole input array or each individual row, depending on the flags
    DFT_INVERSE and DFT_ROWS.
<p>
If DFT_SCALE is set, the scaling is done after the transformation.
<p>
Unlike dct , the function supports arrays of arbitrary size. But only those arrays are processed
efficiently, whose sizes can be factorized in a product of small prime numbers (2, 3, and 5 in the
current implementation). Such an efficient DFT size can be calculated using the getOptimalDFTSize
method.
<p>
The sample below illustrates how to calculate a DFT-based convolution of two 2D real arrays:
<pre>{@code
    void convolveDFT(InputArray A, InputArray B, OutputArray C)
    {
        // reallocate the output array if needed
        C.create(abs(A.rows - B.rows)+1, abs(A.cols - B.cols)+1, A.type());
        Size dftSize;
        // calculate the size of DFT transform
        dftSize.width = getOptimalDFTSize(A.cols + B.cols - 1);
        dftSize.height = getOptimalDFTSize(A.rows + B.rows - 1);

        // allocate temporary buffers and initialize them with 0's
        Mat tempA(dftSize, A.type(), Scalar::all(0));
        Mat tempB(dftSize, B.type(), Scalar::all(0));

        // copy A and B to the top-left corners of tempA and tempB, respectively
        Mat roiA(tempA, Rect(0,0,A.cols,A.rows));
        A.copyTo(roiA);
        Mat roiB(tempB, Rect(0,0,B.cols,B.rows));
        B.copyTo(roiB);

        // now transform the padded A & B in-place;
        // use "nonzeroRows" hint for faster processing
        dft(tempA, tempA, 0, A.rows);
        dft(tempB, tempB, 0, B.rows);

        // multiply the spectrums;
        // the function handles packed spectrum representations well
        mulSpectrums(tempA, tempB, tempA);

        // transform the product back from the frequency domain.
        // Even though all the result rows will be non-zero,
        // you need only the first C.rows of them, and thus you
        // pass nonzeroRows == C.rows
        dft(tempA, tempA, DFT_INVERSE + DFT_SCALE, C.rows);

        // now copy the result back to C.
        tempA(Rect(0, 0, C.cols, C.rows)).copyTo(C);

        // all the temporary buffers will be deallocated automatically
    }
}</pre>
To optimize this sample, consider the following approaches:
-   Since nonzeroRows != 0 is passed to the forward transform calls and since A and B are copied to
    the top-left corners of tempA and tempB, respectively, it is not necessary to clear the whole
    tempA and tempB. It is only necessary to clear the tempA.cols - A.cols ( tempB.cols - B.cols)
    rightmost columns of the matrices.
-   This DFT-based convolution does not have to be applied to the whole big arrays, especially if B
    is significantly smaller than A or vice versa. Instead, you can calculate convolution by parts.
    To do this, you need to split the output array C into multiple tiles. For each tile, estimate
    which parts of A and B are required to calculate convolution in this tile. If the tiles in C are
    too small, the speed will decrease a lot because of repeated work. In the ultimate case, when
    each tile in C is a single pixel, the algorithm becomes equivalent to the naive convolution
    algorithm. If the tiles are too big, the temporary arrays tempA and tempB become too big and
    there is also a slowdown because of bad cache locality. So, there is an optimal tile size
    somewhere in the middle.
-   If different tiles in C can be calculated in parallel and, thus, the convolution is done by
    parts, the loop can be threaded.
<p>
All of the above improvements have been implemented in matchTemplate and filter2D . Therefore, by
using them, you can get the performance even better than with the above theoretically optimal
implementation. Though, those two functions actually calculate cross-correlation, not convolution,
so you need to "flip" the second convolution operand B vertically and horizontally using flip .
\note
-   An example using the discrete fourier transform can be found at
    opencv_source_code/samples/cpp/dft.cpp
-   (Python) An example using the dft functionality to perform Wiener deconvolution can be found
    at opencv_source/samples/python/deconvolution.py
-   (Python) An example rearranging the quadrants of a Fourier image can be found at
    opencv_source/samples/python/dft.py
@param src input array that could be real or complex.
@param dst output array whose size and type depends on the flags .
@param flags transformation flags, representing a combination of the cv::DftFlags
@param nonzeroRows when the parameter is not zero, the function assumes that only the first
nonzeroRows rows of the input array (DFT_INVERSE is not set) or only the first nonzeroRows of the
output array (DFT_INVERSE is set) contain non-zeros, thus, the function can handle the rest of the
rows more efficiently and save some time; this technique is very useful for calculating array
cross-correlation or convolution using DFT.
\sa dct , getOptimalDFTSize , mulSpectrums, filter2D , matchTemplate , flip , cartToPolar ,
magnitude , phase
*/
@Namespace("cv") public static native void dft(@ByVal Mat src, @ByVal Mat dst, int flags/*=0*/, int nonzeroRows/*=0*/);
@Namespace("cv") public static native void dft(@ByVal Mat src, @ByVal Mat dst);

/** \brief Calculates the inverse Discrete Fourier Transform of a 1D or 2D array.
<p>
idft(src, dst, flags) is equivalent to dft(src, dst, flags | DFT_INVERSE) .
\note None of dft and idft scales the result by default. So, you should pass DFT_SCALE to one of
dft or idft explicitly to make these transforms mutually inverse.
\sa dft, dct, idct, mulSpectrums, getOptimalDFTSize
@param src input floating-point real or complex array.
@param dst output array whose size and type depend on the flags.
@param flags operation flags (see dft and cv::DftFlags).
@param nonzeroRows number of dst rows to process; the rest of the rows have undefined content (see
the convolution sample in dft description.
*/
@Namespace("cv") public static native void idft(@ByVal Mat src, @ByVal Mat dst, int flags/*=0*/, int nonzeroRows/*=0*/);
@Namespace("cv") public static native void idft(@ByVal Mat src, @ByVal Mat dst);

/** \brief Performs a forward or inverse discrete Cosine transform of 1D or 2D array.
<p>
The function dct performs a forward or inverse discrete Cosine transform (DCT) of a 1D or 2D
floating-point array:
-   Forward Cosine transform of a 1D vector of N elements:
    \f[Y = C^{(N)}  \cdot X\f]
    where
    \f[C^{(N)}_{jk}= \sqrt{\alpha_j/N} \cos \left ( \frac{\pi(2k+1)j}{2N} \right )\f]
    and
    \f$\alpha_0=1\f$, \f$\alpha_j=2\f$ for *j \> 0*.
-   Inverse Cosine transform of a 1D vector of N elements:
    \f[X =  \left (C^{(N)} \right )^{-1}  \cdot Y =  \left (C^{(N)} \right )^T  \cdot Y\f]
    (since \f$C^{(N)}\f$ is an orthogonal matrix, \f$C^{(N)} \cdot \left(C^{(N)}\right)^T = I\f$ )
-   Forward 2D Cosine transform of M x N matrix:
    \f[Y = C^{(N)}  \cdot X  \cdot \left (C^{(N)} \right )^T\f]
-   Inverse 2D Cosine transform of M x N matrix:
    \f[X =  \left (C^{(N)} \right )^T  \cdot X  \cdot C^{(N)}\f]
<p>
The function chooses the mode of operation by looking at the flags and size of the input array:
-   If (flags & DCT_INVERSE) == 0 , the function does a forward 1D or 2D transform. Otherwise, it
    is an inverse 1D or 2D transform.
-   If (flags & DCT_ROWS) != 0 , the function performs a 1D transform of each row.
-   If the array is a single column or a single row, the function performs a 1D transform.
-   If none of the above is true, the function performs a 2D transform.
<p>
\note Currently dct supports even-size arrays (2, 4, 6 ...). For data analysis and approximation, you
can pad the array when necessary.
Also, the function performance depends very much, and not monotonically, on the array size (see
getOptimalDFTSize ). In the current implementation DCT of a vector of size N is calculated via DFT
of a vector of size N/2 . Thus, the optimal DCT size N1 \>= N can be calculated as:
<pre>{@code
    size_t getOptimalDCTSize(size_t N) { return 2*getOptimalDFTSize((N+1)/2); }
    N1 = getOptimalDCTSize(N);
}</pre>
@param src input floating-point array.
@param dst output array of the same size and type as src .
@param flags transformation flags as a combination of cv::DftFlags (DCT_*)
\sa dft , getOptimalDFTSize , idct
*/
@Namespace("cv") public static native void dct(@ByVal Mat src, @ByVal Mat dst, int flags/*=0*/);
@Namespace("cv") public static native void dct(@ByVal Mat src, @ByVal Mat dst);

/** \brief Calculates the inverse Discrete Cosine Transform of a 1D or 2D array.
<p>
idct(src, dst, flags) is equivalent to dct(src, dst, flags | DCT_INVERSE).
@param src input floating-point single-channel array.
@param dst output array of the same size and type as src.
@param flags operation flags.
\sa  dct, dft, idft, getOptimalDFTSize
*/
@Namespace("cv") public static native void idct(@ByVal Mat src, @ByVal Mat dst, int flags/*=0*/);
@Namespace("cv") public static native void idct(@ByVal Mat src, @ByVal Mat dst);

/** \brief Performs the per-element multiplication of two Fourier spectrums.
<p>
The function mulSpectrums performs the per-element multiplication of the two CCS-packed or complex
matrices that are results of a real or complex Fourier transform.
<p>
The function, together with dft and idft , may be used to calculate convolution (pass conjB=false )
or correlation (pass conjB=true ) of two arrays rapidly. When the arrays are complex, they are
simply multiplied (per element) with an optional conjugation of the second-array elements. When the
arrays are real, they are assumed to be CCS-packed (see dft for details).
@param a first input array.
@param b second input array of the same size and type as src1 .
@param c output array of the same size and type as src1 .
@param flags operation flags; currently, the only supported flag is cv::DFT_ROWS, which indicates that
each row of src1 and src2 is an independent 1D Fourier spectrum. If you do not want to use this flag, then simply add a {@code 0} as value.
@param conjB optional flag that conjugates the second input array before the multiplication (true)
or not (false).
*/
@Namespace("cv") public static native void mulSpectrums(@ByVal Mat a, @ByVal Mat b, @ByVal Mat c,
                               int flags, @Cast("bool") boolean conjB/*=false*/);
@Namespace("cv") public static native void mulSpectrums(@ByVal Mat a, @ByVal Mat b, @ByVal Mat c,
                               int flags);

/** \brief Returns the optimal DFT size for a given vector size.
<p>
DFT performance is not a monotonic function of a vector size. Therefore, when you calculate
convolution of two arrays or perform the spectral analysis of an array, it usually makes sense to
pad the input data with zeros to get a bit larger array that can be transformed much faster than the
original one. Arrays whose size is a power-of-two (2, 4, 8, 16, 32, ...) are the fastest to process.
Though, the arrays whose size is a product of 2's, 3's, and 5's (for example, 300 = 5\*5\*3\*2\*2)
are also processed quite efficiently.
<p>
The function getOptimalDFTSize returns the minimum number N that is greater than or equal to vecsize
so that the DFT of a vector of size N can be processed efficiently. In the current implementation N
= 2 ^p^ \* 3 ^q^ \* 5 ^r^ for some integer p, q, r.
<p>
The function returns a negative number if vecsize is too large (very close to INT_MAX ).
<p>
While the function cannot be used directly to estimate the optimal vector size for DCT transform
(since the current DCT implementation supports only even-size vectors), it can be easily processed
as getOptimalDFTSize((vecsize+1)/2)\*2.
@param vecsize vector size.
\sa dft , dct , idft , idct , mulSpectrums
*/
@Namespace("cv") public static native int getOptimalDFTSize(int vecsize);

/** \brief Returns the default random number generator.
<p>
The function theRNG returns the default random number generator. For each thread, there is a
separate random number generator, so you can use the function safely in multi-thread environments.
If you just need to get a single random number using this generator or initialize an array, you can
use randu or randn instead. But if you are going to generate many random numbers inside a loop, it
is much faster to use this function to retrieve the generator and then use RNG::operator _Tp() .
\sa RNG, randu, randn
*/
@Namespace("cv") public static native @ByRef RNG theRNG();

/** \brief Generates a single uniformly-distributed random number or an array of random numbers.
<p>
Non-template variant of the function fills the matrix dst with uniformly-distributed
random numbers from the specified range:
\f[\texttt{low} _c  \leq \texttt{dst} (I)_c <  \texttt{high} _c\f]
@param dst output array of random numbers; the array must be pre-allocated.
@param low inclusive lower boundary of the generated random numbers.
@param high exclusive upper boundary of the generated random numbers.
\sa RNG, randn, theRNG
*/
@Namespace("cv") public static native void randu(@ByVal Mat dst, @ByVal Mat low, @ByVal Mat high);

/** \brief Fills the array with normally distributed random numbers.
<p>
The function randn fills the matrix dst with normally distributed random numbers with the specified
mean vector and the standard deviation matrix. The generated random numbers are clipped to fit the
value range of the output array data type.
@param dst output array of random numbers; the array must be pre-allocated and have 1 to 4 channels.
@param mean mean value (expectation) of the generated random numbers.
@param stddev standard deviation of the generated random numbers; it can be either a vector (in
which case a diagonal standard deviation matrix is assumed) or a square matrix.
\sa RNG, randu
*/
@Namespace("cv") public static native void randn(@ByVal Mat dst, @ByVal Mat mean, @ByVal Mat stddev);

/** \brief Shuffles the array elements randomly.
<p>
The function randShuffle shuffles the specified 1D array by randomly choosing pairs of elements and
swapping them. The number of such swap operations will be dst.rows\*dst.cols\*iterFactor .
@param dst input/output numerical 1D array.
@param iterFactor scale factor that determines the number of random swap operations (see the details
below).
@param rng optional random number generator used for shuffling; if it is zero, theRNG () is used
instead.
\sa RNG, sort
*/
@Namespace("cv") public static native void randShuffle(@ByVal Mat dst, double iterFactor/*=1.*/, RNG rng/*=0*/);
@Namespace("cv") public static native void randShuffle(@ByVal Mat dst);

/** \brief Principal Component Analysis
<p>
The class is used to calculate a special basis for a set of vectors. The
basis will consist of eigenvectors of the covariance matrix calculated
from the input set of vectors. The class %PCA can also transform
vectors to/from the new coordinate space defined by the basis. Usually,
in this new coordinate system, each vector from the original set (and
any linear combination of such vectors) can be quite accurately
approximated by taking its first few components, corresponding to the
eigenvectors of the largest eigenvalues of the covariance matrix.
Geometrically it means that you calculate a projection of the vector to
a subspace formed by a few eigenvectors corresponding to the dominant
eigenvalues of the covariance matrix. And usually such a projection is
very close to the original vector. So, you can represent the original
vector from a high-dimensional space with a much shorter vector
consisting of the projected vector's coordinates in the subspace. Such a
transformation is also known as Karhunen-Loeve Transform, or KLT.
See http://en.wikipedia.org/wiki/Principal_component_analysis
<p>
The sample below is the function that takes two matrices. The first
function stores a set of vectors (a row per vector) that is used to
calculate PCA. The second function stores another "test" set of vectors
(a row per vector). First, these vectors are compressed with PCA, then
reconstructed back, and then the reconstruction error norm is computed
and printed for each vector. :
<p>
<pre>{@code {.cpp}
using namespace cv;

PCA compressPCA(const Mat& pcaset, int maxComponents,
                const Mat& testset, Mat& compressed)
{
    PCA pca(pcaset, // pass the data
            Mat(), // we do not have a pre-computed mean vector,
                   // so let the PCA engine to compute it
            PCA::DATA_AS_ROW, // indicate that the vectors
                                // are stored as matrix rows
                                // (use PCA::DATA_AS_COL if the vectors are
                                // the matrix columns)
            maxComponents // specify, how many principal components to retain
            );
    // if there is no test data, just return the computed basis, ready-to-use
    if( !testset.data )
        return pca;
    CV_Assert( testset.cols == pcaset.cols );

    compressed.create(testset.rows, maxComponents, testset.type());

    Mat reconstructed;
    for( int i = 0; i < testset.rows; i++ )
    {
        Mat vec = testset.row(i), coeffs = compressed.row(i), reconstructed;
        // compress the vector, the result will be stored
        // in the i-th row of the output matrix
        pca.project(vec, coeffs);
        // and then reconstruct it
        pca.backProject(coeffs, reconstructed);
        // and measure the error
        printf("%d. diff = %g\n", i, norm(vec, reconstructed, NORM_L2));
    }
    return pca;
}
}</pre>
\sa calcCovarMatrix, mulTransposed, SVD, dft, dct
*/
@Namespace("cv") @NoOffset public static class PCA extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PCA(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public PCA(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public PCA position(int position) {
        return (PCA)super.position(position);
    }

    /** enum cv::PCA::Flags */
    public static final int /** indicates that the input samples are stored as matrix rows */
 DATA_AS_ROW = 0,
                 /** indicates that the input samples are stored as matrix columns */
                 DATA_AS_COL = 1,
                 //!
                 USE_AVG     = 2;  /** */

    /** \brief default constructor
    <p>
    The default constructor initializes an empty %PCA structure. The other
    constructors initialize the structure and call PCA::operator()().
    */
    public PCA() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
    @param data input samples stored as matrix rows or matrix columns.
    @param mean optional mean value; if the matrix is empty (\c noArray()),
    the mean is computed from the data.
    @param flags operation flags; currently the parameter is only used to
    specify the data layout (PCA::Flags)
    @param maxComponents maximum number of components that %PCA should
    retain; by default, all the components are retained.
    */
    public PCA(@ByVal Mat data, @ByVal Mat mean, int flags, int maxComponents/*=0*/) { super((Pointer)null); allocate(data, mean, flags, maxComponents); }
    private native void allocate(@ByVal Mat data, @ByVal Mat mean, int flags, int maxComponents/*=0*/);
    public PCA(@ByVal Mat data, @ByVal Mat mean, int flags) { super((Pointer)null); allocate(data, mean, flags); }
    private native void allocate(@ByVal Mat data, @ByVal Mat mean, int flags);

    /** \overload
    @param data input samples stored as matrix rows or matrix columns.
    @param mean optional mean value; if the matrix is empty (noArray()),
    the mean is computed from the data.
    @param flags operation flags; currently the parameter is only used to
    specify the data layout (PCA::Flags)
    @param retainedVariance Percentage of variance that PCA should retain.
    Using this parameter will let the PCA decided how many components to
    retain but it will always keep at least 2.
    */
    public PCA(@ByVal Mat data, @ByVal Mat mean, int flags, double retainedVariance) { super((Pointer)null); allocate(data, mean, flags, retainedVariance); }
    private native void allocate(@ByVal Mat data, @ByVal Mat mean, int flags, double retainedVariance);

    /** \brief performs %PCA
    <p>
    The operator performs %PCA of the supplied dataset. It is safe to reuse
    the same PCA structure for multiple datasets. That is, if the structure
    has been previously used with another dataset, the existing internal
    data is reclaimed and the new eigenvalues, \ref eigenvectors , and \ref
    mean are allocated and computed.
    <p>
    The computed eigenvalues are sorted from the largest to the smallest and
    the corresponding eigenvectors are stored as eigenvectors rows.
    <p>
    @param data input samples stored as the matrix rows or as the matrix
    columns.
    @param mean optional mean value; if the matrix is empty (noArray()),
    the mean is computed from the data.
    @param flags operation flags; currently the parameter is only used to
    specify the data layout. (Flags)
    @param maxComponents maximum number of components that PCA should
    retain; by default, all the components are retained.
    */
    public native @ByRef @Name("operator ()") PCA apply(@ByVal Mat data, @ByVal Mat mean, int flags, int maxComponents/*=0*/);
    public native @ByRef @Name("operator ()") PCA apply(@ByVal Mat data, @ByVal Mat mean, int flags);

    /** \overload
    @param data input samples stored as the matrix rows or as the matrix
    columns.
    @param mean optional mean value; if the matrix is empty (noArray()),
    the mean is computed from the data.
    @param flags operation flags; currently the parameter is only used to
    specify the data layout. (PCA::Flags)
    @param retainedVariance Percentage of variance that %PCA should retain.
    Using this parameter will let the %PCA decided how many components to
    retain but it will always keep at least 2.
     */
    public native @ByRef @Name("operator ()") PCA apply(@ByVal Mat data, @ByVal Mat mean, int flags, double retainedVariance);

    /** \brief Projects vector(s) to the principal component subspace.
    <p>
    The methods project one or more vectors to the principal component
    subspace, where each vector projection is represented by coefficients in
    the principal component basis. The first form of the method returns the
    matrix that the second form writes to the result. So the first form can
    be used as a part of expression while the second form can be more
    efficient in a processing loop.
    @param vec input vector(s); must have the same dimensionality and the
    same layout as the input data used at %PCA phase, that is, if
    DATA_AS_ROW are specified, then {@code vec.cols==data.cols}
    (vector dimensionality) and {@code vec.rows} is the number of vectors to
    project, and the same is true for the PCA::DATA_AS_COL case.
    */
    public native @ByVal Mat project(@ByVal Mat vec);

    /** \overload
    @param vec input vector(s); must have the same dimensionality and the
    same layout as the input data used at PCA phase, that is, if
    DATA_AS_ROW are specified, then {@code vec.cols==data.cols}
    (vector dimensionality) and {@code vec.rows} is the number of vectors to
    project, and the same is true for the PCA::DATA_AS_COL case.
    @param result output vectors; in case of PCA::DATA_AS_COL, the
    output matrix has as many columns as the number of input vectors, this
    means that {@code result.cols==vec.cols} and the number of rows match the
    number of principal components (for example, {@code maxComponents} parameter
    passed to the constructor).
     */
    public native void project(@ByVal Mat vec, @ByVal Mat result);

    /** \brief Reconstructs vectors from their PC projections.
    <p>
    The methods are inverse operations to PCA::project. They take PC
    coordinates of projected vectors and reconstruct the original vectors.
    Unless all the principal components have been retained, the
    reconstructed vectors are different from the originals. But typically,
    the difference is small if the number of components is large enough (but
    still much smaller than the original vector dimensionality). As a
    result, PCA is used.
    @param vec coordinates of the vectors in the principal component
    subspace, the layout and size are the same as of PCA::project output
    vectors.
     */
    public native @ByVal Mat backProject(@ByVal Mat vec);

    /** \overload
    @param vec coordinates of the vectors in the principal component
    subspace, the layout and size are the same as of PCA::project output
    vectors.
    @param result reconstructed vectors; the layout and size are the same as
    of PCA::project input vectors.
     */
    public native void backProject(@ByVal Mat vec, @ByVal Mat result);

    /** \brief write and load PCA matrix
<p>
*/
    public native void write(@ByRef FileStorage fs );
    public native void read(@Const @ByRef FileNode fs);

    /** eigenvectors of the covariation matrix */
    public native @ByRef Mat eigenvectors(); public native PCA eigenvectors(Mat eigenvectors);
    /** eigenvalues of the covariation matrix */
    public native @ByRef Mat eigenvalues(); public native PCA eigenvalues(Mat eigenvalues);
    /** mean value subtracted before the projection and added after the back projection */
    public native @ByRef Mat mean(); public native PCA mean(Mat mean);
}

/** \example pca.cpp
  An example using %PCA for dimensionality reduction while maintaining an amount of variance
 */

/**
   \brief Linear Discriminant Analysis
   \todo document this class
 */
@Namespace("cv") @NoOffset public static class LDA extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LDA(Pointer p) { super(p); }

    /** \brief constructor
    Initializes a LDA with num_components (default 0).
    */
    public LDA(int num_components/*=0*/) { super((Pointer)null); allocate(num_components); }
    private native void allocate(int num_components/*=0*/);
    public LDA() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Initializes and performs a Discriminant Analysis with Fisher's
     Optimization Criterion on given data in src and corresponding labels
     in labels. If 0 (or less) number of components are given, they are
     automatically determined for given data in computation.
    */
    public LDA(@ByVal MatVector src, @ByVal Mat labels, int num_components/*=0*/) { super((Pointer)null); allocate(src, labels, num_components); }
    private native void allocate(@ByVal MatVector src, @ByVal Mat labels, int num_components/*=0*/);
    public LDA(@ByVal MatVector src, @ByVal Mat labels) { super((Pointer)null); allocate(src, labels); }
    private native void allocate(@ByVal MatVector src, @ByVal Mat labels);

    /** Serializes this object to a given filename.
      */
    public native void save(@Str BytePointer filename);
    public native void save(@Str String filename);

    /** Deserializes this object from a given filename.
      */
    public native void load(@Str BytePointer filename);
    public native void load(@Str String filename);

    /** Serializes this object to a given cv::FileStorage.
      */
    public native void save(@ByRef FileStorage fs);

    /** Deserializes this object from a given cv::FileStorage.
      */
    public native void load(@Const @ByRef FileStorage node);

    /** destructor
      */

    /** Compute the discriminants for data in src (row aligned) and labels.
      */
    public native void compute(@ByVal MatVector src, @ByVal Mat labels);

    /** Projects samples into the LDA subspace.
        src may be one or more row aligned samples.
      */
    public native @ByVal Mat project(@ByVal Mat src);

    /** Reconstructs projections from the LDA subspace.
        src may be one or more row aligned projections.
      */
    public native @ByVal Mat reconstruct(@ByVal Mat src);

    /** Returns the eigenvectors of this LDA.
      */
    public native @ByVal Mat eigenvectors();

    /** Returns the eigenvalues of this LDA.
      */
    public native @ByVal Mat eigenvalues();

    public static native @ByVal Mat subspaceProject(@ByVal Mat W, @ByVal Mat mean, @ByVal Mat src);
    public static native @ByVal Mat subspaceReconstruct(@ByVal Mat W, @ByVal Mat mean, @ByVal Mat src);
}

/** \brief Singular Value Decomposition
<p>
Class for computing Singular Value Decomposition of a floating-point
matrix. The Singular Value Decomposition is used to solve least-square
problems, under-determined linear systems, invert matrices, compute
condition numbers, and so on.
<p>
If you want to compute a condition number of a matrix or an absolute value of
its determinant, you do not need {@code u} and {@code vt}. You can pass
flags=SVD::NO_UV|... . Another flag SVD::FULL_UV indicates that full-size u
and vt must be computed, which is not necessary most of the time.
<p>
\sa invert, solve, eigen, determinant
*/
@Namespace("cv") @NoOffset public static class SVD extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SVD(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public SVD(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public SVD position(int position) {
        return (SVD)super.position(position);
    }

    /** enum cv::SVD::Flags */
    public static final int
        /** allow the algorithm to modify the decomposed matrix; it can save space and speed up
            processing. currently ignored. */
        MODIFY_A = 1,
        /** indicates that only a vector of singular values {@code w} is to be processed, while u and vt
            will be set to empty matrices */
        NO_UV    = 2,
        /** when the matrix is not square, by default the algorithm produces u and vt matrices of
            sufficiently large size for the further A reconstruction; if, however, FULL_UV flag is
            specified, u and vt will be full-size square orthogonal matrices.*/
        FULL_UV  = 4;

    /** \brief the default constructor
    <p>
    initializes an empty SVD structure
      */
    public SVD() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
    initializes an empty SVD structure and then calls SVD::operator()
    @param src decomposed matrix.
    @param flags operation flags (SVD::Flags)
      */
    public SVD( @ByVal Mat src, int flags/*=0*/ ) { super((Pointer)null); allocate(src, flags); }
    private native void allocate( @ByVal Mat src, int flags/*=0*/ );
    public SVD( @ByVal Mat src ) { super((Pointer)null); allocate(src); }
    private native void allocate( @ByVal Mat src );

    /** \brief the operator that performs SVD. The previously allocated u, w and vt are released.
    <p>
    The operator performs the singular value decomposition of the supplied
    matrix. The u,{@code vt} , and the vector of singular values w are stored in
    the structure. The same SVD structure can be reused many times with
    different matrices. Each time, if needed, the previous u,{@code vt} , and w
    are reclaimed and the new matrices are created, which is all handled by
    Mat::create.
    @param src decomposed matrix.
    @param flags operation flags (SVD::Flags)
      */
    public native @ByRef @Name("operator ()") SVD apply( @ByVal Mat src, int flags/*=0*/ );
    public native @ByRef @Name("operator ()") SVD apply( @ByVal Mat src );

    /** \brief decomposes matrix and stores the results to user-provided matrices
    <p>
    The methods/functions perform SVD of matrix. Unlike SVD::SVD constructor
    and SVD::operator(), they store the results to the user-provided
    matrices:
    <p>
    <pre>{@code {.cpp}
    Mat A, w, u, vt;
    SVD::compute(A, w, u, vt);
    }</pre>
    <p>
    @param src decomposed matrix
    @param w calculated singular values
    @param u calculated left singular vectors
    @param vt transposed matrix of right singular values
    @param flags operation flags - see SVD::SVD.
      */
    public static native void compute( @ByVal Mat src, @ByVal Mat w,
                             @ByVal Mat u, @ByVal Mat vt, int flags/*=0*/ );
    public static native void compute( @ByVal Mat src, @ByVal Mat w,
                             @ByVal Mat u, @ByVal Mat vt );

    /** \overload
    computes singular values of a matrix
    @param src decomposed matrix
    @param w calculated singular values
    @param flags operation flags - see SVD::Flags.
      */
    public static native void compute( @ByVal Mat src, @ByVal Mat w, int flags/*=0*/ );
    public static native void compute( @ByVal Mat src, @ByVal Mat w );

    /** \brief performs back substitution
      */
    public static native void backSubst( @ByVal Mat w, @ByVal Mat u,
                               @ByVal Mat vt, @ByVal Mat rhs,
                               @ByVal Mat dst );

    /** \brief solves an under-determined singular linear system
    <p>
    The method finds a unit-length solution x of a singular linear system
    A\*x = 0. Depending on the rank of A, there can be no solutions, a
    single solution or an infinite number of solutions. In general, the
    algorithm solves the following problem:
    \f[dst =  \arg \min _{x:  \| x \| =1}  \| src  \cdot x  \|\f]
    @param src left-hand-side matrix.
    @param dst found solution.
      */
    public static native void solveZ( @ByVal Mat src, @ByVal Mat dst );

    /** \brief performs a singular value back substitution.
    <p>
    The method calculates a back substitution for the specified right-hand
    side:
    <p>
    \f[\texttt{x} =  \texttt{vt} ^T  \cdot diag( \texttt{w} )^{-1}  \cdot \texttt{u} ^T  \cdot \texttt{rhs} \sim \texttt{A} ^{-1}  \cdot \texttt{rhs}\f]
    <p>
    Using this technique you can either get a very accurate solution of the
    convenient linear system, or the best (in the least-squares terms)
    pseudo-solution of an overdetermined linear system.
    <p>
    @param rhs right-hand side of a linear system (u\*w\*v')\*dst = rhs to
    be solved, where A has been previously decomposed.
    <p>
    @param dst found solution of the system.
    <p>
    \note Explicit SVD with the further back substitution only makes sense
    if you need to solve many linear systems with the same left-hand side
    (for example, src ). If all you need is to solve a single system
    (possibly with multiple rhs immediately available), simply call solve
    add pass DECOMP_SVD there. It does absolutely the same thing.
      */
    public native void backSubst( @ByVal Mat rhs, @ByVal Mat dst );

    /** \todo document */

    /** \todo document */

    /** \todo document */

    public native @ByRef Mat u(); public native SVD u(Mat u);
    public native @ByRef Mat w(); public native SVD w(Mat w);
    public native @ByRef Mat vt(); public native SVD vt(Mat vt);
}

/** \brief Random Number Generator
<p>
Random number generator. It encapsulates the state (currently, a 64-bit
integer) and has methods to return scalar random values and to fill
arrays with random values. Currently it supports uniform and Gaussian
(normal) distributions. The generator uses Multiply-With-Carry
algorithm, introduced by G. Marsaglia (
<http://en.wikipedia.org/wiki/Multiply-with-carry> ).
Gaussian-distribution random numbers are generated using the Ziggurat
algorithm ( <http://en.wikipedia.org/wiki/Ziggurat_algorithm> ),
introduced by G. Marsaglia and W. W. Tsang.
*/
@Namespace("cv") @NoOffset public static class RNG extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RNG(Pointer p) { super(p); }

    /** enum cv::RNG:: */
    public static final int UNIFORM = 0,
           NORMAL  = 1;

    /** \brief constructor
    <p>
    These are the RNG constructors. The first form sets the state to some
    pre-defined value, equal to 2\*\*32-1 in the current implementation. The
    second form sets the state to the specified value. If you passed state=0
    , the constructor uses the above default value instead to avoid the
    singular random number sequence, consisting of all zeros.
    */
    public RNG() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** \overload
    @param state 64-bit value used to initialize the RNG.
    */
    public RNG(@Cast("uint64") int state) { super((Pointer)null); allocate(state); }
    private native void allocate(@Cast("uint64") int state);
    /**The method updates the state using the MWC algorithm and returns the
    next 32-bit random number.*/
    public native @Cast("unsigned") int next();

    /**Each of the methods updates the state using the MWC algorithm and
    returns the next random number of the specified type. In case of integer
    types, the returned number is from the available value range for the
    specified type. In case of floating-point types, the returned value is
    from [0,1) range.
    */
    public native @Name("operator uchar") byte asByte();
    /** \overload */
    /** \overload */
    public native @Name("operator ushort") short asShort();
    /** \overload */
    /** \overload */
    public native @Name("operator unsigned") int asInt();
    /** \overload */
    /** \overload */
    public native @Name("operator float") float asFloat();
    /** \overload */
    public native @Name("operator double") double asDouble();

    /** \brief returns a random integer sampled uniformly from [0, N).
    <p>
    The methods transform the state using the MWC algorithm and return the
    next random number. The first form is equivalent to RNG::next . The
    second form returns the random number modulo N , which means that the
    result is in the range [0, N) .
    */
    public native @Cast("unsigned") @Name("operator ()") int apply();
    /** \overload
    @param N upper non-inclusive boundary of the returned random number.
    */
    public native @Cast("unsigned") @Name("operator ()") int apply(@Cast("unsigned") int N);

    /** \brief returns uniformly distributed integer random number from [a,b) range
    <p>
    The methods transform the state using the MWC algorithm and return the
    next uniformly-distributed random number of the specified type, deduced
    from the input parameter type, from the range [a, b) . There is a nuance
    illustrated by the following sample:
    <p>
    <pre>{@code {.cpp}
    RNG rng;

    // always produces 0
    double a = rng.uniform(0, 1);

    // produces double from [0, 1)
    double a1 = rng.uniform((double)0, (double)1);

    // produces float from [0, 1)
    double b = rng.uniform(0.f, 1.f);

    // produces double from [0, 1)
    double c = rng.uniform(0., 1.);

    // may cause compiler error because of ambiguity:
    //  RNG::uniform(0, (int)0.999999)? or RNG::uniform((double)0, 0.99999)?
    double d = rng.uniform(0, 0.999999);
    }</pre>
    <p>
    The compiler does not take into account the type of the variable to
    which you assign the result of RNG::uniform . The only thing that
    matters to the compiler is the type of a and b parameters. So, if you
    want a floating-point random number, but the range boundaries are
    integer numbers, either put dots in the end, if they are constants, or
    use explicit type cast operators, as in the a1 initialization above.
    @param a lower inclusive boundary of the returned random numbers.
    @param b upper non-inclusive boundary of the returned random numbers.
      */
    public native int uniform(int a, int b);
    /** \overload */
    public native float uniform(float a, float b);
    /** \overload */
    public native double uniform(double a, double b);

    /** \brief Fills arrays with random numbers.
    <p>
    @param mat 2D or N-dimensional matrix; currently matrices with more than
    4 channels are not supported by the methods, use Mat::reshape as a
    possible workaround.
    @param distType distribution type, RNG::UNIFORM or RNG::NORMAL.
    @param a first distribution parameter; in case of the uniform
    distribution, this is an inclusive lower boundary, in case of the normal
    distribution, this is a mean value.
    @param b second distribution parameter; in case of the uniform
    distribution, this is a non-inclusive upper boundary, in case of the
    normal distribution, this is a standard deviation (diagonal of the
    standard deviation matrix or the full standard deviation matrix).
    @param saturateRange pre-saturation flag; for uniform distribution only;
    if true, the method will first convert a and b to the acceptable value
    range (according to the mat datatype) and then will generate uniformly
    distributed random numbers within the range [saturate(a), saturate(b)),
    if saturateRange=false, the method will generate uniformly distributed
    random numbers in the original range [a, b) and then will saturate them,
    it means, for example, that
    <tt>theRNG().fill(mat_8u, RNG::UNIFORM, -DBL_MAX, DBL_MAX)</tt> will likely
    produce array mostly filled with 0's and 255's, since the range (0, 255)
    is significantly smaller than [-DBL_MAX, DBL_MAX).
    <p>
    Each of the methods fills the matrix with the random values from the
    specified distribution. As the new numbers are generated, the RNG state
    is updated accordingly. In case of multiple-channel images, every
    channel is filled independently, which means that RNG cannot generate
    samples from the multi-dimensional Gaussian distribution with
    non-diagonal covariance matrix directly. To do that, the method
    generates samples from multi-dimensional standard Gaussian distribution
    with zero mean and identity covariation matrix, and then transforms them
    using transform to get samples from the specified Gaussian distribution.
    */
    public native void fill( @ByVal Mat mat, int distType, @ByVal Mat a, @ByVal Mat b, @Cast("bool") boolean saturateRange/*=false*/ );
    public native void fill( @ByVal Mat mat, int distType, @ByVal Mat a, @ByVal Mat b );

    /** \brief Returns the next random number sampled from the Gaussian distribution
    @param sigma standard deviation of the distribution.
    <p>
    The method transforms the state using the MWC algorithm and returns the
    next random number from the Gaussian distribution N(0,sigma) . That is,
    the mean value of the returned random numbers is zero and the standard
    deviation is the specified sigma .
    */
    public native double gaussian(double sigma);

    public native @Cast("uint64") int state(); public native RNG state(int state);
}

/** \brief Mersenne Twister random number generator
<p>
Inspired by http://www.math.sci.hiroshima-u.ac.jp/~m-mat/MT/MT2002/CODES/mt19937ar.c
\todo document
 */
@Namespace("cv") @NoOffset public static class RNG_MT19937 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RNG_MT19937(Pointer p) { super(p); }

    public RNG_MT19937() { super((Pointer)null); allocate(); }
    private native void allocate();
    public RNG_MT19937(@Cast("unsigned") int s) { super((Pointer)null); allocate(s); }
    private native void allocate(@Cast("unsigned") int s);
    public native void seed(@Cast("unsigned") int s);

    public native @Cast("unsigned") int next();

    public native @Name("operator int") int asInt();
    public native @Name("operator float") float asFloat();
    public native @Name("operator double") double asDouble();

    public native @Cast("unsigned") @Name("operator ()") int apply(@Cast("unsigned") int N);
    public native @Cast("unsigned") @Name("operator ()") int apply();

    /** \brief returns uniformly distributed integer random number from [a,b) range
<p>
*/
    public native int uniform(int a, int b);
    /** \brief returns uniformly distributed floating-point random number from [a,b) range
<p>
*/
    public native float uniform(float a, float b);
    /** \brief returns uniformly distributed double-precision floating-point random number from [a,b) range
<p>
*/
    public native double uniform(double a, double b);
}

/** \} core_array
 <p>
 *  \addtogroup core_cluster
 *   \{
<p>
/** \example kmeans.cpp
  An example on K-means clustering
*/

/** \brief Finds centers of clusters and groups input samples around the clusters.
<p>
The function kmeans implements a k-means algorithm that finds the centers of cluster_count clusters
and groups the input samples around the clusters. As an output, \f$\texttt{labels}_i\f$ contains a
0-based cluster index for the sample stored in the \f$i^{th}\f$ row of the samples matrix.
<p>
\note
-   (Python) An example on K-means clustering can be found at
    opencv_source_code/samples/python/kmeans.py
@param data Data for clustering. An array of N-Dimensional points with float coordinates is needed.
Examples of this array can be:
-   Mat points(count, 2, CV_32F);
-   Mat points(count, 1, CV_32FC2);
-   Mat points(1, count, CV_32FC2);
-   std::vector\<cv::Point2f\> points(sampleCount);
@param K Number of clusters to split the set by.
@param bestLabels Input/output integer array that stores the cluster indices for every sample.
@param criteria The algorithm termination criteria, that is, the maximum number of iterations and/or
the desired accuracy. The accuracy is specified as criteria.epsilon. As soon as each of the cluster
centers moves by less than criteria.epsilon on some iteration, the algorithm stops.
@param attempts Flag to specify the number of times the algorithm is executed using different
initial labellings. The algorithm returns the labels that yield the best compactness (see the last
function parameter).
@param flags Flag that can take values of cv::KmeansFlags
@param centers Output matrix of the cluster centers, one row per each cluster center.
@return The function returns the compactness measure that is computed as
\f[\sum _i  \| \texttt{samples} _i -  \texttt{centers} _{ \texttt{labels} _i} \| ^2\f]
after every attempt. The best (minimum) value is chosen and the corresponding labels and the
compactness value are returned by the function. Basically, you can use only the core of the
function, set the number of attempts to 1, initialize labels each time using a custom algorithm,
pass them with the ( flags = KMEANS_USE_INITIAL_LABELS ) flag, and then choose the best
(most-compact) clustering.
*/
@Namespace("cv") public static native double kmeans( @ByVal Mat data, int K, @ByVal Mat bestLabels,
                            @ByVal TermCriteria criteria, int attempts,
                            int flags, @ByVal(nullValue = "cv::noArray()") Mat centers/*=cv::noArray()*/ );
@Namespace("cv") public static native double kmeans( @ByVal Mat data, int K, @ByVal Mat bestLabels,
                            @ByVal TermCriteria criteria, int attempts,
                            int flags );

/** \} core_cluster
 <p>
 *  \addtogroup core_basic
 *  \{
<p>
/////////////////////////////// Formatted output of cv::Mat ///////////////////////////
<p>
/** \todo document */
@Namespace("cv") public static class Formatted extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Formatted(Pointer p) { super(p); }

    public native @Cast("const char*") BytePointer next();
    public native void reset();
}

/** \todo document */
@Namespace("cv") public static class Formatter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Formatter(Pointer p) { super(p); }

    /** enum cv::Formatter:: */
    public static final int FMT_DEFAULT = 0,
           FMT_MATLAB  = 1,
           FMT_CSV     = 2,
           FMT_PYTHON  = 3,
           FMT_NUMPY   = 4,
           FMT_C       = 5;

    public native @Ptr Formatted format(@Const @ByRef Mat mtx);

    public native void set32fPrecision(int p/*=8*/);
    public native void set32fPrecision();
    public native void set64fPrecision(int p/*=16*/);
    public native void set64fPrecision();
    public native void setMultiline(@Cast("bool") boolean ml/*=true*/);
    public native void setMultiline();

    public static native @Ptr Formatter get(int fmt/*=cv::Formatter::FMT_DEFAULT*/);
    public static native @Ptr Formatter get();

}

@Namespace("cv") public static native @Str @Name("operator <<") BytePointer shiftLeft(@Str BytePointer out, @Ptr Formatted fmtd);
@Namespace("cv") public static native @Str @Name("operator <<") String shiftLeft(@Str String out, @Ptr Formatted fmtd);

@Namespace("cv") public static native @Str @Name("operator <<") BytePointer shiftLeft(@Str BytePointer out, @Const @ByRef Mat mtx);
@Namespace("cv") public static native @Str @Name("operator <<") String shiftLeft(@Str String out, @Const @ByRef Mat mtx);

//////////////////////////////////////// Algorithm ////////////////////////////////////


/** \brief This is a base class for all more or less complex algorithms in OpenCV
<p>
especially for classes of algorithms, for which there can be multiple implementations. The examples
are stereo correspondence (for which there are algorithms like block matching, semi-global block
matching, graph-cut etc.), background subtraction (which can be done using mixture-of-gaussians
models, codebook-based algorithm etc.), optical flow (block matching, Lucas-Kanade, Horn-Schunck
etc.).
<p>
Here is example of SIFT use in your application via Algorithm interface:
<pre>{@code
    #include "opencv2/opencv.hpp"
    #include "opencv2/xfeatures2d.hpp"
    using namespace cv::xfeatures2d;

    Ptr<Feature2D> sift = SIFT::create();
    FileStorage fs("sift_params.xml", FileStorage::READ);
    if( fs.isOpened() ) // if we have file with parameters, read them
    {
        sift->read(fs["sift_params"]);
        fs.release();
    }
    else // else modify the parameters and store them; user can later edit the file to use different parameters
    {
        sift->setContrastThreshold(0.01f); // lower the contrast threshold, compared to the default value
        {
            WriteStructContext ws(fs, "sift_params", CV_NODE_MAP);
            sift->write(fs);
        }
    }
    Mat image = imread("myimage.png", 0), descriptors;
    vector<KeyPoint> keypoints;
    sift->detectAndCompute(image, noArray(), keypoints, descriptors);
}</pre>
 */
@Namespace("cv") public static class Algorithm extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Algorithm(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Algorithm(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Algorithm position(int position) {
        return (Algorithm)super.position(position);
    }

    public Algorithm() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \brief Clears the algorithm state
    */
    public native void clear();

    /** \brief Stores algorithm parameters in a file storage
    */
    public native void write(@ByRef FileStorage fs);

    /** \brief Reads algorithm parameters from a file storage
    */
    public native void read(@Const @ByRef FileNode fn);

    /** \brief Returns true if the Algorithm is empty (e.g. in the very beginning or after unsuccessful read
     */
    public native @Cast("bool") boolean empty();

    /** \brief Reads algorithm from the file node
     <p>
     This is static template method of Algorithm. It's usage is following (in the case of SVM):
     <pre>{@code
     Ptr<SVM> svm = Algorithm::read<SVM>(fn);
     }</pre>
     In order to make this method work, the derived class must overwrite Algorithm::read(const
     FileNode& fn) and also have static create() method without parameters
     (or with all the optional parameters)
     */

    /** \brief Loads algorithm from the file
     <p>
     @param filename Name of the file to read.
     @param objname The optional name of the node to read (if empty, the first top-level node will be used)
     <p>
     This is static template method of Algorithm. It's usage is following (in the case of SVM):
     <pre>{@code
     Ptr<SVM> svm = Algorithm::load<SVM>("my_svm_model.xml");
     }</pre>
     In order to make this method work, the derived class must overwrite Algorithm::read(const
     FileNode& fn).
     */

    /** \brief Loads algorithm from a String
     <p>
     @param strModel The string variable containing the model you want to load.
     @param objname The optional name of the node to read (if empty, the first top-level node will be used)
     <p>
     This is static template method of Algorithm. It's usage is following (in the case of SVM):
     <pre>{@code
     Ptr<SVM> svm = Algorithm::loadFromString<SVM>(myStringModel);
     }</pre>
     */

    /** Saves the algorithm to a file.
     In order to make this method work, the derived class must implement Algorithm::write(FileStorage& fs). */
    public native void save(@Str BytePointer filename);
    public native void save(@Str String filename);

    /** Returns the algorithm string identifier.
     This string is used as top level xml/yml node tag when the object is saved to a file or string. */
    public native @Str BytePointer getDefaultName();
}

@Namespace("cv") public static class Param extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Param() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Param(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Param(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public Param position(int position) {
        return (Param)super.position(position);
    }

    /** enum cv::Param:: */
    public static final int INT= 0, BOOLEAN= 1, REAL= 2, STRING= 3, MAT= 4, MAT_VECTOR= 5, ALGORITHM= 6, FLOAT= 7,
           UNSIGNED_INT= 8, UINT64= 9, UCHAR= 11;
}

/** \} core_basic */

 //namespace cv

// #include "opencv2/core/operations.hpp"
// #include "opencv2/core/cvstd.inl.hpp"
// #include "opencv2/core/utility.hpp"
// #include "opencv2/core/optim.hpp"

// #endif /*__OPENCV_CORE_HPP__*/


// Parsed from <opencv2/core/operations.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Copyright (C) 2015, Itseez Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_CORE_OPERATIONS_HPP__
// #define __OPENCV_CORE_OPERATIONS_HPP__

// #ifndef __cplusplus
// #endif

// #include <cstdio>

/** \cond IGNORED */

////////////////////////////// Matx methods depending on core API /////////////////////////////

 // internal











////////////////////////// Augmenting algebraic & logical operations //////////////////////////

// #define CV_MAT_AUG_OPERATOR1(op, cvop, A, B)
//     static inline A& operator op (A& a, const B& b) { cvop; return a; }

// #define CV_MAT_AUG_OPERATOR(op, cvop, A, B)
//     CV_MAT_AUG_OPERATOR1(op, cvop, A, B)
//     CV_MAT_AUG_OPERATOR1(op, cvop, const A, B)

// #define CV_MAT_AUG_OPERATOR_T(op, cvop, A, B)
//     template<typename _Tp> CV_MAT_AUG_OPERATOR1(op, cvop, A, B)
//     template<typename _Tp> CV_MAT_AUG_OPERATOR1(op, cvop, const A, B)

@Namespace("cv") public static native @ByRef @Name("operator +=") Mat addPut( @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByRef @Name("operator +=") Mat addPut( @ByRef Mat a, @Const @ByRef Scalar b);

@Namespace("cv") public static native @ByRef @Name("operator -=") Mat subtractPut( @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByRef @Name("operator -=") Mat subtractPut( @ByRef Mat a, @Const @ByRef Scalar b);

@Namespace("cv") public static native @ByRef @Name("operator *=") Mat multiplyPut( @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByRef @Name("operator *=") Mat multiplyPut( @ByRef Mat a, double b);

@Namespace("cv") public static native @ByRef @Name("operator /=") Mat dividePut( @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByRef @Name("operator /=") Mat dividePut( @ByRef Mat a, double b);

@Namespace("cv") public static native @ByRef @Name("operator &=") Mat andPut( @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByRef @Name("operator &=") Mat andPut( @ByRef Mat a, @Const @ByRef Scalar b);

@Namespace("cv") public static native @ByRef @Name("operator |=") Mat orPut( @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByRef @Name("operator |=") Mat orPut( @ByRef Mat a, @Const @ByRef Scalar b);

@Namespace("cv") public static native @ByRef @Name("operator ^=") Mat xorPut( @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByRef @Name("operator ^=") Mat xorPut( @ByRef Mat a, @Const @ByRef Scalar b);

// #undef CV_MAT_AUG_OPERATOR_T
// #undef CV_MAT_AUG_OPERATOR
// #undef CV_MAT_AUG_OPERATOR1



///////////////////////////////////////////// SVD /////////////////////////////////////////////













/////////////////////////////////// Multiply-with-Carry RNG ///////////////////////////////////






















/** returns the next unifomly-distributed random number of the specified type */
@Namespace("cv") public static native @Name("randu<int>") int intRand();
@Namespace("cv") public static native @Name("randu<float>") float floatRand();
@Namespace("cv") public static native @Name("randu<double>") double doubleRand();

///////////////////////////////// Formatted string generation /////////////////////////////////

///////////////////////////////// Formatted output of cv::Mat /////////////////////////////////

@Namespace("cv") public static native @Ptr Formatted format(@ByVal Mat mtx, int fmt);

@Namespace("cv") public static native int print(@Ptr Formatted fmtd, @Cast("FILE*") Pointer stream/*=stdout*/);
@Namespace("cv") public static native int print(@Ptr Formatted fmtd);

@Namespace("cv") public static native int print(@Const @ByRef Mat mtx, @Cast("FILE*") Pointer stream/*=stdout*/);
@Namespace("cv") public static native int print(@Const @ByRef Mat mtx);

@Namespace("cv") public static native int print(@Const @ByRef UMat mtx, @Cast("FILE*") Pointer stream/*=stdout*/);
@Namespace("cv") public static native int print(@Const @ByRef UMat mtx);

/** \endcond
<p>
/****************************************************************************************\
*                                  Auxiliary algorithms                                  *
\****************************************************************************************/

/** \brief Splits an element set into equivalency classes.
<p>
The generic function partition implements an \f$O(N^2)\f$ algorithm for splitting a set of \f$N\f$ elements
into one or more equivalency classes, as described in
<http://en.wikipedia.org/wiki/Disjoint-set_data_structure> . The function returns the number of
equivalency classes.
@param _vec Set of elements stored as a vector.
@param labels Output vector of labels. It contains as many elements as vec. Each label labels[i] is
a 0-based cluster index of {@code vec[i]}.
@param predicate Equivalence predicate (pointer to a boolean function of two arguments or an
instance of the class that has the method bool operator()(const _Tp& a, const _Tp& b) ). The
predicate returns true when the elements are certainly in the same class, and returns false if they
may or may not be in the same class.
\ingroup core_cluster
*/

 // cv

// #endif


// Parsed from <opencv2/core/bufferpool.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.
//
// Copyright (C) 2014, Advanced Micro Devices, Inc., all rights reserved.

// #ifndef __OPENCV_CORE_BUFFER_POOL_HPP__
// #define __OPENCV_CORE_BUFFER_POOL_HPP__

/** \addtogroup core
 *  \{ */

@Namespace("cv") public static class BufferPoolController extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BufferPoolController(Pointer p) { super(p); }

    public native @Cast("size_t") long getReservedSize();
    public native @Cast("size_t") long getMaxReservedSize();
    public native void setMaxReservedSize(@Cast("size_t") long size);
    public native void freeAllReservedBuffers();
}

/** \} */



// #endif // __OPENCV_CORE_BUFFER_POOL_HPP__


// Parsed from <opencv2/core/mat.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_CORE_MAT_HPP__
// #define __OPENCV_CORE_MAT_HPP__

// #ifndef __cplusplus
// #endif

// #include "opencv2/core/matx.hpp"
// #include "opencv2/core/types.hpp"

// #include "opencv2/core/bufferpool.hpp"

/** \addtogroup core_basic
 *  \{ */

/** enum cv:: */
public static final int ACCESS_READ= 1<<24, ACCESS_WRITE= 1<<25,
    ACCESS_RW= 3<<24, ACCESS_MASK= ACCESS_RW, ACCESS_FAST= 1<<26;

//////////////////////// Input/Output Array Arguments /////////////////////////////////

/** \brief This is the proxy class for passing read-only input arrays into OpenCV functions.
<p>
It is defined as:
<pre>{@code
    typedef const _InputArray& InputArray;
}</pre>
where _InputArray is a class that can be constructed from {@code Mat}, {@code Mat_<T>}, {@code Matx<T, m, n>},
{@code std::vector<T>}, {@code std::vector<std::vector<T> >} or {@code std::vector<Mat>}. It can also be constructed
from a matrix expression.
<p>
Since this is mostly implementation-level class, and its interface may change in future versions, we
do not describe it in details. There are a few key things, though, that should be kept in mind:
<p>
-   When you see in the reference manual or in OpenCV source code a function that takes
    InputArray, it means that you can actually pass {@code Mat}, {@code Matx}, {@code vector<T>} etc. (see above the
    complete list).
-   Optional input arguments: If some of the input arrays may be empty, pass cv::noArray() (or
    simply cv::Mat() as you probably did before).
-   The class is designed solely for passing parameters. That is, normally you *should not*
    declare class members, local and global variables of this type.
-   If you want to design your own function or a class method that can operate of arrays of
    multiple types, you can use InputArray (or OutputArray) for the respective parameters. Inside
    a function you should use _InputArray::getMat() method to construct a matrix header for the
    array (without copying data). _InputArray::kind() can be used to distinguish Mat from
    {@code vector<>} etc., but normally it is not needed.
<p>
Here is how you can use a function that takes InputArray :
<pre>{@code
    std::vector<Point2f> vec;
    // points or a circle
    for( int i = 0; i < 30; i++ )
        vec.push_back(Point2f((float)(100 + 30*cos(i*CV_PI*2/5)),
                              (float)(100 - 30*sin(i*CV_PI*2/5))));
    cv::transform(vec, vec, cv::Matx23f(0.707, -0.707, 10, 0.707, 0.707, 20));
}</pre>
That is, we form an STL vector containing points, and apply in-place affine transformation to the
vector using the 2x3 matrix created inline as {@code Matx<float, 2, 3>} instance.
<p>
Here is how such a function can be implemented (for simplicity, we implement a very specific case of
it, according to the assertion statement inside) :
<pre>{@code
    void myAffineTransform(InputArray _src, OutputArray _dst, InputArray _m)
    {
        // get Mat headers for input arrays. This is O(1) operation,
        // unless _src and/or _m are matrix expressions.
        Mat src = _src.getMat(), m = _m.getMat();
        CV_Assert( src.type() == CV_32FC2 && m.type() == CV_32F && m.size() == Size(3, 2) );

        // [re]create the output array so that it has the proper size and type.
        // In case of Mat it calls Mat::create, in case of STL vector it calls vector::resize.
        _dst.create(src.size(), src.type());
        Mat dst = _dst.getMat();

        for( int i = 0; i < src.rows; i++ )
            for( int j = 0; j < src.cols; j++ )
            {
                Point2f pt = src.at<Point2f>(i, j);
                dst.at<Point2f>(i, j) = Point2f(m.at<float>(0, 0)*pt.x +
                                                m.at<float>(0, 1)*pt.y +
                                                m.at<float>(0, 2),
                                                m.at<float>(1, 0)*pt.x +
                                                m.at<float>(1, 1)*pt.y +
                                                m.at<float>(1, 2));
            }
    }
}</pre>
There is another related type, InputArrayOfArrays, which is currently defined as a synonym for
InputArray:
<pre>{@code
    typedef InputArray InputArrayOfArrays;
}</pre>
It denotes function arguments that are either vectors of vectors or vectors of matrices. A separate
synonym is needed to generate Python/Java etc. wrappers properly. At the function implementation
level their use is similar, but _InputArray::getMat(idx) should be used to get header for the
idx-th component of the outer vector and _InputArray::size().area() should be used to find the
number of components (vectors/matrices) of the outer vector.
 */


/** \brief This type is very similar to InputArray except that it is used for input/output and output function
parameters.
<p>
Just like with InputArray, OpenCV users should not care about OutputArray, they just pass {@code Mat},
{@code vector<T>} etc. to the functions. The same limitation as for {@code InputArray}: *Do not explicitly
create OutputArray instances* applies here too.
<p>
If you want to make your function polymorphic (i.e. accept different arrays as output parameters),
it is also not very difficult. Take the sample above as the reference. Note that
_OutputArray::create() needs to be called before _OutputArray::getMat(). This way you guarantee
that the output array is properly allocated.
<p>
Optional output parameters. If you do not need certain output array to be computed and returned to
you, pass cv::noArray(), just like you would in the case of optional input array. At the
implementation level, use _OutputArray::needed() to check if certain output array needs to be
computed or not.
<p>
There are several synonyms for OutputArray that are used to assist automatic Python/Java/... wrapper
generators:
<pre>{@code
    typedef OutputArray OutputArrayOfArrays;
    typedef OutputArray InputOutputArray;
    typedef OutputArray InputOutputArrayOfArrays;
}</pre>
 */

public static Mat noArray() { return null; }

/////////////////////////////////// MatAllocator //////////////////////////////////////

/** Usage flags for allocator */
/** enum cv::UMatUsageFlags */
public static final int
    USAGE_DEFAULT = 0,

    // buffer allocation policy is platform and usage specific
    USAGE_ALLOCATE_HOST_MEMORY =  1 << 0,
    USAGE_ALLOCATE_DEVICE_MEMORY =  1 << 1,
    USAGE_ALLOCATE_SHARED_MEMORY =  1 << 2, // It is not equal to: USAGE_ALLOCATE_HOST_MEMORY | USAGE_ALLOCATE_DEVICE_MEMORY

    __UMAT_USAGE_FLAGS_32BIT =  0x7fffffff; // Binary compatibility hint

/** \brief  Custom array allocator
*/
@Namespace("cv") public static class MatAllocator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatAllocator(Pointer p) { super(p); }


    // let's comment it off for now to detect and fix all the uses of allocator
    //virtual void allocate(int dims, const int* sizes, int type, int*& refcount,
    //                      uchar*& datastart, uchar*& data, size_t* step) = 0;
    //virtual void deallocate(int* refcount, uchar* datastart, uchar* data) = 0;
    public native @Name("allocate") UMatData _allocate(int dims, @Const IntPointer sizes, int type,
                                   Pointer data, @Cast("size_t*") SizeTPointer step, int flags, @Cast("cv::UMatUsageFlags") int usageFlags);
    public native @Name("allocate") UMatData _allocate(int dims, @Const IntBuffer sizes, int type,
                                   Pointer data, @Cast("size_t*") SizeTPointer step, int flags, @Cast("cv::UMatUsageFlags") int usageFlags);
    public native @Name("allocate") UMatData _allocate(int dims, @Const int[] sizes, int type,
                                   Pointer data, @Cast("size_t*") SizeTPointer step, int flags, @Cast("cv::UMatUsageFlags") int usageFlags);
    public native @Cast("bool") @Name("allocate") boolean _allocate(UMatData data, int accessflags, @Cast("cv::UMatUsageFlags") int usageFlags);
    public native @Name("deallocate") void _deallocate(UMatData data);
    public native void map(UMatData data, int accessflags);
    public native void unmap(UMatData data);
    public native void download(UMatData data, Pointer dst, int dims, @Cast("const size_t*") SizeTPointer sz,
                              @Cast("const size_t*") SizeTPointer srcofs, @Cast("const size_t*") SizeTPointer srcstep,
                              @Cast("const size_t*") SizeTPointer dststep);
    public native void upload(UMatData data, @Const Pointer src, int dims, @Cast("const size_t*") SizeTPointer sz,
                            @Cast("const size_t*") SizeTPointer dstofs, @Cast("const size_t*") SizeTPointer dststep,
                            @Cast("const size_t*") SizeTPointer srcstep);
    public native void copy(UMatData srcdata, UMatData dstdata, int dims, @Cast("const size_t*") SizeTPointer sz,
                          @Cast("const size_t*") SizeTPointer srcofs, @Cast("const size_t*") SizeTPointer srcstep,
                          @Cast("const size_t*") SizeTPointer dstofs, @Cast("const size_t*") SizeTPointer dststep, @Cast("bool") boolean sync);

    // default implementation returns DummyBufferPoolController
    public native BufferPoolController getBufferPoolController(@Cast("const char*") BytePointer id/*=NULL*/);
    public native BufferPoolController getBufferPoolController();
    public native BufferPoolController getBufferPoolController(String id/*=NULL*/);
}


//////////////////////////////// MatCommaInitializer //////////////////////////////////

/** \brief  Comma-separated Matrix Initializer
 <p>
 The class instances are usually not created explicitly.
 Instead, they are created on "matrix << firstValue" operator.
 <p>
 The sample below initializes 2x2 rotation matrix:
 <p>
 <pre>{@code
 double angle = 30, a = cos(angle*CV_PI/180), b = sin(angle*CV_PI/180);
 Mat R = (Mat_<double>(2,2) << a, -b, b, a);
 }</pre>
*/


/////////////////////////////////////// Mat ///////////////////////////////////////////

// note that umatdata might be allocated together
// with the matrix data, not as a separate object.
// therefore, it does not have constructor or destructor;
// it should be explicitly initialized using init().
@Namespace("cv") @NoOffset public static class UMatData extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UMatData(Pointer p) { super(p); }

    /** enum cv::UMatData:: */
    public static final int COPY_ON_MAP= 1, HOST_COPY_OBSOLETE= 2,
        DEVICE_COPY_OBSOLETE= 4, TEMP_UMAT= 8, TEMP_COPIED_UMAT= 24,
        USER_ALLOCATED= 32, DEVICE_MEM_MAPPED= 64;
    public UMatData(@Const MatAllocator allocator) { super((Pointer)null); allocate(allocator); }
    private native void allocate(@Const MatAllocator allocator);

    // provide atomic access to the structure
    public native void lock();
    public native void unlock();

    public native @Cast("bool") boolean hostCopyObsolete();
    public native @Cast("bool") boolean deviceCopyObsolete();
    public native @Cast("bool") boolean deviceMemMapped();
    public native @Cast("bool") boolean copyOnMap();
    public native @Cast("bool") boolean tempUMat();
    public native @Cast("bool") boolean tempCopiedUMat();
    public native void markHostCopyObsolete(@Cast("bool") boolean flag);
    public native void markDeviceCopyObsolete(@Cast("bool") boolean flag);
    public native void markDeviceMemMapped(@Cast("bool") boolean flag);

    @MemberGetter public native @Const MatAllocator prevAllocator();
    @MemberGetter public native @Const MatAllocator currAllocator();
    public native int urefcount(); public native UMatData urefcount(int urefcount);
    public native int refcount(); public native UMatData refcount(int refcount);
    public native @Cast("uchar*") BytePointer data(); public native UMatData data(BytePointer data);
    public native @Cast("uchar*") BytePointer origdata(); public native UMatData origdata(BytePointer origdata);
    public native @Cast("size_t") long size(); public native UMatData size(long size);

    public native int flags(); public native UMatData flags(int flags);
    public native Pointer handle(); public native UMatData handle(Pointer handle);
    public native Pointer userdata(); public native UMatData userdata(Pointer userdata);
    public native int allocatorFlags_(); public native UMatData allocatorFlags_(int allocatorFlags_);
    public native int mapcount(); public native UMatData mapcount(int mapcount);
    public native UMatData originalUMatData(); public native UMatData originalUMatData(UMatData originalUMatData);
}


@Namespace("cv") @NoOffset public static class UMatDataAutoLock extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UMatDataAutoLock(Pointer p) { super(p); }

    public UMatDataAutoLock(UMatData u) { super((Pointer)null); allocate(u); }
    private native void allocate(UMatData u);
    public native UMatData u(); public native UMatDataAutoLock u(UMatData u);
}


@Namespace("cv") @NoOffset public static class MatSize extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatSize(Pointer p) { super(p); }

    public MatSize(IntPointer _p) { super((Pointer)null); allocate(_p); }
    private native void allocate(IntPointer _p);
    public MatSize(IntBuffer _p) { super((Pointer)null); allocate(_p); }
    private native void allocate(IntBuffer _p);
    public MatSize(int[] _p) { super((Pointer)null); allocate(_p); }
    private native void allocate(int[] _p);
    public native @ByVal @Name("operator ()") Size apply();
    public native @ByRef @Name("operator []") IntPointer get(int i);
    public native @Const @Name("operator const int*") IntPointer asIntPointer();
    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef MatSize sz);
    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef MatSize sz);

    public native IntPointer p(); public native MatSize p(IntPointer p);
}

@Namespace("cv") @NoOffset public static class MatStep extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatStep(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public MatStep(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public MatStep position(int position) {
        return (MatStep)super.position(position);
    }

    public MatStep() { super((Pointer)null); allocate(); }
    private native void allocate();
    public MatStep(@Cast("size_t") long s) { super((Pointer)null); allocate(s); }
    private native void allocate(@Cast("size_t") long s);
    public native @Cast("size_t*") @ByRef @Name("operator []") SizeTPointer get(int i);
    public native @Name("operator size_t") long asLong();
    public native @ByRef @Name("operator =") MatStep put(@Cast("size_t") long s);

    public native @Cast("size_t*") SizeTPointer p(); public native MatStep p(SizeTPointer p);
    public native @Cast("size_t") long buf(int i); public native MatStep buf(int i, long buf);
    @MemberGetter public native @Cast("size_t*") SizeTPointer buf();
}

/** \example cout_mat.cpp
An example demonstrating the serial out capabilities of cv::Mat
*/

 /** \brief n-dimensional dense array class
<p>
The class Mat represents an n-dimensional dense numerical single-channel or multi-channel array. It
can be used to store real or complex-valued vectors and matrices, grayscale or color images, voxel
volumes, vector fields, point clouds, tensors, histograms (though, very high-dimensional histograms
may be better stored in a SparseMat ). The data layout of the array {@code M} is defined by the array
{@code M.step[]}, so that the address of element \f$(i_0,...,i_{M.dims-1})\f$, where \f$0\leq i_k<M.size[k]\f$, is
computed as:
\f[addr(M_{i_0,...,i_{M.dims-1}}) = M.data + M.step[0]*i_0 + M.step[1]*i_1 + ... + M.step[M.dims-1]*i_{M.dims-1}\f]
In case of a 2-dimensional array, the above formula is reduced to:
\f[addr(M_{i,j}) = M.data + M.step[0]*i + M.step[1]*j\f]
Note that {@code M.step[i] >= M.step[i+1]} (in fact, {@code M.step[i] >= M.step[i+1]*M.size[i+1]} ). This means
that 2-dimensional matrices are stored row-by-row, 3-dimensional matrices are stored plane-by-plane,
and so on. M.step[M.dims-1] is minimal and always equal to the element size M.elemSize() .
<p>
So, the data layout in Mat is fully compatible with CvMat, IplImage, and CvMatND types from OpenCV
1.x. It is also compatible with the majority of dense array types from the standard toolkits and
SDKs, such as Numpy (ndarray), Win32 (independent device bitmaps), and others, that is, with any
array that uses *steps* (or *strides*) to compute the position of a pixel. Due to this
compatibility, it is possible to make a Mat header for user-allocated data and process it in-place
using OpenCV functions.
<p>
There are many different ways to create a Mat object. The most popular options are listed below:
<p>
- Use the create(nrows, ncols, type) method or the similar Mat(nrows, ncols, type[, fillValue])
constructor. A new array of the specified size and type is allocated. type has the same meaning as
in the cvCreateMat method. For example, CV_8UC1 means a 8-bit single-channel array, CV_32FC2
means a 2-channel (complex) floating-point array, and so on.
<pre>{@code
    // make a 7x7 complex matrix filled with 1+3j.
    Mat M(7,7,CV_32FC2,Scalar(1,3));
    // and now turn M to a 100x60 15-channel 8-bit matrix.
    // The old content will be deallocated
    M.create(100,60,CV_8UC(15));
}</pre>
As noted in the introduction to this chapter, create() allocates only a new array when the shape
or type of the current array are different from the specified ones.
<p>
- Create a multi-dimensional array:
<pre>{@code
    // create a 100x100x100 8-bit array
    int sz[] = {100, 100, 100};
    Mat bigCube(3, sz, CV_8U, Scalar::all(0));
}</pre>
It passes the number of dimensions =1 to the Mat constructor but the created array will be
2-dimensional with the number of columns set to 1. So, Mat::dims is always \>= 2 (can also be 0
when the array is empty).
<p>
- Use a copy constructor or assignment operator where there can be an array or expression on the
right side (see below). As noted in the introduction, the array assignment is an O(1) operation
because it only copies the header and increases the reference counter. The Mat::clone() method can
be used to get a full (deep) copy of the array when you need it.
<p>
- Construct a header for a part of another array. It can be a single row, single column, several
rows, several columns, rectangular region in the array (called a *minor* in algebra) or a
diagonal. Such operations are also O(1) because the new header references the same data. You can
actually modify a part of the array using this feature, for example:
<pre>{@code
    // add the 5-th row, multiplied by 3 to the 3rd row
    M.row(3) = M.row(3) + M.row(5)*3;
    // now copy the 7-th column to the 1-st column
    // M.col(1) = M.col(7); // this will not work
    Mat M1 = M.col(1);
    M.col(7).copyTo(M1);
    // create a new 320x240 image
    Mat img(Size(320,240),CV_8UC3);
    // select a ROI
    Mat roi(img, Rect(10,10,100,100));
    // fill the ROI with (0,255,0) (which is green in RGB space);
    // the original 320x240 image will be modified
    roi = Scalar(0,255,0);
}</pre>
Due to the additional datastart and dataend members, it is possible to compute a relative
sub-array position in the main *container* array using locateROI():
<pre>{@code
    Mat A = Mat::eye(10, 10, CV_32S);
    // extracts A columns, 1 (inclusive) to 3 (exclusive).
    Mat B = A(Range::all(), Range(1, 3));
    // extracts B rows, 5 (inclusive) to 9 (exclusive).
    // that is, C \~ A(Range(5, 9), Range(1, 3))
    Mat C = B(Range(5, 9), Range::all());
    Size size; Point ofs;
    C.locateROI(size, ofs);
    // size will be (width=10,height=10) and the ofs will be (x=1, y=5)
}</pre>
As in case of whole matrices, if you need a deep copy, use the {@code clone()} method of the extracted
sub-matrices.
<p>
- Make a header for user-allocated data. It can be useful to do the following:
    -# Process "foreign" data using OpenCV (for example, when you implement a DirectShow\* filter or
    a processing module for gstreamer, and so on). For example:
    <pre>{@code
        void process_video_frame(const unsigned char* pixels,
                                 int width, int height, int step)
        {
            Mat img(height, width, CV_8UC3, pixels, step);
            GaussianBlur(img, img, Size(7,7), 1.5, 1.5);
        }
    }</pre>
    -# Quickly initialize small matrices and/or get a super-fast element access.
    <pre>{@code
        double m[3][3] = {{a, b, c}, {d, e, f}, {g, h, i}};
        Mat M = Mat(3, 3, CV_64F, m).inv();
    }</pre>
    .
    Partial yet very common cases of this *user-allocated data* case are conversions from CvMat and
    IplImage to Mat. For this purpose, there is function cv::cvarrToMat taking pointers to CvMat or
    IplImage and the optional flag indicating whether to copy the data or not.
    \snippet samples/cpp/image.cpp iplimage
<p>
- Use MATLAB-style array initializers, zeros(), ones(), eye(), for example:
<pre>{@code
    // create a double-precision identity martix and add it to M.
    M += Mat::eye(M.rows, M.cols, CV_64F);
}</pre>
<p>
- Use a comma-separated initializer:
<pre>{@code
    // create a 3x3 double-precision identity matrix
    Mat M = (Mat_<double>(3,3) << 1, 0, 0, 0, 1, 0, 0, 0, 1);
}</pre>
With this approach, you first call a constructor of the Mat class with the proper parameters, and
then you just put {@code << operator} followed by comma-separated values that can be constants,
variables, expressions, and so on. Also, note the extra parentheses required to avoid compilation
errors.
<p>
Once the array is created, it is automatically managed via a reference-counting mechanism. If the
array header is built on top of user-allocated data, you should handle the data by yourself. The
array data is deallocated when no one points to it. If you want to release the data pointed by a
array header before the array destructor is called, use Mat::release().
<p>
The next important thing to learn about the array class is element access. This manual already
described how to compute an address of each array element. Normally, you are not required to use the
formula directly in the code. If you know the array element type (which can be retrieved using the
method Mat::type() ), you can access the element \f$M_{ij}\f$ of a 2-dimensional array as:
<pre>{@code
    M.at<double>(i,j) += 1.f;
}</pre>
assuming that {@code M} is a double-precision floating-point array. There are several variants of the method
at for a different number of dimensions.
<p>
If you need to process a whole row of a 2D array, the most efficient way is to get the pointer to
the row first, and then just use the plain C operator [] :
<pre>{@code
    // compute sum of positive matrix elements
    // (assuming that M isa double-precision matrix)
    double sum=0;
    for(int i = 0; i < M.rows; i++)
    {
        const double* Mi = M.ptr<double>(i);
        for(int j = 0; j < M.cols; j++)
            sum += std::max(Mi[j], 0.);
    }
}</pre>
Some operations, like the one above, do not actually depend on the array shape. They just process
elements of an array one by one (or elements from multiple arrays that have the same coordinates,
for example, array addition). Such operations are called *element-wise*. It makes sense to check
whether all the input/output arrays are continuous, namely, have no gaps at the end of each row. If
yes, process them as a long single row:
<pre>{@code
    // compute the sum of positive matrix elements, optimized variant
    double sum=0;
    int cols = M.cols, rows = M.rows;
    if(M.isContinuous())
    {
        cols *= rows;
        rows = 1;
    }
    for(int i = 0; i < rows; i++)
    {
        const double* Mi = M.ptr<double>(i);
        for(int j = 0; j < cols; j++)
            sum += std::max(Mi[j], 0.);
    }
}</pre>
In case of the continuous matrix, the outer loop body is executed just once. So, the overhead is
smaller, which is especially noticeable in case of small matrices.
<p>
Finally, there are STL-style iterators that are smart enough to skip gaps between successive rows:
<pre>{@code
    // compute sum of positive matrix elements, iterator-based variant
    double sum=0;
    MatConstIterator_<double> it = M.begin<double>(), it_end = M.end<double>();
    for(; it != it_end; ++it)
        sum += std::max(*it, 0.);
}</pre>
The matrix iterators are random-access iterators, so they can be passed to any STL algorithm,
including std::sort().
*/
@Namespace("cv") @NoOffset public static class Mat extends AbstractMat {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Mat(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Mat(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Mat position(int position) {
        return (Mat)super.position(position);
    }

    /**
    These are various constructors that form a matrix. As noted in the AutomaticAllocation, often
    the default constructor is enough, and the proper matrix will be allocated by an OpenCV function.
    The constructed matrix can further be assigned to another matrix or matrix expression or can be
    allocated with Mat::create . In the former case, the old content is de-referenced.
     */
    public Mat() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
    @param rows Number of rows in a 2D array.
    @param cols Number of columns in a 2D array.
    @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or
    CV_8UC(n), ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    */
    public Mat(int rows, int cols, int type) { super((Pointer)null); allocate(rows, cols, type); }
    private native void allocate(int rows, int cols, int type);

    /** \overload
    @param size 2D array size: Size(cols, rows) . In the Size() constructor, the number of rows and the
    number of columns go in the reverse order.
    @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or
    CV_8UC(n), ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
      */
    public Mat(@ByVal Size size, int type) { super((Pointer)null); allocate(size, type); }
    private native void allocate(@ByVal Size size, int type);

    /** \overload
    @param rows Number of rows in a 2D array.
    @param cols Number of columns in a 2D array.
    @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or
    CV_8UC(n), ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    @param s An optional value to initialize each matrix element with. To set all the matrix elements to
    the particular value after the construction, use the assignment operator
    Mat::operator=(const Scalar& value) .
    */
    public Mat(int rows, int cols, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(rows, cols, type, s); }
    private native void allocate(int rows, int cols, int type, @Const @ByRef Scalar s);

    /** \overload
    @param size 2D array size: Size(cols, rows) . In the Size() constructor, the number of rows and the
    number of columns go in the reverse order.
    @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or
    CV_8UC(n), ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    @param s An optional value to initialize each matrix element with. To set all the matrix elements to
    the particular value after the construction, use the assignment operator
    Mat::operator=(const Scalar& value) .
      */
    public Mat(@ByVal Size size, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(size, type, s); }
    private native void allocate(@ByVal Size size, int type, @Const @ByRef Scalar s);

    /** \overload
    @param ndims Array dimensionality.
    @param sizes Array of integers specifying an n-dimensional array shape.
    @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or
    CV_8UC(n), ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    */
    public Mat(int ndims, @Const IntPointer sizes, int type) { super((Pointer)null); allocate(ndims, sizes, type); }
    private native void allocate(int ndims, @Const IntPointer sizes, int type);
    public Mat(int ndims, @Const IntBuffer sizes, int type) { super((Pointer)null); allocate(ndims, sizes, type); }
    private native void allocate(int ndims, @Const IntBuffer sizes, int type);
    public Mat(int ndims, @Const int[] sizes, int type) { super((Pointer)null); allocate(ndims, sizes, type); }
    private native void allocate(int ndims, @Const int[] sizes, int type);

    /** \overload
    @param ndims Array dimensionality.
    @param sizes Array of integers specifying an n-dimensional array shape.
    @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or
    CV_8UC(n), ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    @param s An optional value to initialize each matrix element with. To set all the matrix elements to
    the particular value after the construction, use the assignment operator
    Mat::operator=(const Scalar& value) .
    */
    public Mat(int ndims, @Const IntPointer sizes, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(ndims, sizes, type, s); }
    private native void allocate(int ndims, @Const IntPointer sizes, int type, @Const @ByRef Scalar s);
    public Mat(int ndims, @Const IntBuffer sizes, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(ndims, sizes, type, s); }
    private native void allocate(int ndims, @Const IntBuffer sizes, int type, @Const @ByRef Scalar s);
    public Mat(int ndims, @Const int[] sizes, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(ndims, sizes, type, s); }
    private native void allocate(int ndims, @Const int[] sizes, int type, @Const @ByRef Scalar s);

    /** \overload
    @param m Array that (as a whole or partly) is assigned to the constructed matrix. No data is copied
    by these constructors. Instead, the header pointing to m data or its sub-array is constructed and
    associated with it. The reference counter, if any, is incremented. So, when you modify the matrix
    formed using such a constructor, you also modify the corresponding elements of m . If you want to
    have an independent copy of the sub-array, use Mat::clone() .
    */
    public Mat(@Const @ByRef Mat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef Mat m);

    /** \overload
    @param rows Number of rows in a 2D array.
    @param cols Number of columns in a 2D array.
    @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or
    CV_8UC(n), ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    @param data Pointer to the user data. Matrix constructors that take data and step parameters do not
    allocate matrix data. Instead, they just initialize the matrix header that points to the specified
    data, which means that no data is copied. This operation is very efficient and can be used to
    process external data using OpenCV functions. The external data is not automatically deallocated, so
    you should take care of it.
    @param step Number of bytes each matrix row occupies. The value should include the padding bytes at
    the end of each row, if any. If the parameter is missing (set to AUTO_STEP ), no padding is assumed
    and the actual step is calculated as cols*elemSize(). See Mat::elemSize.
    */
    public Mat(int rows, int cols, int type, Pointer data, @Cast("size_t") long step/*=AUTO_STEP*/) { super((Pointer)null); allocate(rows, cols, type, data, step); this.data = data; }
    private native void allocate(int rows, int cols, int type, Pointer data, @Cast("size_t") long step/*=AUTO_STEP*/);
    private Pointer data; // a reference to prevent deallocation
    public Mat(int rows, int cols, int type, Pointer data) { this(rows, cols, type, data, AUTO_STEP); }
    public Mat(byte ... b) { this(b, false); }
    public Mat(byte[] b, boolean signed) { this(new BytePointer(b), signed); }
    public Mat(short ... s) { this(s, true); }
    public Mat(short[] s, boolean signed) { this(new ShortPointer(s), signed); }
    public Mat(int ... n) { this(new IntPointer(n)); }
    public Mat(double ... d) { this(new DoublePointer(d)); }
    public Mat(float ... f) { this(new FloatPointer(f)); }
    public Mat(BytePointer p, boolean signed) { this(p.limit - p.position, 1, signed ? CV_8SC1 : CV_8UC1, p); }
    public Mat(ShortPointer p, boolean signed) { this(p.limit - p.position, 1, signed ? CV_16SC1 : CV_16UC1, p); }
    public Mat(IntPointer p) { this(p.limit - p.position, 1, CV_32SC1, p); }
    public Mat(FloatPointer p) { this(p.limit - p.position, 1, CV_32FC1, p); }
    public Mat(DoublePointer p) { this(p.limit - p.position, 1, CV_64FC1, p); }

    /** \overload
    @param size 2D array size: Size(cols, rows) . In the Size() constructor, the number of rows and the
    number of columns go in the reverse order.
    @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or
    CV_8UC(n), ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    @param data Pointer to the user data. Matrix constructors that take data and step parameters do not
    allocate matrix data. Instead, they just initialize the matrix header that points to the specified
    data, which means that no data is copied. This operation is very efficient and can be used to
    process external data using OpenCV functions. The external data is not automatically deallocated, so
    you should take care of it.
    @param step Number of bytes each matrix row occupies. The value should include the padding bytes at
    the end of each row, if any. If the parameter is missing (set to AUTO_STEP ), no padding is assumed
    and the actual step is calculated as cols*elemSize(). See Mat::elemSize.
    */
    public Mat(@ByVal Size size, int type, Pointer data, @Cast("size_t") long step/*=AUTO_STEP*/) { super((Pointer)null); allocate(size, type, data, step); }
    private native void allocate(@ByVal Size size, int type, Pointer data, @Cast("size_t") long step/*=AUTO_STEP*/);
    public Mat(@ByVal Size size, int type, Pointer data) { super((Pointer)null); allocate(size, type, data); }
    private native void allocate(@ByVal Size size, int type, Pointer data);

    /** \overload
    @param ndims Array dimensionality.
    @param sizes Array of integers specifying an n-dimensional array shape.
    @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or
    CV_8UC(n), ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    @param data Pointer to the user data. Matrix constructors that take data and step parameters do not
    allocate matrix data. Instead, they just initialize the matrix header that points to the specified
    data, which means that no data is copied. This operation is very efficient and can be used to
    process external data using OpenCV functions. The external data is not automatically deallocated, so
    you should take care of it.
    @param steps Array of ndims-1 steps in case of a multi-dimensional array (the last step is always
    set to the element size). If not specified, the matrix is assumed to be continuous.
    */
    public Mat(int ndims, @Const IntPointer sizes, int type, Pointer data, @Cast("const size_t*") SizeTPointer steps/*=0*/) { super((Pointer)null); allocate(ndims, sizes, type, data, steps); }
    private native void allocate(int ndims, @Const IntPointer sizes, int type, Pointer data, @Cast("const size_t*") SizeTPointer steps/*=0*/);
    public Mat(int ndims, @Const IntPointer sizes, int type, Pointer data) { super((Pointer)null); allocate(ndims, sizes, type, data); }
    private native void allocate(int ndims, @Const IntPointer sizes, int type, Pointer data);
    public Mat(int ndims, @Const IntBuffer sizes, int type, Pointer data, @Cast("const size_t*") SizeTPointer steps/*=0*/) { super((Pointer)null); allocate(ndims, sizes, type, data, steps); }
    private native void allocate(int ndims, @Const IntBuffer sizes, int type, Pointer data, @Cast("const size_t*") SizeTPointer steps/*=0*/);
    public Mat(int ndims, @Const IntBuffer sizes, int type, Pointer data) { super((Pointer)null); allocate(ndims, sizes, type, data); }
    private native void allocate(int ndims, @Const IntBuffer sizes, int type, Pointer data);
    public Mat(int ndims, @Const int[] sizes, int type, Pointer data, @Cast("const size_t*") SizeTPointer steps/*=0*/) { super((Pointer)null); allocate(ndims, sizes, type, data, steps); }
    private native void allocate(int ndims, @Const int[] sizes, int type, Pointer data, @Cast("const size_t*") SizeTPointer steps/*=0*/);
    public Mat(int ndims, @Const int[] sizes, int type, Pointer data) { super((Pointer)null); allocate(ndims, sizes, type, data); }
    private native void allocate(int ndims, @Const int[] sizes, int type, Pointer data);

    /** \overload
    @param m Array that (as a whole or partly) is assigned to the constructed matrix. No data is copied
    by these constructors. Instead, the header pointing to m data or its sub-array is constructed and
    associated with it. The reference counter, if any, is incremented. So, when you modify the matrix
    formed using such a constructor, you also modify the corresponding elements of m . If you want to
    have an independent copy of the sub-array, use Mat::clone() .
    @param rowRange Range of the m rows to take. As usual, the range start is inclusive and the range
    end is exclusive. Use Range::all() to take all the rows.
    @param colRange Range of the m columns to take. Use Range::all() to take all the columns.
    */
    public Mat(@Const @ByRef Mat m, @Const @ByRef Range rowRange, @Const @ByRef(nullValue = "cv::Range::all()") Range colRange/*=cv::Range::all()*/) { super((Pointer)null); allocate(m, rowRange, colRange); }
    private native void allocate(@Const @ByRef Mat m, @Const @ByRef Range rowRange, @Const @ByRef(nullValue = "cv::Range::all()") Range colRange/*=cv::Range::all()*/);
    public Mat(@Const @ByRef Mat m, @Const @ByRef Range rowRange) { super((Pointer)null); allocate(m, rowRange); }
    private native void allocate(@Const @ByRef Mat m, @Const @ByRef Range rowRange);

    /** \overload
    @param m Array that (as a whole or partly) is assigned to the constructed matrix. No data is copied
    by these constructors. Instead, the header pointing to m data or its sub-array is constructed and
    associated with it. The reference counter, if any, is incremented. So, when you modify the matrix
    formed using such a constructor, you also modify the corresponding elements of m . If you want to
    have an independent copy of the sub-array, use Mat::clone() .
    @param roi Region of interest.
    */
    public Mat(@Const @ByRef Mat m, @Const @ByRef Rect roi) { super((Pointer)null); allocate(m, roi); }
    private native void allocate(@Const @ByRef Mat m, @Const @ByRef Rect roi);

    /** \overload
    @param m Array that (as a whole or partly) is assigned to the constructed matrix. No data is copied
    by these constructors. Instead, the header pointing to m data or its sub-array is constructed and
    associated with it. The reference counter, if any, is incremented. So, when you modify the matrix
    formed using such a constructor, you also modify the corresponding elements of m . If you want to
    have an independent copy of the sub-array, use Mat::clone() .
    @param ranges Array of selected ranges of m along each dimensionality.
    */

    /** \overload
    @param vec STL vector whose elements form the matrix. The matrix has a single column and the number
    of rows equal to the number of vector elements. Type of the matrix matches the type of vector
    elements. The constructor can handle arbitrary types, for which there is a properly declared
    DataType . This means that the vector elements must be primitive numbers or uni-type numerical
    tuples of numbers. Mixed-type structures are not supported. The corresponding constructor is
    explicit. Since STL vectors are not automatically converted to Mat instances, you should write
    Mat(vec) explicitly. Unless you copy the data into the matrix ( copyData=true ), no new elements
    will be added to the vector because it can potentially yield vector data reallocation, and, thus,
    the matrix data pointer will be invalid.
    @param copyData Flag to specify whether the underlying data of the STL vector should be copied
    to (true) or shared with (false) the newly constructed matrix. When the data is copied, the
    allocated buffer is managed using Mat reference counting mechanism. While the data is shared,
    the reference counter is NULL, and you should not deallocate the data until the matrix is not
    destructed.
    */

    /** \overload
    */

    /** \overload
    */

    /** \overload
    */

    /** \overload
    */

    /** \overload
    */

    /** download data from GpuMat */

    /** destructor - calls release() */

    /** \brief assignment operators
    <p>
    These are available assignment operators. Since they all are very different, make sure to read the
    operator parameters description.
    @param m Assigned, right-hand-side matrix. Matrix assignment is an O(1) operation. This means that
    no data is copied but the data is shared and the reference counter, if any, is incremented. Before
    assigning new data, the old data is de-referenced via Mat::release .
     */
    public native @ByRef @Name("operator =") Mat put(@Const @ByRef Mat m);

    /** \overload
    @param expr Assigned matrix expression object. As opposite to the first form of the assignment
    operation, the second form can reuse already allocated matrix if it has the right size and type to
    fit the matrix expression result. It is automatically handled by the real function that the matrix
    expressions is expanded to. For example, C=A+B is expanded to add(A, B, C), and add takes care of
    automatic C reallocation.
    */
    public native @ByRef @Name("operator =") Mat put(@Const @ByRef MatExpr expr);

    /** retrieve UMat from Mat */
    public native @ByVal UMat getUMat(int accessFlags, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native @ByVal UMat getUMat(int accessFlags);

    /** \brief Creates a matrix header for the specified matrix row.
    <p>
    The method makes a new header for the specified matrix row and returns it. This is an O(1)
    operation, regardless of the matrix size. The underlying data of the new matrix is shared with the
    original matrix. Here is the example of one of the classical basic matrix processing operations,
    axpy, used by LU and many other algorithms:
    <pre>{@code
        inline void matrix_axpy(Mat& A, int i, int j, double alpha)
        {
            A.row(i) += A.row(j)*alpha;
        }
    }</pre>
    \note In the current implementation, the following code does not work as expected:
    <pre>{@code
        Mat A;
        ...
        A.row(i) = A.row(j); // will not work
    }</pre>
    This happens because A.row(i) forms a temporary header that is further assigned to another header.
    Remember that each of these operations is O(1), that is, no data is copied. Thus, the above
    assignment is not true if you may have expected the j-th row to be copied to the i-th row. To
    achieve that, you should either turn this simple assignment into an expression or use the
    Mat::copyTo method:
    <pre>{@code
        Mat A;
        ...
        // works, but looks a bit obscure.
        A.row(i) = A.row(j) + 0;
        // this is a bit longer, but the recommended method.
        A.row(j).copyTo(A.row(i));
    }</pre>
    @param y A 0-based row index.
     */
    public native @ByVal Mat row(int y);

    /** \brief Creates a matrix header for the specified matrix column.
    <p>
    The method makes a new header for the specified matrix column and returns it. This is an O(1)
    operation, regardless of the matrix size. The underlying data of the new matrix is shared with the
    original matrix. See also the Mat::row description.
    @param x A 0-based column index.
     */
    public native @ByVal Mat col(int x);

    /** \brief Creates a matrix header for the specified row span.
    <p>
    The method makes a new header for the specified row span of the matrix. Similarly to Mat::row and
    Mat::col , this is an O(1) operation.
    @param startrow An inclusive 0-based start index of the row span.
    @param endrow An exclusive 0-based ending index of the row span.
     */
    public native @ByVal Mat rowRange(int startrow, int endrow);

    /** \overload
    @param r Range structure containing both the start and the end indices.
    */
    public native @ByVal Mat rowRange(@Const @ByRef Range r);

    /** \brief Creates a matrix header for the specified column span.
    <p>
    The method makes a new header for the specified column span of the matrix. Similarly to Mat::row and
    Mat::col , this is an O(1) operation.
    @param startcol An inclusive 0-based start index of the column span.
    @param endcol An exclusive 0-based ending index of the column span.
     */
    public native @ByVal Mat colRange(int startcol, int endcol);

    /** \overload
    @param r Range structure containing both the start and the end indices.
    */
    public native @ByVal Mat colRange(@Const @ByRef Range r);

    /** \brief Extracts a diagonal from a matrix
    <p>
    The method makes a new header for the specified matrix diagonal. The new matrix is represented as a
    single-column matrix. Similarly to Mat::row and Mat::col, this is an O(1) operation.
    @param d index of the diagonal, with the following values:
    - {@code d=0} is the main diagonal.
    - {@code d>0} is a diagonal from the lower half. For example, d=1 means the diagonal is set
      immediately below the main one.
    - {@code d<0} is a diagonal from the upper half. For example, d=-1 means the diagonal is set
      immediately above the main one.
     */
    public native @ByVal Mat diag(int d/*=0*/);
    public native @ByVal Mat diag();

    /** \brief creates a diagonal matrix
    <p>
    The method makes a new header for the specified matrix diagonal. The new matrix is represented as a
    single-column matrix. Similarly to Mat::row and Mat::col, this is an O(1) operation.
    @param d Single-column matrix that forms a diagonal matrix
     */
    public static native @ByVal Mat diag(@Const @ByRef Mat d);

    /** \brief Creates a full copy of the array and the underlying data.
    <p>
    The method creates a full copy of the array. The original step[] is not taken into account. So, the
    array copy is a continuous array occupying total()*elemSize() bytes.
     */
    public native @ByVal Mat clone();

    /** \brief Copies the matrix to another one.
    <p>
    The method copies the matrix data to another matrix. Before copying the data, the method invokes :
    <pre>{@code
        m.create(this->size(), this->type());
    }</pre>
    so that the destination matrix is reallocated if needed. While m.copyTo(m); works flawlessly, the
    function does not handle the case of a partial overlap between the source and the destination
    matrices.
    <p>
    When the operation mask is specified, if the Mat::create call shown above reallocates the matrix,
    the newly allocated matrix is initialized with all zeros before copying the data.
    @param m Destination matrix. If it does not have a proper size or type before the operation, it is
    reallocated.
     */
    public native void copyTo( @ByVal Mat m );

    /** \overload
    @param m Destination matrix. If it does not have a proper size or type before the operation, it is
    reallocated.
    @param mask Operation mask. Its non-zero elements indicate which matrix elements need to be copied.
    The mask has to be of type CV_8U and can have 1 or multiple channels.
    */
    public native void copyTo( @ByVal Mat m, @ByVal Mat mask );

    /** \brief Converts an array to another data type with optional scaling.
    <p>
    The method converts source pixel values to the target data type. saturate_cast\<\> is applied at
    the end to avoid possible overflows:
    <p>
    \f[m(x,y) = saturate \_ cast<rType>( \alpha (*this)(x,y) +  \beta )\f]
    @param m output matrix; if it does not have a proper size or type before the operation, it is
    reallocated.
    @param rtype desired output matrix type or, rather, the depth since the number of channels are the
    same as the input has; if rtype is negative, the output matrix will have the same type as the input.
    @param alpha optional scale factor.
    @param beta optional delta added to the scaled values.
     */
    public native void convertTo( @ByVal Mat m, int rtype, double alpha/*=1*/, double beta/*=0*/ );
    public native void convertTo( @ByVal Mat m, int rtype );

    /** \brief Provides a functional form of convertTo.
    <p>
    This is an internally used method called by the \ref MatrixExpressions engine.
    @param m Destination array.
    @param type Desired destination array depth (or -1 if it should be the same as the source type).
     */
    public native void assignTo( @ByRef Mat m, int type/*=-1*/ );
    public native void assignTo( @ByRef Mat m );

    /** \brief Sets all or some of the array elements to the specified value.
    @param s Assigned scalar converted to the actual array type.
    */
    public native @ByRef @Name("operator =") Mat put(@Const @ByRef Scalar s);

    /** \brief Sets all or some of the array elements to the specified value.
    <p>
    This is an advanced variant of the Mat::operator=(const Scalar& s) operator.
    @param value Assigned scalar converted to the actual array type.
    @param mask Operation mask of the same size as \*this.
     */
    public native @ByRef Mat setTo(@ByVal Mat value, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
    public native @ByRef Mat setTo(@ByVal Mat value);

    /** \brief Changes the shape and/or the number of channels of a 2D matrix without copying the data.
    <p>
    The method makes a new matrix header for \*this elements. The new matrix may have a different size
    and/or different number of channels. Any combination is possible if:
    -   No extra elements are included into the new matrix and no elements are excluded. Consequently,
        the product rows\*cols\*channels() must stay the same after the transformation.
    -   No data is copied. That is, this is an O(1) operation. Consequently, if you change the number of
        rows, or the operation changes the indices of elements row in some other way, the matrix must be
        continuous. See Mat::isContinuous .
    <p>
    For example, if there is a set of 3D points stored as an STL vector, and you want to represent the
    points as a 3xN matrix, do the following:
    <pre>{@code
        std::vector<Point3f> vec;
        ...
        Mat pointMat = Mat(vec). // convert vector to Mat, O(1) operation
                          reshape(1). // make Nx3 1-channel matrix out of Nx1 3-channel.
                                      // Also, an O(1) operation
                             t(); // finally, transpose the Nx3 matrix.
                                  // This involves copying all the elements
    }</pre>
    @param cn New number of channels. If the parameter is 0, the number of channels remains the same.
    @param rows New number of rows. If the parameter is 0, the number of rows remains the same.
     */
    public native @ByVal Mat reshape(int cn, int rows/*=0*/);
    public native @ByVal Mat reshape(int cn);

    /** \overload */
    public native @ByVal Mat reshape(int cn, int newndims, @Const IntPointer newsz);
    public native @ByVal Mat reshape(int cn, int newndims, @Const IntBuffer newsz);
    public native @ByVal Mat reshape(int cn, int newndims, @Const int[] newsz);

    /** \brief Transposes a matrix.
    <p>
    The method performs matrix transposition by means of matrix expressions. It does not perform the
    actual transposition but returns a temporary matrix transposition object that can be further used as
    a part of more complex matrix expressions or can be assigned to a matrix:
    <pre>{@code
        Mat A1 = A + Mat::eye(A.size(), A.type())*lambda;
        Mat C = A1.t()*A1; // compute (A + lambda*I)^t * (A + lamda*I)
    }</pre>
     */
    public native @ByVal MatExpr t();

    /** \brief Inverses a matrix.
    <p>
    The method performs a matrix inversion by means of matrix expressions. This means that a temporary
    matrix inversion object is returned by the method and can be used further as a part of more complex
    matrix expressions or can be assigned to a matrix.
    @param method Matrix inversion method. One of cv::DecompTypes
     */
    public native @ByVal MatExpr inv(int method/*=cv::DECOMP_LU*/);
    public native @ByVal MatExpr inv();

    /** \brief Performs an element-wise multiplication or division of the two matrices.
    <p>
    The method returns a temporary object encoding per-element array multiplication, with optional
    scale. Note that this is not a matrix multiplication that corresponds to a simpler "\*" operator.
    <p>
    Example:
    <pre>{@code
        Mat C = A.mul(5/B); // equivalent to divide(A, B, C, 5)
    }</pre>
    @param m Another array of the same type and the same size as \*this, or a matrix expression.
    @param scale Optional scale factor.
     */
    public native @ByVal MatExpr mul(@ByVal Mat m, double scale/*=1*/);
    public native @ByVal MatExpr mul(@ByVal Mat m);

    /** \brief Computes a cross-product of two 3-element vectors.
    <p>
    The method computes a cross-product of two 3-element vectors. The vectors must be 3-element
    floating-point vectors of the same shape and size. The result is another 3-element vector of the
    same shape and type as operands.
    @param m Another cross-product operand.
     */
    public native @ByVal Mat cross(@ByVal Mat m);

    /** \brief Computes a dot-product of two vectors.
    <p>
    The method computes a dot-product of two matrices. If the matrices are not single-column or
    single-row vectors, the top-to-bottom left-to-right scan ordering is used to treat them as 1D
    vectors. The vectors must have the same size and type. If the matrices have more than one channel,
    the dot products from all the channels are summed together.
    @param m another dot-product operand.
     */
    public native double dot(@ByVal Mat m);

    /** \brief Returns a zero array of the specified size and type.
    <p>
    The method returns a Matlab-style zero array initializer. It can be used to quickly form a constant
    array as a function parameter, part of a matrix expression, or as a matrix initializer. :
    <pre>{@code
        Mat A;
        A = Mat::zeros(3, 3, CV_32F);
    }</pre>
    In the example above, a new matrix is allocated only if A is not a 3x3 floating-point matrix.
    Otherwise, the existing matrix A is filled with zeros.
    @param rows Number of rows.
    @param cols Number of columns.
    @param type Created matrix type.
     */
    public static native @ByVal MatExpr zeros(int rows, int cols, int type);

    /** \overload
    @param size Alternative to the matrix size specification Size(cols, rows) .
    @param type Created matrix type.
    */
    public static native @ByVal MatExpr zeros(@ByVal Size size, int type);

    /** \overload
    @param ndims Array dimensionality.
    @param sz Array of integers specifying the array shape.
    @param type Created matrix type.
    */
    

    /** \brief Returns an array of all 1's of the specified size and type.
    <p>
    The method returns a Matlab-style 1's array initializer, similarly to Mat::zeros. Note that using
    this method you can initialize an array with an arbitrary value, using the following Matlab idiom:
    <pre>{@code
        Mat A = Mat::ones(100, 100, CV_8U)*3; // make 100x100 matrix filled with 3.
    }</pre>
    The above operation does not form a 100x100 matrix of 1's and then multiply it by 3. Instead, it
    just remembers the scale factor (3 in this case) and use it when actually invoking the matrix
    initializer.
    @param rows Number of rows.
    @param cols Number of columns.
    @param type Created matrix type.
     */
    public static native @ByVal MatExpr ones(int rows, int cols, int type);

    /** \overload
    @param size Alternative to the matrix size specification Size(cols, rows) .
    @param type Created matrix type.
    */
    public static native @ByVal MatExpr ones(@ByVal Size size, int type);

    /** \overload
    @param ndims Array dimensionality.
    @param sz Array of integers specifying the array shape.
    @param type Created matrix type.
    */
    

    /** \brief Returns an identity matrix of the specified size and type.
    <p>
    The method returns a Matlab-style identity matrix initializer, similarly to Mat::zeros. Similarly to
    Mat::ones, you can use a scale operation to create a scaled identity matrix efficiently:
    <pre>{@code
        // make a 4x4 diagonal matrix with 0.1's on the diagonal.
        Mat A = Mat::eye(4, 4, CV_32F)*0.1;
    }</pre>
    @param rows Number of rows.
    @param cols Number of columns.
    @param type Created matrix type.
     */
    public static native @ByVal MatExpr eye(int rows, int cols, int type);

    /** \overload
    @param size Alternative matrix size specification as Size(cols, rows) .
    @param type Created matrix type.
    */
    public static native @ByVal MatExpr eye(@ByVal Size size, int type);

    /** \brief Allocates new array data if needed.
    <p>
    This is one of the key Mat methods. Most new-style OpenCV functions and methods that produce arrays
    call this method for each output array. The method uses the following algorithm:
    <p>
    -# If the current array shape and the type match the new ones, return immediately. Otherwise,
       de-reference the previous data by calling Mat::release.
    -# Initialize the new header.
    -# Allocate the new data of total()\*elemSize() bytes.
    -# Allocate the new, associated with the data, reference counter and set it to 1.
    <p>
    Such a scheme makes the memory management robust and efficient at the same time and helps avoid
    extra typing for you. This means that usually there is no need to explicitly allocate output arrays.
    That is, instead of writing:
    <pre>{@code
        Mat color;
        ...
        Mat gray(color.rows, color.cols, color.depth());
        cvtColor(color, gray, COLOR_BGR2GRAY);
    }</pre>
    you can simply write:
    <pre>{@code
        Mat color;
        ...
        Mat gray;
        cvtColor(color, gray, COLOR_BGR2GRAY);
    }</pre>
    because cvtColor, as well as the most of OpenCV functions, calls Mat::create() for the output array
    internally.
    @param rows New number of rows.
    @param cols New number of columns.
    @param type New matrix type.
     */
    public native void create(int rows, int cols, int type);

    /** \overload
    @param size Alternative new matrix size specification: Size(cols, rows)
    @param type New matrix type.
    */
    public native void create(@ByVal Size size, int type);

    /** \overload
    @param ndims New array dimensionality.
    @param sizes Array of integers specifying a new array shape.
    @param type New matrix type.
    */
    public native void create(int ndims, @Const IntPointer sizes, int type);
    public native void create(int ndims, @Const IntBuffer sizes, int type);
    public native void create(int ndims, @Const int[] sizes, int type);

    /** \brief Increments the reference counter.
    <p>
    The method increments the reference counter associated with the matrix data. If the matrix header
    points to an external data set (see Mat::Mat ), the reference counter is NULL, and the method has no
    effect in this case. Normally, to avoid memory leaks, the method should not be called explicitly. It
    is called implicitly by the matrix assignment operator. The reference counter increment is an atomic
    operation on the platforms that support it. Thus, it is safe to operate on the same matrices
    asynchronously in different threads.
     */
    public native void addref();

    /** \brief Decrements the reference counter and deallocates the matrix if needed.
    <p>
    The method decrements the reference counter associated with the matrix data. When the reference
    counter reaches 0, the matrix data is deallocated and the data and the reference counter pointers
    are set to NULL's. If the matrix header points to an external data set (see Mat::Mat ), the
    reference counter is NULL, and the method has no effect in this case.
    <p>
    This method can be called manually to force the matrix data deallocation. But since this method is
    automatically called in the destructor, or by any other method that changes the data pointer, it is
    usually not needed. The reference counter decrement and check for 0 is an atomic operation on the
    platforms that support it. Thus, it is safe to operate on the same matrices asynchronously in
    different threads.
     */
    public native void release();

    /** deallocates the matrix data */
    public native @Name("deallocate") void _deallocate();
    /** internal use function; properly re-allocates _size, _step arrays */
    public native void copySize(@Const @ByRef Mat m);

    /** \brief Reserves space for the certain number of rows.
    <p>
    The method reserves space for sz rows. If the matrix already has enough space to store sz rows,
    nothing happens. If the matrix is reallocated, the first Mat::rows rows are preserved. The method
    emulates the corresponding method of the STL vector class.
    @param sz Number of rows.
     */
    public native void reserve(@Cast("size_t") long sz);

    /** \brief Changes the number of matrix rows.
    <p>
    The methods change the number of matrix rows. If the matrix is reallocated, the first
    min(Mat::rows, sz) rows are preserved. The methods emulate the corresponding methods of the STL
    vector class.
    @param sz New number of rows.
     */
    public native void resize(@Cast("size_t") long sz);

    /** \overload
    @param sz New number of rows.
    @param s Value assigned to the newly added elements.
     */
    public native void resize(@Cast("size_t") long sz, @Const @ByRef Scalar s);

    /** internal function */
    public native void push_back_(@Const Pointer elem);

    /** \brief Adds elements to the bottom of the matrix.
    <p>
    The methods add one or more elements to the bottom of the matrix. They emulate the corresponding
    method of the STL vector class. When elem is Mat , its type and the number of columns must be the
    same as in the container matrix.
    @param elem Added element(s).
     */

    /** \overload
    @param elem Added element(s).
    */

    /** \overload
    @param m Added line(s).
    */
    public native void push_back(@Const @ByRef Mat m);

    /** \brief Removes elements from the bottom of the matrix.
    <p>
    The method removes one or more rows from the bottom of the matrix.
    @param nelems Number of removed rows. If it is greater than the total number of rows, an exception
    is thrown.
     */
    public native void pop_back(@Cast("size_t") long nelems/*=1*/);
    public native void pop_back();

    /** \brief Locates the matrix header within a parent matrix.
    <p>
    After you extracted a submatrix from a matrix using Mat::row, Mat::col, Mat::rowRange,
    Mat::colRange, and others, the resultant submatrix points just to the part of the original big
    matrix. However, each submatrix contains information (represented by datastart and dataend
    fields) that helps reconstruct the original matrix size and the position of the extracted
    submatrix within the original matrix. The method locateROI does exactly that.
    @param wholeSize Output parameter that contains the size of the whole matrix containing *this*
    as a part.
    @param ofs Output parameter that contains an offset of *this* inside the whole matrix.
     */
    public native void locateROI( @ByRef Size wholeSize, @ByRef Point ofs );

    /** \brief Adjusts a submatrix size and position within the parent matrix.
    <p>
    The method is complimentary to Mat::locateROI . The typical use of these functions is to determine
    the submatrix position within the parent matrix and then shift the position somehow. Typically, it
    can be required for filtering operations when pixels outside of the ROI should be taken into
    account. When all the method parameters are positive, the ROI needs to grow in all directions by the
    specified amount, for example:
    <pre>{@code
        A.adjustROI(2, 2, 2, 2);
    }</pre>
    In this example, the matrix size is increased by 4 elements in each direction. The matrix is shifted
    by 2 elements to the left and 2 elements up, which brings in all the necessary pixels for the
    filtering with the 5x5 kernel.
    <p>
    adjustROI forces the adjusted ROI to be inside of the parent matrix that is boundaries of the
    adjusted ROI are constrained by boundaries of the parent matrix. For example, if the submatrix A is
    located in the first row of a parent matrix and you called A.adjustROI(2, 2, 2, 2) then A will not
    be increased in the upward direction.
    <p>
    The function is used internally by the OpenCV filtering functions, like filter2D , morphological
    operations, and so on.
    @param dtop Shift of the top submatrix boundary upwards.
    @param dbottom Shift of the bottom submatrix boundary downwards.
    @param dleft Shift of the left submatrix boundary to the left.
    @param dright Shift of the right submatrix boundary to the right.
    \sa copyMakeBorder
     */
    public native @ByRef Mat adjustROI( int dtop, int dbottom, int dleft, int dright );

    /** \brief Extracts a rectangular submatrix.
    <p>
    The operators make a new header for the specified sub-array of \*this . They are the most
    generalized forms of Mat::row, Mat::col, Mat::rowRange, and Mat::colRange . For example,
    {@code A(Range(0, 10), Range::all())} is equivalent to {@code A.rowRange(0, 10)}. Similarly to all of the above,
    the operators are O(1) operations, that is, no matrix data is copied.
    @param rowRange Start and end row of the extracted submatrix. The upper boundary is not included. To
    select all the rows, use Range::all().
    @param colRange Start and end column of the extracted submatrix. The upper boundary is not included.
    To select all the columns, use Range::all().
     */
    public native @ByVal @Name("operator ()") Mat apply( @ByVal Range rowRange, @ByVal Range colRange );

    /** \overload
    @param roi Extracted submatrix specified as a rectangle.
    */
    public native @ByVal @Name("operator ()") Mat apply( @Const @ByRef Rect roi );

    /** \overload
    @param ranges Array of selected ranges along each array dimension.
    */
    public native @ByVal @Name("operator ()") Mat apply( @Const Range ranges );

    // //! converts header to CvMat; no data is copied
    // operator CvMat() const;
    // //! converts header to CvMatND; no data is copied
    // operator CvMatND() const;
    // //! converts header to IplImage; no data is copied
    // operator IplImage() const;

    /** \brief Reports whether the matrix is continuous or not.
    <p>
    The method returns true if the matrix elements are stored continuously without gaps at the end of
    each row. Otherwise, it returns false. Obviously, 1x1 or 1xN matrices are always continuous.
    Matrices created with Mat::create are always continuous. But if you extract a part of the matrix
    using Mat::col, Mat::diag, and so on, or constructed a matrix header for externally allocated data,
    such matrices may no longer have this property.
    <p>
    The continuity flag is stored as a bit in the Mat::flags field and is computed automatically when
    you construct a matrix header. Thus, the continuity check is a very fast operation, though
    theoretically it could be done as follows:
    <pre>{@code
        // alternative implementation of Mat::isContinuous()
        bool myCheckMatContinuity(const Mat& m)
        {
            //return (m.flags & Mat::CONTINUOUS_FLAG) != 0;
            return m.rows == 1 || m.step == m.cols*m.elemSize();
        }
    }</pre>
    The method is used in quite a few of OpenCV functions. The point is that element-wise operations
    (such as arithmetic and logical operations, math functions, alpha blending, color space
    transformations, and others) do not depend on the image geometry. Thus, if all the input and output
    arrays are continuous, the functions can process them as very long single-row vectors. The example
    below illustrates how an alpha-blending function can be implemented:
    <pre>{@code
        template<typename T>
        void alphaBlendRGBA(const Mat& src1, const Mat& src2, Mat& dst)
        {
            const float alpha_scale = (float)std::numeric_limits<T>::max(),
                        inv_scale = 1.f/alpha_scale;

            CV_Assert( src1.type() == src2.type() &&
                       src1.type() == CV_MAKETYPE(DataType<T>::depth, 4) &&
                       src1.size() == src2.size());
            Size size = src1.size();
            dst.create(size, src1.type());

            // here is the idiom: check the arrays for continuity and,
            // if this is the case,
            // treat the arrays as 1D vectors
            if( src1.isContinuous() && src2.isContinuous() && dst.isContinuous() )
            {
                size.width *= size.height;
                size.height = 1;
            }
            size.width *= 4;

            for( int i = 0; i < size.height; i++ )
            {
                // when the arrays are continuous,
                // the outer loop is executed only once
                const T* ptr1 = src1.ptr<T>(i);
                const T* ptr2 = src2.ptr<T>(i);
                T* dptr = dst.ptr<T>(i);

                for( int j = 0; j < size.width; j += 4 )
                {
                    float alpha = ptr1[j+3]*inv_scale, beta = ptr2[j+3]*inv_scale;
                    dptr[j] = saturate_cast<T>(ptr1[j]*alpha + ptr2[j]*beta);
                    dptr[j+1] = saturate_cast<T>(ptr1[j+1]*alpha + ptr2[j+1]*beta);
                    dptr[j+2] = saturate_cast<T>(ptr1[j+2]*alpha + ptr2[j+2]*beta);
                    dptr[j+3] = saturate_cast<T>((1 - (1-alpha)*(1-beta))*alpha_scale);
                }
            }
        }
    }</pre>
    This approach, while being very simple, can boost the performance of a simple element-operation by
    10-20 percents, especially if the image is rather small and the operation is quite simple.
    <p>
    Another OpenCV idiom in this function, a call of Mat::create for the destination array, that
    allocates the destination array unless it already has the proper size and type. And while the newly
    allocated arrays are always continuous, you still need to check the destination array because
    Mat::create does not always allocate a new matrix.
     */
    public native @Cast("bool") boolean isContinuous();

    /** returns true if the matrix is a submatrix of another matrix */
    public native @Cast("bool") boolean isSubmatrix();

    /** \brief Returns the matrix element size in bytes.
    <p>
    The method returns the matrix element size in bytes. For example, if the matrix type is CV_16SC3 ,
    the method returns 3\*sizeof(short) or 6.
     */
    public native @Cast("size_t") long elemSize();

    /** \brief Returns the size of each matrix element channel in bytes.
    <p>
    The method returns the matrix element channel size in bytes, that is, it ignores the number of
    channels. For example, if the matrix type is CV_16SC3 , the method returns sizeof(short) or 2.
     */
    public native @Cast("size_t") long elemSize1();

    /** \brief Returns the type of a matrix element.
    <p>
    The method returns a matrix element type. This is an identifier compatible with the CvMat type
    system, like CV_16SC3 or 16-bit signed 3-channel array, and so on.
     */
    public native int type();

    /** \brief Returns the depth of a matrix element.
    <p>
    The method returns the identifier of the matrix element depth (the type of each individual channel).
    For example, for a 16-bit signed element array, the method returns CV_16S . A complete list of
    matrix types contains the following values:
    -   CV_8U - 8-bit unsigned integers ( 0..255 )
    -   CV_8S - 8-bit signed integers ( -128..127 )
    -   CV_16U - 16-bit unsigned integers ( 0..65535 )
    -   CV_16S - 16-bit signed integers ( -32768..32767 )
    -   CV_32S - 32-bit signed integers ( -2147483648..2147483647 )
    -   CV_32F - 32-bit floating-point numbers ( -FLT_MAX..FLT_MAX, INF, NAN )
    -   CV_64F - 64-bit floating-point numbers ( -DBL_MAX..DBL_MAX, INF, NAN )
     */
    public native int depth();

    /** \brief Returns the number of matrix channels.
    <p>
    The method returns the number of matrix channels.
     */
    public native int channels();

    /** \brief Returns a normalized step.
    <p>
    The method returns a matrix step divided by Mat::elemSize1() . It can be useful to quickly access an
    arbitrary matrix element.
     */
    public native @Cast("size_t") long step1(int i/*=0*/);
    public native @Cast("size_t") long step1();

    /** \brief Returns true if the array has no elements.
    <p>
    The method returns true if Mat::total() is 0 or if Mat::data is NULL. Because of pop_back() and
    resize() methods {@code M.total() == 0} does not imply that {@code M.data == NULL}.
     */
    public native @Cast("bool") boolean empty();

    /** \brief Returns the total number of array elements.
    <p>
    The method returns the number of array elements (a number of pixels if the array represents an
    image).
     */
    public native @Cast("size_t") long total();

    /** returns N if the matrix is 1-channel (N x ptdim) or ptdim-channel (1 x N) or (N x 1); negative number otherwise */
    public native int checkVector(int elemChannels, int depth/*=-1*/, @Cast("bool") boolean requireContinuous/*=true*/);
    public native int checkVector(int elemChannels);

    /** \brief Returns a pointer to the specified matrix row.
    <p>
    The methods return {@code uchar*} or typed pointer to the specified matrix row. See the sample in
    Mat::isContinuous to know how to use these methods.
    @param i0 A 0-based row index.
     */
    public native @Cast("uchar*") BytePointer ptr(int i0/*=0*/);
    public native @Cast("uchar*") BytePointer ptr();
    /** \overload */

    /** \overload */
    public native @Cast("uchar*") BytePointer ptr(int i0, int i1);
    /** \overload */

    /** \overload */
    public native @Cast("uchar*") BytePointer ptr(int i0, int i1, int i2);
    /** \overload */

    /** \overload */
    public native @Cast("uchar*") BytePointer ptr(@Const IntPointer idx);
    public native @Cast("uchar*") ByteBuffer ptr(@Const IntBuffer idx);
    public native @Cast("uchar*") byte[] ptr(@Const int[] idx);
    /** \overload */
    /** \overload */
    /** \overload */

    /** \overload */
    /** \overload */
    /** \overload */
    /** \overload */
    /** \overload */
    /** \overload */
    /** \overload */
    /** \overload */
    /** \overload */
    /** \overload */

    /** \brief Returns a reference to the specified array element.
    <p>
    The template methods return a reference to the specified array element. For the sake of higher
    performance, the index range checks are only performed in the Debug configuration.
    <p>
    Note that the variants with a single index (i) can be used to access elements of single-row or
    single-column 2-dimensional arrays. That is, if, for example, A is a 1 x N floating-point matrix and
    B is an M x 1 integer matrix, you can simply write {@code A.at<float>(k+4)} and {@code B.at<int>(2*i+1)}
    instead of {@code A.at<float>(0,k+4)} and {@code B.at<int>(2*i+1,0)}, respectively.
    <p>
    The example below initializes a Hilbert matrix:
    <pre>{@code
        Mat H(100, 100, CV_64F);
        for(int i = 0; i < H.rows; i++)
            for(int j = 0; j < H.cols; j++)
                H.at<double>(i,j)=1./(i+j+1);
    }</pre>
    @param i0 Index along the dimension 0
     */
    /** \overload
    @param i0 Index along the dimension 0
    */
    /** \overload
    @param i0 Index along the dimension 0
    @param i1 Index along the dimension 1
    */
    /** \overload
    @param i0 Index along the dimension 0
    @param i1 Index along the dimension 1
    */

    /** \overload
    @param i0 Index along the dimension 0
    @param i1 Index along the dimension 1
    @param i2 Index along the dimension 2
    */
    /** \overload
    @param i0 Index along the dimension 0
    @param i1 Index along the dimension 1
    @param i2 Index along the dimension 2
    */

    /** \overload
    @param idx Array of Mat::dims indices.
    */
    /** \overload
    @param idx Array of Mat::dims indices.
    */

    /** \overload */
    /** \overload */

    /** \overload
    special versions for 2D arrays (especially convenient for referencing image pixels)
    @param pt Element position specified as Point(j,i) .
    */
    /** \overload
    special versions for 2D arrays (especially convenient for referencing image pixels)
    @param pt Element position specified as Point(j,i) .
    */

    /** \brief Returns the matrix iterator and sets it to the first matrix element.
    <p>
    The methods return the matrix read-only or read-write iterators. The use of matrix iterators is very
    similar to the use of bi-directional STL iterators. In the example below, the alpha blending
    function is rewritten using the matrix iterators:
    <pre>{@code
        template<typename T>
        void alphaBlendRGBA(const Mat& src1, const Mat& src2, Mat& dst)
        {
            typedef Vec<T, 4> VT;

            const float alpha_scale = (float)std::numeric_limits<T>::max(),
                        inv_scale = 1.f/alpha_scale;

            CV_Assert( src1.type() == src2.type() &&
                       src1.type() == DataType<VT>::type &&
                       src1.size() == src2.size());
            Size size = src1.size();
            dst.create(size, src1.type());

            MatConstIterator_<VT> it1 = src1.begin<VT>(), it1_end = src1.end<VT>();
            MatConstIterator_<VT> it2 = src2.begin<VT>();
            MatIterator_<VT> dst_it = dst.begin<VT>();

            for( ; it1 != it1_end; ++it1, ++it2, ++dst_it )
            {
                VT pix1 = *it1, pix2 = *it2;
                float alpha = pix1[3]*inv_scale, beta = pix2[3]*inv_scale;
                *dst_it = VT(saturate_cast<T>(pix1[0]*alpha + pix2[0]*beta),
                             saturate_cast<T>(pix1[1]*alpha + pix2[1]*beta),
                             saturate_cast<T>(pix1[2]*alpha + pix2[2]*beta),
                             saturate_cast<T>((1 - (1-alpha)*(1-beta))*alpha_scale));
            }
        }
    }</pre>
     */

    /** \brief Returns the matrix iterator and sets it to the after-last matrix element.
    <p>
    The methods return the matrix read-only or read-write iterators, set to the point following the last
    matrix element.
     */

    /** \brief Invoke with arguments functor, and runs the functor over all matrix element.
    <p>
    The methods runs operation in parallel. Operation is passed by arguments. Operation have to be a
    function pointer, a function object or a lambda(C++11).
    <p>
    All of below operation is equal. Put 0xFF to first channel of all matrix elements:
    <pre>{@code
        Mat image(1920, 1080, CV_8UC3);
        typedef cv::Point3_<uint8_t> Pixel;

        // first. raw pointer access.
        for (int r = 0; r < image.rows; ++r) {
            Pixel* ptr = image.ptr<Pixel>(0, r);
            const Pixel* ptr_end = ptr + image.cols;
            for (; ptr != ptr_end; ++ptr) {
                ptr->x = 255;
            }
        }

        // Using MatIterator. (Simple but there are a Iterator's overhead)
        for (Pixel &p : cv::Mat_<Pixel>(image)) {
            p.x = 255;
        }

        // Parallel execution with function object.
        struct Operator {
            void operator ()(Pixel &pixel, const int * position) {
                pixel.x = 255;
            }
        };
        image.forEach<Pixel>(Operator());

        // Parallel execution using C++11 lambda.
        image.forEach<Pixel>([](Pixel &p, const int * position) -> void {
            p.x = 255;
        });
    }</pre>
    position parameter is index of current pixel:
    <pre>{@code
        // Creating 3D matrix (255 x 255 x 255) typed uint8_t,
        //  and initialize all elements by the value which equals elements position.
        //  i.e. pixels (x,y,z) = (1,2,3) is (b,g,r) = (1,2,3).

        int sizes[] = { 255, 255, 255 };
        typedef cv::Point3_<uint8_t> Pixel;

        Mat_<Pixel> image = Mat::zeros(3, sizes, CV_8UC3);

        image.forEachWithPosition([&](Pixel& pixel, const int position[]) -> void{
            pixel.x = position[0];
            pixel.y = position[1];
            pixel.z = position[2];
        });
    }</pre>
     */
    /** \overload */

// #ifdef CV_CXX_MOVE_SEMANTICS
// #endif

    /** enum cv::Mat:: */
    public static final int MAGIC_VAL  =  0x42FF0000, AUTO_STEP = 0, CONTINUOUS_FLAG =  CV_MAT_CONT_FLAG, SUBMATRIX_FLAG =  CV_SUBMAT_FLAG;
    /** enum cv::Mat:: */
    public static final int MAGIC_MASK =  0xFFFF0000, TYPE_MASK =  0x00000FFF, DEPTH_MASK = 7;

    /** includes several bit-fields:
         - the magic signature
         - continuity flag
         - depth
         - number of channels
     */
    public native int flags(); public native Mat flags(int flags);
    /** the matrix dimensionality, >= 2 */
    public native int dims(); public native Mat dims(int dims);
    /** the number of rows and columns or (-1, -1) when the matrix has more than 2 dimensions */
    public native int rows(); public native Mat rows(int rows);
    public native int cols(); public native Mat cols(int cols);
    /** pointer to the data */
    public native @Cast("uchar*") BytePointer data(); public native Mat data(BytePointer data);

    /** helper fields used in locateROI and adjustROI */
    @MemberGetter public native @Cast("const uchar*") BytePointer datastart();
    @MemberGetter public native @Cast("const uchar*") BytePointer dataend();
    @MemberGetter public native @Cast("const uchar*") BytePointer datalimit();

    /** custom allocator */
    public native MatAllocator allocator(); public native Mat allocator(MatAllocator allocator);
    /** and the standard allocator */
    public static native MatAllocator getStdAllocator();
    public static native MatAllocator getDefaultAllocator();
    public static native void setDefaultAllocator(MatAllocator allocator);

    /** interaction with UMat */
    public native UMatData u(); public native Mat u(UMatData u);

    public native @ByVal Size size();
    @MemberGetter public native int size(int i);
    @MemberGetter public native long step();
    @MemberGetter public native int step(int i);
}


///////////////////////////////// Mat_<_Tp> ////////////////////////////////////

/** \brief Template matrix class derived from Mat
<p>
<pre>{@code
    template<typename _Tp> class Mat_ : public Mat
    {
    public:
        // ... some specific methods
        //         and
        // no new extra fields
    };
}</pre>
The class {@code Mat_<_Tp>} is a *thin* template wrapper on top of the Mat class. It does not have any
extra data fields. Nor this class nor Mat has any virtual methods. Thus, references or pointers to
these two classes can be freely but carefully converted one to another. For example:
<pre>{@code
    // create a 100x100 8-bit matrix
    Mat M(100,100,CV_8U);
    // this will be compiled fine. no any data conversion will be done.
    Mat_<float>& M1 = (Mat_<float>&)M;
    // the program is likely to crash at the statement below
    M1(99,99) = 1.f;
}</pre>
While Mat is sufficient in most cases, Mat_ can be more convenient if you use a lot of element
access operations and if you know matrix type at the compilation time. Note that
{@code Mat::at(int y,int x)} and {@code Mat_::operator()(int y,int x)} do absolutely the same
and run at the same speed, but the latter is certainly shorter:
<pre>{@code
    Mat_<double> M(20,20);
    for(int i = 0; i < M.rows; i++)
        for(int j = 0; j < M.cols; j++)
            M(i,j) = 1./(i+j+1);
    Mat E, V;
    eigen(M,E,V);
    cout << E.at<double>(0,0)/E.at<double>(M.rows-1,0);
}</pre>
To use Mat_ for multi-channel images/matrices, pass Vec as a Mat_ parameter:
<pre>{@code
    // allocate a 320x240 color image and fill it with green (in RGB space)
    Mat_<Vec3b> img(240, 320, Vec3b(0,255,0));
    // now draw a diagonal white line
    for(int i = 0; i < 100; i++)
        img(i,i)=Vec3b(255,255,255);
    // and now scramble the 2nd (red) channel of each pixel
    for(int i = 0; i < img.rows; i++)
        for(int j = 0; j < img.cols; j++)
            img(i,j)[2] ^= (uchar)(i ^ j);
}</pre>
 */

/** \todo document */
@Namespace("cv") @NoOffset public static class UMat extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UMat(Pointer p) { super(p); }

    /** default constructor */
    public UMat(@Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(usageFlags); }
    private native void allocate(@Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** constructs 2D matrix of the specified size and type */
    // (_type is CV_8UC1, CV_64FC3, CV_32SC(12) etc.)
    public UMat(int rows, int cols, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(rows, cols, type, usageFlags); }
    private native void allocate(int rows, int cols, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int rows, int cols, int type) { super((Pointer)null); allocate(rows, cols, type); }
    private native void allocate(int rows, int cols, int type);
    public UMat(@ByVal Size size, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(size, type, usageFlags); }
    private native void allocate(@ByVal Size size, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(@ByVal Size size, int type) { super((Pointer)null); allocate(size, type); }
    private native void allocate(@ByVal Size size, int type);
    /** constucts 2D matrix and fills it with the specified value _s. */
    public UMat(int rows, int cols, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(rows, cols, type, s, usageFlags); }
    private native void allocate(int rows, int cols, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int rows, int cols, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(rows, cols, type, s); }
    private native void allocate(int rows, int cols, int type, @Const @ByRef Scalar s);
    public UMat(@ByVal Size size, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(size, type, s, usageFlags); }
    private native void allocate(@ByVal Size size, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(@ByVal Size size, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(size, type, s); }
    private native void allocate(@ByVal Size size, int type, @Const @ByRef Scalar s);

    /** constructs n-dimensional matrix */
    public UMat(int ndims, @Const IntPointer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(ndims, sizes, type, usageFlags); }
    private native void allocate(int ndims, @Const IntPointer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int ndims, @Const IntPointer sizes, int type) { super((Pointer)null); allocate(ndims, sizes, type); }
    private native void allocate(int ndims, @Const IntPointer sizes, int type);
    public UMat(int ndims, @Const IntBuffer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(ndims, sizes, type, usageFlags); }
    private native void allocate(int ndims, @Const IntBuffer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int ndims, @Const IntBuffer sizes, int type) { super((Pointer)null); allocate(ndims, sizes, type); }
    private native void allocate(int ndims, @Const IntBuffer sizes, int type);
    public UMat(int ndims, @Const int[] sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(ndims, sizes, type, usageFlags); }
    private native void allocate(int ndims, @Const int[] sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int ndims, @Const int[] sizes, int type) { super((Pointer)null); allocate(ndims, sizes, type); }
    private native void allocate(int ndims, @Const int[] sizes, int type);
    public UMat(int ndims, @Const IntPointer sizes, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(ndims, sizes, type, s, usageFlags); }
    private native void allocate(int ndims, @Const IntPointer sizes, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int ndims, @Const IntPointer sizes, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(ndims, sizes, type, s); }
    private native void allocate(int ndims, @Const IntPointer sizes, int type, @Const @ByRef Scalar s);
    public UMat(int ndims, @Const IntBuffer sizes, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(ndims, sizes, type, s, usageFlags); }
    private native void allocate(int ndims, @Const IntBuffer sizes, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int ndims, @Const IntBuffer sizes, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(ndims, sizes, type, s); }
    private native void allocate(int ndims, @Const IntBuffer sizes, int type, @Const @ByRef Scalar s);
    public UMat(int ndims, @Const int[] sizes, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(ndims, sizes, type, s, usageFlags); }
    private native void allocate(int ndims, @Const int[] sizes, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int ndims, @Const int[] sizes, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(ndims, sizes, type, s); }
    private native void allocate(int ndims, @Const int[] sizes, int type, @Const @ByRef Scalar s);

    /** copy constructor */
    public UMat(@Const @ByRef UMat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef UMat m);

    /** creates a matrix header for a part of the bigger matrix */
    public UMat(@Const @ByRef UMat m, @Const @ByRef Range rowRange, @Const @ByRef(nullValue = "cv::Range::all()") Range colRange/*=cv::Range::all()*/) { super((Pointer)null); allocate(m, rowRange, colRange); }
    private native void allocate(@Const @ByRef UMat m, @Const @ByRef Range rowRange, @Const @ByRef(nullValue = "cv::Range::all()") Range colRange/*=cv::Range::all()*/);
    public UMat(@Const @ByRef UMat m, @Const @ByRef Range rowRange) { super((Pointer)null); allocate(m, rowRange); }
    private native void allocate(@Const @ByRef UMat m, @Const @ByRef Range rowRange);
    public UMat(@Const @ByRef UMat m, @Const @ByRef Rect roi) { super((Pointer)null); allocate(m, roi); }
    private native void allocate(@Const @ByRef UMat m, @Const @ByRef Rect roi);
    /** builds matrix from std::vector with or without copying the data */
    /** builds matrix from cv::Vec; the data is copied by default */
    /** builds matrix from cv::Matx; the data is copied by default */
    /** builds matrix from a 2D point */
    /** builds matrix from a 3D point */
    /** builds matrix from comma initializer */

    /** destructor - calls release() */
    /** assignment operators */
    public native @ByRef @Name("operator =") UMat put(@Const @ByRef UMat m);

    public native @ByVal Mat getMat(int flags);

    /** returns a new matrix header for the specified row */
    public native @ByVal UMat row(int y);
    /** returns a new matrix header for the specified column */
    public native @ByVal UMat col(int x);
    /** ... for the specified row span */
    public native @ByVal UMat rowRange(int startrow, int endrow);
    public native @ByVal UMat rowRange(@Const @ByRef Range r);
    /** ... for the specified column span */
    public native @ByVal UMat colRange(int startcol, int endcol);
    public native @ByVal UMat colRange(@Const @ByRef Range r);
    /** ... for the specified diagonal */
    // (d=0 - the main diagonal,
    //  >0 - a diagonal from the lower half,
    //  <0 - a diagonal from the upper half)
    public native @ByVal UMat diag(int d/*=0*/);
    public native @ByVal UMat diag();
    /** constructs a square diagonal matrix which main diagonal is vector "d" */
    public static native @ByVal UMat diag(@Const @ByRef UMat d);

    /** returns deep copy of the matrix, i.e. the data is copied */
    public native @ByVal UMat clone();
    /** copies the matrix content to "m". */
    // It calls m.create(this->size(), this->type()).
    public native void copyTo( @ByVal Mat m );
    /** copies those matrix elements to "m" that are marked with non-zero mask elements. */
    public native void copyTo( @ByVal Mat m, @ByVal Mat mask );
    /** converts matrix to another datatype with optional scalng. See cvConvertScale. */
    public native void convertTo( @ByVal Mat m, int rtype, double alpha/*=1*/, double beta/*=0*/ );
    public native void convertTo( @ByVal Mat m, int rtype );

    public native void assignTo( @ByRef UMat m, int type/*=-1*/ );
    public native void assignTo( @ByRef UMat m );

    /** sets every matrix element to s */
    public native @ByRef @Name("operator =") UMat put(@Const @ByRef Scalar s);
    /** sets some of the matrix elements to s, according to the mask */
    public native @ByRef UMat setTo(@ByVal Mat value, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/);
    public native @ByRef UMat setTo(@ByVal Mat value);
    /** creates alternative matrix header for the same data, with different */
    // number of channels and/or different number of rows. see cvReshape.
    public native @ByVal UMat reshape(int cn, int rows/*=0*/);
    public native @ByVal UMat reshape(int cn);
    public native @ByVal UMat reshape(int cn, int newndims, @Const IntPointer newsz);
    public native @ByVal UMat reshape(int cn, int newndims, @Const IntBuffer newsz);
    public native @ByVal UMat reshape(int cn, int newndims, @Const int[] newsz);

    /** matrix transposition by means of matrix expressions */
    public native @ByVal UMat t();
    /** matrix inversion by means of matrix expressions */
    public native @ByVal UMat inv(int method/*=cv::DECOMP_LU*/);
    public native @ByVal UMat inv();
    /** per-element matrix multiplication by means of matrix expressions */
    public native @ByVal UMat mul(@ByVal Mat m, double scale/*=1*/);
    public native @ByVal UMat mul(@ByVal Mat m);

    /** computes dot-product */
    public native double dot(@ByVal Mat m);

    /** Matlab-style matrix initialization */
    public static native @ByVal UMat zeros(int rows, int cols, int type);
    public static native @ByVal UMat zeros(@ByVal Size size, int type);
    
    public static native @ByVal UMat ones(int rows, int cols, int type);
    public static native @ByVal UMat ones(@ByVal Size size, int type);
    
    public static native @ByVal UMat eye(int rows, int cols, int type);
    public static native @ByVal UMat eye(@ByVal Size size, int type);

    /** allocates new matrix data unless the matrix already has specified size and type. */
    // previous data is unreferenced if needed.
    public native void create(int rows, int cols, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(int rows, int cols, int type);
    public native void create(@ByVal Size size, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(@ByVal Size size, int type);
    public native void create(int ndims, @Const IntPointer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(int ndims, @Const IntPointer sizes, int type);
    public native void create(int ndims, @Const IntBuffer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(int ndims, @Const IntBuffer sizes, int type);
    public native void create(int ndims, @Const int[] sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(int ndims, @Const int[] sizes, int type);

    /** increases the reference counter; use with care to avoid memleaks */
    public native void addref();
    /** decreases reference counter; */
    // deallocates the data when reference counter reaches 0.
    public native void release();

    /** deallocates the matrix data */
    public native @Name("deallocate") void _deallocate();
    /** internal use function; properly re-allocates _size, _step arrays */
    public native void copySize(@Const @ByRef UMat m);

    /** locates matrix header within a parent matrix. See below */
    public native void locateROI( @ByRef Size wholeSize, @ByRef Point ofs );
    /** moves/resizes the current matrix ROI inside the parent matrix. */
    public native @ByRef UMat adjustROI( int dtop, int dbottom, int dleft, int dright );
    /** extracts a rectangular sub-matrix */
    // (this is a generalized form of row, rowRange etc.)
    public native @ByVal @Name("operator ()") UMat apply( @ByVal Range rowRange, @ByVal Range colRange );
    public native @ByVal @Name("operator ()") UMat apply( @Const @ByRef Rect roi );
    public native @ByVal @Name("operator ()") UMat apply( @Const Range ranges );

    /** returns true iff the matrix data is continuous */
    // (i.e. when there are no gaps between successive rows).
    // similar to CV_IS_MAT_CONT(cvmat->type)
    public native @Cast("bool") boolean isContinuous();

    /** returns true if the matrix is a submatrix of another matrix */
    public native @Cast("bool") boolean isSubmatrix();

    /** returns element size in bytes, */
    // similar to CV_ELEM_SIZE(cvmat->type)
    public native @Cast("size_t") long elemSize();
    /** returns the size of element channel in bytes. */
    public native @Cast("size_t") long elemSize1();
    /** returns element type, similar to CV_MAT_TYPE(cvmat->type) */
    public native int type();
    /** returns element type, similar to CV_MAT_DEPTH(cvmat->type) */
    public native int depth();
    /** returns element type, similar to CV_MAT_CN(cvmat->type) */
    public native int channels();
    /** returns step/elemSize1() */
    public native @Cast("size_t") long step1(int i/*=0*/);
    public native @Cast("size_t") long step1();
    /** returns true if matrix data is NULL */
    public native @Cast("bool") boolean empty();
    /** returns the total number of matrix elements */
    public native @Cast("size_t") long total();

    /** returns N if the matrix is 1-channel (N x ptdim) or ptdim-channel (1 x N) or (N x 1); negative number otherwise */
    public native int checkVector(int elemChannels, int depth/*=-1*/, @Cast("bool") boolean requireContinuous/*=true*/);
    public native int checkVector(int elemChannels);

// #ifdef CV_CXX_MOVE_SEMANTICS
// #endif

    public native Pointer handle(int accessFlags);
    public native void ndoffset(@Cast("size_t*") SizeTPointer ofs);

    /** enum cv::UMat:: */
    public static final int MAGIC_VAL  =  0x42FF0000, AUTO_STEP = 0, CONTINUOUS_FLAG =  CV_MAT_CONT_FLAG, SUBMATRIX_FLAG =  CV_SUBMAT_FLAG;
    /** enum cv::UMat:: */
    public static final int MAGIC_MASK =  0xFFFF0000, TYPE_MASK =  0x00000FFF, DEPTH_MASK = 7;

    /** includes several bit-fields:
         - the magic signature
         - continuity flag
         - depth
         - number of channels
     */
    public native int flags(); public native UMat flags(int flags);
    /** the matrix dimensionality, >= 2 */
    public native int dims(); public native UMat dims(int dims);
    /** the number of rows and columns or (-1, -1) when the matrix has more than 2 dimensions */
    public native int rows(); public native UMat rows(int rows);
    public native int cols(); public native UMat cols(int cols);

    /** custom allocator */
    public native MatAllocator allocator(); public native UMat allocator(MatAllocator allocator);
    public native @Cast("cv::UMatUsageFlags") int usageFlags(); public native UMat usageFlags(int usageFlags); // usage flags for allocator
    /** and the standard allocator */
    public static native MatAllocator getStdAllocator();

    // black-box container of UMat data
    public native UMatData u(); public native UMat u(UMatData u);

    // offset of the submatrix (or 0)
    public native @Cast("size_t") long offset(); public native UMat offset(long offset);

    public native @ByVal Size size();
    @MemberGetter public native int size(int i);
    @MemberGetter public native long step();
    @MemberGetter public native int step(int i);
}


/////////////////////////// multi-dimensional sparse matrix //////////////////////////

/** \brief The class SparseMat represents multi-dimensional sparse numerical arrays.
<p>
Such a sparse array can store elements of any type that Mat can store. *Sparse* means that only
non-zero elements are stored (though, as a result of operations on a sparse matrix, some of its
stored elements can actually become 0. It is up to you to detect such elements and delete them
using SparseMat::erase ). The non-zero elements are stored in a hash table that grows when it is
filled so that the search time is O(1) in average (regardless of whether element is there or not).
Elements can be accessed using the following methods:
-   Query operations (SparseMat::ptr and the higher-level SparseMat::ref, SparseMat::value and
    SparseMat::find), for example:
    <pre>{@code
        const int dims = 5;
        int size[] = {10, 10, 10, 10, 10};
        SparseMat sparse_mat(dims, size, CV_32F);
        for(int i = 0; i < 1000; i++)
        {
            int idx[dims];
            for(int k = 0; k < dims; k++)
                idx[k] = rand()
            sparse_mat.ref<float>(idx) += 1.f;
        }
    }</pre>
-   Sparse matrix iterators. They are similar to MatIterator but different from NAryMatIterator.
    That is, the iteration loop is familiar to STL users:
    <pre>{@code
        // prints elements of a sparse floating-point matrix
        // and the sum of elements.
        SparseMatConstIterator_<float>
            it = sparse_mat.begin<float>(),
            it_end = sparse_mat.end<float>();
        double s = 0;
        int dims = sparse_mat.dims();
        for(; it != it_end; ++it)
        {
            // print element indices and the element value
            const SparseMat::Node* n = it.node();
            printf("(");
            for(int i = 0; i < dims; i++)
                printf("%d%s", n->idx[i], i < dims-1 ? ", " : ")");
            printf(": %g\n", it.value<float>());
            s += *it;
        }
        printf("Element sum is %g\n", s);
    }</pre>
    If you run this loop, you will notice that elements are not enumerated in a logical order
    (lexicographical, and so on). They come in the same order as they are stored in the hash table
    (semi-randomly). You may collect pointers to the nodes and sort them to get the proper ordering.
    Note, however, that pointers to the nodes may become invalid when you add more elements to the
    matrix. This may happen due to possible buffer reallocation.
-   Combination of the above 2 methods when you need to process 2 or more sparse matrices
    simultaneously. For example, this is how you can compute unnormalized cross-correlation of the 2
    floating-point sparse matrices:
    <pre>{@code
        double cross_corr(const SparseMat& a, const SparseMat& b)
        {
            const SparseMat *_a = &a, *_b = &b;
            // if b contains less elements than a,
            // it is faster to iterate through b
            if(_a->nzcount() > _b->nzcount())
                std::swap(_a, _b);
            SparseMatConstIterator_<float> it = _a->begin<float>(),
                                           it_end = _a->end<float>();
            double ccorr = 0;
            for(; it != it_end; ++it)
            {
                // take the next element from the first matrix
                float avalue = *it;
                const Node* anode = it.node();
                // and try to find an element with the same index in the second matrix.
                // since the hash value depends only on the element index,
                // reuse the hash value stored in the node
                float bvalue = _b->value<float>(anode->idx,&anode->hashval);
                ccorr += avalue*bvalue;
            }
            return ccorr;
        }
    }</pre>
 */
@Namespace("cv") @NoOffset public static class SparseMat extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseMat(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public SparseMat(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public SparseMat position(int position) {
        return (SparseMat)super.position(position);
    }


    /** enum cv::SparseMat:: */
    public static final int MAGIC_VAL= 0x42FD0000, MAX_DIM= 32, HASH_SCALE= 0x5bd1e995, HASH_BIT= 0x80000000;

    /** the sparse matrix header */
    @NoOffset public static class Hdr extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Hdr(Pointer p) { super(p); }
    
        public Hdr(int _dims, @Const IntPointer _sizes, int _type) { super((Pointer)null); allocate(_dims, _sizes, _type); }
        private native void allocate(int _dims, @Const IntPointer _sizes, int _type);
        public Hdr(int _dims, @Const IntBuffer _sizes, int _type) { super((Pointer)null); allocate(_dims, _sizes, _type); }
        private native void allocate(int _dims, @Const IntBuffer _sizes, int _type);
        public Hdr(int _dims, @Const int[] _sizes, int _type) { super((Pointer)null); allocate(_dims, _sizes, _type); }
        private native void allocate(int _dims, @Const int[] _sizes, int _type);
        public native void clear();
        public native int refcount(); public native Hdr refcount(int refcount);
        public native int dims(); public native Hdr dims(int dims);
        public native int valueOffset(); public native Hdr valueOffset(int valueOffset);
        public native @Cast("size_t") long nodeSize(); public native Hdr nodeSize(long nodeSize);
        public native @Cast("size_t") long nodeCount(); public native Hdr nodeCount(long nodeCount);
        public native @Cast("size_t") long freeList(); public native Hdr freeList(long freeList);
        public native @Cast("uchar*") @StdVector BytePointer pool(); public native Hdr pool(BytePointer pool);
        public native @Cast("size_t*") @StdVector SizeTPointer hashtab(); public native Hdr hashtab(SizeTPointer hashtab);
        public native int size(int i); public native Hdr size(int i, int size);
        @MemberGetter public native IntPointer size();
    }

    /** sparse matrix node - element of a hash table */
    public static class Node extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public Node() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public Node(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Node(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public Node position(int position) {
            return (Node)super.position(position);
        }
    
        /** hash value */
        public native @Cast("size_t") long hashval(); public native Node hashval(long hashval);
        /** index of the next node in the same hash table entry */
        public native @Cast("size_t") long next(); public native Node next(long next);
        /** index of the matrix element */
        public native int idx(int i); public native Node idx(int i, int idx);
        @MemberGetter public native IntPointer idx();
    }

    /** \brief Various SparseMat constructors.
     */
    public SparseMat() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
    @param dims Array dimensionality.
    @param _sizes Sparce matrix size on all dementions.
    @param _type Sparse matrix data type.
    */
    public SparseMat(int dims, @Const IntPointer _sizes, int _type) { super((Pointer)null); allocate(dims, _sizes, _type); }
    private native void allocate(int dims, @Const IntPointer _sizes, int _type);
    public SparseMat(int dims, @Const IntBuffer _sizes, int _type) { super((Pointer)null); allocate(dims, _sizes, _type); }
    private native void allocate(int dims, @Const IntBuffer _sizes, int _type);
    public SparseMat(int dims, @Const int[] _sizes, int _type) { super((Pointer)null); allocate(dims, _sizes, _type); }
    private native void allocate(int dims, @Const int[] _sizes, int _type);

    /** \overload
    @param m Source matrix for copy constructor. If m is dense matrix (ocvMat) then it will be converted
    to sparse representation.
    */
    public SparseMat(@Const @ByRef SparseMat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef SparseMat m);

    /** \overload
    @param m Source matrix for copy constructor. If m is dense matrix (ocvMat) then it will be converted
    to sparse representation.
    */
    public SparseMat(@Const @ByRef Mat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef Mat m);

    /** the destructor */

    /** assignment operator. This is O(1) operation, i.e. no data is copied */
    public native @ByRef @Name("operator =") SparseMat put(@Const @ByRef SparseMat m);
    /** equivalent to the corresponding constructor */
    public native @ByRef @Name("operator =") SparseMat put(@Const @ByRef Mat m);

    /** creates full copy of the matrix */
    public native @ByVal SparseMat clone();

    /** copies all the data to the destination matrix. All the previous content of m is erased */
    public native void copyTo( @ByRef SparseMat m );
    /** converts sparse matrix to dense matrix. */
    public native void copyTo( @ByRef Mat m );
    /** multiplies all the matrix elements by the specified scale factor alpha and converts the results to the specified data type */
    public native void convertTo( @ByRef SparseMat m, int rtype, double alpha/*=1*/ );
    public native void convertTo( @ByRef SparseMat m, int rtype );
    /** converts sparse matrix to dense n-dim matrix with optional type conversion and scaling.
    /**
        @param [out] m - output matrix; if it does not have a proper size or type before the operation,
            it is reallocated
        @param [in] rtype – desired output matrix type or, rather, the depth since the number of channels
            are the same as the input has; if rtype is negative, the output matrix will have the
            same type as the input.
        @param [in] alpha – optional scale factor
        @param [in] beta – optional delta added to the scaled values
    */
    public native void convertTo( @ByRef Mat m, int rtype, double alpha/*=1*/, double beta/*=0*/ );
    public native void convertTo( @ByRef Mat m, int rtype );

    // not used now
    public native void assignTo( @ByRef SparseMat m, int type/*=-1*/ );
    public native void assignTo( @ByRef SparseMat m );

    /** reallocates sparse matrix.
    /**
        If the matrix already had the proper size and type,
        it is simply cleared with clear(), otherwise,
        the old matrix is released (using release()) and the new one is allocated.
    */
    public native void create(int dims, @Const IntPointer _sizes, int _type);
    public native void create(int dims, @Const IntBuffer _sizes, int _type);
    public native void create(int dims, @Const int[] _sizes, int _type);
    /** sets all the sparse matrix elements to 0, which means clearing the hash table. */
    public native void clear();
    /** manually increments the reference counter to the header. */
    public native void addref();
    // decrements the header reference counter. When the counter reaches 0, the header and all the underlying data are deallocated.
    public native void release();

    /** converts sparse matrix to the old-style representation; all the elements are copied. */
    //operator CvSparseMat*() const;
    /** returns the size of each element in bytes (not including the overhead - the space occupied by SparseMat::Node elements) */
    public native @Cast("size_t") long elemSize();
    /** returns elemSize()/channels() */
    public native @Cast("size_t") long elemSize1();

    /** returns type of sparse matrix elements */
    public native int type();
    /** returns the depth of sparse matrix elements */
    public native int depth();
    /** returns the number of channels */
    public native int channels();

    /** returns the array of sizes, or NULL if the matrix is not allocated */
    public native @Const IntPointer size();
    /** returns the size of i-th matrix dimension (or 0) */
    public native int size(int i);
    /** returns the matrix dimensionality */
    public native int dims();
    /** returns the number of non-zero elements (=the number of hash table nodes) */
    public native @Cast("size_t") long nzcount();

    /** computes the element hash value (1D case) */
    public native @Cast("size_t") long hash(int i0);
    /** computes the element hash value (2D case) */
    public native @Cast("size_t") long hash(int i0, int i1);
    /** computes the element hash value (3D case) */
    public native @Cast("size_t") long hash(int i0, int i1, int i2);
    /** computes the element hash value (nD case) */
    public native @Cast("size_t") long hash(@Const IntPointer idx);
    public native @Cast("size_t") long hash(@Const IntBuffer idx);
    public native @Cast("size_t") long hash(@Const int[] idx);

    /**\{
    /**
     specialized variants for 1D, 2D, 3D cases and the generic_type one for n-D case.
     return pointer to the matrix element.
      - if the element is there (it's non-zero), the pointer to it is returned
      - if it's not there and createMissing=false, NULL pointer is returned
      - if it's not there and createMissing=true, then the new element
        is created and initialized with 0. Pointer to it is returned
      - if the optional hashval pointer is not NULL, the element hash value is
        not computed, but *hashval is taken instead.
    */
    /** returns pointer to the specified element (1D case) */
    public native @Cast("uchar*") BytePointer ptr(int i0, @Cast("bool") boolean createMissing, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native @Cast("uchar*") BytePointer ptr(int i0, @Cast("bool") boolean createMissing);
    /** returns pointer to the specified element (2D case) */
    public native @Cast("uchar*") BytePointer ptr(int i0, int i1, @Cast("bool") boolean createMissing, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native @Cast("uchar*") BytePointer ptr(int i0, int i1, @Cast("bool") boolean createMissing);
    /** returns pointer to the specified element (3D case) */
    public native @Cast("uchar*") BytePointer ptr(int i0, int i1, int i2, @Cast("bool") boolean createMissing, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native @Cast("uchar*") BytePointer ptr(int i0, int i1, int i2, @Cast("bool") boolean createMissing);
    /** returns pointer to the specified element (nD case) */
    public native @Cast("uchar*") BytePointer ptr(@Const IntPointer idx, @Cast("bool") boolean createMissing, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native @Cast("uchar*") BytePointer ptr(@Const IntPointer idx, @Cast("bool") boolean createMissing);
    public native @Cast("uchar*") ByteBuffer ptr(@Const IntBuffer idx, @Cast("bool") boolean createMissing, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native @Cast("uchar*") ByteBuffer ptr(@Const IntBuffer idx, @Cast("bool") boolean createMissing);
    public native @Cast("uchar*") byte[] ptr(@Const int[] idx, @Cast("bool") boolean createMissing, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native @Cast("uchar*") byte[] ptr(@Const int[] idx, @Cast("bool") boolean createMissing);
    /**\}
     <p>
     * \{
    /**
     return read-write reference to the specified sparse matrix element.
     <p>
     {@code ref<_Tp>(i0,...[,hashval])} is equivalent to {@code *(_Tp*)ptr(i0,...,true[,hashval])}.
     The methods always return a valid reference.
     If the element did not exist, it is created and initialiazed with 0.
    */
    /** returns reference to the specified element (1D case) */
    /** returns reference to the specified element (2D case) */
    /** returns reference to the specified element (3D case) */
    /** returns reference to the specified element (nD case) */
    /**\}
     <p>
     * \{
    /**
     return value of the specified sparse matrix element.
     <p>
     {@code value<_Tp>(i0,...[,hashval])} is equivalent to
     <pre>{@code
     { const _Tp* p = find<_Tp>(i0,...[,hashval]); return p ? *p : _Tp(); }
     }</pre>
     <p>
     That is, if the element did not exist, the methods return 0.
     */
    /** returns value of the specified element (1D case) */
    /** returns value of the specified element (2D case) */
    /** returns value of the specified element (3D case) */
    /** returns value of the specified element (nD case) */
    /**\}
     <p>
     * \{
    /**
     Return pointer to the specified sparse matrix element if it exists
     <p>
     {@code find<_Tp>(i0,...[,hashval])} is equivalent to {@code (_const Tp*)ptr(i0,...false[,hashval])}.
     <p>
     If the specified element does not exist, the methods return NULL.
    */
    /** returns pointer to the specified element (1D case) */
    /** returns pointer to the specified element (2D case) */
    /** returns pointer to the specified element (3D case) */
    /** returns pointer to the specified element (nD case) */
    /**\}
     <p>
     *  erases the specified element (2D case) */
    public native void erase(int i0, int i1, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native void erase(int i0, int i1);
    /** erases the specified element (3D case) */
    public native void erase(int i0, int i1, int i2, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native void erase(int i0, int i1, int i2);
    /** erases the specified element (nD case) */
    public native void erase(@Const IntPointer idx, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native void erase(@Const IntPointer idx);
    public native void erase(@Const IntBuffer idx, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native void erase(@Const IntBuffer idx);
    public native void erase(@Const int[] idx, @Cast("size_t*") SizeTPointer hashval/*=0*/);
    public native void erase(@Const int[] idx);

    /**\{
    /**
       return the sparse matrix iterator pointing to the first sparse matrix element
    */
    /** returns the sparse matrix iterator at the matrix beginning */
    public native @ByVal SparseMatIterator begin();
    /** returns the sparse matrix iterator at the matrix beginning */
    /** returns the read-only sparse matrix iterator at the matrix beginning */
    /** returns the read-only sparse matrix iterator at the matrix beginning */
    /**\}
    /**
       return the sparse matrix iterator pointing to the element following the last sparse matrix element
    */
    /** returns the sparse matrix iterator at the matrix end */
    public native @ByVal SparseMatIterator end();
    /** returns the read-only sparse matrix iterator at the matrix end */
    /** returns the typed sparse matrix iterator at the matrix end */
    /** returns the typed read-only sparse matrix iterator at the matrix end */

    /** returns the value stored in the sparse martix node */
    /** returns the value stored in the sparse martix node */

    ////////////// some internal-use methods ///////////////
    public native Node node(@Cast("size_t") long nidx);

    public native @Cast("uchar*") BytePointer newNode(@Const IntPointer idx, @Cast("size_t") long hashval);
    public native @Cast("uchar*") ByteBuffer newNode(@Const IntBuffer idx, @Cast("size_t") long hashval);
    public native @Cast("uchar*") byte[] newNode(@Const int[] idx, @Cast("size_t") long hashval);
    public native void removeNode(@Cast("size_t") long hidx, @Cast("size_t") long nidx, @Cast("size_t") long previdx);
    public native void resizeHashTab(@Cast("size_t") long newsize);

    public native int flags(); public native SparseMat flags(int flags);
    public native Hdr hdr(); public native SparseMat hdr(Hdr hdr);
}



///////////////////////////////// SparseMat_<_Tp> ////////////////////////////////////

/** \brief Template sparse n-dimensional array class derived from SparseMat
<p>
SparseMat_ is a thin wrapper on top of SparseMat created in the same way as Mat_ . It simplifies
notation of some operations:
<pre>{@code
    int sz[] = {10, 20, 30};
    SparseMat_<double> M(3, sz);
    ...
    M.ref(1, 2, 3) = M(4, 5, 6) + M(7, 8, 9);
}</pre>
 */



////////////////////////////////// MatConstIterator //////////////////////////////////

@Namespace("cv") @NoOffset public static class MatConstIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatConstIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public MatConstIterator(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public MatConstIterator position(int position) {
        return (MatConstIterator)super.position(position);
    }


// #ifndef OPENCV_NOSTL
// #endif

    /** default constructor */
    public MatConstIterator() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** constructor that sets the iterator to the beginning of the matrix */
    public MatConstIterator(@Const Mat _m) { super((Pointer)null); allocate(_m); }
    private native void allocate(@Const Mat _m);
    /** constructor that sets the iterator to the specified element of the matrix */
    public MatConstIterator(@Const Mat _m, int _row, int _col/*=0*/) { super((Pointer)null); allocate(_m, _row, _col); }
    private native void allocate(@Const Mat _m, int _row, int _col/*=0*/);
    public MatConstIterator(@Const Mat _m, int _row) { super((Pointer)null); allocate(_m, _row); }
    private native void allocate(@Const Mat _m, int _row);
    /** constructor that sets the iterator to the specified element of the matrix */
    public MatConstIterator(@Const Mat _m, @ByVal Point _pt) { super((Pointer)null); allocate(_m, _pt); }
    private native void allocate(@Const Mat _m, @ByVal Point _pt);
    /** constructor that sets the iterator to the specified element of the matrix */
    
    /** copy constructor */
    public MatConstIterator(@Const @ByRef MatConstIterator it) { super((Pointer)null); allocate(it); }
    private native void allocate(@Const @ByRef MatConstIterator it);

    /** copy operator */
    public native @ByRef @Name("operator =") MatConstIterator put(@Const @ByRef MatConstIterator it);
    /** returns the current matrix element */
    public native @Cast("const uchar*") @Name("operator *") BytePointer multiply();
    /** returns the i-th matrix element, relative to the current */
    public native @Cast("const uchar*") @Name("operator []") BytePointer get(@Cast("ptrdiff_t") long i);

    /** shifts the iterator forward by the specified number of elements */
    public native @ByRef @Name("operator +=") MatConstIterator addPut(@Cast("ptrdiff_t") long ofs);
    /** shifts the iterator backward by the specified number of elements */
    public native @ByRef @Name("operator -=") MatConstIterator subtractPut(@Cast("ptrdiff_t") long ofs);
    /** decrements the iterator */
    public native @ByRef @Name("operator --") MatConstIterator decrement();
    /** decrements the iterator */
    public native @ByVal @Name("operator --") MatConstIterator decrement(int arg0);
    /** increments the iterator */
    public native @ByRef @Name("operator ++") MatConstIterator increment();
    /** increments the iterator */
    public native @ByVal @Name("operator ++") MatConstIterator increment(int arg0);
    /** returns the current iterator position */
    public native @ByVal Point pos();
    /** returns the current iterator position */
    public native void pos(IntPointer _idx);
    public native void pos(IntBuffer _idx);
    public native void pos(int[] _idx);

    public native @Cast("ptrdiff_t") long lpos();
    public native void seek(@Cast("ptrdiff_t") long ofs, @Cast("bool") boolean relative/*=false*/);
    public native void seek(@Cast("ptrdiff_t") long ofs);
    public native void seek(@Const IntPointer _idx, @Cast("bool") boolean relative/*=false*/);
    public native void seek(@Const IntPointer _idx);
    public native void seek(@Const IntBuffer _idx, @Cast("bool") boolean relative/*=false*/);
    public native void seek(@Const IntBuffer _idx);
    public native void seek(@Const int[] _idx, @Cast("bool") boolean relative/*=false*/);
    public native void seek(@Const int[] _idx);

    @MemberGetter public native @Const Mat m();
    public native @Cast("size_t") long elemSize(); public native MatConstIterator elemSize(long elemSize);
    @MemberGetter public native @Cast("const uchar*") BytePointer ptr();
    @MemberGetter public native @Cast("const uchar*") BytePointer sliceStart();
    @MemberGetter public native @Cast("const uchar*") BytePointer sliceEnd();
}



////////////////////////////////// MatConstIterator_ /////////////////////////////////

/** \brief Matrix read-only iterator
 */



//////////////////////////////////// MatIterator_ ////////////////////////////////////

/** \brief Matrix read-write iterator
*/



/////////////////////////////// SparseMatConstIterator ///////////////////////////////

/**  \brief Read-Only Sparse Matrix Iterator.
 <p>
 Here is how to use the iterator to compute the sum of floating-point sparse matrix elements:
 <p>
 <pre>{@code
 SparseMatConstIterator it = m.begin(), it_end = m.end();
 double s = 0;
 CV_Assert( m.type() == CV_32F );
 for( ; it != it_end; ++it )
    s += it.value<float>();
 }</pre>
*/
@Namespace("cv") @NoOffset public static class SparseMatConstIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseMatConstIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public SparseMatConstIterator(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public SparseMatConstIterator position(int position) {
        return (SparseMatConstIterator)super.position(position);
    }

    /** the default constructor */
    public SparseMatConstIterator() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** the full constructor setting the iterator to the first sparse matrix element */
    public SparseMatConstIterator(@Const SparseMat _m) { super((Pointer)null); allocate(_m); }
    private native void allocate(@Const SparseMat _m);
    /** the copy constructor */
    public SparseMatConstIterator(@Const @ByRef SparseMatConstIterator it) { super((Pointer)null); allocate(it); }
    private native void allocate(@Const @ByRef SparseMatConstIterator it);

    /** the assignment operator */
    public native @ByRef @Name("operator =") SparseMatConstIterator put(@Const @ByRef SparseMatConstIterator it);

    /** template method returning the current matrix element */
    /** returns the current node of the sparse matrix. it.node->idx is the current element index */
    public native @Const SparseMat.Node node();

    /** moves iterator to the previous element */
    
    /** moves iterator to the previous element */
    
    /** moves iterator to the next element */
    public native @ByRef @Name("operator ++") SparseMatConstIterator increment();
    /** moves iterator to the next element */
    public native @ByVal @Name("operator ++") SparseMatConstIterator increment(int arg0);

    /** moves iterator to the element after the last element */
    public native void seekEnd();

    @MemberGetter public native @Const SparseMat m();
    public native @Cast("size_t") long hashidx(); public native SparseMatConstIterator hashidx(long hashidx);
    public native @Cast("uchar*") BytePointer ptr(); public native SparseMatConstIterator ptr(BytePointer ptr);
}



////////////////////////////////// SparseMatIterator /////////////////////////////////

/** \brief  Read-write Sparse Matrix Iterator
 <p>
 The class is similar to cv::SparseMatConstIterator,
 but can be used for in-place modification of the matrix elements.
*/
@Namespace("cv") public static class SparseMatIterator extends SparseMatConstIterator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseMatIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public SparseMatIterator(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public SparseMatIterator position(int position) {
        return (SparseMatIterator)super.position(position);
    }

    /** the default constructor */
    public SparseMatIterator() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** the full constructor setting the iterator to the first sparse matrix element */
    public SparseMatIterator(SparseMat _m) { super((Pointer)null); allocate(_m); }
    private native void allocate(SparseMat _m);
    /** the full constructor setting the iterator to the specified sparse matrix element */
    
    /** the copy constructor */
    public SparseMatIterator(@Const @ByRef SparseMatIterator it) { super((Pointer)null); allocate(it); }
    private native void allocate(@Const @ByRef SparseMatIterator it);

    /** the assignment operator */
    public native @ByRef @Name("operator =") SparseMatIterator put(@Const @ByRef SparseMatIterator it);
    /** returns read-write reference to the current sparse matrix element */
    /** returns pointer to the current sparse matrix node. it.node->idx is the index of the current element (do not modify it!) */
    public native SparseMat.Node node();

    /** moves iterator to the next element */
    public native @ByRef @Name("operator ++") SparseMatIterator increment();
    /** moves iterator to the next element */
    public native @ByVal @Name("operator ++") SparseMatIterator increment(int arg0);
}



/////////////////////////////// SparseMatConstIterator_ //////////////////////////////

/** \brief  Template Read-Only Sparse Matrix Iterator Class.
 <p>
 This is the derived from SparseMatConstIterator class that
 introduces more convenient operator *() for accessing the current element.
*/



///////////////////////////////// SparseMatIterator_ /////////////////////////////////

/** \brief  Template Read-Write Sparse Matrix Iterator Class.
 <p>
 This is the derived from cv::SparseMatConstIterator_ class that
 introduces more convenient operator *() for accessing the current element.
*/



/////////////////////////////////// NAryMatIterator //////////////////////////////////

/** \brief n-ary multi-dimensional array iterator.
<p>
Use the class to implement unary, binary, and, generally, n-ary element-wise operations on
multi-dimensional arrays. Some of the arguments of an n-ary function may be continuous arrays, some
may be not. It is possible to use conventional MatIterator 's for each array but incrementing all of
the iterators after each small operations may be a big overhead. In this case consider using
NAryMatIterator to iterate through several matrices simultaneously as long as they have the same
geometry (dimensionality and all the dimension sizes are the same). On each iteration {@code it.planes[0]},
{@code it.planes[1]},... will be the slices of the corresponding matrices.
<p>
The example below illustrates how you can compute a normalized and threshold 3D color histogram:
<pre>{@code
    void computeNormalizedColorHist(const Mat& image, Mat& hist, int N, double minProb)
    {
        const int histSize[] = {N, N, N};

        // make sure that the histogram has a proper size and type
        hist.create(3, histSize, CV_32F);

        // and clear it
        hist = Scalar(0);

        // the loop below assumes that the image
        // is a 8-bit 3-channel. check it.
        CV_Assert(image.type() == CV_8UC3);
        MatConstIterator_<Vec3b> it = image.begin<Vec3b>(),
                                 it_end = image.end<Vec3b>();
        for( ; it != it_end; ++it )
        {
            const Vec3b& pix = *it;
            hist.at<float>(pix[0]*N/256, pix[1]*N/256, pix[2]*N/256) += 1.f;
        }

        minProb *= image.rows*image.cols;
        Mat plane;
        NAryMatIterator it(&hist, &plane, 1);
        double s = 0;
        // iterate through the matrix. on each iteration
        // it.planes[*] (of type Mat) will be set to the current plane.
        for(int p = 0; p < it.nplanes; p++, ++it)
        {
            threshold(it.planes[0], it.planes[0], minProb, 0, THRESH_TOZERO);
            s += sum(it.planes[0])[0];
        }

        s = 1./s;
        it = NAryMatIterator(&hist, &plane, 1);
        for(int p = 0; p < it.nplanes; p++, ++it)
            it.planes[0] *= s;
    }
}</pre>
 */
@Namespace("cv") @NoOffset public static class NAryMatIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NAryMatIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public NAryMatIterator(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public NAryMatIterator position(int position) {
        return (NAryMatIterator)super.position(position);
    }

    /** the default constructor */
    public NAryMatIterator() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** the full constructor taking arbitrary number of n-dim matrices */
    public NAryMatIterator(@Cast("const cv::Mat**") PointerPointer arrays, @Cast("uchar**") PointerPointer ptrs, int narrays/*=-1*/) { super((Pointer)null); allocate(arrays, ptrs, narrays); }
    private native void allocate(@Cast("const cv::Mat**") PointerPointer arrays, @Cast("uchar**") PointerPointer ptrs, int narrays/*=-1*/);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr BytePointer ptrs) { super((Pointer)null); allocate(arrays, ptrs); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr BytePointer ptrs);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr BytePointer ptrs, int narrays/*=-1*/) { super((Pointer)null); allocate(arrays, ptrs, narrays); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr BytePointer ptrs, int narrays/*=-1*/);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr ByteBuffer ptrs, int narrays/*=-1*/) { super((Pointer)null); allocate(arrays, ptrs, narrays); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr ByteBuffer ptrs, int narrays/*=-1*/);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr ByteBuffer ptrs) { super((Pointer)null); allocate(arrays, ptrs); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr ByteBuffer ptrs);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr byte[] ptrs, int narrays/*=-1*/) { super((Pointer)null); allocate(arrays, ptrs, narrays); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr byte[] ptrs, int narrays/*=-1*/);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr byte[] ptrs) { super((Pointer)null); allocate(arrays, ptrs); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr byte[] ptrs);
    /** the full constructor taking arbitrary number of n-dim matrices */
    public NAryMatIterator(@Cast("const cv::Mat**") PointerPointer arrays, Mat planes, int narrays/*=-1*/) { super((Pointer)null); allocate(arrays, planes, narrays); }
    private native void allocate(@Cast("const cv::Mat**") PointerPointer arrays, Mat planes, int narrays/*=-1*/);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, Mat planes) { super((Pointer)null); allocate(arrays, planes); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, Mat planes);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, Mat planes, int narrays/*=-1*/) { super((Pointer)null); allocate(arrays, planes, narrays); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, Mat planes, int narrays/*=-1*/);
    /** the separate iterator initialization method */
    public native void init(@Cast("const cv::Mat**") PointerPointer arrays, Mat planes, @Cast("uchar**") PointerPointer ptrs, int narrays/*=-1*/);
    public native void init(@Const @ByPtrPtr Mat arrays, Mat planes, @Cast("uchar**") @ByPtrPtr BytePointer ptrs);
    public native void init(@Const @ByPtrPtr Mat arrays, Mat planes, @Cast("uchar**") @ByPtrPtr BytePointer ptrs, int narrays/*=-1*/);
    public native void init(@Const @ByPtrPtr Mat arrays, Mat planes, @Cast("uchar**") @ByPtrPtr ByteBuffer ptrs, int narrays/*=-1*/);
    public native void init(@Const @ByPtrPtr Mat arrays, Mat planes, @Cast("uchar**") @ByPtrPtr ByteBuffer ptrs);
    public native void init(@Const @ByPtrPtr Mat arrays, Mat planes, @Cast("uchar**") @ByPtrPtr byte[] ptrs, int narrays/*=-1*/);
    public native void init(@Const @ByPtrPtr Mat arrays, Mat planes, @Cast("uchar**") @ByPtrPtr byte[] ptrs);

    /** proceeds to the next plane of every iterated matrix */
    public native @ByRef @Name("operator ++") NAryMatIterator increment();
    /** proceeds to the next plane of every iterated matrix (postfix increment operator) */
    public native @ByVal @Name("operator ++") NAryMatIterator increment(int arg0);

    /** the iterated arrays */
    @MemberGetter public native @Const Mat arrays(int i);
    @MemberGetter public native @Cast("const cv::Mat**") PointerPointer arrays();
    /** the current planes */
    public native Mat planes(); public native NAryMatIterator planes(Mat planes);
    /** data pointers */
    public native @Cast("uchar*") BytePointer ptrs(int i); public native NAryMatIterator ptrs(int i, BytePointer ptrs);
    @MemberGetter public native @Cast("uchar**") PointerPointer ptrs();
    /** the number of arrays */
    public native int narrays(); public native NAryMatIterator narrays(int narrays);
    /** the number of hyper-planes that the iterator steps through */
    public native @Cast("size_t") long nplanes(); public native NAryMatIterator nplanes(long nplanes);
    /** the size of each segment (in elements) */
    public native @Cast("size_t") long size(); public native NAryMatIterator size(long size);
}



///////////////////////////////// Matrix Expressions /////////////////////////////////

@Namespace("cv") public static class MatOp extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatOp(Pointer p) { super(p); }


    public native @Cast("bool") boolean elementWise(@Const @ByRef MatExpr expr);
    public native void assign(@Const @ByRef MatExpr expr, @ByRef Mat m, int type/*=-1*/);
    public native void assign(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void roi(@Const @ByRef MatExpr expr, @Const @ByRef Range rowRange,
                         @Const @ByRef Range colRange, @ByRef MatExpr res);
    public native void diag(@Const @ByRef MatExpr expr, int d, @ByRef MatExpr res);
    public native void augAssignAdd(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void augAssignSubtract(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void augAssignMultiply(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void augAssignDivide(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void augAssignAnd(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void augAssignOr(@Const @ByRef MatExpr expr, @ByRef Mat m);
    public native void augAssignXor(@Const @ByRef MatExpr expr, @ByRef Mat m);

    public native void add(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res);
    public native void add(@Const @ByRef MatExpr expr1, @Const @ByRef Scalar s, @ByRef MatExpr res);

    public native void subtract(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res);
    public native void subtract(@Const @ByRef Scalar s, @Const @ByRef MatExpr expr, @ByRef MatExpr res);

    public native void multiply(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res, double scale/*=1*/);
    public native void multiply(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res);
    public native void multiply(@Const @ByRef MatExpr expr1, double s, @ByRef MatExpr res);

    public native void divide(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res, double scale/*=1*/);
    public native void divide(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res);
    public native void divide(double s, @Const @ByRef MatExpr expr, @ByRef MatExpr res);

    public native void abs(@Const @ByRef MatExpr expr, @ByRef MatExpr res);

    public native void transpose(@Const @ByRef MatExpr expr, @ByRef MatExpr res);
    public native void matmul(@Const @ByRef MatExpr expr1, @Const @ByRef MatExpr expr2, @ByRef MatExpr res);
    public native void invert(@Const @ByRef MatExpr expr, int method, @ByRef MatExpr res);

    public native @ByVal Size size(@Const @ByRef MatExpr expr);
    public native int type(@Const @ByRef MatExpr expr);
}

/** \brief Matrix expression representation
\anchor MatrixExpressions
This is a list of implemented matrix operations that can be combined in arbitrary complex
expressions (here A, B stand for matrices ( Mat ), s for a scalar ( Scalar ), alpha for a
real-valued scalar ( double )):
-   Addition, subtraction, negation: {@code A+B}, {@code A-B}, {@code A+s}, {@code A-s}, {@code s+A}, {@code s-A}, {@code -A}
-   Scaling: {@code A*alpha}
-   Per-element multiplication and division: {@code A.mul(B)}, {@code A/B}, {@code alpha/A}
-   Matrix multiplication: {@code A*B}
-   Transposition: {@code A.t()} (means A<sup>T</sup>)
-   Matrix inversion and pseudo-inversion, solving linear systems and least-squares problems:
    {@code A.inv([method]) (~ A<sup>-1</sup>)},   {@code A.inv([method])*B (~ X: AX=B)}
-   Comparison: {@code A cmpop B}, {@code A cmpop alpha}, {@code alpha cmpop A}, where *cmpop* is one of
  {@code >}, {@code >=}, {@code ==}, {@code !=}, {@code <=}, {@code <}. The result of comparison is an 8-bit single channel mask whose
    elements are set to 255 (if the particular element or pair of elements satisfy the condition) or
    0.
-   Bitwise logical operations: {@code A logicop B}, {@code A logicop s}, {@code s logicop A}, {@code ~A}, where *logicop* is one of
  {@code &}, {@code |}, {@code ^}.
-   Element-wise minimum and maximum: {@code min(A, B)}, {@code min(A, alpha)}, {@code max(A, B)}, {@code max(A, alpha)}
-   Element-wise absolute value: {@code abs(A)}
-   Cross-product, dot-product: {@code A.cross(B)}, {@code A.dot(B)}
-   Any function of matrix or matrices and scalars that returns a matrix or a scalar, such as norm,
    mean, sum, countNonZero, trace, determinant, repeat, and others.
-   Matrix initializers ( Mat::eye(), Mat::zeros(), Mat::ones() ), matrix comma-separated
    initializers, matrix constructors and operators that extract sub-matrices (see Mat description).
-   Mat_<destination_type>() constructors to cast the result to the proper type.
\note Comma-separated initializers and probably some other operations may require additional
explicit Mat() or Mat_<T>() constructor calls to resolve a possible ambiguity.
<p>
Here are examples of matrix expressions:
<pre>{@code
    // compute pseudo-inverse of A, equivalent to A.inv(DECOMP_SVD)
    SVD svd(A);
    Mat pinvA = svd.vt.t()*Mat::diag(1./svd.w)*svd.u.t();

    // compute the new vector of parameters in the Levenberg-Marquardt algorithm
    x -= (A.t()*A + lambda*Mat::eye(A.cols,A.cols,A.type())).inv(DECOMP_CHOLESKY)*(A.t()*err);

    // sharpen image using "unsharp mask" algorithm
    Mat blurred; double sigma = 1, threshold = 5, amount = 1;
    GaussianBlur(img, blurred, Size(), sigma, sigma);
    Mat lowContrastMask = abs(img - blurred) < threshold;
    Mat sharpened = img*(1+amount) + blurred*(-amount);
    img.copyTo(sharpened, lowContrastMask);
}</pre>
*/
@Namespace("cv") @NoOffset public static class MatExpr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatExpr(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public MatExpr(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public MatExpr position(int position) {
        return (MatExpr)super.position(position);
    }

    public MatExpr() { super((Pointer)null); allocate(); }
    private native void allocate();
    public MatExpr(@Const @ByRef Mat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef Mat m);

    public MatExpr(@Const MatOp _op, int _flags, @Const @ByRef(nullValue = "cv::Mat()") Mat _a/*=cv::Mat()*/, @Const @ByRef(nullValue = "cv::Mat()") Mat _b/*=cv::Mat()*/,
                @Const @ByRef(nullValue = "cv::Mat()") Mat _c/*=cv::Mat()*/, double _alpha/*=1*/, double _beta/*=1*/, @Const @ByRef(nullValue = "cv::Scalar()") Scalar _s/*=cv::Scalar()*/) { super((Pointer)null); allocate(_op, _flags, _a, _b, _c, _alpha, _beta, _s); }
    private native void allocate(@Const MatOp _op, int _flags, @Const @ByRef(nullValue = "cv::Mat()") Mat _a/*=cv::Mat()*/, @Const @ByRef(nullValue = "cv::Mat()") Mat _b/*=cv::Mat()*/,
                @Const @ByRef(nullValue = "cv::Mat()") Mat _c/*=cv::Mat()*/, double _alpha/*=1*/, double _beta/*=1*/, @Const @ByRef(nullValue = "cv::Scalar()") Scalar _s/*=cv::Scalar()*/);
    public MatExpr(@Const MatOp _op, int _flags) { super((Pointer)null); allocate(_op, _flags); }
    private native void allocate(@Const MatOp _op, int _flags);

    public native @ByVal @Name("operator cv::Mat") Mat asMat();

    public native @ByVal Size size();
    public native int type();

    public native @ByVal MatExpr row(int y);
    public native @ByVal MatExpr col(int x);
    public native @ByVal MatExpr diag(int d/*=0*/);
    public native @ByVal MatExpr diag();
    public native @ByVal @Name("operator ()") MatExpr apply( @Const @ByRef Range rowRange, @Const @ByRef Range colRange );
    public native @ByVal @Name("operator ()") MatExpr apply( @Const @ByRef Rect roi );

    public native @ByVal MatExpr t();
    public native @ByVal MatExpr inv(int method/*=cv::DECOMP_LU*/);
    public native @ByVal MatExpr inv();
    public native @ByVal MatExpr mul(@Const @ByRef MatExpr e, double scale/*=1*/);
    public native @ByVal MatExpr mul(@Const @ByRef MatExpr e);
    public native @ByVal MatExpr mul(@Const @ByRef Mat m, double scale/*=1*/);
    public native @ByVal MatExpr mul(@Const @ByRef Mat m);

    public native @ByVal Mat cross(@Const @ByRef Mat m);
    public native double dot(@Const @ByRef Mat m);

    @MemberGetter public native @Const MatOp op();
    public native int flags(); public native MatExpr flags(int flags);

    public native @ByRef Mat a(); public native MatExpr a(Mat a);
    public native @ByRef Mat b(); public native MatExpr b(Mat b);
    public native @ByRef Mat c(); public native MatExpr c(Mat c);
    public native double alpha(); public native MatExpr alpha(double alpha);
    public native double beta(); public native MatExpr beta(double beta);
    public native @ByRef Scalar s(); public native MatExpr s(Scalar s);
}

/** \} core_basic
 <p>
 *  \relates cv::MatExpr
 *  \{ */
@Namespace("cv") public static native @ByVal @Name("operator +") MatExpr add(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator +") MatExpr add(@Const @ByRef Mat a, @Const @ByRef Scalar s);
@Namespace("cv") public static native @ByVal @Name("operator +") MatExpr add(@Const @ByRef Scalar s, @Const @ByRef Mat a);
@Namespace("cv") public static native @ByVal @Name("operator +") MatExpr add(@Const @ByRef MatExpr e, @Const @ByRef Mat m);
@Namespace("cv") public static native @ByVal @Name("operator +") MatExpr add(@Const @ByRef Mat m, @Const @ByRef MatExpr e);
@Namespace("cv") public static native @ByVal @Name("operator +") MatExpr add(@Const @ByRef MatExpr e, @Const @ByRef Scalar s);
@Namespace("cv") public static native @ByVal @Name("operator +") MatExpr add(@Const @ByRef Scalar s, @Const @ByRef MatExpr e);
@Namespace("cv") public static native @ByVal @Name("operator +") MatExpr add(@Const @ByRef MatExpr e1, @Const @ByRef MatExpr e2);

@Namespace("cv") public static native @ByVal @Name("operator -") MatExpr subtract(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator -") MatExpr subtract(@Const @ByRef Mat a, @Const @ByRef Scalar s);
@Namespace("cv") public static native @ByVal @Name("operator -") MatExpr subtract(@Const @ByRef Scalar s, @Const @ByRef Mat a);
@Namespace("cv") public static native @ByVal @Name("operator -") MatExpr subtract(@Const @ByRef MatExpr e, @Const @ByRef Mat m);
@Namespace("cv") public static native @ByVal @Name("operator -") MatExpr subtract(@Const @ByRef Mat m, @Const @ByRef MatExpr e);
@Namespace("cv") public static native @ByVal @Name("operator -") MatExpr subtract(@Const @ByRef MatExpr e, @Const @ByRef Scalar s);
@Namespace("cv") public static native @ByVal @Name("operator -") MatExpr subtract(@Const @ByRef Scalar s, @Const @ByRef MatExpr e);
@Namespace("cv") public static native @ByVal @Name("operator -") MatExpr subtract(@Const @ByRef MatExpr e1, @Const @ByRef MatExpr e2);

@Namespace("cv") public static native @ByVal @Name("operator -") MatExpr subtract(@Const @ByRef Mat m);
@Namespace("cv") public static native @ByVal @Name("operator -") MatExpr subtract(@Const @ByRef MatExpr e);

@Namespace("cv") public static native @ByVal @Name("operator *") MatExpr multiply(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator *") MatExpr multiply(@Const @ByRef Mat a, double s);
@Namespace("cv") public static native @ByVal @Name("operator *") MatExpr multiply(double s, @Const @ByRef Mat a);
@Namespace("cv") public static native @ByVal @Name("operator *") MatExpr multiply(@Const @ByRef MatExpr e, @Const @ByRef Mat m);
@Namespace("cv") public static native @ByVal @Name("operator *") MatExpr multiply(@Const @ByRef Mat m, @Const @ByRef MatExpr e);
@Namespace("cv") public static native @ByVal @Name("operator *") MatExpr multiply(@Const @ByRef MatExpr e, double s);
@Namespace("cv") public static native @ByVal @Name("operator *") MatExpr multiply(double s, @Const @ByRef MatExpr e);
@Namespace("cv") public static native @ByVal @Name("operator *") MatExpr multiply(@Const @ByRef MatExpr e1, @Const @ByRef MatExpr e2);

@Namespace("cv") public static native @ByVal @Name("operator /") MatExpr divide(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator /") MatExpr divide(@Const @ByRef Mat a, double s);
@Namespace("cv") public static native @ByVal @Name("operator /") MatExpr divide(double s, @Const @ByRef Mat a);
@Namespace("cv") public static native @ByVal @Name("operator /") MatExpr divide(@Const @ByRef MatExpr e, @Const @ByRef Mat m);
@Namespace("cv") public static native @ByVal @Name("operator /") MatExpr divide(@Const @ByRef Mat m, @Const @ByRef MatExpr e);
@Namespace("cv") public static native @ByVal @Name("operator /") MatExpr divide(@Const @ByRef MatExpr e, double s);
@Namespace("cv") public static native @ByVal @Name("operator /") MatExpr divide(double s, @Const @ByRef MatExpr e);
@Namespace("cv") public static native @ByVal @Name("operator /") MatExpr divide(@Const @ByRef MatExpr e1, @Const @ByRef MatExpr e2);

@Namespace("cv") public static native @ByVal @Name("operator <") MatExpr lessThan(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator <") MatExpr lessThan(@Const @ByRef Mat a, double s);
@Namespace("cv") public static native @ByVal @Name("operator <") MatExpr lessThan(double s, @Const @ByRef Mat a);

@Namespace("cv") public static native @ByVal @Name("operator <=") MatExpr lessThanEquals(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator <=") MatExpr lessThanEquals(@Const @ByRef Mat a, double s);
@Namespace("cv") public static native @ByVal @Name("operator <=") MatExpr lessThanEquals(double s, @Const @ByRef Mat a);

@Namespace("cv") public static native @ByVal @Name("operator ==") MatExpr equals(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator ==") MatExpr equals(@Const @ByRef Mat a, double s);
@Namespace("cv") public static native @ByVal @Name("operator ==") MatExpr equals(double s, @Const @ByRef Mat a);

@Namespace("cv") public static native @ByVal @Name("operator !=") MatExpr notEquals(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator !=") MatExpr notEquals(@Const @ByRef Mat a, double s);
@Namespace("cv") public static native @ByVal @Name("operator !=") MatExpr notEquals(double s, @Const @ByRef Mat a);

@Namespace("cv") public static native @ByVal @Name("operator >=") MatExpr greaterThanEquals(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator >=") MatExpr greaterThanEquals(@Const @ByRef Mat a, double s);
@Namespace("cv") public static native @ByVal @Name("operator >=") MatExpr greaterThanEquals(double s, @Const @ByRef Mat a);

@Namespace("cv") public static native @ByVal @Name("operator >") MatExpr greaterThan(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator >") MatExpr greaterThan(@Const @ByRef Mat a, double s);
@Namespace("cv") public static native @ByVal @Name("operator >") MatExpr greaterThan(double s, @Const @ByRef Mat a);

@Namespace("cv") public static native @ByVal @Name("operator &") MatExpr and(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator &") MatExpr and(@Const @ByRef Mat a, @Const @ByRef Scalar s);
@Namespace("cv") public static native @ByVal @Name("operator &") MatExpr and(@Const @ByRef Scalar s, @Const @ByRef Mat a);

@Namespace("cv") public static native @ByVal @Name("operator |") MatExpr or(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator |") MatExpr or(@Const @ByRef Mat a, @Const @ByRef Scalar s);
@Namespace("cv") public static native @ByVal @Name("operator |") MatExpr or(@Const @ByRef Scalar s, @Const @ByRef Mat a);

@Namespace("cv") public static native @ByVal @Name("operator ^") MatExpr xor(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal @Name("operator ^") MatExpr xor(@Const @ByRef Mat a, @Const @ByRef Scalar s);
@Namespace("cv") public static native @ByVal @Name("operator ^") MatExpr xor(@Const @ByRef Scalar s, @Const @ByRef Mat a);

@Namespace("cv") public static native @ByVal @Name("operator ~") MatExpr not(@Const @ByRef Mat m);

@Namespace("cv") public static native @ByVal MatExpr min(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal MatExpr min(@Const @ByRef Mat a, double s);
@Namespace("cv") public static native @ByVal MatExpr min(double s, @Const @ByRef Mat a);

@Namespace("cv") public static native @ByVal MatExpr max(@Const @ByRef Mat a, @Const @ByRef Mat b);
@Namespace("cv") public static native @ByVal MatExpr max(@Const @ByRef Mat a, double s);
@Namespace("cv") public static native @ByVal MatExpr max(double s, @Const @ByRef Mat a);

/** \brief Calculates an absolute value of each matrix element.
<p>
abs is a meta-function that is expanded to one of absdiff or convertScaleAbs forms:
- C = abs(A-B) is equivalent to {@code absdiff(A, B, C)}
- C = abs(A) is equivalent to {@code absdiff(A, Scalar::all(0), C)}
- C = {@code Mat_<Vec<uchar,n> >(abs(A*alpha + beta))} is equivalent to {@code convertScaleAbs(A, C, alpha,
beta)}
<p>
The output matrix has the same size and the same type as the input one except for the last case,
where C is depth=CV_8U .
@param m matrix.
\sa \ref MatrixExpressions, absdiff, convertScaleAbs
 */
@Namespace("cv") public static native @ByVal MatExpr abs(@Const @ByRef Mat m);
/** \overload
@param e matrix expression.
*/
@Namespace("cv") public static native @ByVal MatExpr abs(@Const @ByRef MatExpr e);
/** \} relates cv::MatExpr */

 // cv

// #include "opencv2/core/mat.inl.hpp"

// #endif // __OPENCV_CORE_MAT_HPP__


// Parsed from <opencv2/core/persistence.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_CORE_PERSISTENCE_HPP__
// #define __OPENCV_CORE_PERSISTENCE_HPP__

// #ifndef __cplusplus
// #endif

/** \addtogroup core_c
 *  \{
<p>
/** \brief "black box" representation of the file storage associated with a file on disk.
<p>
Several functions that are described below take CvFileStorage\* as inputs and allow the user to
save or to load hierarchical collections that consist of scalar values, standard CXCore objects
(such as matrices, sequences, graphs), and user-defined objects.
<p>
OpenCV can read and write data in XML (<http://www.w3c.org/XML>) or YAML (<http://www.yaml.org>)
formats. Below is an example of 3x3 floating-point identity matrix A, stored in XML and YAML files
using CXCore functions:
XML:
<pre>{@code {.xml}
    <?xml version="1.0">
    <opencv_storage>
    <A type_id="opencv-matrix">
      <rows>3</rows>
      <cols>3</cols>
      <dt>f</dt>
      <data>1. 0. 0. 0. 1. 0. 0. 0. 1.</data>
    </A>
    </opencv_storage>
}</pre>
YAML:
<pre>{@code {.yaml}
    %YAML:1.0
    A: !!opencv-matrix
      rows: 3
      cols: 3
      dt: f
      data: [ 1., 0., 0., 0., 1., 0., 0., 0., 1.]
}</pre>
As it can be seen from the examples, XML uses nested tags to represent hierarchy, while YAML uses
indentation for that purpose (similar to the Python programming language).
<p>
The same functions can read and write data in both formats; the particular format is determined by
the extension of the opened file, ".xml" for XML files and ".yml" or ".yaml" for YAML.
 */

/** \} core_c */

// #include "opencv2/core/types.hpp"
// #include "opencv2/core/mat.hpp"

/** \addtogroup core_xml
<p>
XML/YAML file storages.     {#xml_storage}
=======================
Writing to a file storage.
--------------------------
You can store and then restore various OpenCV data structures to/from XML (<http://www.w3c.org/XML>)
or YAML (<http://www.yaml.org>) formats. Also, it is possible store and load arbitrarily complex
data structures, which include OpenCV data structures, as well as primitive data types (integer and
floating-point numbers and text strings) as their elements.
<p>
Use the following procedure to write something to XML or YAML:
-# Create new FileStorage and open it for writing. It can be done with a single call to
FileStorage::FileStorage constructor that takes a filename, or you can use the default constructor
and then call FileStorage::open. Format of the file (XML or YAML) is determined from the filename
extension (".xml" and ".yml"/".yaml", respectively)
-# Write all the data you want using the streaming operator {@code <<}, just like in the case of STL
streams.
-# Close the file using FileStorage::release. FileStorage destructor also closes the file.
<p>
Here is an example:
<pre>{@code
    #include "opencv2/opencv.hpp"
    #include <time.h>

    using namespace cv;

    int main(int, char** argv)
    {
        FileStorage fs("test.yml", FileStorage::WRITE);

        fs << "frameCount" << 5;
        time_t rawtime; time(&rawtime);
        fs << "calibrationDate" << asctime(localtime(&rawtime));
        Mat cameraMatrix = (Mat_<double>(3,3) << 1000, 0, 320, 0, 1000, 240, 0, 0, 1);
        Mat distCoeffs = (Mat_<double>(5,1) << 0.1, 0.01, -0.001, 0, 0);
        fs << "cameraMatrix" << cameraMatrix << "distCoeffs" << distCoeffs;
        fs << "features" << "[";
        for( int i = 0; i < 3; i++ )
        {
            int x = rand() % 640;
            int y = rand() % 480;
            uchar lbp = rand() % 256;

            fs << "{:" << "x" << x << "y" << y << "lbp" << "[:";
            for( int j = 0; j < 8; j++ )
                fs << ((lbp >> j) & 1);
            fs << "]" << "}";
        }
        fs << "]";
        fs.release();
        return 0;
    }
}</pre>
The sample above stores to XML and integer, text string (calibration date), 2 matrices, and a custom
structure "feature", which includes feature coordinates and LBP (local binary pattern) value. Here
is output of the sample:
<pre>{@code {.yaml}
%YAML:1.0
frameCount: 5
calibrationDate: "Fri Jun 17 14:09:29 2011\n"
cameraMatrix: !!opencv-matrix
   rows: 3
   cols: 3
   dt: d
   data: [ 1000., 0., 320., 0., 1000., 240., 0., 0., 1. ]
distCoeffs: !!opencv-matrix
   rows: 5
   cols: 1
   dt: d
   data: [ 1.0000000000000001e-01, 1.0000000000000000e-02,
       -1.0000000000000000e-03, 0., 0. ]
features:
   - { x:167, y:49, lbp:[ 1, 0, 0, 1, 1, 0, 1, 1 ] }
   - { x:298, y:130, lbp:[ 0, 0, 0, 1, 0, 0, 1, 1 ] }
   - { x:344, y:158, lbp:[ 1, 1, 0, 0, 0, 0, 1, 0 ] }
}</pre>
<p>
As an exercise, you can replace ".yml" with ".xml" in the sample above and see, how the
corresponding XML file will look like.
<p>
Several things can be noted by looking at the sample code and the output:
<p>
-   The produced YAML (and XML) consists of heterogeneous collections that can be nested. There are 2
    types of collections: named collections (mappings) and unnamed collections (sequences). In mappings
    each element has a name and is accessed by name. This is similar to structures and std::map in
    C/C++ and dictionaries in Python. In sequences elements do not have names, they are accessed by
    indices. This is similar to arrays and std::vector in C/C++ and lists, tuples in Python.
    "Heterogeneous" means that elements of each single collection can have different types.
    <p>
    Top-level collection in YAML/XML is a mapping. Each matrix is stored as a mapping, and the matrix
    elements are stored as a sequence. Then, there is a sequence of features, where each feature is
    represented a mapping, and lbp value in a nested sequence.
<p>
-   When you write to a mapping (a structure), you write element name followed by its value. When you
    write to a sequence, you simply write the elements one by one. OpenCV data structures (such as
    cv::Mat) are written in absolutely the same way as simple C data structures - using {@code <<}
    operator.
<p>
-   To write a mapping, you first write the special string {@code {} to the storage, then write the
    elements as pairs ({@code fs << <element_name> << <element_value>}) and then write the closing
    {@code }}.
<p>
-   To write a sequence, you first write the special string {@code [}, then write the elements, then
    write the closing {@code ]}.
<p>
-   In YAML (but not XML), mappings and sequences can be written in a compact Python-like inline
    form. In the sample above matrix elements, as well as each feature, including its lbp value, is
    stored in such inline form. To store a mapping/sequence in a compact form, put {@code :} after the
    opening character, e.g. use {@code {:} instead of {@code {} and {@code [:} instead of {@code [}. When the
    data is written to XML, those extra {@code :} are ignored.
<p>
Reading data from a file storage.
---------------------------------
To read the previously written XML or YAML file, do the following:
-#  Open the file storage using FileStorage::FileStorage constructor or FileStorage::open method.
    In the current implementation the whole file is parsed and the whole representation of file
    storage is built in memory as a hierarchy of file nodes (see FileNode)
<p>
-#  Read the data you are interested in. Use FileStorage::operator [], FileNode::operator []
    and/or FileNodeIterator.
<p>
-#  Close the storage using FileStorage::release.
<p>
Here is how to read the file created by the code sample above:
<pre>{@code
    FileStorage fs2("test.yml", FileStorage::READ);

    // first method: use (type) operator on FileNode.
    int frameCount = (int)fs2["frameCount"];

    String date;
    // second method: use FileNode::operator >>
    fs2["calibrationDate"] >> date;

    Mat cameraMatrix2, distCoeffs2;
    fs2["cameraMatrix"] >> cameraMatrix2;
    fs2["distCoeffs"] >> distCoeffs2;

    cout << "frameCount: " << frameCount << endl
         << "calibration date: " << date << endl
         << "camera matrix: " << cameraMatrix2 << endl
         << "distortion coeffs: " << distCoeffs2 << endl;

    FileNode features = fs2["features"];
    FileNodeIterator it = features.begin(), it_end = features.end();
    int idx = 0;
    std::vector<uchar> lbpval;

    // iterate through a sequence using FileNodeIterator
    for( ; it != it_end; ++it, idx++ )
    {
        cout << "feature #" << idx << ": ";
        cout << "x=" << (int)(*it)["x"] << ", y=" << (int)(*it)["y"] << ", lbp: (";
        // you can also easily read numerical arrays using FileNode >> std::vector operator.
        (*it)["lbp"] >> lbpval;
        for( int i = 0; i < (int)lbpval.size(); i++ )
            cout << " " << (int)lbpval[i];
        cout << ")" << endl;
    }
    fs2.release();
}</pre>
<p>
Format specification    {#format_spec}
--------------------
{@code ([count]{u|c|w|s|i|f|d})}... where the characters correspond to fundamental C++ types:
-   {@code u} 8-bit unsigned number
-   {@code c} 8-bit signed number
-   {@code w} 16-bit unsigned number
-   {@code s} 16-bit signed number
-   {@code i} 32-bit signed number
-   {@code f} single precision floating-point number
-   {@code d} double precision floating-point number
-   {@code r} pointer, 32 lower bits of which are written as a signed integer. The type can be used to
    store structures with links between the elements.
<p>
{@code count} is the optional counter of values of a given type. For example, {@code 2if} means that each array
element is a structure of 2 integers, followed by a single-precision floating-point number. The
equivalent notations of the above specification are {@code iif}, {@code 2i1f} and so forth. Other examples: {@code u}
means that the array consists of bytes, and {@code 2d} means the array consists of pairs of doubles.
<p>
@see \ref filestorage.cpp
*/

/** \{
<p>
/** \example filestorage.cpp
A complete example using the FileStorage interface
*/

////////////////////////// XML & YAML I/O ////////////////////////// */

/** \brief XML/YAML file storage class that encapsulates all the information necessary for writing or reading
data to/from a file.
 */
@Namespace("cv") @NoOffset public static class FileStorage extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileStorage(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public FileStorage(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public FileStorage position(int position) {
        return (FileStorage)super.position(position);
    }

    /** file storage mode */
    /** enum cv::FileStorage::Mode */
    public static final int
        /** value, open the file for reading */
        READ        = 0,
        /** value, open the file for writing */
        WRITE       = 1,
        /** value, open the file for appending */
        APPEND      = 2,
        /** flag, read data from source or write data to the internal buffer (which is
 *  returned by FileStorage::release) */
        MEMORY      = 4,
        /** mask for format flags */
        FORMAT_MASK =  (7<<3),
        /** flag, auto format */
        FORMAT_AUTO = 0,
        /** flag, XML format */
        FORMAT_XML  =  (1<<3),
        /** flag, YAML format */
        FORMAT_YAML =  (2<<3);
    /** enum cv::FileStorage:: */
    public static final int
        UNDEFINED      = 0,
        VALUE_EXPECTED = 1,
        NAME_EXPECTED  = 2,
        INSIDE_MAP     = 4;

    /** \brief The constructors.
    <p>
    The full constructor opens the file. Alternatively you can use the default constructor and then
    call FileStorage::open.
     */
    public FileStorage() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
    @param source Name of the file to open or the text string to read the data from. Extension of the
    file (.xml or .yml/.yaml) determines its format (XML or YAML respectively). Also you can append .gz
    to work with compressed files, for example myHugeMatrix.xml.gz. If both FileStorage::WRITE and
    FileStorage::MEMORY flags are specified, source is used just to specify the output file format (e.g.
    mydata.xml, .yml etc.).
    @param flags Mode of operation. See  FileStorage::Mode
    @param encoding Encoding of the file. Note that UTF-16 XML encoding is not supported currently and
    you should use 8-bit encoding instead of it.
    */
    public FileStorage(@Str BytePointer source, int flags, @Str BytePointer encoding/*=cv::String()*/) { super((Pointer)null); allocate(source, flags, encoding); }
    private native void allocate(@Str BytePointer source, int flags, @Str BytePointer encoding/*=cv::String()*/);
    public FileStorage(@Str BytePointer source, int flags) { super((Pointer)null); allocate(source, flags); }
    private native void allocate(@Str BytePointer source, int flags);
    public FileStorage(@Str String source, int flags, @Str String encoding/*=cv::String()*/) { super((Pointer)null); allocate(source, flags, encoding); }
    private native void allocate(@Str String source, int flags, @Str String encoding/*=cv::String()*/);
    public FileStorage(@Str String source, int flags) { super((Pointer)null); allocate(source, flags); }
    private native void allocate(@Str String source, int flags);

    /** \overload */
    public FileStorage(CvFileStorage fs, @Cast("bool") boolean owning/*=true*/) { super((Pointer)null); allocate(fs, owning); }
    private native void allocate(CvFileStorage fs, @Cast("bool") boolean owning/*=true*/);
    public FileStorage(CvFileStorage fs) { super((Pointer)null); allocate(fs); }
    private native void allocate(CvFileStorage fs);

    /** the destructor. calls release() */

    /** \brief Opens a file.
    <p>
    See description of parameters in FileStorage::FileStorage. The method calls FileStorage::release
    before opening the file.
    @param filename Name of the file to open or the text string to read the data from.
       Extension of the file (.xml or .yml/.yaml) determines its format (XML or YAML respectively).
        Also you can append .gz to work with compressed files, for example myHugeMatrix.xml.gz. If both
        FileStorage::WRITE and FileStorage::MEMORY flags are specified, source is used just to specify
        the output file format (e.g. mydata.xml, .yml etc.).
    @param flags Mode of operation. One of FileStorage::Mode
    @param encoding Encoding of the file. Note that UTF-16 XML encoding is not supported currently and
    you should use 8-bit encoding instead of it.
     */
    public native @Cast("bool") boolean open(@Str BytePointer filename, int flags, @Str BytePointer encoding/*=cv::String()*/);
    public native @Cast("bool") boolean open(@Str BytePointer filename, int flags);
    public native @Cast("bool") boolean open(@Str String filename, int flags, @Str String encoding/*=cv::String()*/);
    public native @Cast("bool") boolean open(@Str String filename, int flags);

    /** \brief Checks whether the file is opened.
    <p>
    @return true if the object is associated with the current file and false otherwise. It is a
    good practice to call this method after you tried to open a file.
     */
    public native @Cast("bool") boolean isOpened();

    /** \brief Closes the file and releases all the memory buffers.
    <p>
    Call this method after all I/O operations with the storage are finished.
     */
    public native void release();

    /** \brief Closes the file and releases all the memory buffers.
    <p>
    Call this method after all I/O operations with the storage are finished. If the storage was
    opened for writing data and FileStorage::WRITE was specified
     */
    public native @Str BytePointer releaseAndGetString();

    /** \brief Returns the first element of the top-level mapping.
    @return The first element of the top-level mapping.
     */
    public native @ByVal FileNode getFirstTopLevelNode();

    /** \brief Returns the top-level mapping
    @param streamidx Zero-based index of the stream. In most cases there is only one stream in the file.
    However, YAML supports multiple streams and so there can be several.
    @return The top-level mapping.
     */
    public native @ByVal FileNode root(int streamidx/*=0*/);
    public native @ByVal FileNode root();

    /** \brief Returns the specified element of the top-level mapping.
    @param nodename Name of the file node.
    @return Node with the given name.
     */
    public native @ByVal @Name("operator []") FileNode get(@Str BytePointer nodename);
    public native @ByVal @Name("operator []") FileNode get(@Str String nodename);

    /** \overload */

    /** \brief Returns the obsolete C FileStorage structure.
    @return Pointer to the underlying C FileStorage structure
     */
    public native @Name("operator *") CvFileStorage multiply();

    /** \overload */

    /** \brief Writes multiple numbers.
    <p>
    Writes one or more numbers of the specified format to the currently written structure. Usually it is
    more convenient to use operator {@code <<} instead of this method.
    @param fmt Specification of each array element, see \ref format_spec "format specification"
    @param vec Pointer to the written array.
    @param len Number of the uchar elements to write.
     */
    public native void writeRaw( @Str BytePointer fmt, @Cast("const uchar*") BytePointer vec, @Cast("size_t") long len );
    public native void writeRaw( @Str String fmt, @Cast("const uchar*") ByteBuffer vec, @Cast("size_t") long len );
    public native void writeRaw( @Str BytePointer fmt, @Cast("const uchar*") byte[] vec, @Cast("size_t") long len );
    public native void writeRaw( @Str String fmt, @Cast("const uchar*") BytePointer vec, @Cast("size_t") long len );
    public native void writeRaw( @Str BytePointer fmt, @Cast("const uchar*") ByteBuffer vec, @Cast("size_t") long len );
    public native void writeRaw( @Str String fmt, @Cast("const uchar*") byte[] vec, @Cast("size_t") long len );

    /** \brief Writes the registered C structure (CvMat, CvMatND, CvSeq).
    @param name Name of the written object.
    @param obj Pointer to the object.
    @see ocvWrite for details.
     */
    public native void writeObj( @Str BytePointer name, @Const Pointer obj );
    public native void writeObj( @Str String name, @Const Pointer obj );

    /** \brief Returns the normalized object name for the specified name of a file.
    @param filename Name of a file
    @return The normalized object name.
     */
    public static native @Str BytePointer getDefaultObjectName(@Str BytePointer filename);
    public static native @Str String getDefaultObjectName(@Str String filename);

    /** the underlying C FileStorage structure */
    public native @Ptr CvFileStorage fs(); public native FileStorage fs(CvFileStorage fs);
    /** the currently written element */
    public native @Str BytePointer elname(); public native FileStorage elname(BytePointer elname);
    /** the stack of written structures */
    public native @Cast("char*") @StdVector BytePointer structs(); public native FileStorage structs(BytePointer structs);
    /** the writer state */
    public native int state(); public native FileStorage state(int state);
}



/** \brief File Storage Node class.
<p>
The node is used to store each and every element of the file storage opened for reading. When
XML/YAML file is read, it is first parsed and stored in the memory as a hierarchical collection of
nodes. Each node can be a “leaf” that is contain a single number or a string, or be a collection of
other nodes. There can be named collections (mappings) where each element has a name and it is
accessed by a name, and ordered collections (sequences) where elements do not have names but rather
accessed by index. Type of the file node can be determined using FileNode::type method.
<p>
Note that file nodes are only used for navigating file storages opened for reading. When a file
storage is opened for writing, no data is stored in memory after it is written.
 */
@Namespace("cv") @NoOffset public static class FileNode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileNode(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public FileNode(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public FileNode position(int position) {
        return (FileNode)super.position(position);
    }

    /** type of the file storage node */
    /** enum cv::FileNode::Type */
    public static final int
        /** empty node */
        NONE      = 0,
        /** an integer */
        INT       = 1,
        /** floating-point number */
        REAL      = 2,
        /** synonym or REAL */
        FLOAT     =  REAL,
        /** text string in UTF-8 encoding */
        STR       = 3,
        /** synonym for STR */
        STRING    =  STR,
        /** integer of size size_t. Typically used for storing complex dynamic structures where some elements reference the others */
        REF       = 4,
        /** sequence */
        SEQ       = 5,
        /** mapping */
        MAP       = 6,
        TYPE_MASK = 7,
        /** compact representation of a sequence or mapping. Used only by YAML writer */
        FLOW      = 8,
        /** a registered object (e.g. a matrix) */
        USER      = 16,
        /** empty structure (sequence or mapping) */
        EMPTY     = 32,
        /** the node has a name (i.e. it is element of a mapping) */
        NAMED     = 64;
    /** \brief The constructors.
    <p>
    These constructors are used to create a default file node, construct it from obsolete structures or
    from the another file node.
     */
    public FileNode() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
    @param fs Pointer to the obsolete file storage structure.
    @param node File node to be used as initialization for the created file node.
    */
    public FileNode(@Const CvFileStorage fs, @Const CvFileNode node) { super((Pointer)null); allocate(fs, node); }
    private native void allocate(@Const CvFileStorage fs, @Const CvFileNode node);

    /** \overload
    @param node File node to be used as initialization for the created file node.
    */
    public FileNode(@Const @ByRef FileNode node) { super((Pointer)null); allocate(node); }
    private native void allocate(@Const @ByRef FileNode node);

    /** \brief Returns element of a mapping node or a sequence node.
    @param nodename Name of an element in the mapping node.
    @return Returns the element with the given identifier.
     */
    public native @ByVal @Name("operator []") FileNode get(@Str BytePointer nodename);
    public native @ByVal @Name("operator []") FileNode get(@Str String nodename);

    /** \overload
    @param nodename Name of an element in the mapping node.
    */

    /** \overload
    @param i Index of an element in the sequence node.
    */
    public native @ByVal @Name("operator []") FileNode get(int i);

    /** \brief Returns type of the node.
    @return Type of the node. See FileNode::Type
     */
    public native int type();

    /** returns true if the node is empty */
    public native @Cast("bool") boolean empty();
    /** returns true if the node is a "none" object */
    public native @Cast("bool") boolean isNone();
    /** returns true if the node is a sequence */
    public native @Cast("bool") boolean isSeq();
    /** returns true if the node is a mapping */
    public native @Cast("bool") boolean isMap();
    /** returns true if the node is an integer */
    public native @Cast("bool") boolean isInt();
    /** returns true if the node is a floating-point number */
    public native @Cast("bool") boolean isReal();
    /** returns true if the node is a text string */
    public native @Cast("bool") boolean isString();
    /** returns true if the node has a name */
    public native @Cast("bool") boolean isNamed();
    /** returns the node name or an empty string if the node is nameless */
    public native @Str BytePointer name();
    /** returns the number of elements in the node, if it is a sequence or mapping, or 1 otherwise. */
    public native @Cast("size_t") long size();
    /** returns the node content as an integer. If the node stores floating-point number, it is rounded. */
    public native @Name("operator int") int asInt();
    /** returns the node content as float */
    public native @Name("operator float") float asFloat();
    /** returns the node content as double */
    public native @Name("operator double") double asDouble();
    /** returns the node content as text string */
    public native @Name("operator cv::String") @Str BytePointer asBytePointer();
// #ifndef OPENCV_NOSTL
// #endif

    /** returns pointer to the underlying file node */
    public native @Name("operator *") CvFileNode multiply();
    /** returns pointer to the underlying file node */

    /** returns iterator pointing to the first node element */
    public native @ByVal FileNodeIterator begin();
    /** returns iterator pointing to the element following the last node element */
    public native @ByVal FileNodeIterator end();

    /** \brief Reads node elements to the buffer with the specified format.
    <p>
    Usually it is more convenient to use operator {@code >>} instead of this method.
    @param fmt Specification of each array element. See \ref format_spec "format specification"
    @param vec Pointer to the destination array.
    @param len Number of elements to read. If it is greater than number of remaining elements then all
    of them will be read.
     */
    public native void readRaw( @Str BytePointer fmt, @Cast("uchar*") BytePointer vec, @Cast("size_t") long len );
    public native void readRaw( @Str String fmt, @Cast("uchar*") ByteBuffer vec, @Cast("size_t") long len );
    public native void readRaw( @Str BytePointer fmt, @Cast("uchar*") byte[] vec, @Cast("size_t") long len );
    public native void readRaw( @Str String fmt, @Cast("uchar*") BytePointer vec, @Cast("size_t") long len );
    public native void readRaw( @Str BytePointer fmt, @Cast("uchar*") ByteBuffer vec, @Cast("size_t") long len );
    public native void readRaw( @Str String fmt, @Cast("uchar*") byte[] vec, @Cast("size_t") long len );

    /** reads the registered object and returns pointer to it */
    public native Pointer readObj();

    // do not use wrapper pointer classes for better efficiency
    @MemberGetter public native @Const CvFileStorage fs();
    @MemberGetter public native @Const CvFileNode node();
}


/** \brief used to iterate through sequences and mappings.
<p>
A standard STL notation, with node.begin(), node.end() denoting the beginning and the end of a
sequence, stored in node. See the data reading sample in the beginning of the section.
 */
@Namespace("cv") @NoOffset public static class FileNodeIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileNodeIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public FileNodeIterator(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public FileNodeIterator position(int position) {
        return (FileNodeIterator)super.position(position);
    }

    /** \brief The constructors.
    <p>
    These constructors are used to create a default iterator, set it to specific element in a file node
    or construct it from another iterator.
     */
    public FileNodeIterator() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
    @param fs File storage for the iterator.
    @param node File node for the iterator.
    @param ofs Index of the element in the node. The created iterator will point to this element.
    */
    public FileNodeIterator(@Const CvFileStorage fs, @Const CvFileNode node, @Cast("size_t") long ofs/*=0*/) { super((Pointer)null); allocate(fs, node, ofs); }
    private native void allocate(@Const CvFileStorage fs, @Const CvFileNode node, @Cast("size_t") long ofs/*=0*/);
    public FileNodeIterator(@Const CvFileStorage fs, @Const CvFileNode node) { super((Pointer)null); allocate(fs, node); }
    private native void allocate(@Const CvFileStorage fs, @Const CvFileNode node);

    /** \overload
    @param it Iterator to be used as initialization for the created iterator.
    */
    public FileNodeIterator(@Const @ByRef FileNodeIterator it) { super((Pointer)null); allocate(it); }
    private native void allocate(@Const @ByRef FileNodeIterator it);

    /** returns the currently observed element */
    public native @ByVal @Name("operator *") FileNode multiply();
    /** accesses the currently observed element methods */
    public native @ByVal @Name("operator ->") FileNode access();

    /** moves iterator to the next node */
    public native @ByRef @Name("operator ++") FileNodeIterator increment();
    /** moves iterator to the next node */
    public native @ByVal @Name("operator ++") FileNodeIterator increment(int arg0);
    /** moves iterator to the previous node */
    public native @ByRef @Name("operator --") FileNodeIterator decrement();
    /** moves iterator to the previous node */
    public native @ByVal @Name("operator --") FileNodeIterator decrement(int arg0);
    /** moves iterator forward by the specified offset (possibly negative) */
    public native @ByRef @Name("operator +=") FileNodeIterator addPut(int ofs);
    /** moves iterator backward by the specified offset (possibly negative) */
    public native @ByRef @Name("operator -=") FileNodeIterator subtractPut(int ofs);

    /** \brief Reads node elements to the buffer with the specified format.
    <p>
    Usually it is more convenient to use operator {@code >>} instead of this method.
    @param fmt Specification of each array element. See \ref format_spec "format specification"
    @param vec Pointer to the destination array.
    @param maxCount Number of elements to read. If it is greater than number of remaining elements then
    all of them will be read.
     */
    public native @ByRef FileNodeIterator readRaw( @Str BytePointer fmt, @Cast("uchar*") BytePointer vec,
                                   @Cast("size_t") long maxCount/*=(size_t)INT_MAX*/ );
    public native @ByRef FileNodeIterator readRaw( @Str BytePointer fmt, @Cast("uchar*") BytePointer vec );
    public native @ByRef FileNodeIterator readRaw( @Str String fmt, @Cast("uchar*") ByteBuffer vec,
                                   @Cast("size_t") long maxCount/*=(size_t)INT_MAX*/ );
    public native @ByRef FileNodeIterator readRaw( @Str String fmt, @Cast("uchar*") ByteBuffer vec );
    public native @ByRef FileNodeIterator readRaw( @Str BytePointer fmt, @Cast("uchar*") byte[] vec,
                                   @Cast("size_t") long maxCount/*=(size_t)INT_MAX*/ );
    public native @ByRef FileNodeIterator readRaw( @Str BytePointer fmt, @Cast("uchar*") byte[] vec );
    public native @ByRef FileNodeIterator readRaw( @Str String fmt, @Cast("uchar*") BytePointer vec,
                                   @Cast("size_t") long maxCount/*=(size_t)INT_MAX*/ );
    public native @ByRef FileNodeIterator readRaw( @Str String fmt, @Cast("uchar*") BytePointer vec );
    public native @ByRef FileNodeIterator readRaw( @Str BytePointer fmt, @Cast("uchar*") ByteBuffer vec,
                                   @Cast("size_t") long maxCount/*=(size_t)INT_MAX*/ );
    public native @ByRef FileNodeIterator readRaw( @Str BytePointer fmt, @Cast("uchar*") ByteBuffer vec );
    public native @ByRef FileNodeIterator readRaw( @Str String fmt, @Cast("uchar*") byte[] vec,
                                   @Cast("size_t") long maxCount/*=(size_t)INT_MAX*/ );
    public native @ByRef FileNodeIterator readRaw( @Str String fmt, @Cast("uchar*") byte[] vec );

    public static class SeqReader extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public SeqReader() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public SeqReader(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public SeqReader(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public SeqReader position(int position) {
            return (SeqReader)super.position(position);
        }
    
      public native int header_size(); public native SeqReader header_size(int header_size);
      public native Pointer seq(); public native SeqReader seq(Pointer seq);        /* sequence, beign read; CvSeq      */
      public native Pointer block(); public native SeqReader block(Pointer block);      /* current block;        CvSeqBlock */
      public native @Cast("schar*") BytePointer ptr(); public native SeqReader ptr(BytePointer ptr);        /* pointer to element be read next */
      public native @Cast("schar*") BytePointer block_min(); public native SeqReader block_min(BytePointer block_min);  /* pointer to the beginning of block */
      public native @Cast("schar*") BytePointer block_max(); public native SeqReader block_max(BytePointer block_max);  /* pointer to the end of block */
      public native int delta_index(); public native SeqReader delta_index(int delta_index);/* = seq->first->start_index   */
      public native @Cast("schar*") BytePointer prev_elem(); public native SeqReader prev_elem(BytePointer prev_elem);  /* pointer to previous element */
    }

    @MemberGetter public native @Const CvFileStorage fs();
    @MemberGetter public native @Const CvFileNode container();
    public native @ByRef SeqReader reader(); public native FileNodeIterator reader(SeqReader reader);
    public native @Cast("size_t") long remaining(); public native FileNodeIterator remaining(long remaining);
}

/** \} core_xml
<p>
/////////////////// XML & YAML I/O implementation //////////////////
 <p>
 *  \relates cv::FileStorage
 *  \{ */

@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str BytePointer name, int value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str String name, int value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str BytePointer name, float value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str String name, float value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str BytePointer name, double value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str String name, double value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str BytePointer name, @Str BytePointer value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str String name, @Str String value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str BytePointer name, @Const @ByRef Mat value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str String name, @Const @ByRef Mat value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str BytePointer name, @Const @ByRef SparseMat value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str String name, @Const @ByRef SparseMat value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str BytePointer name, @Const @ByRef KeyPointVector value);
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str String name, @Const @ByRef KeyPointVector value);
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str BytePointer name, @Const @ByRef DMatchVector value);
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str String name, @Const @ByRef DMatchVector value);

@Namespace("cv") public static native void writeScalar( @ByRef FileStorage fs, int value );
@Namespace("cv") public static native void writeScalar( @ByRef FileStorage fs, float value );
@Namespace("cv") public static native void writeScalar( @ByRef FileStorage fs, double value );
@Namespace("cv") public static native void writeScalar( @ByRef FileStorage fs, @Str BytePointer value );
@Namespace("cv") public static native void writeScalar( @ByRef FileStorage fs, @Str String value );

/** \}
 <p>
 *  \relates cv::FileNode
 *  \{ */

@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef IntPointer value, int default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef IntBuffer value, int default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef int[] value, int default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef FloatPointer value, float default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef FloatBuffer value, float default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef float[] value, float default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef DoublePointer value, double default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef DoubleBuffer value, double default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef double[] value, double default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @Str BytePointer value, @Str BytePointer default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @Str String value, @Str String default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef Mat mat, @Const @ByRef(nullValue = "cv::Mat()") Mat default_mat/*=cv::Mat()*/ );
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef Mat mat );
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef SparseMat mat, @Const @ByRef(nullValue = "cv::SparseMat()") SparseMat default_mat/*=cv::SparseMat()*/ );
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef SparseMat mat );
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef KeyPointVector keypoints);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef DMatchVector matches);

@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @ByRef Range value, @Const @ByRef Range default_value);

/** \}
<p>
/** \brief Writes string to a file storage.
\relates cv::FileStorage
 */
@Namespace("cv") public static native @ByRef @Name("operator <<") FileStorage shiftLeft(@ByRef FileStorage fs, @Str BytePointer str);
@Namespace("cv") public static native @ByRef @Name("operator <<") FileStorage shiftLeft(@ByRef FileStorage fs, @Str String str);

/** \cond IGNORED */
    @Namespace("cv::internal") @NoOffset public static class WriteStructContext extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public WriteStructContext(Pointer p) { super(p); }
    
        public WriteStructContext(@ByRef FileStorage _fs, @Str BytePointer name, int flags, @Str BytePointer typeName/*=cv::String()*/) { super((Pointer)null); allocate(_fs, name, flags, typeName); }
        private native void allocate(@ByRef FileStorage _fs, @Str BytePointer name, int flags, @Str BytePointer typeName/*=cv::String()*/);
        public WriteStructContext(@ByRef FileStorage _fs, @Str BytePointer name, int flags) { super((Pointer)null); allocate(_fs, name, flags); }
        private native void allocate(@ByRef FileStorage _fs, @Str BytePointer name, int flags);
        public WriteStructContext(@ByRef FileStorage _fs, @Str String name, int flags, @Str String typeName/*=cv::String()*/) { super((Pointer)null); allocate(_fs, name, flags, typeName); }
        private native void allocate(@ByRef FileStorage _fs, @Str String name, int flags, @Str String typeName/*=cv::String()*/);
        public WriteStructContext(@ByRef FileStorage _fs, @Str String name, int flags) { super((Pointer)null); allocate(_fs, name, flags); }
        private native void allocate(@ByRef FileStorage _fs, @Str String name, int flags);
    }

 // internal

/** \endcond
 <p>
 *  \relates cv::FileStorage
 *  \{ */

@Namespace("cv") public static native void write( @ByRef FileStorage fs, int value );

@Namespace("cv") public static native void write( @ByRef FileStorage fs, float value );

@Namespace("cv") public static native void write( @ByRef FileStorage fs, double value );

@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str BytePointer value );
@Namespace("cv") public static native void write( @ByRef FileStorage fs, @Str String value );

@Namespace("cv") public static native void write(@ByRef FileStorage fs, @Const @ByRef Range r );

@Namespace("cv") public static native void write(@ByRef FileStorage fs, @Str BytePointer name, @Const @ByRef Range r );
@Namespace("cv") public static native void write(@ByRef FileStorage fs, @Str String name, @Const @ByRef Range r );

/** \} FileStorage
 <p>
 *  \relates cv::FileNode
 *  \{ */

@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @Cast("bool*") @ByRef BoolPointer value, @Cast("bool") boolean default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @Cast("bool*") @ByRef boolean[] value, @Cast("bool") boolean default_value);

@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @Cast("uchar*") @ByRef BytePointer value, @Cast("uchar") byte default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @Cast("uchar*") @ByRef ByteBuffer value, @Cast("uchar") byte default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @Cast("uchar*") @ByRef byte[] value, @Cast("uchar") byte default_value);

@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @Cast("ushort*") @ByRef ShortPointer value, @Cast("ushort") short default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @Cast("ushort*") @ByRef ShortBuffer value, @Cast("ushort") short default_value);
@Namespace("cv") public static native void read(@Const @ByRef FileNode node, @Cast("ushort*") @ByRef short[] value, @Cast("ushort") short default_value);

/** \} FileNode
 <p>
 *  \relates cv::FileStorage
 *  \{
<p>
/** \brief Writes data to a file storage.
 */

/** \brief Writes data to a file storage.
 */

/** \brief Writes data to a file storage.
 */
@Namespace("cv") public static native @ByRef @Name("operator <<") FileStorage shiftLeft(@ByRef FileStorage fs, @Cast("char*") ByteBuffer value);
@Namespace("cv") public static native @ByRef @Name("operator <<") FileStorage shiftLeft(@ByRef FileStorage fs, @Cast("char*") byte[] value);

/** \} FileStorage
 <p>
 *  \relates cv::FileNodeIterator
 *  \{
<p>
/** \brief Reads data from a file storage.
 */

/** \brief Reads data from a file storage.
 */

/** \} FileNodeIterator
 <p>
 *  \relates cv::FileNode
 *  \{
<p>
/** \brief Reads data from a file storage.
 */

/** \brief Reads data from a file storage.
 */

/** \} FileNode
 <p>
 *  \relates cv::FileNodeIterator
 *  \{ */

@Namespace("cv") public static native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef FileNodeIterator it1, @Const @ByRef FileNodeIterator it2);

@Namespace("cv") public static native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef FileNodeIterator it1, @Const @ByRef FileNodeIterator it2);

@Namespace("cv") public static native @Cast("ptrdiff_t") @Name("operator -") long subtract(@Const @ByRef FileNodeIterator it1, @Const @ByRef FileNodeIterator it2);

@Namespace("cv") public static native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef FileNodeIterator it1, @Const @ByRef FileNodeIterator it2);

/** \} FileNodeIterator
 <p>
 *  \cond IGNORED */

























/** \endcond */

 // cv

// #endif // __OPENCV_CORE_PERSISTENCE_HPP__


// Parsed from <opencv2/core/optim.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the OpenCV Foundation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_OPTIM_HPP__
// #define __OPENCV_OPTIM_HPP__

// #include "opencv2/core.hpp"

/** \addtogroup core_optim
The algorithms in this section minimize or maximize function value within specified constraints or
without any constraints.
\{
*/

/** \brief Basic interface for all solvers
 */
@Namespace("cv") public static class MinProblemSolver extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MinProblemSolver(Pointer p) { super(p); }

    /** \brief Represents function being optimized
     */
    @Const public static class Function extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public Function() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public Function(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Function(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public Function position(int position) {
            return (Function)super.position(position);
        }
    
        @Virtual(true) public native int getDims();
        @Virtual public native double getGradientEps();
        @Virtual(true) public native double calc(@Const DoublePointer x);
        @Virtual public native void getGradient(@Const DoublePointer x,DoublePointer grad);
    }

    /** \brief Getter for the optimized function.
    <p>
    The optimized function is represented by Function interface, which requires derivatives to
    implement the sole method calc(double*) to evaluate the function.
    <p>
    @return Smart-pointer to an object that implements Function interface - it represents the
    function that is being optimized. It can be empty, if no function was given so far.
     */
    public native @Ptr Function getFunction();

    /** \brief Setter for the optimized function.
    <p>
    *It should be called at least once before the call to* minimize(), as default value is not usable.
    <p>
    @param f The new function to optimize.
     */
    public native void setFunction(@Ptr Function f);

    /** \brief Getter for the previously set terminal criteria for this algorithm.
    <p>
    @return Deep copy of the terminal criteria used at the moment.
     */
    public native @ByVal TermCriteria getTermCriteria();

    /** \brief Set terminal criteria for solver.
    <p>
    This method *is not necessary* to be called before the first call to minimize(), as the default
    value is sensible.
    <p>
    Algorithm stops when the number of function evaluations done exceeds termcrit.maxCount, when
    the function values at the vertices of simplex are within termcrit.epsilon range or simplex
    becomes so small that it can enclosed in a box with termcrit.epsilon sides, whatever comes
    first.
    @param termcrit Terminal criteria to be used, represented as cv::TermCriteria structure.
     */
    public native void setTermCriteria(@Const @ByRef TermCriteria termcrit);

    /** \brief actually runs the algorithm and performs the minimization.
    <p>
    The sole input parameter determines the centroid of the starting simplex (roughly, it tells
    where to start), all the others (terminal criteria, initial step, function to be minimized) are
    supposed to be set via the setters before the call to this method or the default values (not
    always sensible) will be used.
    <p>
    @param x The initial point, that will become a centroid of an initial simplex. After the algorithm
    will terminate, it will be setted to the point where the algorithm stops, the point of possible
    minimum.
    @return The value of a function at the point found.
     */
    public native double minimize(@ByVal Mat x);
}

/** \brief This class is used to perform the non-linear non-constrained minimization of a function,
<p>
defined on an {@code n}-dimensional Euclidean space, using the **Nelder-Mead method**, also known as
**downhill simplex method**. The basic idea about the method can be obtained from
<http://en.wikipedia.org/wiki/Nelder-Mead_method>.
<p>
It should be noted, that this method, although deterministic, is rather a heuristic and therefore
may converge to a local minima, not necessary a global one. It is iterative optimization technique,
which at each step uses an information about the values of a function evaluated only at {@code n+1}
points, arranged as a *simplex* in {@code n}-dimensional space (hence the second name of the method). At
each step new point is chosen to evaluate function at, obtained value is compared with previous
ones and based on this information simplex changes it's shape , slowly moving to the local minimum.
Thus this method is using *only* function values to make decision, on contrary to, say, Nonlinear
Conjugate Gradient method (which is also implemented in optim).
<p>
Algorithm stops when the number of function evaluations done exceeds termcrit.maxCount, when the
function values at the vertices of simplex are within termcrit.epsilon range or simplex becomes so
small that it can enclosed in a box with termcrit.epsilon sides, whatever comes first, for some
defined by user positive integer termcrit.maxCount and positive non-integer termcrit.epsilon.
<p>
\note DownhillSolver is a derivative of the abstract interface
cv::MinProblemSolver, which in turn is derived from the Algorithm interface and is used to
encapsulate the functionality, common to all non-linear optimization algorithms in the optim
module.
<p>
\note term criteria should meet following condition:
<pre>{@code
    termcrit.type == (TermCriteria::MAX_ITER + TermCriteria::EPS) && termcrit.epsilon > 0 && termcrit.maxCount > 0
}</pre>
 */
@Namespace("cv") public static class DownhillSolver extends MinProblemSolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DownhillSolver(Pointer p) { super(p); }

    /** \brief Returns the initial step that will be used in downhill simplex algorithm.
    <p>
    @param step Initial step that will be used in algorithm. Note, that although corresponding setter
    accepts column-vectors as well as row-vectors, this method will return a row-vector.
    @see DownhillSolver::setInitStep
     */
    public native void getInitStep(@ByVal Mat step);

    /** \brief Sets the initial step that will be used in downhill simplex algorithm.
    <p>
    Step, together with initial point (givin in DownhillSolver::minimize) are two {@code n}-dimensional
    vectors that are used to determine the shape of initial simplex. Roughly said, initial point
    determines the position of a simplex (it will become simplex's centroid), while step determines the
    spread (size in each dimension) of a simplex. To be more precise, if \f$s,x_0\in\mathbb{R}^n\f$ are
    the initial step and initial point respectively, the vertices of a simplex will be:
    \f$v_0:=x_0-\frac{1}{2} s\f$ and \f$v_i:=x_0+s_i\f$ for \f$i=1,2,\dots,n\f$ where \f$s_i\f$ denotes
    projections of the initial step of *n*-th coordinate (the result of projection is treated to be
    vector given by \f$s_i:=e_i\cdot\left<e_i\cdot s\right>\f$, where \f$e_i\f$ form canonical basis)
    <p>
    @param step Initial step that will be used in algorithm. Roughly said, it determines the spread
    (size in each dimension) of an initial simplex.
     */
    public native void setInitStep(@ByVal Mat step);

    /** \brief This function returns the reference to the ready-to-use DownhillSolver object.
    <p>
    All the parameters are optional, so this procedure can be called even without parameters at
    all. In this case, the default values will be used. As default value for terminal criteria are
    the only sensible ones, MinProblemSolver::setFunction() and DownhillSolver::setInitStep()
    should be called upon the obtained object, if the respective parameters were not given to
    create(). Otherwise, the two ways (give parameters to createDownhillSolver() or miss them out
    and call the MinProblemSolver::setFunction() and DownhillSolver::setInitStep()) are absolutely
    equivalent (and will drop the same errors in the same way, should invalid input be detected).
    @param f Pointer to the function that will be minimized, similarly to the one you submit via
    MinProblemSolver::setFunction.
    @param initStep Initial step, that will be used to construct the initial simplex, similarly to the one
    you submit via MinProblemSolver::setInitStep.
    @param termcrit Terminal criteria to the algorithm, similarly to the one you submit via
    MinProblemSolver::setTermCriteria.
     */
    public static native @Ptr DownhillSolver create(@Ptr Function f/*=cv::Ptr<cv::MinProblemSolver::Function>()*/,
                                          @ByVal(nullValue = "cv::Mat_<double>(1,1,0.0)") Mat initStep/*=cv::Mat_<double>(1,1,0.0)*/,
                                          @ByVal(nullValue = "cv::TermCriteria(cv::TermCriteria::MAX_ITER+cv::TermCriteria::EPS,5000,0.000001)") TermCriteria termcrit/*=cv::TermCriteria(cv::TermCriteria::MAX_ITER+cv::TermCriteria::EPS,5000,0.000001)*/);
    public static native @Ptr DownhillSolver create();
}

/** \brief This class is used to perform the non-linear non-constrained minimization of a function
with known gradient,
<p>
defined on an *n*-dimensional Euclidean space, using the **Nonlinear Conjugate Gradient method**.
The implementation was done based on the beautifully clear explanatory article [An Introduction to
the Conjugate Gradient Method Without the Agonizing
Pain](http://www.cs.cmu.edu/~quake-papers/painless-conjugate-gradient.pdf) by Jonathan Richard
Shewchuk. The method can be seen as an adaptation of a standard Conjugate Gradient method (see, for
example <http://en.wikipedia.org/wiki/Conjugate_gradient_method>) for numerically solving the
systems of linear equations.
<p>
It should be noted, that this method, although deterministic, is rather a heuristic method and
therefore may converge to a local minima, not necessary a global one. What is even more disastrous,
most of its behaviour is ruled by gradient, therefore it essentially cannot distinguish between
local minima and maxima. Therefore, if it starts sufficiently near to the local maximum, it may
converge to it. Another obvious restriction is that it should be possible to compute the gradient of
a function at any point, thus it is preferable to have analytic expression for gradient and
computational burden should be born by the user.
<p>
The latter responsibility is accompilished via the getGradient method of a
MinProblemSolver::Function interface (which represents function being optimized). This method takes
point a point in *n*-dimensional space (first argument represents the array of coordinates of that
point) and comput its gradient (it should be stored in the second argument as an array).
<p>
\note class ConjGradSolver thus does not add any new methods to the basic MinProblemSolver interface.
<p>
\note term criteria should meet following condition:
<pre>{@code
    termcrit.type == (TermCriteria::MAX_ITER + TermCriteria::EPS) && termcrit.epsilon > 0 && termcrit.maxCount > 0
    // or
    termcrit.type == TermCriteria::MAX_ITER) && termcrit.maxCount > 0
}</pre>
 */
@Namespace("cv") public static class ConjGradSolver extends MinProblemSolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConjGradSolver(Pointer p) { super(p); }

    /** \brief This function returns the reference to the ready-to-use ConjGradSolver object.
    <p>
    All the parameters are optional, so this procedure can be called even without parameters at
    all. In this case, the default values will be used. As default value for terminal criteria are
    the only sensible ones, MinProblemSolver::setFunction() should be called upon the obtained
    object, if the function was not given to create(). Otherwise, the two ways (submit it to
    create() or miss it out and call the MinProblemSolver::setFunction()) are absolutely equivalent
    (and will drop the same errors in the same way, should invalid input be detected).
    @param f Pointer to the function that will be minimized, similarly to the one you submit via
    MinProblemSolver::setFunction.
    @param termcrit Terminal criteria to the algorithm, similarly to the one you submit via
    MinProblemSolver::setTermCriteria.
    */
    public static native @Ptr ConjGradSolver create(@Ptr Function f/*=cv::Ptr<cv::ConjGradSolver::Function>()*/,
                                          @ByVal(nullValue = "cv::TermCriteria(cv::TermCriteria::MAX_ITER+cv::TermCriteria::EPS,5000,0.000001)") TermCriteria termcrit/*=cv::TermCriteria(cv::TermCriteria::MAX_ITER+cv::TermCriteria::EPS,5000,0.000001)*/);
    public static native @Ptr ConjGradSolver create();
}

/** return codes for cv::solveLP() function */
/** enum cv::SolveLPResult */
public static final int
    /** problem is unbounded (target function can achieve arbitrary high values) */
    SOLVELP_UNBOUNDED    = -2,
    /** problem is unfeasible (there are no points that satisfy all the constraints imposed) */
    SOLVELP_UNFEASIBLE    = -1,
    /** there is only one maximum for target function */
    SOLVELP_SINGLE    = 0,
    /** there are multiple maxima for target function - the arbitrary one is returned */
    SOLVELP_MULTI    = 1;

/** \brief Solve given (non-integer) linear programming problem using the Simplex Algorithm (Simplex Method).
<p>
What we mean here by "linear programming problem" (or LP problem, for short) can be formulated as:
<p>
\f[\mbox{Maximize } c\cdot x\\
 \mbox{Subject to:}\\
 Ax\leq b\\
 x\geq 0\f]
<p>
Where \f$c\f$ is fixed {@code 1}-by-{@code n} row-vector, \f$A\f$ is fixed {@code m}-by-{@code n} matrix, \f$b\f$ is fixed {@code m}-by-{@code 1}
column vector and \f$x\f$ is an arbitrary {@code n}-by-{@code 1} column vector, which satisfies the constraints.
<p>
Simplex algorithm is one of many algorithms that are designed to handle this sort of problems
efficiently. Although it is not optimal in theoretical sense (there exist algorithms that can solve
any problem written as above in polynomial time, while simplex method degenerates to exponential
time for some special cases), it is well-studied, easy to implement and is shown to work well for
real-life purposes.
<p>
The particular implementation is taken almost verbatim from **Introduction to Algorithms, third
edition** by T. H. Cormen, C. E. Leiserson, R. L. Rivest and Clifford Stein. In particular, the
Bland's rule <http://en.wikipedia.org/wiki/Bland%27s_rule> is used to prevent cycling.
<p>
@param Func This row-vector corresponds to \f$c\f$ in the LP problem formulation (see above). It should
contain 32- or 64-bit floating point numbers. As a convenience, column-vector may be also submitted,
in the latter case it is understood to correspond to \f$c^T\f$.
@param Constr {@code m}-by-{@code n+1} matrix, whose rightmost column corresponds to \f$b\f$ in formulation above
and the remaining to \f$A\f$. It should containt 32- or 64-bit floating point numbers.
@param z The solution will be returned here as a column-vector - it corresponds to \f$c\f$ in the
formulation above. It will contain 64-bit floating point numbers.
@return One of cv::SolveLPResult
 */
@Namespace("cv") public static native int solveLP(@Const @ByRef Mat Func, @Const @ByRef Mat Constr, @ByRef Mat z);

/** \} */

// cv

// #endif


}
