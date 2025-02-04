import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    
    return 0;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i= 0; i < arr.length; i++)
    {
      double element = arr[i];
      if (element == target)
      {
        return i;
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int i= 0; i < arr.length; i++)
    {
     int target = arr[i];
     for (int j = i+1; j < arr.length; j++)
     if (arr[i] == arr[j] && i != j)
     {
      return true;
     }
    }
    return false;
  }

  public static int findMode(int[] arr)
  {
    int count = 0;
    int max_count = 0;
    int mode = arr[0];
    for (int i = i; i < arr.length; i++)
    {
      int potential_mode = arr[i];
      count = 0;
      for (j = 0; j < i; ++j)
      {
        if (arr[j] == potential_mode)
        ++count;
      }
      if (count > max_count)
      {
        max_count = count;
        mode = potential_mode;
      }
    }
    return mode;
  }
}
